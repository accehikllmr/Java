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
import java.util.ArrayList;

public class Student {
	
	// static attribute for student ID digit
	public static int yorkIDNumber = 1;
	// static attribute for unnamed student count
	public static int unnamedCount = 0;
	
    private String yorkID;
	private String name;
	private int year;
	private ArrayList<Course> courses; // list of courses completed or completing

	// ADD OTHER FIELDS, IF NEEDED
	
	/** customer constructor that takes name and year
	 *  sets name and year
	 *  
	 *  also creates a unique yorkID of form "York-xx" where xx is a serial number 
	 * 
	 * @param name  name of the student
	 * @param year  year of study
	 */
	  
	 // ... (String name, int year) {
	 public Student(String name, int year) {
		 // incrementing count of unnamed students for each one without a name
		 if (name.equals("")) {
			 Student.unnamedCount++;
		 }
		 // calling helper methods to validate String object and int (object?) arguments passed to name parameter
		 this.name = validName(name);
		 this.year = validYear(year);
	     this.courses = new ArrayList<>(); // create the empty arraylist
	     // creating unique york ID, and increment digit value since new Student object created
		 yorkID = String.format("York-%d", Student.yorkIDNumber);
		 Student.yorkIDNumber++;
	}
	
	// accessor method
	public String getYorkID() {
		return this.yorkID;
	}
	 
	public String getName() {
		return this.name;
	}
	
	public int getYear() {
		return this.year;
	}
	
	// ADD ACCESSOR METHOD FOR COURSES ARRAYLIST
	
	public static int getUnnamedCount() {
		return Student.unnamedCount;
	}
	 
	// mutator methods
	public void setYorkID(String yorkID) {
		// NEED TO VALIDATE ARGUMENT PASSED TO METHOD
		// IF INVALID, NO CHANGE MADE
		// NEED TO CHECK FOR CONFLICT WITH EXISTING STUDENT IDS
	}
	
	public void setName(String name) {
		this.name = validName(name);
	}
	
	public void setYear(int year) {
		this.year = validYear(year);
	}
	
	public void setCourses() {
		// NEED TO COMPLETE SIGNATURE, UNSURE HOW TO DO IT FOR ARRAYLIST
	}
	
	// helper methods
	public int validYear(int year) {
		return (year > 0) ? year : 1;
	}
	
	public String validName(String name) {
		return (!name.equals("")) ? name : String.format("Unnamed Student %d", Student.getUnnamedCount());
	}

	/**
	    * enroll course c 
	    * @param c  the course to enroll
	    * 
	    */
	public void enrollCourse(Course c)
	{
		 
	}
	
	/**
	 * drop course c. Return true if course is dropped. return false if no such
	 * course exist in the list.
	 * 
	 * @param c  the course to drop
	 * @return true if the course is removed, false if has not taken the course
	 */
	public boolean dropCourse (Course c) {
		
	}
	
	/**
	 * drop the i'th course in the list. 
	 * assume i is valid, i.e., 0 <= i < number of courses
	 * 
	 * @param i  the index of course to drop
	 * @return the course that is being dropped
	 */	
	public Course dropCourse (int i) {
		 
	}
	
	/**
	 * get the i'th course in the list. 
	 * assume i is valid, i.e., 0 <= i < number of courses
	 * 
	 * @param i  the index of course to get
	 * @return the course at the position
	 */
	public Course getCourse(int i) {
		 
	}
	
	 
	/**
	 * get the title of the i'th course in the list. 
	 * assume i is valid, i.e., 0 <= i < number of courses
	 * 
	 * @param i  the index of course to get
	 * @return the title of course at the position
	 */
	
	public String getCourseTitle(int i) {
		 
	}
	
	
	
	/**
	 * get the instructor's name of the i'th course in the list. 
	 * assume i is valid, i.e., 0 <= i < number of courses
	 * 
	 * @param i  the index of course to get
	 * @return the name of instructor of course at the position
	 */
	
	public String getInstrucorName(int i) {
		 
	}
	
	 
	/**
	 * get total number of courses has taken or is taking
	 *
	 * @return the number of courses taken or taking
	 */
	public int totalCourses() {
		 
	}
	
	 
	
	/**
	 * return true if course c has been completed or is taking, return false otherwise
	 *
	 * @return if the course has been taken or is taking
	 */
	public boolean hasTaken (Course c)
	{
		 
	}


	@Override
	/**
	 * return a string representation of the student
	 * in the form of ID name year [course codes]
	 * e.g., 
	 * York-02 Sue 2 []
	 * York-02 Sue 2 [1022]
	 * York-02 Sue 2 [1012-1022-2011]
	 * 
	 * @return a string representation of above format
	 **/
	public String toString() {
		return String.format("%s %s %d", this.getYorkID(), this.getName(), 1);
	}
	
	
	

	
	
	
	
	
	
	
	
	

}
