package com.development.UI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.development.rockpaperscissors.Interface;

public class Window extends JFrame {

	private PanelGame game;
	private Interface inter;
	private ArrayList<String[][]> matches;
	private boolean isMatchMode;
	private String errorMessage;
	
	public Window(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		game = new PanelGame();
		setContentPane(game);
		
		this.inter = new Interface();
		this.matches = null;
		this.isMatchMode = true;
		this.errorMessage = "Invalid values";
		
		this.game.btnNewButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				game.turnToMatch();
				isMatchMode = true;
			}
			
		});
		
		this.game.btnNewButton_1.addActionListener(new ActionListener(){

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
					}else{
						JOptionPane.showMessageDialog(null, errorMessage);
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
					game.emptyTextFields();
				}else{
					JOptionPane.showMessageDialog(null, errorMessage);
				}
				
			}
			
		});
		
	}
	
	private boolean isVerified(String[][] match){
		
		String strat;
		String name;
		boolean isVerified = false;
		
		for(int i = 0; i < match.length; i++){
			strat = match[i][1].toUpperCase();
			name = match[i][0];
			if(strat.equals("P") || strat.equals("S") || strat.equals("R") || !name.isEmpty()){
				isVerified = true;
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
