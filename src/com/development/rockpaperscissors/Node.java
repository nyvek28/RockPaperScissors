package com.development.rockpaperscissors;

public class Node {

	private Node next;
	private String val;
	
	public Node(String v){
		
		this.setVal(v);
		this.setNext(null);
		
	}
	
	public Node(String v, Node n){
		
		this.setVal(v);
		this.setNext(n);
		
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	
	
	
}
