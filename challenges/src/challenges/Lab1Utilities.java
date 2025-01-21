package challenges;
//You are NOT allowed to add any "import" statement other than 
//the ones already in the starter files. 

/* EXAMINE DEFAULT UNIT TESTS TO SEE IF THEY COVER ALL EDGE CASES
 * IF NOT, ADD MORE UNIT TESTS
 * ALSO, DO WE HAVE TO ACCOUNT FOR INVALID INPUT VALUES (e.g. starting balance is negative)
 */

////////////////////////////////////////////////////////////
//Full Name : Michel Clark
//Yorku Email : mciehl@my.yorku.ca
//Date : January 26, 2025
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
////////////////////////////////////////////////////////////
public class Lab1Utilities {
	// ALREADY IMPLEMENTED; DO NOT MODIFY

	private Lab1Utilities() {
		// empty to prevent object creation
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}
	
	/**
	 *  
	 * Write a static method named weather that takes two integers as parameters representing a month and day.
	 * The month is specified as an integer between 1 and 12, such as 1 for January, 2 for February, etc.
	 * The day of the month is an integer between 1 and 31. 
	 * The method returns a String indicating the standard Toronto weather season for the given month and day.
	 * 
	 * <p>If the date falls between December 15 and March 25,  the method should return  "The current weather season is Winter"</p>
	 * <p>If the date falls between April 1 and May 31, the method should return "The current weather season is Spring"</p>
	 * <p>If the date falls between June 1 and September 15, the method should return "The current weather season is Summer"</p>
	 * <p>if the date falls between September 16 and November 30, the method should return "The current weather season is Fall"</p>
	 * <p>Otherwise, return "Unknown".</p>
	 * 
	 *  <p>
    * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
    * strictly forbidden. Violation of this will result in a 70% penalty on your
    * marks. Try to solve this problem using Java Control Structures (selection
    * structures, repetition structures, and nested Loops) only </strong>
    * </p>
    * <p>Make sure the method compiles without errors and returns the correct result
    *  when invoked.
    * </p>
    * 
	 *<p>
	 *Examples:
     * </p>
     *
     * <pre>
     * if month=12 and  day= 20 then return "The current weather season is Winter"
     * if month=3 and  day= 10 then return "The current weather season is Winter"
     * if month=4 and  day= 15 then return "The current weather season is Spring"
     * if month=7 and  day= 1 then return "The current weather season is Summer"
     * if month=10 and  day= 1 then return "The current weather season is Fall"
     * if month=12 and  day= 10 then return "Unknown"
     * </pre>
	 * <p>
     * Remember that double quotations are shown above to indicate the beginning and
     * end of the string value, and these double quotations are not part of the
     * return value.
     * </p> 
	 * 
	 * @param month  Positive integer between 1 and 12, such as 1 for January, 2 for February, etc. 
	 * @param day  Positive integer between 1 and 31
	 * @return String indicates the standard Toronto weather season for that month and day.
	 * <p>
     *     <strong> Precondition: </strong> month and day are non-negative values
     * </p>
	 */	
	
	public static String weather(int month, int day) 
	{
		/* Your implementation of this method starts here.
	        * Recall that :
	        * 1. No System.out.println statements should appear here.
	        * 	  Instead, you need to return the result.
	        * 2. No Scanner operations should appear here (e.g., input.nextInt()).
	        *    Instead, refer to the input parameters of this method.
	        */
		
		// defining valid values for months and days, to avoid mis-interpretation of season (e.g. December 32)
		boolean validDay = day >= 1 && day <= 31;
		boolean validMonth = month >= 1 && month <= 12;
		
		// validating arguments passed to month and day parameters, halts program if invalid
		if (!validDay || !validMonth)
		{
			return "Unknown";
		}
		
		// defining each season according to given dates, presuming that months must have correct number of days
		boolean isWinter = (month == 12 && day >= 15) || month == 1 || (month == 2 && day <= 28) || (month == 3 && day <= 25);
		boolean isSpring = (month == 4 && day <= 30) || month == 5;
		boolean isSummer = (month == 6 && day <= 30) || month == 7 || month == 8 || (month == 9 && day <= 15);
		boolean isFall = (month == 9 && day <= 30) || month == 10 || (month == 11 && day <= 30);
		
		// branching returns appropriate statement, based on truth value of boolean variables
		if (isWinter)
		{
			return "The current weather season is Winter";
		}
		else if (isSpring)
		{
			return "The current weather season is Spring";
		}
		else if (isSummer)
		{
			return "The current weather season is Summer";
		}
		else if (isFall)
		{
			return "The current weather season is Fall";
		}
		else 
		{
			return "Unknown";
		}
		
	}
	
	
	/**
	 * Write a static method name  temperatureConverter that 
	 * converts a Fahrenheit degree to Celsius using the
	 * formula celsius = (5/9) (fahrenheit - 32).
	 *
	 * The method receives temperature degrees in Fahrenheit and returns string
	 * value as shown below in the examples. The celsius degree is rounded to two
	 * decimal points.
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if fahrenheit=100.0 then return "Fahrenheit (100.0) is equivalent to (37.78) in Celsius"
	 * if fahrenheit=10.0 then return "Fahrenheit (10.0) is equivalent to (-12.22) in Celsius"
	 * if fahrenheit=49.0 then return "Fahrenheit (49.0) is equivalent to (9.44) in Celsius"
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param fahrenheit input temperature value as double
	 * @return string value, see above examples
	 */
   
