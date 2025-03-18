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

// ABSTRACT CLASS WHICH IMPLMENENTS THE ARRAYLIST LIST INTERFACE?
// NEED ACCESSOR AND MUTATOR METHODS FOR THIS CLASS?
// ADD MORE TEST CASES

public class MyArrayList {

	private static final int DEFAULT_CAPACITY = 5;
	
	int size;  // non-private for testing purpose, should be private in real application
	Course[] elementData; // non-private for testing purpose
	
	/**
	 * Create an empty list of default capacity
	 * 
	 */
    public MyArrayList() {
    	this.elementData = new Course[DEFAULT_CAPACITY];
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
		// instead of method calculating size upon every call, value is calculated upon each course addition
		return this.size;
		/* counting size of Array object, but excluding all null elements from count,
		 * storing value as size field of Array object
		 
		this.size = 0;
		for (int i = 0; i < elementData.length; i++) {
			if (elementData[i] != null) {
				this.size++;
			}
		}
		*/
	}
	
	/**
     * Returns <tt>true</tt> if this list contains no elements.
     *
     * @return <tt>true</tt> if this list contains no elements
     */
	public boolean isEmpty() {
		// initializing indicator which switches to false upon finding a single non-null element in Array object
		boolean allNull = true;
		// checking if all elements are null (i.e. no elements)
		for (int i = 0; i < elementData.length; i++) {
			if (elementData[i] != null) {
				allNull = false;
				break;
			}
		}
		// if either is true, then Array object is considered empty
		return this.elementData.length == 0 || allNull;
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
		// iterating through Array object Course objects to find identical object which matches argument object
		for (int i = 0; i < this.elementData.length; i++) {
			Course course = this.elementData[i];
			/* using method from Course class to compare Course object attributes
			 * lazy evaluation for comparing null value, since cannot invoke equals method
			 */
			if (course != null && o.equals(course)) {
				return true;
			}
		}
		return false;
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
    	return this.elementData[index];
	}

	/**
	 * Add element e into (the end of) the list. 
	 * If the array is full, expand it.
	 * Create a new array with DEFAULT_CAPACITY (5) more capacity, copy existing data to the new array.
	 * 
	 * @param e element whose presence in this collection is to be ensured. Assume e is not null. 
	 */
    public void add(Course e) {
    	// to avoid IndexError, first check if Array object has space for a new Course object (i.e. no null elements or empty of size 0)  	
    	if (this.size == this.elementData.length) {
    		// creating new Array object with size increased by 5, relative to current number of non-null elements
    		Course[] newElementData = new Course[this.size + DEFAULT_CAPACITY];
    		// using size, since all elements beyond size of Array object, if they exist, are null
			for (int i = 0; i < this.size; i++) {
				// aliasing to Course object at position i, same course so any change to object should carry across all instances
				newElementData[i] = this.elementData[i];
			}
			// having cycled through original Array object, now point original Array object to new Array object
			this.elementData = newElementData;
			// adding Course object at position following last non-null Array object element, not aliasing since need same address
			newElementData[this.size] = e;
		// case where there is space remaining in the Array object
    	} else {
    		// again, not aliasing since want single Course object to exist, so any change should carry across instances
			this.elementData[this.size] = e;
		}
    	// size of list increases for each additional element added
		this.size++;	 
	}
		 
	/**
	 * Removes a single instance of the specified element from this list if it is present.  
	 * More formally, removes an element <tt>e</tt> such that <tt>c.equals(e)</tt>. 
	 * 
	 * If this collection contains one or more such elements, removes the first occurrence 
	 * of the specified element. If this collection does not contain the element, it is unchanged.
	 * 
	 * Shifts any subsequent elements to the left (their indices decrease).  
	 * Returns the element that was removed from the list.
	 * 
	 * @param o element to be removed from this list, if present. Assume o is not null.
	 * @return if this list contained the specified element. false otherwise.
	 */ 
	public boolean remove(Course c) {		
		// iterating through Array object, not alias, since need to modify original
		for (int i = 0; i < this.size; i++) {
			if (this.elementData[i].equals(c)) {
				// iterating through Array object from index of object to remove, until end
				for (int j = i; j < this.size; j++) {
					// shifting every element one index to the left, overwriting element to remove, only at this index, and leaving null at the end
					this.elementData[j] = this.elementData[j + 1];
				}
				// one element was remove, so size of the Array object is reduced by one
				this.size--;
				// since element was found in the Array object
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Removes the element at the specified position in this list. 
	 * Shifts any subsequent elements to the left (their indices decrease).  
	 * Returns the element that was removed from the list.
	 * 
	 * Assume index is in the range, i.e., (index >0 && index <= size())
	 * 
	 * @param index the index of the element to be removed
	 * @return the element previously at the specified position
	 */		
	public Course remove(int index) {
		// assign Course object to variable, otherwise will not be accessible once it is removed from Array object
		Course removed = this.elementData[index];
		// iterating through Array object, but staring at index for Course object to be removed
		for (int i = index; i < this.size; i++) {
			this.elementData[i] = this.elementData[i + 1];
		}
		// Course object removed, so Array object size is reduced by one
		this.size--;
		return removed;
	}

	// Search Operations

	/**
	 * Returns the index of the first occurrence of the specified element in this list,
	 * or -1 if this list does not contain the element.
	 * 
	 * More formally, returns the lowest index <tt>i</tt> such that <tt>o.equals(get(i))</tt>,
	 * or -1 if there is no such index.
	 * 
	 * @param o element to search for. Assume o is not null
	 * @return the index of the first occurrence of the specified element in this list, 
	 * or -1 if this list does not contain the element
	 */
	public int indexOf(Course o) {
		for (int i = 0; i < this.elementData.length; i++) {
			if (o.equals(this.elementData[i])) {
				return i;
			}
		}
		// if Course object is not found in list
		return -1;
	}
}
