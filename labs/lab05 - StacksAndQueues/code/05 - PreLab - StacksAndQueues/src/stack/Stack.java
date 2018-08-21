package stack;

/**
 * An Array-based stack
 *
 * @param <T>
 */
public class Stack<T> implements IStack<T>{

	private Object[] data;
	private int size = 0;
	private static final int INITIAL_CAPACITY = 100;
	
	public Stack(){
		this(INITIAL_CAPACITY);
	}
	
	public Stack(int capacity) {
		this.data = new Object[capacity];
		this.size = 0;
	}

	
	public void push(T data) {
		//TODO: Write this method
	}

	
	@SuppressWarnings("unchecked")
	public T pop(){
		//TODO: Write this method
		return null;
	}

	/**
	 * Returns the size of this Stack
	 */
	public int size() {
		//TODO: Write this method
		return -1;
	}
	
	public int capacity() {
		//TODO: Write this method
		return -1;
	}

	/**
	 * When the underlying array fills up, we need to resize it to accommodate the stack's elements
	 * Ignores the request if the new capacity is too small to fit the elements already in the stack
	 */
	public void resize(int newCapacity){
		//TODO: Write this method
	}
	
	
}
