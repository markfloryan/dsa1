package list;

/**
 * 
 * A custom built linked list
 * T here is the type the list stores
 */
public class LinkedList<T> implements List<T>{

	/* Dummy head and tail */
	private ListNode<T> head, tail;
	private int size;
	
	public LinkedList() {
		//TODO: Write constructor
	}
	
	public int size() {
		//TODO: Write size method
		return -1
	}
	
	/**
	 * Clears out the entire list
	 */
	public void clear() {
		//TODO: Write clear method
	}
	
	/**
	 * Inserts new data at the end of the list (i.e., just before the dummy tail node)
	 * @param data
	 */
	public void insertAtTail(T data) {
		//TODO: Write insertAtTail
	}
	
	/**
	 * Inserts data at the front of the list (i.e., just after the dummy head node
	 * @param data
	 */
	public void insertAtHead(T data) {
		//TODO: Write insertAtHead
	}
	
	/**
	 * Inserts node such that index becomes the position of the newly inserted data
	 * @param data
	 * @param index
	 */
	public void insertAt(int index, T data) {
		//TODO: Write insertAt()
	}
	
	public T removeAtTail(){
		//TODO: Write removeAtTail()
		return null;
	}
	
	public T removeAtHead(){
		//TODO: Write removeAtHead()
		return null;
	}
	
	/**
	 * Returns index of first occurrence of the data in the list, or -1 if not present
	 * @param data
	 * @return
	 */
	public int find(T data) {
		//TODO: Write find
		return -1;
	}
	
	/**
	 * Returns the data at the given index, null if anything goes wrong (index out of bounds, empty list, etc.)
	 * @param index
	 * @return
	 */
	public T get(int index) { 
		//TODO: Write get
		return null;
	}
	
	/**
	 * Returns the list as space separated values
	 */
	public String toString() {
		String toRet = "";
		
		ListNode<T> curNode = head.getNext();
		while(curNode != tail) {
			toRet += curNode.getData() + " ";
			curNode = curNode.getNext();
		}
		
		return toRet;
	}
	
	
}
