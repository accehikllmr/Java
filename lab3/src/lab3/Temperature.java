package lab3;

/*Write the definition of class named Temperature.
 * The Temperature class will hold a temperature in Fahrenheit and provide methods to get
 * the temperature in Fahrenheit, Celsius, and Kelvin.
 * 
 * The class should have the following private field:
 * 		ftemp: a double that holds a Fahrenheit temperature.
 * 
 * The class should have the following public methods:
 * 		Constructor: The constructor should accept a Fahrenheit temperature (as a double) and
 * 			assign it to the ftemp field.
 * 		setFahrenheit: This public method should accept a Fahrenheit temperature (as a double)
 * 			and assign it to the ftemp field.
 * 		getFahrenheit: This public method should return the value of the ftemp field. The method
 * 			should accept no arguments.
 * 		getCelsius: This public method should return the value of the ftemp field converted to
 * 			Celsius. The method should accept no arguments. Use the following formula to convert
 * 			to Celsius:
 * 				Celsius = (5.0 / 9.0) * (Fahrenheit - 32)
 * 		getKelvin: This public method should return the value of the ftemp field converted to
 * 			Kelvin. The method should accept no arguments. Use the following formula to convert
 * 			to Kelvin:
 * 				Kelvin = ((5.0 / 9.0) * (Fahrenheit - 32)) + 273.15
 * 		getAll: This public method should return the value of the ftemp field, its Celsius
 * 			equivalent, and its Kelvin equivalent, all three in the form of a double array.
 *			For example, if the ftemp is 32, then the return value is {32.0,0.0,273.15}*/

public class Temperature {
	
	// NEED TO TEST MORE THOROUGHLY
	
	// class attributes, private since cannot be accessed outside of the class
	private double ftemp;
	
	// class constructor, not sure whether name of parameter must differ from name of attribute 
	public Temperature(double _ftemp) {
		this.ftemp = _ftemp;
	}
	
	// setter (mutator) method to change the ftemp attribute of an existing Temperature object
	public void setFahrenheit(double _ftemp) {
		this.ftemp = _ftemp;
	}
	
	// getter (accessor) method to retrieve the ftemp attribute from an existing Temperature object
	public double getFahrenheit() {
		return this.ftemp;
	}
	
	// getter method which retrieves the ftemp attribute from an existing Temperature object, but only after converting to Celsius
	public double getCelsius() {
		// formula to convert Fahrenheit units into Celsius units
		return (5.0 / 9.0) * (this.ftemp - 32.0);
	}
	
	// getter method which retrieves the ftemp attribute from an existing Temperature object, but only after converting to Kelvin
	public double getKelvin() {
		// formula to convert Fahrenheit units into Kelvin units, perhaps there is a way to call the getCelsius function to avoid repeating formula
		return this.getCelsius() + 273.15; 
	}
	
	// getter method which retrieves the ftemp attribute from an existing Temperature object, as an Array containing all conversions
	public double [] getAll() {
		// instantiating Array object with defined size containing each temperature conversion
		double [] alltemp = {this.getFahrenheit(), this.getCelsius(), this.getKelvin()};
		
		return alltemp;
	}
}