	public static String temperatureConverter(double fahrenheit) 
	{
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		// validating argument passed to class parameter: above absolute zero
		if (fahrenheit < -459.67) 
		{
			return String.format("Invalid temperature: Below absolute zero");
		}
		
		double celciusTemp;
		
		// all values in calculation must have the same type, otherwise yields incorrect result
		celciusTemp = (5.0 / 9.0) * (fahrenheit - 32.0);
		
		// verify whether or not format method for String objects can be used in this assignment
		return String.format("Fahrenheit (%.1f) is equivalent to (%.2f) in Celsius", fahrenheit, celciusTemp);
	}

	
	/**
	 * Write a static method name ageinyearsDetailed that takes the age in days 
	 * and then calculates the age
	 * in years, months, and remaining days. Assume there are 365 days 
	 * in a year and approximately 30 days in a month.
	 * The method returns a string value as shown in the examples below.
	 *
	 * Examples:
	 *<pre>
	 * if days=7000 then return "Age in days (7000), age in years is (19), months (2), with remaining days (5)"
	 * if days=1900 then return "Age in days (1900), age in years is (5), months (2), with remaining days (15)"
	 * if days=8016 then return "Age in days (8016), age in years is (21), months (11), with remaining days (21)"
	 *</pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 *
	 * @param days input days value as int value
	 * @return String value as shown in the examples above (Check test cases)
	 */
	
	public static String ageInYearsDetailed(int days) 
	{
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		// validating argument passed to class parameter: not negative
		if (days < 0)
		{
			return "Invalid age in days: Below zero";
		}
		
		// variables to store results for returned value
		int ageYears;
		int ageMonths;
		int ageDays;
	
		// constants, for converting days into years and months
		int DAYS_IN_YEAR = 365;
		int DAYS_IN_MONTH = 30;
		
		// numerator and denominator are both integers, so result is integer (i.e. equivalent to // in Python), how many times 365 goes into total days
		ageYears = days / DAYS_IN_YEAR;
		// take the remainder of 365 into total days (what does not make a whole year) and see how many times 30 goes into it
		ageMonths = (days % DAYS_IN_YEAR) / DAYS_IN_MONTH;
		// take remainder of days that don't make a whole year, and a whole month, gives days in the month
		ageDays = (days % DAYS_IN_YEAR) % DAYS_IN_MONTH;
		
		return String.format("Age in days (%d), age in years is (%d), months (%d), with remaining days (%d)", days, ageYears, ageMonths, ageDays);
    }
	
	/**
	 * Implement the method that converts centimetres to an integral number of feet
	 * and any remaining inches. The method receives the centimetres as double data
	 * type and returns string value as shown in the examples below. Note that the
	 * remaining inches value is rounded to two decimal points.
	 * 
	 * <p>
	 * You need the following facts to complete the implementation of this method.
	 * There are 12 inches in a foot and one inch is 2.54 centimetres.
	 * 
	 * </p>
	 * 
	 * *
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if cm=157.0 then return "157.00cm is 5ft and 1.81in"
	 * if cm=57.15 then return "57.15cm is 1ft and 10.50in"
	 * if cm=37.0 then return "37.00cm is 1ft and 2.57in"
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param cm double value of centimetres
	 * @return String value as shown above
	 */

	public static String distanceConverter(double cm) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		// validating argument passed to class parameter: not negative
		if (cm < 0)
		{
			return "Invalid length: Less than zero";
		}
		
		// variables to store results for returned value
		double feet;
		double inches;
		// variable to calculate above values
		double totalInches;
		
		// constants for conversion between cm and in
		double INCHES_IN_FEET = 12.0;
		double CM_IN_INCHES = 2.54;

		// converting total cm to total in
		totalInches = cm / CM_IN_INCHES;
		// how many times 1 foot goes into total inches
		feet = Math.floor(totalInches / INCHES_IN_FEET);
		// inches remaining from above calculation
		inches = totalInches % INCHES_IN_FEET;
		
