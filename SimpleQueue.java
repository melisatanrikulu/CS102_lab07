/**
 * SimpleQueue class 
 * @author Melisa Tanrikulu
 * @version 30.07.2021
 */

public class SimpleQueue {
	// Instance Data Members
	private SimpleLinkedList list;
	
	// Constructor
	
	/*
	 * Constructs an empty SimpleLinkedList
	 */
	public SimpleQueue() {
		list = new SimpleLinkedList();
	}

	/*
	 * Adds data to the tail of the queue
	 * @param data
	 */
	public void enqueue(String data) {
		list.addToTail(data);
	}
	
	/* Removes the data from the head of the queue
	 * @return value of the node
	 */
	public String dequeue() {
		return list.removeFromHead();
	}
	
	/*
	 * Checks if the queue is empty
	 * @return true if empty
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
