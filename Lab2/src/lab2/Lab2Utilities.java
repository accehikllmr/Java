package lab2;

//You are NOT allowed to add any "import" statement other than 
//the ones already in the starter files. 


///////////////////////////////////////////////////////////////////////////
//Full Name : Michel Clark
//Yorku Email : mciehl@my.yorku.ca
//Date : February 9, 2025
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////


import java.util.Random;
public class Lab2Utilities {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	
	private Lab2Utilities() {
		// empty to prevent object creation
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}
	
	/**
	 * 
	 * Implement the method below that takes String <code>str</code> as the input
	 * argument and returns the number of digits in the given input String. Digit is
	 * any integer between <code>0</code> and <code>9</code>.
	 * <p>
	 * <strong> You can assume that the input String is not null and has length
	 * equal to 1 (at least one character).</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 *  if str = "mystring123"  then return 3
	 *  if str = "123mystring123" then return 6
	 *  if str = "123my25str047ing123" then return 11
	 * </pre>
	 * 
	 * You will need a loop, <strong>your loop must not execute more iterations
	 * than necessary, and you cannot use break or continue</strong>. 
	 * 
	 * 
	 * 
	 * @param str : input string
	 * @return Number of digits in the given input String
	 */

	public static int digitCountinString(String str) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		// INPUT STRING IS NOT NULL AND HAS LENGTH EQUAL TO AT LEAST 1
		
		// initializing variable to track number of digits in string
		int num_digits = 0;
		
		// looping through indices of string, but not including full string length (out of range)
		for (int i = 0; i < str.length(); i++) {
			// checking if character at given index position of string is a digit, using method
			if (Character.isDigit(str.charAt(i))) {
				// if so, increment number of digits by one
				num_digits++;
			}
		}
		
