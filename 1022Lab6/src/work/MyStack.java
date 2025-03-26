package work;

public class MyStack {

	private static final int DEFAULT_CAPACITY = 5;

	public int size; // non-private for testing purpose, should be private in real application
	public Integer[] elementData; // non-private for testing purpose

	
	/**
	 * Create an empty stack of default capacity
	 * 
	 */
	public MyStack() {
		 
	}

	/**
	 * Returns the number of elements in this collection.
	 *
	 * @return the number of elements in this list
	 */
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Returns <tt>true</tt> if this list contains no elements.
	 *
	 * @return <tt>true</tt> if this list contains no elements
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Returns <tt>true</tt> if this stack contains the specified element. More
	 * formally, returns <tt>true</tt> if and only if this stack contains at least
	 * one element <tt>e</tt> such that <tt>o.equals(e)</tt>.
	 *
	 * @param o Integer element whose presence in this stack is to be tested. Assume o
	 *          is not null.
	 * 
	 * @return <tt>true</tt> if this stack contains the specified element
	 * 
	 */
	public boolean contains(Integer o) {
		// TODO Auto-generated method stub
		 
		return false;
	}

	

	/**
	 * Add element e into (top of) the stack (the end of the array). If the array is full, expand it.
	 * Create a new array with DEFAULT_CAPACITY (5) more capacity, copy existing
	 * data to the new array.
	 * 
	 *
	 * @param e element whose presence in this stack is to be ensured. Assume e
	 *          is not null.
	 */
	public void push(Integer e) {
		 
	}

	

	/**
	 * Removes the element at the top of the stack
	 * 
	 * if stack is empty, return null
	 * 
	 * 
	 * #return the top element in the stack. null if teh stack is empty
	 */
	
	
	public Integer pop() {
		  
		 return 0;
		
	}
	public Integer peek() {
		  
		 return 0;
		
	}

	
}