		// .0 for feet, since double type but want no digits after decimal point
		return String.format("%.2fcm is %.0fft and %.2fin", cm, feet, inches);
	}

	/**
	 * Implement the method that takes in two numbers as input arguments: an account
	 * balance (rounded to two decimal points) and an annual interest rate expressed
	 * as a percentage. The method return string indicated the balance after five
	 * years have elapsed. The return balance after five years should be rounded to
	 * two decimal points See examples below. Note that the interest from the first
	 * year is added back to the bank balance and is, therefore, itself subject to
	 * interest in the second year, and so on.
	 * 
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if balance=6000.00 and interest=4.25 then return "The balance was 6000.00 with interest 4.25, after five years balance is  7388.08"
	 * if balance=3000.00 and interest=3.50 then return "The balance was 3000.00 with interest 3.50, after five years balance is  3563.06"
	 * if balance=4000.00 and interest=2.25 then return "The balance was 4000.00 with interest 2.25, after five years balance is  4470.71"
	 * </pre>
	 * 
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param balance  : input balance
	 * @param interest : an annual interest rate expressed as a percentage. rounded
	 *                 to two decimal points
	 * @return String value as shown in the examples above
	 */

	public static String fiveYearBalance(double balance, double interest) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		// assigning balance to new variable, original must remain unchanged for return statement
		double new_balance = balance;
		
		// looping over five years, so must include 5 in value of i
		for (int i = 1; i <= 5; i++) 
		{
			// shorthand formula for compound interest
			new_balance *= (1 + interest / 100);
		}

		return String.format("The balance was %.2f with interest %.2f, after five years balance is %.2f", balance, interest, new_balance);
	}
	
	
	/**
	 * Implement the following method, which receives a weight in pounds and a
	 * height in feet and inches for any given person, and returns the person's body
	 * mass index (BMI) rounded to 2 decimal place.
	 * 
	 * Note: the height of a person is represented in both feet and inches input
	 * parameters. So, if person has height is 10 feet and 15 inches then feet input
	 * parameter will be 10 and inches input parameter will be 15.
	 * 
	 * You must convert the weight in pounds into kilograms by using the following
	 * conversion rate: <strong>1 pound is equal to 0.453592 kilograms.</strong> You
	 * must convert the height in feet and inches into metres by using the following
	 * conversion rates: <strong>1 foot is equal to 0.3048 metre, and 1 inch is
	 * equal to 0.0254 metre.</strong> Given a weight in kilograms <i>w</i> and a
	 * height in metres <i>h</i>, the BMI is <i>w</i> / <i>h</i><sup>2</sup>.
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if pounds=75, feet=15  and inches=45  then  return 1.04
	 * if pounds=80, feet=13  and inches=45  then  return 1.39
	 * if pounds=135, feet=7  and inches=45 then  return  5.7
	 * </pre>
	 * 
	 * @param pounds  : int input value for weight in pounds
	 * @param feet    : int input value for height in feet, should be used with
	 *                inches input
	 * @param inches: int input value for height in inches
	 * @return the person's body mass index (BMI) rounded to 2 decimal place.
	 */

	public static double computeBMI(int pounds, int feet, int inches) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		// conversion constants from imperial to metric units
		double KG_PER_POUND = 0.453592;
		double M_PER_FOOT = 0.3048;
		double M_PER_INCH = 0.0254;
		
		// converting from imperial to metric units
		double metric_weight = pounds * KG_PER_POUND;
		double metric_height = (feet * M_PER_FOOT) + (inches * M_PER_INCH);
		
		// formula for calculating BMI, using pow method from Math (library?)
		double bmi = metric_weight / (Math.pow(metric_height, 2));
		
		return bmi;
	}

	
	/**
	 * Write a static method to determine if the given integer is perfect square.
	 * <p>
	 * Note: The numbers 0, 1, 4, 9, 16, 25, ... are perfect squares.
	 * </p>
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 50% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n = 0 then 	return "Integer 0 is Perfect Square"
	 * if n= 10  then  return "Integer 10 is NOT Perfect Square"
	 * if n= 63 then  return "Integer 63 is NOT Perfect Square"
	 * if n= 64  then  return "Integer 64 is NOT Perfect Square"
	 * </pre>
	 * 
	 * 
	 *  <p>
    * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
    * strictly forbidden. Violation of this will result in a 70% penalty on your
    * marks. Try to solve this problem using Java Control Structures (selection
    * structures, repetition structures, and nested Loops) only </strong>
    * </p>
    * <p>Make sure the method compiles without errors and returns the correct result
    *  when invoked.
    * </p>
	 * @param n :int input integer
	 * 
	 *          @pre.
	 *          <p>
	 *          <strong> Precondition </strong>
	 *          </p>
	 *          <p>
	 *          You may assume that the integer n is No negative integer
	 *          </p>
	 * 
	 * @return String value see the above examples
	 */

	public static String isPerfectSquare(int n) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		/* number is not perfect square if flooring its root is not the same as its original root
		 * e.g. sqrt(16) = 4.0, floor of 4.0 == 4.0, whereas sqrt(15) = 3.8729. floor of 3.8729 == 3.0000 != 3.8729
		 */
		boolean perfectSquare = Math.sqrt(n) == Math.floor(Math.sqrt(n));
		
		// branching if number passed to function is a perfect square
		if (perfectSquare) {
			return String.format("Integer %d is Perfect Square", n);
		}
		
		return String.format("Integer %d is NOT Perfect Square", n);
			
	}	
}