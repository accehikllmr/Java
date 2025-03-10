package Lab4;

public class Fan {
	
	/* constants values used for speed variable, double-check if these should be listed among object attributes
	 * variables made static, so that they can be accesses using class name
	 * in other words, they are tied to the class, not an instantiation of that class
	 */
	public static int SLOW = 1;
	public static int MEDIUM = 2;
	public static int FAST = 3;
	
	// constants values used for status variable
	public static boolean ON = true;
	public static boolean OFF = false;
	
	// fan attributes, default values are assigned in the default constructor
	private int speed;
	private boolean status;
	private double radius;
	private String color;
	
	// default constructor (i.e. no arguments passed during Fan object instantiation)
	public Fan() {
		
		// (March 13 Lab) CONVENTION WHEN RETRIEVING PUBLIC STATIC CONSTANTS FROM INSIDE CLASS
		
		// calling more general constructor to initialize object, passing default values to argument parameters of general constructor
		this(Fan.SLOW, Fan.OFF, 5.0, "blue");
	}
	
	// since constructors have same name, but different signatures, no issue (constructor overloading, same can be done with methods)
	public Fan(int speed, boolean status, double radius, String color) {
		
		// used argument validation for all object attributes, as in setter functions, but added default values from default constructor
		if (speed == Fan.SLOW || speed == Fan.MEDIUM || speed == Fan.FAST) {
			this.speed = speed;
		} else {
			// value assigned to speed attribute if invalid argument is passed to class constructor
			this.speed = Fan.SLOW;
		}
		
		// no argument validation needed, since only two possible values for a boolean data type
		this.status = status;
		
		if (radius > 0) {
			this.radius = radius;
		} else {
			// value assigned to radius attribute if invalid argument is passed to class constructor
			this.radius = 5.0;
		}
		
		// no argument validation for color, since no valid list of colors for fan given
		this.color = color;
	}
	
	// all helper functions below are non-static, since what they return depends on the specific Fan object
	
	// getter methods, retrieves values assigned to Fan object attributes
	public int getSpeed() {
		return this.speed;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	// setter method, if valid argument is passed to method parameter, assigns new values to Fan object attribute
	public void setSpeed(int speed) {
		if (speed == Fan.SLOW || speed == Fan.MEDIUM || speed == Fan.FAST) {
			this.speed = speed;
		}
		// if argument passed to speed parameter is not one of three possible options, then the setter function does nothing
	}
	
	public void setStatus(boolean status) {
		this.status = status;
		// see comment in method constructor
	}
	
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		}
		// if argument passed to radius parameter is a negative value, then the setter function does nothing
	}
	
	public void setColor(String color) {
		this.color = color;
		// no argument validation, since no list of valid colors was given
	}
	
	// (March 11 lecture) ANY OTHER TYPES OF HELPER FUNCTIONS TO ADD? (e.g. ACCESSORS FOR STATIC OBJECT ATTRIBUTES)
	
	// class method which indicates the area covered by the Fan object's blowing
	public double getCoverage() {
		return this.speed * this.radius * 5;
	}
	
	// class method which indicates whether the coverage area of a Fan object's blowing is suitable (according to given definition)
	public boolean isSuitable(double area) {
		// conjunction of conditions required for Fan object to have suitable blowing coverage
		return (2 * area <= Fan.SLOW * this.radius * 5) && (Fan.FAST * this.radius * 5 <= 10 * area);
	}
	
	public String toString() {
		
		String speed_str;
		// substituting integer representation of speed for its equivalent string representation
		if (this.speed == 1) {
			speed_str = "SLOW";
		} else {
			if (this.speed == 2) {
				speed_str = "MEDIUM";
			} else {
				speed_str = "FAST";
			}
		}
		
		// using single conditional to return different String objects based on whether Fan object is ON or OFF
		return (this.status == true) ? String.format("Speed: %s, Color: %s, Radius: %.1f", speed_str, this.color, this.radius) : String.format("fan is off, Color: %s, Radius: %.1f", this.color, this.radius);
	}
}
