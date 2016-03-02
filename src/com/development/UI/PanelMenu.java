package com.development.UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelMenu extends JPanel {

	public JButton btnNewButton;
	public JButton btnNewButton_1;
	
	/**
	 * Create the panel.
	 */
	public PanelMenu() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rock Paper Scissors");
		lblNewLabel.setBounds(8, 5, 125, 16);
		add(lblNewLabel);
		
		btnNewButton = new JButton("Single Match");
		btnNewButton.setBounds(0, 23, 117, 29);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Tournament");
		btnNewButton_1.setBounds(0, 49, 117, 29);
		add(btnNewButton_1);

	}
}
