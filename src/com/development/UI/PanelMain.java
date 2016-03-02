package com.development.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.development.rockpaperscissors.Interface;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class PanelMain extends JPanel {

	private PanelMenu menu;
	private PanelGame game;
	private Interface inter;
	private ArrayList<String[][]> matches;
	private boolean isMatchMode;
	private String errorMessage;
	
	/**
	 * Create the panel.
	 */
	public PanelMain() {
		
		this.setLayout(null);
		
		this.inter = new Interface();
		
		this.matches = null;
		this.isMatchMode = true;
		this.errorMessage = "Invalid values";
		
		this.menu = new PanelMenu();
		//this.add(menu, BorderLayout.EAST);
		//this.menu.setVisible(true);
		
		this.game = new PanelGame();
		this.game.setBounds(0, 0, game.getSize().width, game.getSize().height);
		this.add(game);
		this.game.setVisible(true);
		
		this.menu.btnNewButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				game.turnToMatch();
				isMatchMode = true;
			}
			
		});
		
		this.menu.btnNewButton_1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				game.turnToTournament();
				matches = new ArrayList<String[][]>();
				isMatchMode = false;
			}
			
		});
		
		this.game.btnOk.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isMatchMode){
					String[][] match = getMatch();
					if(isVerified(match)){
						String w;
						w = inter.playMatch(match);
						game.lblNone.setText(w);
					}
				}else{
					if(matches != null){
						String[] w;
						w = inter.playTournament(convertToTournement(matches));
						game.lblNone.setText(w[0]);
						game.lblNone_1.setText(w[1]);
						matches = null;
					}else{
						JOptionPane.showMessageDialog(null, errorMessage);
					}
				}
			}
			
		});
		
		this.game.btnAddMatch.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String[][] match = getMatch();
				if(isVerified(match)){
					matches.add(match);
				}else{
					JOptionPane.showMessageDialog(null, errorMessage);
				}
				
			}
			
		});
		
		this.setPreferredSize(new Dimension(500,500));
		this.setSize(new Dimension(500,500));
		
	}
	
	private boolean isVerified(String[][] match){
		
		String strat;
		String name;
		boolean isVerified = true;
		
		for(int i = 0; i < match.length; i++){
			strat = match[i][1].toUpperCase();
			name = match[i][0];
			if(strat != "P" || strat != "R" || strat != "S" || name.isEmpty()){
				isVerified = false;
				break;
			}
		}
		
		return isVerified;
		
	}
	
	private String[][] getMatch(){
		
		String[][] match = {
				{this.game.textField.getText(),this.game.textField_1.getText()},
				{this.game.textField_2.getText(),this.game.textField_3.getText()}
				};
		
		return match;
	}
	
	private String[][][] convertToTournement(ArrayList<String[][]> t){
		
		String[][][] tournament = new String[t.size()][][];
		
		for(int i = 0; i < tournament.length; i++){
			tournament[i] = t.get(i);
		}
		
		return tournament;
		
	}

}
