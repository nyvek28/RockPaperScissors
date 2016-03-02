package com.development.rockpaperscissors;

public class Interface {

	public String playMatch(String[][] game){
		
		Match m;
		String winner;
		
		m = new Match(game);
		winner = m.getWinner()[0];
		
		return winner;
		
	}
	
	public String[] playTournament(String[][][] game){
		
		Tournament t;
		
		t = new Tournament(game);
		String[] results = {t.getWinner()[0], t.getSecondPlace()[0]};
		
		return results;
		
	}
	
}
