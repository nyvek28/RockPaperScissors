package com.development.rockpaperscissors;

public class Match extends Game{

	private String[][] game;
	private static RPSList strategies = new RPSList();
	private static int numJugadores = 2;
	private static int handIndex = 1;
	
	public Match(String[][] match){
		

		this.capitalizeHands(match);
		if(isVerified(match)){
			this.setGame(match);
		}else{
			System.out.println("Error");
		}
		
		this.execute();
		
	}
	
	/*
	public void execute(){
		
		String playerOneStrategy;
		String playerTwoStrategy;
		
		playerOneStrategy = this.getGame()[0][1];
		playerTwoStrategy = this.getGame()[1][1];
		if(playerOneStrategy.equals(playerTwoStrategy)){
			this.setWinner(this.getGame()[0]);
		}else if(playerOneStrategy.equals("R")){
			if(playerTwoStrategy.equals("P")){
				this.setWinner(this.getGame()[1]);
			}else{
				this.setWinner(this.getGame()[0]);
			}
		}else if(playerOneStrategy.equals("S")){
			if(playerTwoStrategy.equals("R")){
				this.setWinner(this.getGame()[1]);
			}else{
				this.setWinner(this.getGame()[0]);
			}
		}else if(playerOneStrategy.equals("P")){
			if(playerTwoStrategy.equals("S")){
				this.setWinner(this.getGame()[1]);
			}else{
				this.setWinner(this.getGame()[0]);
			}
		}
		
	}
	*/
	
	public void execute(){
		
		String[] playerOne = this.getGame()[0];
		String[] playerTwo = this.getGame()[1];
		
		Match.getStrategies().select(playerOne[Match.getHandIndex()]);
		if(playerTwo[Match.getHandIndex()].equals(Match.getStrategies().next())){
			this.setWinner(playerTwo);
			this.setSecondPlace(playerOne);
		}else{
			this.setWinner(playerOne);
			this.setSecondPlace(playerTwo);
		}
		
	}
	
	private boolean isVerified(String[][] match){
		
		boolean isMatch = true;
		
		if(match.length == Match.getNumJugadores()){
			for(int i = 0; i < match.length; i++){
				
				String m = match[i][Match.getHandIndex()];
				if(m.equals("P") || m.equals("S") || m.equals("R")){
					isMatch = true;
				}else{
					isMatch = false;
					break;
				}
			}
		}else{
			System.out.println("More than 2 players!");
			isMatch = false;
		}
		
		return isMatch;
		
	}
	
	private void capitalizeHands(String[][] match){
		for(int i = 0; i < match.length; i++){
			match[i][Match.getHandIndex()] = match[i][Match.getHandIndex()].toUpperCase();
		}
	}

	protected String[][] getGame() {
		return game;
	}

	protected void setGame(String[][] game) {
		this.game = game;
	}

	protected static int getNumJugadores() {
		return numJugadores;
	}

	protected static void setNumJugadores(int numJugadores) {
		Match.numJugadores = numJugadores;
	}

	protected static RPSList getStrategies() {
		return strategies;
	}

	protected static void setStrategies(RPSList strategies) {
		Match.strategies = strategies;
	}

	protected static int getHandIndex() {
		return handIndex;
	}

	protected static void setHandIndex(int handIndex) {
		Match.handIndex = handIndex;
	}
	
	
	
}
