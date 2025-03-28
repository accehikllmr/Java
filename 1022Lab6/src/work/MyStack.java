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
		// initialized to size 0 since the Stack only contains null elements
		 this.size = 0;
		 // Stack is implemented using an Array object
		 this.elementData = new Integer[DEFAULT_CAPACITY];
	}

	/**
	 * Returns the number of elements in this collection.
	 *
	 * @return the number of elements in this list
	 */
	public int size() {
		return this.size;
	}

	/**
	 * Returns <tt>true</tt> if this list contains no elements.
	 *
	 * @return <tt>true</tt> if this list contains no elements
	 */
	public boolean isEmpty() {
		return this.size == 0;
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
		for (Integer element : this.elementData) {
			if (element != null && element.equals(o)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Add element e into (top of) the stack (the end of the array). If the array is full, expand it.
	 * Create a new array with DEFAULT_CAPACITY (5) more capacity, copy existing data to the new array.
	 * 
	 * @param e element whose presence in this stack is to be ensured. Assume e is not null.
	 */
	public void push(Integer e) {
		 if ((this.size) == this.elementData.length) {
			 Integer[] newStack = new Integer[this.size + DEFAULT_CAPACITY];
			 for (int i = 0; i < this.size; i++) {
				 newStack[i] = this.elementData[i];
			 }
			 newStack[this.size] = e;
			 this.elementData = newStack;
		 } else {
			 this.elementData[this.size] = e;
		 }
		 this.size++;
	}

	/**
	 * Removes the element at the top of the stack if stack is empty, return null
	 * 
	 * #return the top element in the stack. null if the stack is empty
	 */
	public Integer pop() {
		Integer popElement = this.elementData[this.size - 1];
		this.elementData[this.size - 1] = null;
		this.size--;
		return popElement;
		
	}
	public Integer peek() {
		return this.elementData[this.size - 1];
	}
}
