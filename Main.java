/**
 * Main class 
 * @author Melisa Tanrikulu
 * @version 30.07.2021
 */

public class Main {
	public static void main( String[] args ) {
		
		System.out.println("SimpleLinkedList example:");
		SimpleLinkedList list = new SimpleLinkedList();
		
		list.addToTail("Rose");
		list.addToTail("Daisy");
		list.addToTail("Lily");
		list.addToTail("Jasmine");
		list.addToTail("Magnolia");
		
		System.out.println(list);
		
		System.out.println("Supossed to return Rose, Lily and Magnolia: ");
		System.out.println( list.get(0).getData() );
		System.out.println( list.get(2).getData() );
		System.out.println( list.get("Magnolia").getData() );
		
		System.out.println("\nRemoves from head one by one:");
		list.removeFromHead();
		System.out.println(list);
		list.removeFromHead();
		System.out.println(list);
		list.removeFromHead();
		System.out.println(list);
		list.removeFromHead();
		System.out.println(list);
		list.removeFromHead();
		System.out.println(list);
		
		
		System.out.println("SimpleStackWithQueue Example");
		
		SimpleStackWithQueue stack = new SimpleStackWithQueue();
		
		stack.push("Rose");
		stack.push("Daisy");
		stack.push("Lily");
		stack.push("Jasmine");
		stack.push("Magnolia");
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
	}
}
