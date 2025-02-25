package lab3;

/*Write the definition for a class named Car that has the following private fields:

	yearModel: An int that holds the car's year model
	make: A String object that holds the make of the car
	speed: An int that holds the car's current speed

In addition, the class should have the following public methods:

	Constructor: Accepts two arguments. The first argument is the car's year model and
		the second argument is the car's make. These values should be assigned to the yearModel
		and make fields. The constructor should also assign 0 to the speed field.
	getYearModel: A public method that returns the value stored in the yearModel field.
	getMake: A public method that returns the value stored in the make field.
	getSpeed: A public method that returns the value stored in the speed field.
	setYearModel: A public method that accepts an int argument that is assigned to the yearModel
		field. The method returns no value.
	setMake: A public method that accepts a String argument that is assigned to the make field.
		The method returns no value.
	setSpeed: A public method that accepts an int argument that is assigned to the speed field.
		The method returns no value.
	accelerate: A public void method that adds 5 to the speed field.
	brake: A public void method that subtracts 5 from the speed field.
	getDescription: This public method should return the information about the Car instance
		in the form of a String array as given in the following example:
		if yearModel is 2025, make is "Toyota" and speed is 5 then getDescription returns:
		{"This is a 2025 model vehicle.","It is made by Toyota.", "It is cruising at 5 kmph."}
*/

public class Car {
	
	// NEED TO TEST MORE THOROUGHLY
	
	// class attributes
	private int yearModel;
	private String make;
	private int speed;
	
	// class constructor
	public Car(int _yearModel, String _make) {
		this.yearModel = _yearModel;
		this.make = _make;
		this.speed = 0;
	}
	
	// getter (accessor) methods for all Car object attributes
	public int getYearModel() {
		return this.yearModel;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	// setter (mutator) methods for all Car object attributes
	public void setYearModel(int _yearModel) {
		this.yearModel = _yearModel;
	}
	
	public void setMake(String _make) {
		this.make = _make;
	}
	
	public void setSpeed(int _speed) {
		this.speed = _speed;
	}
	
	// other methods that define possible behaviours for Car object
	public void accelerate() {
		this.speed += 5;
	}
	
	public void brake() {
		this.speed -= 5;
	}
	
	public String [] getDescription() {
		// building String object for each separate Array element in Car object description
		String yearString = String.format("This is a %d model vehicle.", this.yearModel);
		String makeString = String.format("It is made by %s.", this.make);
		String speedString = String.format("It is cruising at %d kmph.", this.speed);
		
		// instantiating Array object to insert separate Array elements for Car object description
		String [] description = {yearString, makeString, speedString};
		
		return description;
	}
	
}
