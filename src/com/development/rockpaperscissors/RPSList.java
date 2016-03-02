package com.development.rockpaperscissors;

public class RPSList extends CircularLinkedList{

	private Node selected;
	private static String[] strategies = {"R","P","S"};
	
	public RPSList(){
		
		for(int i = 0; i < this.getStrategies().length; i++){
			this.add(this.getStrategies()[i]);
		}
		
		this.setSelected(this.getFirst());
		
	}
	
	public void select(String val){
		
		Node temp = this.getFirst();
		for(int i = 0; i <= this.size(); i++){
			if(val.equals(temp.getVal())){
				this.setSelected(temp);
			}
			temp = temp.getNext();
		}
		
	}
	
	public String next(){
		return this.getSelected().getNext().getVal();
	}
	
	public String getSelection(){
		return this.getSelected().getVal();
	}
	
	public void selectNext(){
		
		this.setSelected(this.getSelected().getNext());
		
	}

	protected Node getSelected() {
		return selected;
	}

	protected void setSelected(Node selected) {
		this.selected = selected;
	}

	protected static String[] getStrategies() {
		return strategies;
	}

	protected static void setStrategies(String[] strategies) {
		RPSList.strategies = strategies;
	}
	
}
