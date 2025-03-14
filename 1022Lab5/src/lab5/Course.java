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

// ENSURE THAT OBLIGATORY EQUALS METHOD ALLOWS SEARCH IN STUDENT'S ARRAYLIST OF COURSES
// ADD MORE TEST CASES

public class Course {
	
	// counting number of unnamed courses, in order to distinguish them by number
	public static int unnamedCount = 0;
	
	private int code;  
	private String name;
	private Professor instructor;
	
	/**
	 * a custom constructor
	 * 
	 * @param code  code of the course
	 * @param name  name of the course
	 * @param prof instructor of the course
	 */
	public Course(int code, String name, Professor prof) {
		// increment count of unnamed courses, in order to assign correct number to string
		if (name.equals("")) {
			Course.unnamedCount++;
		}
		
		this.code = code;
		this.name = validName(name);
		this.instructor = prof;
	}
	
	// accessor methods
	public int getCode() {
		return this.code;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Professor getInstructor() {
		return this.instructor;
	}
	
	public static int getUnnamedCount() {
		return Course.unnamedCount;
	}

	// mutator methods
	public void setCode(int code) {
		this.code = code;
	}
	
	public void setName(String name) {
		this.name = validName(name);
	}
	
	public void setInstructor(Professor prof) {
		this.instructor = prof;
	}
	
	private String validName(String name) {
		return (!name.equals("")) ? name : String.format("Unnamed Course %d", Course.getUnnamedCount());
	}
	
	@Override
	/**
	 * string representation of this course.
	 * in the format of "Course [code=cc, name=nn, instructor=instrucorName]"
	 * e.g., Course [code=2011, name=Sue, instructor=Sam]
	 * 
	 * return string representation of above format
	 */
	public String toString() {
		// calling getName method from the Professor object, since don't want Professor object itself
		return String.format("Course [code=%d, name=%s, instructor=%s]", this.getCode(), this.getName(), this.instructor.getName());
	}
	
	/**
	 * two Courses are equal if they have the same code and same name.
	 * Assume obj is of class Course and is not null
	 * 
	 * @param other course object
	 * @return true if they have same code and same name. False otherwise
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		// checking if a single object is being compared to itself
		if (this == obj) {
			return true;
		}
		// checking if the object passed as an argument is null
		if (obj == null) {
			return false;
		}
		// checking that both objects are of the same class (i.e. Course)
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		// having satisfied all of the above conditions, can now assign argument to new Course object variable
		Course other = (Course)obj;
		
		if ((this.getCode() == other.getCode()) && (this.getName().equals(other.getName()))) {
			return true;
		}
		return false;
	}
}
