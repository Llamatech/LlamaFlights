package com.llama.tech.airports.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.llama.tech.utils.list.Lista;
import com.llama.tech.utils.list.LlamaArrayList;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChartSelectorDialog extends JDialog implements ItemListener, ActionListener
{

	private final JPanel contentPanel = new JPanel();
	private JPanel panel_1;
	private JTextField[] lbls = new JTextField[6];
	private JComboBox<Integer> comboBox;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private OptionsPanel optionsPanel;
	private int numSelected = 1; 

	/**
	 * Create the dialog.
	 * @param optionsPanel 
	 */
	public ChartSelectorDialog(OptionsPanel optionsPanel) 
	{
		
		for(int i = 0; i < 6; i++)
		{
			//cmd[i] = i+"";
			lbls[i] = new JTextField();
			lbls[i].setEditable(false);
//			lbls[i].setActionCommand(i+"");
//			lbls[i].addActionListener(this);
			
		}
		
		setBounds(100, 100, 451, 378);
		setTitle("Comparar Aeropuertos (Gráfico)");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(11, 264, 408, 54);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				btnNewButton = new JButton("Consultar");
				btnNewButton.setBounds(86, 12, 117, 25);
				btnNewButton.addActionListener(this);
				btnNewButton.setActionCommand("GET");
				panel.add(btnNewButton);
			}
			{
				btnNewButton_1 = new JButton("Cancelar");
				btnNewButton_1.setBounds(215, 12, 117, 25);
				btnNewButton_1.addActionListener(this);
				btnNewButton_1.setActionCommand("CANCEL");				
				panel.add(btnNewButton_1);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(11, 12, 408, 43);
			contentPanel.add(panel);
			panel.setLayout(new FormLayout(new ColumnSpec[] {
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("default:grow"),},
				new RowSpec[] {
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,}));
			{
				JLabel lblNewLabel = new JLabel("Número de Aeropuertos a Comparar:");
				panel.add(lblNewLabel, "2, 2");
			}
			{
				Integer[] quant = {1,2,3,4,5,6};
				comboBox = new JComboBox<Integer>(quant);
				panel.add(comboBox, "6, 2, fill, default");
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "C\u00F3digos Aeropuerto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
			panel_1.setBounds(11, 67, 408, 186);
			contentPanel.add(panel_1);
			panel_1.setLayout(new FormLayout(new ColumnSpec[] {
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("default:grow"),},
				new RowSpec[] {
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,}));
			{
				JLabel lblNewLabel_1 = new JLabel("Aeropuerto 1:");
				panel_1.add(lblNewLabel_1, "4, 2");
			}
			{
//				textField = new JTextField();
//				textField.setEditable(false);
//				panel_1.add(textField, "8, 2, fill, default");
//				textField.setColumns(10);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Aeropuerto 2:");
				panel_1.add(lblNewLabel_2, "4, 4");
			}
			{
//				textField_1 = new JTextField();
//				textField_1.setEditable(false);
//				panel_1.add(textField_1, "8, 4, fill, default");
//				textField_1.setColumns(10);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Aeropuerto 3:");
				panel_1.add(lblNewLabel_3, "4, 6");
			}
			{
//				textField_2 = new JTextField();
//				textField_2.setEditable(false);
//				panel_1.add(textField_2, "8, 6, fill, default");
//				textField_2.setColumns(10);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("Aeropuerto 4:");
				panel_1.add(lblNewLabel_4, "4, 8");
			}
			{
//				textField_3 = new JTextField();
//				textField_3.setEditable(false);
//				panel_1.add(textField_3, "8, 8, fill, default");
//				textField_3.setColumns(10);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("Aeropuerto 5:");
				panel_1.add(lblNewLabel_5, "4, 10");
			}
			{
//				textField_4 = new JTextField();
//				textField_4.setEditable(false);
//				panel_1.add(textField_4, "8, 10, fill, default");
//				textField_4.setColumns(10);
			}
			{
				JLabel lblNewLabel_6 = new JLabel("Aeropuerto 6:");
				panel_1.add(lblNewLabel_6, "4, 12");
			}
			{
//				textField_5 = new JTextField();
//				textField_5.setEditable(false);
//				panel_1.add(textField_5, "8, 12, fill, default");
//				textField_5.setColumns(10);
			}
			
			int pos = 2;
			for(int i = 0; i < lbls.length; i++)
			{
				panel_1.add(lbls[i], String.format("8, %d, fill, default", pos));
				lbls[i].setColumns(4);
				pos += 2;
			}
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getStateChange() == ItemEvent.SELECTED)
		{
			int index = (int) e.getItem();
			numSelected = index;
			
			for(int i = 0; i < index+1; i++)
			{
				lbls[i].setEditable(true);
			}
			
			for(int i = index+1; i < lbls.length; i++)
			{
				lbls[i].setEditable(false);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("GET"))
		{
			Lista<String> airCodes = new LlamaArrayList<String>(6); 
			for(int i = 0; i < numSelected; i++)
			{
				
			}
		}
		
	}

}
