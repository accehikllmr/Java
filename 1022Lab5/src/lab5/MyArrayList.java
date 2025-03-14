///////////////////////////////////////////////////////////////////////////
//Full Name : Michel Clark
//Yorku Email : mciehl@my.yorku.ca
//Date : March 23, 2025
//Authenticity Declaration:
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider. This submitted
//piece of work is entirely of my own creation.
///////////////////////////////////////////////////////////////////////////

package lab5;

public class MyArrayList  {

	private static final int DEFAULT_CAPACITY = 5;
	
	int size;  // non-private for testing purpose, should be private in real application
	Course[] elementData; // non-private for testing purpose
	
	
	/**
	 * Create an empty list of default capacity
	 * 
	 */
    public MyArrayList() {
    	this.elementData = new Course [DEFAULT_CAPACITY];
	}

	/**
	 * Create an empty list of capacity capa
	 * 
	 * @param capa the initial capacity. Assume greater than 0.
	 */
	 
    public MyArrayList(int capa) {
		 this.elementData = new Course[capa];
	}

	
	 
    /**
     * Returns the number of elements in this collection.  
     *
     * @return the number of elements in this list
     */
	public int size() {
		 
	}
	

	 /**
     * Returns <tt>true</tt> if this list contains no elements.
     *
     * @return <tt>true</tt> if this list contains no elements
     */
	public boolean isEmpty() {
		 
	}

	 
	 /**
     * Returns <tt>true</tt> if this list contains the specified element.
     * More formally, returns <tt>true</tt> if and only if this list
     * contains at least one element <tt>e</tt> such that
     * <tt>o.equals(e)</tt>.
     *
     * @param o course element whose presence in this list is to be tested. Assume o is not null.
     * 
     * @return <tt>true</tt> if this collection contains the specified
     *         element
     * 
     */
	public boolean contains (Course o) {
		 
	}

	 
	/**
     * Returns the element at the specified position in this list.
     * assume the specified position is valid, in the range of 0-size()
     * 
     * @param index index of the element to return.  Assume <tt>index &lt; 0 || index &gt;= size()</tt>)
     * @return the element at the specified position in this list
     *               
     */
    public Course get(int index) {
		 
	}

	 
	
	    /**
	     * Add element e into (the end of) the list.
	     * If the array is full, expand it.
	     * Create a new array with DEFAULT_CAPACITY (5) more capacity, copy existing data to the new array.
	     *  
	    *
	    * @param e element whose presence in this collection is to be ensured. Assume e is not null. 
	    */
	   public void add(Course e) {
		 
		//....
		if (    ) { // full, need to expand by 5
		// 1) crate bigger array, 2) copy existing data 3) this.elementData reference the bigger array
			 
		}
		 
	}
		
	
	  
	
	   /**
	     * Removes a single instance of the specified element from this list
	     * if it is present.  
	     * More formally, removes an element <tt>e</tt> such that
	     * <tt>c.equals(e)</tt>. 
	     * If this collection contains one or more such elements,   
	     * removes the first occurrence of the specified element. If this collection does not contain the element, it is unchanged.
	     * 
	     * Shifts any subsequent elements to the left (their indices decrease).  
	     * Returns the element that was removed from the
	     * list.
	     * 	       
	     * @param o element to be removed from this list, if present. Assume o is not null.
	     * @return if this list contained the specified element. false otherwise.
	     */ 
	public boolean remove(Course c) {
		 
		 
	}
	
	 /**
	    * Removes the element at the specified position in this list. 
	    * Shifts any subsequent elements to the left (their indices decrease).  
	    * Returns the element that was removed from the
	    * list.
	    * 
	    * Assume index is in the range, i.e., (index >0 && index <= size())
	    *
	    * @param index the index of the element to be removed
	    * @return the element previously at the specified position
	    *       
	    */
			
	public Course remove(int index) {
		 
	}
	

	// Search Operations

	   /**
	    * Returns the index of the first occurrence of the specified element
	    * in this list, or -1 if this list does not contain the element.
	    * More formally, returns the lowest index <tt>i</tt> such that
	    * <tt>o.equals(get(i))</tt>,
	    * or -1 if there is no such index.
	    *
	    * @param o element to search for. Assume o is not null
	    * @return the index of the first occurrence of the specified element in
	    *         this list, or -1 if this list does not contain the element
	    * */
	 
	public int indexOf(Course o) {
		 
	}
 

}
