/**
 * SimpleLinkedList class 
 * @author Melisa Tanrikulu
 * @version 30.07.2021
 */

public class SimpleLinkedList {
	
	// Instance Data Members
	private Node head;
	
	// Constructor
	
	/*
	 * Constructs a null head
	 */
	public SimpleLinkedList() {
		head = null;
	}
	
	/*
	 * Adds a data to the tail
	 * @param data
	 */
	public void addToTail(String data) {
		if ( head == null )
			head = new Node(data);
		else {
			Node temp = head;
			while ( temp.getNext() != null )
				temp = temp.getNext();
			temp.setNext( new Node(data) );
		}
	}
	
	/*
	 * Removes the data from the head and returns its value
	 * @return data
	 */
	public String removeFromHead() {
		Node temp = head;
		String data = "";
		
		if ( temp != null ) {
			data = head.getData();
			head = temp.getNext();
		}
		
		return data;
	}
	
	/*
	 * Checks if the list is empty or nor
	 * @return true if empty
	 */
	public boolean isEmpty() {
		if ( head == null )
			return true;
		else
			return false;
	}
	
	/*
	 * Returns the node with the given data
	 * @param data
	 * @return node
	 */
	public Node get(String data) {
		Node temp = head;
		
		while ( temp != null ) {
			if ( temp.getData().equals(data) )
				return temp;
			else
				temp = temp.getNext();
		}
		
		return null;
	}
	
	/*
	 * Returns the node with the given index
	 * @param data
	 * @return node
	 */
	public Node get(int index) {
		Node temp = head;
		
		if ( index >= 0 ) {
			while ( temp != null ) {
				for ( int i = 0; i < index; i++ ) {
					temp = temp.getNext();
				}
				return temp;
			}
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		Node temp = head;
		String text = "--------HEAD-------- \n";
		
		while ( temp != null ) {
			text += temp.getData() + "\n";
			temp = temp.getNext();
		}
		
		text += "--------TAIL--------\n";
		
		return text;
	}
}
