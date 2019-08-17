package queue;

import java.util.LinkedList;

/**
 * A Linked-List based Queue
 * @author Mark Floryan
 *
 * @param <T>
 */
public class Queue<T> implements IQueue<T>{

	private LinkedList<T> list;
	
	/**
	 * Constructor: Initialize the inner list
	 */
	public Queue(){
		//Todo: Implement this method
	}
	
	/**
	 * Return the size by invoking the size of the list
	 */
	public int size() {
		//Todo: Implement this method
	}
	
	/**
	 * Simply add the data to the tail of the linked list
	 */
	public void enqueue(T data) {
		//Todo: Implement this method
	}
	
	/**
	 * Simply remove data from the head of the list, throw exception if list is empty.
	 */
	public T dequeue(){		
		//Todo: Implement this method
	}
	
	
}
