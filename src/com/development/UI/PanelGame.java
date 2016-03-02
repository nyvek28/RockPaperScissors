package com.development.UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelGame extends JPanel {
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JButton btnOk;
	public JButton btnAddMatch;
	public JLabel lblWinner;
	public JLabel lblSecondPlace;
	public JLabel lblNone;
	public JLabel lblNone_1;
	public JButton btnNewButton;
	public JButton btnNewButton_1;

	/**
	 * Create the panel.
	 */
	public PanelGame() {
		setLayout(null);
		
		btnNewButton = new JButton("Single Match");
		btnNewButton.setBounds(350, 23, 117, 29);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Tournament");
		btnNewButton_1.setBounds(350, 49, 117, 29);
		add(btnNewButton_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(26, 30, 61, 16);
		add(lblName);
		
		JLabel lblPlayers = new JLabel("Players");
		lblPlayers.setBounds(26, 6, 61, 16);
		add(lblPlayers);
		
		JLabel lblStrategy = new JLabel("Strategy");
		lblStrategy.setBounds(172, 30, 61, 16);
		add(lblStrategy);
		
		textField = new JTextField();
		textField.setBounds(26, 51, 134, 28);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 51, 134, 28);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(26, 91, 134, 28);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(172, 91, 134, 28);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblP = new JLabel("P1");
		lblP.setBounds(6, 58, 61, 16);
		add(lblP);
		
		JLabel lblP_1 = new JLabel("P2");
		lblP_1.setBounds(6, 97, 61, 16);
		add(lblP_1);
		
		btnOk = new JButton("Ok");
		btnOk.setBounds(219, 131, 117, 29);
		add(btnOk);
		
		btnAddMatch = new JButton("Add Match");
		btnAddMatch.setBounds(105, 131, 117, 29);
		add(btnAddMatch);
		btnAddMatch.setVisible(false);
		
		lblWinner = new JLabel("Winner:");
		lblWinner.setBounds(26, 181, 91, 16);
		add(lblWinner);
		
		lblSecondPlace = new JLabel("Second Place:");
		lblSecondPlace.setBounds(26, 197, 91, 16);
		add(lblSecondPlace);
		lblSecondPlace.setVisible(false);
		
		
		lblNone = new JLabel("None");
		lblNone.setBounds(115, 181, 61, 16);
		add(lblNone);
		
		lblNone_1 = new JLabel("None");
		lblNone_1.setBounds(115, 197, 61, 16);
		add(lblNone_1);
		lblNone_1.setVisible(false);

	}
	
	public void turnToMatch(){
		this.emptyTextFields();
		this.lblNone.setText("None");
		this.btnAddMatch.setVisible(false);
		this.lblSecondPlace.setVisible(false);
		this.lblNone_1.setVisible(false);
	}
	
	public void turnToTournament(){
		this.emptyTextFields();
		this.lblNone.setText("None");
		this.lblNone_1.setText("None");
		this.btnAddMatch.setVisible(true);
		this.lblSecondPlace.setVisible(true);
		this.lblNone_1.setVisible(true);
	}
	
	public void emptyTextFields(){
		this.textField.setText("");
		this.textField_1.setText("");
		this.textField_2.setText("");
		this.textField_3.setText("");
	}
	
}
