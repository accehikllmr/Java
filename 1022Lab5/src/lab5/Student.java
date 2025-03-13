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
	
    private String yorkID;
	private String name;
	private int year;
	private ArrayList<Course> courses; // list of courses completed or completing

	// other field as needed
	
	
	
	/** customer constructor that takes name and year
	 *  sets name and year
	 *  
	 *  also creates a unique yorkID of form "York-xx" where xx is a serial number 
	 * 
	 * @param name  name of the course
	 * @param year  year of study
	 */
	  
	 // ... (String name, int year) {
	     
	 
	     this.courses = new ArrayList<>(); // create the empty arraylist
	     // create unique york ID
		 
		
	//}
	
	// getters, setters for the 4 fields.
	//.....
	
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
		
			
		return "";
	}
	
	
	

	
	
	
	
	
	
	
	
	

}
