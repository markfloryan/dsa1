package list;

/**
 * 
 * @author Mark Floryan
 *
 */
public class ListNode<T> {
	
	/* Data being stored in this node */
	private T data;
	
	/* Reference to the next node in the list */
	private ListNode<T> next;
	private ListNode<T> prev;
	
	public ListNode() {
		this.next = null;
		this.prev = null;
	}
	
	public ListNode(T data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	/* Getters */
	public T getData() { return this.data; }
	public ListNode<T> getNext() { return this.next; }
	public ListNode<T> getPrev() { return this.prev; }
	
	/* Setters */
	public void setNext(ListNode<T> next) { this.next = next; }
	public void setPrev(ListNode<T> prev) { this.prev = prev; }
}
