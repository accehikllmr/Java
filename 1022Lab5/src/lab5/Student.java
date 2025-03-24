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
	// initializing new ArrayList here, should not be reinitialized for every class instance
	public static ArrayList<Integer> idDigits = new ArrayList<>(); // to prevent duplicate ID values among students
	
    private String yorkID;
	private String name;
	private int year;
	// not using the custom MyArrayList class and its methods, instead using official implementation
	private ArrayList<Course> courses; // list of courses completed or completing
	
	/** customer constructor that takes name and year
	 *  sets name and year
	 *  
	 *  also creates a unique yorkID of form "York-xx" where xx is a serial number 
	 * 
	 * @param name  name of the student
	 * @param year  year of study
	 */
	 public Student(String name, int year) {
		 // incrementing count of unnamed students for each one without a name
		 if (name.equals("")) {
			 Student.unnamedCount++;
		 }
		 // calling helper methods to validate String object and int (object?) arguments passed to name parameter
		 this.name = validName(name);
		 this.year = validYear(year);
	     this.courses = new ArrayList<>(); // create the empty MyArrayList, not done above
	     /* creating unique york ID, and increment digit value since new Student object created
	      * but, checking that no conflicting id already exists (possibility due to mutator)
	      */
		 while (Student.idDigits.contains(Student.yorkIDNumber)) {
			 // increments new ID number until finding one that is not already in ArrayList
			 Student.yorkIDNumber++;
		 }
		 Student.idDigits.add(Student.yorkIDNumber);
	     yorkID = String.format("York-%d", Student.yorkIDNumber);
	     // increments after assigning ID number to student
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
	
	public ArrayList<Course> getCourses() {
		return this.courses;
	}
	
	public static int getUnnamedCount() {
		return Student.unnamedCount;
	}
	
	public static ArrayList<Integer> getIdDigits() {
		return Student.idDigits;
	}
	 
	// mutator methods
	public void setYorkID(String yorkID) {
		// retrieving prefix from argument passed to method parameter
		String yorkSubstring = yorkID.substring(0, 5);
		// retrieving digits from argument passed to method parameter
		int yorkDigits = Integer.parseInt(yorkID.substring(5));
		// checking for correct substring and ID number larger than largest existing number, and not a duplicate
		if (yorkSubstring.equals("York-") && yorkDigits >= Student.yorkIDNumber && !Student.idDigits.contains(yorkDigits)) {
			this.yorkID = yorkID;
			Student.idDigits.add(yorkDigits);
		}
	}
	
	public void setName(String name) {
		this.name = validName(name);
	}
	
	public void setYear(int year) {
		this.year = validYear(year);
	}
	
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
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
	public void enrollCourse(Course c) {
		courses.add(c);
	}
	
	/**
	 * drop course c. Return true if course is dropped. return false if no such
	 * course exist in the list.
	 * 
	 * @param c  the course to drop
	 * @return true if the course is removed, false if has not taken the course
	 */
	public boolean dropCourse (Course c) {
		if (courses.contains(c)) {
			courses.remove(c);
			return true;
		}
		return false;
	}
	
	/**
	 * drop the i'th course in the list. 
	 * assume i is valid, i.e., 0 <= i < number of courses
	 * 
	 * @param i  the index of course to drop
	 * @return the course that is being dropped
	 */	
	public Course dropCourse (int i) {
		// aliasing since removing it will prevent direct access
		Course course = courses.get(i);
		courses.remove(i);
		return course;
	}
	
	/**
	 * get the i'th course in the list. 
	 * assume i is valid, i.e., 0 <= i < number of courses
	 * 
	 * @param i  the index of course to get
	 * @return the course at the position
	 */
	public Course getCourse(int i) {
		return courses.get(i);
	}
	
	/**
	 * get the title of the i'th course in the list. 
	 * assume i is valid, i.e., 0 <= i < number of courses
	 * 
	 * @param i  the index of course to get
	 * @return the title of course at the position
	 */
	
	public String getCourseTitle(int i) {
		return courses.get(i).getName();
	}
	
	/**
	 * get the instructor's name of the i'th course in the list. 
	 * assume i is valid, i.e., 0 <= i < number of courses
	 * 
	 * @param i  the index of course to get
	 * @return the name of instructor of course at the position
	 */
	public String getInstructorName(int i) {
		return courses.get(i).getInstructor().getName();
	}
	
	/**
	 * get total number of courses has taken or is taking
	 *
	 * @return the number of courses taken or taking
	 */
	public int totalCourses() {
		return this.courses.size();
	}
	
	/**
	 * return true if course c has been completed or is taking, return false otherwise
	 *
	 * @return if the course has been taken or is taking
	 */
	public boolean hasTaken (Course c) {
		return courses.contains(c);
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
		// string to build sequence of course codes, conditioned on whether empty or not
		String codes = (courses.size() != 0) ? "[" : "[]";
		// iterating through courses to retrieve codes and build string
		for (int i = 0; i < courses.size(); i++) {
			// retrieving course object from index i, then retrieving its code, converting to String
			String codeAdd = Integer.toString(courses.get(i).getCode());
			// conditional addition to string, based on whether it is final course code to add
			codes += (i != courses.size() - 1) ? String.format("%s-", codeAdd) : String.format("%s]", codeAdd);
		}
		return String.format("%s %s %d %s", this.getYorkID(), this.getName(), this.getYear(), codes);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		Student other = (Student)obj;
		
		// students are uniquely identified using their IDs, so no need to compare other fields (assuming code for assigning IDs is foolproof)
		if (this.getYorkID().equals(other.getYorkID())) {
			return true;
		}
		return false;
	}
}
