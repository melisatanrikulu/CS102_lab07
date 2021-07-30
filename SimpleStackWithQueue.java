/**
 * Node class 
 * @author Melisa Tanrikulu
 * @version 30.07.2021
 */

public class SimpleStackWithQueue {
	
	// Instance Data Members
	private SimpleQueue q1;
	private SimpleQueue q2;
	
	// Constructor
	
	/*
	 * Construct two empty queues
	 */
	public SimpleStackWithQueue() {
		q1 = new SimpleQueue();
		q2 = new SimpleQueue();
	}	
	
	/*
	 * Adds a data to queue
	 * @param data
	 */
	public void push(String data) {
		String element;
		
		q2.enqueue(data);

		while ( !q1.isEmpty() ) {
			element = q1.dequeue();
			q2.enqueue(element);
		}
		
		SimpleQueue temp = q1;
		q1 = q2;
		q2 = temp;
	}
	
	/*
	 * Removes data from queue
	 * @return value of node
	 */
	public String pop() {
		return q1.dequeue();
		
	}
	
	@Override
	public String toString() {
		String text = "--------FIRST--------: \n";
		
		String element;

		while ( !q1.isEmpty() ) {
			element = q1.dequeue();
			text += element + "\n";
			q2.enqueue(element);
		}
		
		SimpleQueue temp = q1;
		q1 = q2;
		q2 = temp;
		
		text += "--------LAST--------";
		return text;		
	}

}
