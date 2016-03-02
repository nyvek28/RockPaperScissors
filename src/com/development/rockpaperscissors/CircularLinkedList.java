package com.development.rockpaperscissors;

public class CircularLinkedList {

	private Node first;
	private Node last;
	
	public CircularLinkedList(){
		this.setFirst(null);
		this.setLast(null);
	}
	
	public void add(String val){
		
		Node newNode;
		
		if(this.isEmpty()){
			
			newNode = new Node(val);
			this.setFirst(newNode);
			this.setLast(newNode);this.getLast().setNext(newNode);
			
		}else{
			
			newNode = new Node(val, this.getFirst());
			this.getLast().setNext(newNode);
			this.setLast(newNode);
			
		}
		
	}
	
	public void remove(String val){
		
		if(!this.isEmpty()){
			//Find the specified element and erase it
		}
		
	}
	
	public String get(int index){
		
		String val = null;
		
		if(index < this.size()){
			Node temp = this.getFirst();
			for(int i = 0; i <= index; i++){
				val = temp.getVal();
				temp = temp.getNext();
			}
		}
		
		return val;
		
	}
	
	public int size(){
		
		int size = 0;
		
		if(!this.isEmpty()){
			Node temp = this.getFirst();
			while(temp != this.getLast()){
				size++;
				temp = temp.getNext();
			}
		}
		
		return size;
		
	}
	
	public boolean isEmpty(){
		
		boolean isEmpty = false;
		
		if(this.getFirst() == null){
			isEmpty = true;
		}
		
		return isEmpty;
		
	}

	protected Node getFirst() {
		return first;
	}

	protected void setFirst(Node first) {
		this.first = first;
	}

	protected Node getLast() {
		return last;
	}

	protected void setLast(Node last) {
		this.last = last;
	}
	
}
