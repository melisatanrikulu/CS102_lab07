/**
 * Node class 
 * @author Melisa Tanrikulu
 * @version 30.07.2021
 */

public class Node {
	// Instance Data Members
	String data;
	Node next;	
	
	// Constructors
	
	/* 
	 * Construcs a node.
	 * @param data
	 */
	public Node( String data ) {
		this.data = data;
		next = null;
	}
	
	/* 
	 * Construcs a node.
	 * @param data, Node next
	 */
	public Node( String data, Node next ) {
		this.data = data;
		this.next = next; 
	}
	
	// Get methods
	
	/*
	 * Returns the data
	 * @return data
	 */
	public String getData() {
		return data;
	}
	
	/*
	 * Returns the next node
	 * @return node
	 */
	public Node getNext() {
		return next;
	}
	
	// Set methods
	
	/*
	 * Changes the data
	 * @param newData
	 */
	public void setData( String newData ) {
		this.data = newData;
	}
	
	/*
	 * Changes the next node
	 * @param newNext
	 */
	public void setNext(Node newNext) {
		next = newNext;
	}
}
