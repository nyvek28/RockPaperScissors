package com.development.rockpaperscissors;

//Other than a conceptual inheritance this class's purpose is to reuse code and serve as a template for Match and Tournament

public abstract class Game {
	
	protected String[] winner;
	protected String[] secondPlace;
	
	public abstract void execute();
	
	public String[] getWinner() {
		return winner;
	}

	protected void setWinner(String[] winner) {
		this.winner = winner;
	}

	public String[] getSecondPlace() {
		return secondPlace;
	}

	protected void setSecondPlace(String[] secondPlace) {
		this.secondPlace = secondPlace;
	}
	
}
