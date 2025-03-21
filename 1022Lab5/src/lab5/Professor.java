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

// NEED WE ADD EQUALS AND TOSTRING METHODS FOR THIS CLASS?
// ADD MORE TEST CASES

public class Professor {
	
	// counting number of unnamed professors, in order to distinguish them by number
	public static int unnamedCount = 0;
	
	private String name;
	private int year;
	
	// customer constructor
	public Professor(String name, int year) {
		// incrementing count of unnamed professors, in order to assign correct number to string
		if (name.equals("")) {
			Professor.unnamedCount++;
		}
		// using helper method to validate arguments passed to constructor
		this.year = validYear(year);
		this.name = validName(name);
	}
	
	// accessor methods
	public int getYear() {
		return this.year;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static int getUnnamedCount() {
		return Professor.unnamedCount;
	}
	
	// mutator methods
	public void setYear(int year) {
		this.year = validYear(year);
	}
	
	public void setName(String name) {
		this.name = validName(name);
	}
	
	// helper method to ensure that Professor object year is a positive value
	private int validYear(int year) {
		return (year > 0) ? year : 1;
	}
	
	// helper method to assign name to Professor object if empty string argument is passed
	private String validName(String name) {
		return (!name.equals("")) ? name : String.format("Unnamed Professor %d", Professor.getUnnamedCount());
	}
}
