package com.development.rockpaperscissors;

import java.util.ArrayList;

public class Tournament extends Game{

	private ArrayList<Match> matches;
	
	public Tournament(String[][][] tournament){
		
		ArrayList<Match> matches = new ArrayList<Match>();
		
		for(int i = 0; i < tournament.length; i++){
			Match m;
			m = new Match(tournament[i]);
			matches.add(m);
		}
		
		this.setMatches(matches);
		this.execute();
	}
	
	public void execute(){
		
		Match finalMatch;
		
		while(this.getMatches().size() > 1){
			this.executeLine();
		}
		
		finalMatch = this.getMatches().get(0);
		this.setWinner(finalMatch.getWinner());
		this.setSecondPlace(finalMatch.getSecondPlace());
		
	}
	
	private void executeLine(){
		ArrayList<Match> temp = new ArrayList<Match>();
		Match m;
		String[] playerOne;
		String[] playerTwo;
		for(int i = 0; i < this.getMatches().size(); i++){
			playerOne = this.getMatches().get(i).getWinner();
			if(i < ((this.getMatches().size())-1)){
				i++;
			}
			System.out.println(""+i);
			playerTwo = this.getMatches().get(i).getWinner();
			String[][] game = {playerOne,playerTwo};
			m = new Match(game);
			temp.add(m);
		}
		
		this.setMatches(temp);
		
	}

	private ArrayList<Match> getMatches() {
		return matches;
	}

	private void setMatches(ArrayList<Match> matches) {
		this.matches = matches;
	}
	
	
	
}
