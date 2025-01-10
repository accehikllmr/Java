package beginner;

/* Java is a strongly typed language, hence type checking is done at compile time (before running the program) and a program cannot change the type 
 * assigned to a variable, nor mix them
 */

public class DataTypes {

	public static void main(String[] args)
	{
		// *** primitive types in Java ***
		// 8-bit integer value, hence 256 possible values (-128 to 127)
		byte varByte;		// declaration statement
		varByte = 127;		// assignment statement
		varByte = -128;		// assignment statement
		
		// 16-bit integer value, hence 2^16 possible values
		short varShort = 32767;	// combined declaration and assignment
		varShort = -32768;
		
		// 32-bit integer value, hence 2^32 possible values
		int varInt;
		varInt = 2147483647;
		varInt = -2147483648;
		
		/* 64-bit integer value, hence 2^64 possible values seems that L or l suffix is necessary to assign a long integer to a variable
		 * int type is the default
		 */
		long varLong;
		varLong = 9223372036854775807L;
		varLong = -9223372036854775808L;
		
		/* 32-bit floating point value (maximum value shown not correct, perhaps imprecision from calculation with Python console) integral part 
		 * and fractional part, separated by decimal point as with long, float requires a F or f suffix to be recognized; double type is the default
		 */
		float varFloat;
		varFloat = 3.4028234663852886e+38f;
		varFloat = 1.0f;
		
		// 64-bit floating point value (maximum value not shown), constants are named using all uppercase letters, separated by underscore
		double PI_ROUND;
		PI_ROUND = 3.141592654;
		PI_ROUND = 3.14159;
		
		/* 16-bit character using the Unicode encoding scheme must use single quotes, otherwise interpreted as a string maximum length is 1, 
		 * since not a string
		 */
		char varChar;
		varChar = 'a';
		varChar = 'b';
		
		// boolean true or false value
		boolean var_boolean;
		var_boolean = true;
		var_boolean = false;
		
	}
	
}