		return num_digits;
	}
	
	/**
	 * Write a static method to generate string of random number. The number of
	 * generated random number is defined by integer value given by n the generated
	 * random integers should be between x and y (inclusive). Assuming n is positive
	 * and x is less than or equal to y.
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 70% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n=5, x= 5 and y =10 then some of possible returned strings {@code <6><8><9><10><7>} 
	 * or {@code <8><9><6><6><7>} , {@code <9><6><9><6><9>},..., {@code <5><9><6><5><10>},... .
	 * if n=2,  x= 2 and y =7  then some of possible returned strings {@code <3><7>} 
	 * or {@code <7><6>} , {@code <4><7>},...
	 * </pre>
	 * 
	 * @pre.
	 * <p>
	 * <strong> Precondition </strong>
	 * </p>
	 * <p>
	 * n is positive and x is less than or equal to y
	 * </p>
	 * 
	 * @param n : number of random integers
	 * @param x : int input the lower limit
	 * @param y : int input the upper limit
	 * @return generate string of random number the number of generated random
	 *         number is defined by integer value given by n the generated random
	 *         integers should be between x and y (inclusive).
	 */

	public static String stringOfRandomInt(int n, int x, int y) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		// N IS POSITIVE AND X IS LESS THAN Y (LOWER BOUND VS. UPPER BOUND)
		
		// instantiating Random class object (needed to use methods from class)
		Random random = new Random();
		
		// instantiating Integer class object, used to generate random numbers
		int rand_num;
		
		// instantiating String class object, used to build String object returned from method
		String num_string = "";

		// looping n times, to create as many random numbers
		for (int i = 0; i < n; i++) {
			// generating random number between 0 and difference between bounds, add x to end up within bound
			rand_num = random.nextInt(y - x) + x;
			// converting generated number to a String object
			Integer.toString(rand_num);
			// build String object, adding symbols and number for each iteration
			num_string = num_string + "<" + rand_num + ">";
		}

		return num_string;
	}

	/**
	 * Implement the method below that takes binary String <code>str</code> as
	 * input argument and returns the length of maximum consecutive 0's in a given
	 *  binary input string.
	 * <p>
	 * <strong> You can assume that the input String is not null and contains at
	 * least 1 one character.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if str = "11101110001"  then return 3
	 * 	if str = "10000001001" then return 6
	 * 	if str = "0000100111" then return 4
	 * 	if str = "01001010100111" then return 2
	 * </pre>
	 * 
	 * @param str : input binary string
	 * @return returns the length of maximum consecutive 0's in a given  binary input
	 *         string.
	 */
	
	public static int lengthofMaxConsecutiveZeros(String str) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
	
		// INPUT STRING IS NOT NULL AND HAS LENGTH EQUAL TO AT LEAST 1
		
		// instantiating Integer object to store current streak of zeroes
		int zero_streak = 0;
		// to store maximum streak of zeroes, for comparison with current streak
		int max_zero_streak = 0;
		
		// looping through indices of String object
		for (int i = 0; i < str.length(); i++) {
			// condition that char is '0' and not the final character in the String object
			if ((str.charAt(i) == '0') && (i != str.length() - 1)) {
				zero_streak++;
			// condition that char is '1'
			} else if (str.charAt(i) == '1') {
				// condition that current streak is larger than maximum streak found
				if (zero_streak > max_zero_streak) {
					// update maximum streak to new high
					max_zero_streak = zero_streak;
				}
				// reset streak, since a '1' has been encountered
				zero_streak = 0;
			// condition that char is 0 and last character
			} else {
				// increment for last character
				zero_streak++;
				// update maximum streak
				max_zero_streak = zero_streak;
			}
		}

		return max_zero_streak;
	}

	/**
	 * 
	 * Implement a static method that receives three strings as input 
	 * and returns a String datatype as an output.
	 * If the length of any input string is zero, 
	 * the method does nothing and returns a string with the value "Invalid". 
	 * Otherwise, the method does the following:
	 * <p>
	 * First, the method extracts the first half of the first string, s1. 
	 * For example, if s1 is "York", the length of s1 is even,  then the method returns "Yo".
	 * Otherwise, if s1 is "Hello",  then the method returns "Hel".
	 * </p>
	 *  <p>
	 * Second, the method extracts the last two characters from s2 if the s2 length is greater than or equal to 2; 
	 * otherwise, the method uses a single character from s2. After extracting the characters from s2, 
	 * the method creates three copies of the extracted characters. 
	 * For example, if s2 is "Hello", then the method will create a new string with 
	 * the following value "lololo". 
	 * If s2 is "Y", then the method will create a new string with the following value "YYY".
	 * </p>
	 *  <p>
	 * Third, the method extracts the first two characters from s3 if the length is greater than or equal to 2;
	 *  otherwise, the method uses a single character from s3. After extracting the characters from s3, 
	 *  the method creates five copies of the extracted characters. 
	 *  For example, if s3 is "Hello", then the method will create a new string with 
	 *  the following value "HeHeHeHeHe". 
	 *  If s3 is "A", the method will create a new string with the following value "AAAAA".
	 *  </p>
	 *  <p>
	 *  The method returns a string 
	 *  after concatenating the result from the first, second and third steps. 
	 *  See the below examples
	 *  </p> 
	 *   <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * If s1 = "York" , s2 = "Hello", s3 = "Time", return "YolololoTiTiTiTiTi"
	 * If s1 = "EECS-York" , s2 = "Hello EECS1022", s3 = "Lab Time", return "EECS-222222LaLaLaLaLa"
	 * If s1 = "W" , s2 = "A", s3 = "B",  return "WAAABBBBB"
	 * If s1 = "" , s2 = "Sunday", s3 = "Monday", return "Invalid"
	 * 
	 * </pre>
	 *  <p>
    * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
    * strictly forbidden. Violation of this will result in a 70% penalty on your
    * marks. Try to solve this problem using Java Control Structures (selection
    * structures, repetition structures, and nested Loops) only </strong>
    * </p>
    * <p>Make sure the method compiles without errors and returns the correct result
    *  when invoked.
    * </p>
	 * @param s1 Input String 
	 * @param s2 Input String 
	 * @param s3 Input String 
	 * @return  string value, see above examples
	 */
	
	public static String mixStrings(String s1, String s2, String s3) {
		
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		// instantiating integer objects to calculate length of each string passed to function
		int len_s1 = s1.length();
		int len_s2 = s2.length();
		int len_s3 = s3.length();

		// any string of length zero is invalid, function returns a value
		if (len_s1 == 0 || len_s2 == 0 || len_s3 == 0) {
			return "Invalid";
		}

		// instantiating String objects to extract substrings from strings passed to function
		String substring_s1, substring_s2, substring_s3;
		
		// instantiating integer objects to calculate important indices for substrings
		int half_index_s1;
		int start_index_s2;
		
		// index at half of string is half if even length, and floor if odd (both values adjusted by minus one)
		half_index_s1 = (int)((len_s1 % 2 == 0) ? (len_s1 / 2) - 1 : Math.floor(len_s1 / 2));
		// substring is slice of original string from beginning to half
		substring_s1 = s1.substring(0, half_index_s1 + 1);
		
		// index is either the before last position or the last position (adjusted by minus one)
		start_index_s2 = (int)((len_s2 > 1) ? len_s2 - 2 : len_s2 - 1);
		
		// substring of substring is slice of original string beginning from before last or last index
		substring_s2 = s2.substring(start_index_s2);
		// substring is above three times
		substring_s2 += substring_s2 + substring_s2;
		
		// substring of substring is slice of original string first or first two character(s)
		substring_s3 = (len_s3 > 1) ? s3.substring(0, 2) : s3.substring(0, 1);
		// substring is above five times
		substring_s3 += substring_s3 + substring_s3 + substring_s3 + substring_s3;
		
		// concatenating substrings
		return substring_s1 + substring_s2 + substring_s3;
		
	}

	/** 
	 * <p> Write a stringCompressor  method that 
	 *  compresses long String {@code str} containing many adjacent equal characters
	 * (but no digits).  
	 *  <p> For example: </p>
	 *   
	 *  <pre>
	 *  
	 *  compressString("")  return "" , empty string 
	 *  compressString("bbbcfreb$b") return  "b3c1f1r1e1b1$1b1"
	 *  compressString("bbbrrraaaaaazzzz") return  "b3r3a6z4"
	 *  
	 *  </pre>
	 *  
	 *   	
	 * @param inputStr :
	 * 			string to be compressed, {@code str} is not null
	 * @pre.  
	 * 		Precondition: s does not contain a digit in '0'.. '9'. 
	 * @return
	 * 		the compressed version of the long string, as explained above
	 *  	
	 *  
	 * 
	 *
	 */

    public static String stringCompressor(String inputStr) {
    	/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
       
    	// initializing integer object to store string length, reducing total characters
    	int len_str = inputStr.length();
    	
    	// default return value when empty string passed to method argument
    	if (len_str == 0) {
    		return "";
    	}
    	    	
    	// instantiate counter for number of letters at 1, since minimum for successive symbols is 1
    	int char_count = 1;
    	// instantiating string object in which result will be stored
    	String return_string = "";
    	
    	// loop through string indices, stopping before going beyond range of string
    	for (int index = 0; index < len_str; ++index) {
    		// if not yet arrived at last character in string object, to avoid index out of range error
    		if (index != len_str - 1) {
    			// identical successive characters, increase the count
    			if (inputStr.charAt(index) == inputStr.charAt(index + 1)) {
    				++char_count;
    			// non-identical successive characters, concatenate character and its count to existing string
    			} else {
    				// converting integer object to string object, not done implicitly for some reason...
    				return_string += inputStr.charAt(index) + Integer.toString(char_count);
    				// reset value to 1, since succession has ended
    				char_count = 1;    			
    			}
    		// arrived at last character in string object
    		} else {
    			// concatenate character and its count to existing string
    			return_string += inputStr.charAt(index) + Integer.toString(char_count);
    		}
    	}
    	
    	return return_string;

    }

	/**
	 * Write a static method that receives a short value that can be stored in 16 bits and
	 * then convert this input value to 16 bits binary representation. The method
	 * returns the string value representing the binary value in 16 bits equivalent to the
	 * input value.
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 70% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if value=15 then return "The decimal value (15) has binary representation [0000000000001111]"
	 * if value=145 then return "The decimal value (145) has binary representation [0000000010010001]"
	 * if value=255  then return "The decimal value (205) has binary representation [0000000011001101]"
	 * 
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param value input integer value of type short
	 * @return String value represent binary value in 16 bits. See example above
	 * 
	 *         <p>
	 *         <strong> Precondition </strong> :   value is non-negative values
	 *         </p>
	 * 
	 * 
	 */

	public static String binaryRepresentation(short value) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */

		// PRECONDITION STATES THAT ARGUMENT PASSED TO VALUE PARAMETER IS NON-NEGATIVE
		
		// storing as string, since will build using one character at a time
		String binary = "";
		// storing original value, since value in value variable will be modified in loop
		short stored_value = value;
				
		/* iterating through all powers of 2 for 16 binary positions (0 to 15)
		 * CAREFUL : condition must evaluate to false to stop loop
		 * hence n < 0 does not work, it is immediately false
		 */
		for (int n = 15; n >= 0; --n) {
			// calculating 2^n, to compare with value
			double binary_position = Math.pow(2, n);
			// add 1 to string when 2^n is within value
			if (value >= binary_position) {
				binary += '1';
				// deduct from value, since 2^n in value and finding sum of 2^n for values of n
				// CONVERSION TO SHORT EXPLICIT? SHOULD IT BE ADDED EXPLICITLY?
				value -= binary_position;
			} else {
				// no deduction, since 2^n not in value
				binary += '0';
			}
		}
		
		return String.format("The decimal value (%d) has binary representation [%s]", stored_value, binary);

	}

	
	/**
	 * Write a static method that receives two short values that can be stored in 16 bits 
	 * and then return their binary xor operation/logic. 
	 * It will help if you make sure the input values 
	 * are converted to binary representation (16 bits) 
	 * before performing the xor operation. If you want, 
	 * you can use <strong><code>binaryRepresentation</code></strong> method 
	 * that you should implement in this lab.  
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 70% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 *  
	 * if value1=12  and value2 = 15, then return "XOR of two values is [0000000000000011]"
	 * if value1=142  and value2 = 145, then return "XOR of two values is [0000000000011111]"
	 * if value1=82  and value2 = 255, then return "XOR of two values is [0000000010101101]"
	 * 
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param value1 input integer value of type short
	 * @param value2  input integer value of type short
	 * @return String value represents the xor operation of the input values in 16 bits. See the example above 
	 * 
	 *         <p>
	 *         <strong> Precondition </strong> :   value is non-negative values
	 *         </p>
	 * 
	 * 
	 */	
	public static String binaryXor(short value1 , short value2) {
		
		// ARGUMENT PASSED TO VALUE PARAMETERS ARE NON-NEGATIVE
		
		/* converting short type values into their binary representations, using existing class
		 * but return is a string, so need to extract substring with only binary
		 * later line, since otherwise referencing itself
		 */
		String value1_string = binaryRepresentation(value1);
		String value2_string = binaryRepresentation(value2);
		
		// extracting binary string, from index after first left bracket all the way to index prior to right bracket
		String value1_binary = value1_string.substring(value1_string.indexOf('[') + 1, value1_string.indexOf(']'));
		String value2_binary = value2_string.substring(value2_string.indexOf('[') + 1, value2_string.indexOf(']'));
		
		// instantiating string object to store XOR operation on binary strings
		String xor_string = "";
		
		// looping through indices of strings, to compare each corresponding pair of bits
		for (int index = 0; index < 16; ++index) {
			// exclusive or, so adding a one to operation string only when bit are different
			if (value1_binary.charAt(index) != value2_binary.charAt(index)) {
				xor_string += '1';
			} else {
				xor_string += '0';
			}
		}
		
        return String.format("XOR of two values is [%s]", xor_string);
        
	}
	
	/**
	 * 
	 * Write a static method that counts the number of integers between a
	 * lower-limit integer and an upper-limit integer that are multiple of 3 or
	 * multiple of 5 or multiple 7.
	 * 
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 70% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * 
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if lowerLimit=0 and  upperLimit= 5 then return "Between (1) and (5) there are (1) multiple of 3, (1) multiple of 5 and (0) multiple of 7"
	 * if lowerLimit=10 and  upperLimit= 10 then return "Between (10) and (10) there are (0) multiple of 3, (1) multiple of 5 and (0) multiple of 7"
	 * if lowerLimit=10 and  upperLimit= 22 then return "Between (10) and (22) there are (4) multiple of 3, (3) multiple of 5 and (2) multiple of 7"
	 * if lowerLimit=7 and  upperLimit= 5 then return "Error: lower limit (7) is not less than or equal to upper limit (5)"
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param lowerLimit lower limit integer value
	 * @param upperLimit upper limit integer value
	 * @return String value as shown in the examples above
	 * 
	 * 
	 *         <p>
	 *         <strong> Precondition </strong>
	 *         </p>
	 *         <p>
	 *         lowerLimit and upperLimit are non-negative values and lowerLimit less than upperLimit
	 *         </p>
	 * 
	
	 */
	public static String countofMult357(int lowerLimit, int upperLimit) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		return "";

	}
	
	/**
	 * Write a static method named isPalindromeInt to determine
	 * if the given input <code>n</code> integer
	 * is a palindrome integer.
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n = 0 then 	return "Integer 0 is Palindrome"
	 * if n= 10  then  return "Integer 10 is NOT Palindrome"
	 * if n= 3635363 then  return "Integer 3635363 is Palindrome"
	 * if n= 121121  then  return "Integer 121121 is Palindrome"
	 * if n= 112545214 then return "Integer 112545214 is NOT Palindrome"
	 * </pre>
	 * 
	 * 
	 * @param n : int input value
	 * @return <code>n</code> is palindrome integer then return true. Otherwise,
	 *         return false
	 *  <p><strong> Precondition </strong></p>
	 *          <p>
	 *          You may assume that the integer n is No negative integer
	 *          </p>
	 */
	public static String isPalindromeInt(int n) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		return "";
	}

	

	

}
