package Lab4;

public class RoomDimension {
	
	private double length;
	private double width;
	
	// general class constructor
	public RoomDimension(double length, double width) {
		/* validating arguments passed to constructor parameters, assigning 1.0 for 
		 * default length and width, a room has to be 2-Dimensional
		 */
		this.length = validDimension(length);
		this.width = validDimension(width);
	}
	
	// default constructor
	public RoomDimension() {
		this(1.0, 1.0);
	}
	
	// accessor methods
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	// mutator methods
	public void setLength(double length) {
		this.length = validDimension(length);
	}
	
	public void setWidth(double width) {
		this.width = validDimension(width);
	}
	
	// class method which calculates the area of the RoomDimension object
	public double getArea() {
		// unsure of what is best practice here, retrieving attributes directly or through accessor
		return this.getLength() * this.getWidth();
	}
	
	// class method which represents the values assigned to the RoomDimension object attributes
	public String toString() {
		return String.format("Length: %.1f, Width: %.1f", this.getLength(), this.getWidth());
	}
	
	// class method which compares the dimensions of the attributes of 2 RoomDimension objects, to determine if they're equal
	public boolean equals(RoomDimension other) {
		return (this.getLength() == other.getLength()) && (this.getWidth() == other.getWidth());
	}
	
	// class method which determines whether a given Fan object is suitable for a given RoomDimension object
	public boolean isFanSuitable(Fan fan) {
		// passing area of RoomDimension object as argument since it will be compared with the blowing area of the fan, to determine suitability
		return fan.isSuitable(this.getArea());
	}
	
	// helper method
	public double validDimension(double value) {
		return (value > 0) ? value : 1.0;
	}
	
	/* (March 13 lab) 
	 * SHOULD THERE BE ACCESSORS FOR STATIC OBJECT ATTRIBUTES?
	 */
}
