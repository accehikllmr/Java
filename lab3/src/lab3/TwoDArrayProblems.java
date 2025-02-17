package lab3;

import java.util.Arrays;

public class TwoDArrayProblems {
	
	/*Create a public static String method named findExtrema that takes as an argument
	 * a two-dimensional int array and performs the following tasks:
		--find and print the maximum and minimum values in each row;
		--find and print the maximum and minimum values in each column.
	 
		If, for example, the array { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} } is passed to findExtrema,
		the return value should be:
			The maximum values along the rows are [3,6,9].
			The minimum values along the rows are [1,4,7].
			The maximum values along the columns are [7,8,9].
			The minimum values along the columns are [1,2,3].

		If the array is null, the return value should be: [null array].
	*/
	
	public static String findExtrema(int[][] array) {
		
		// NEED TO TEST MORE THOROUGHLY
		
		// validating argument passed to array parameter of method
		if (array == null) {
			return "[null array].";
		}
		
		// variable to store max/min integer values for each row (nested Array object), value to be concatenated to return String object
		int rowMaximum;
		int rowMinimum;

		/* variables to store max/min integer values for each column, storing first inner Array object since by default has max/min values for columns
		 * notice syntax for initializing new array object (cannot simply assign argument Array object to new Array object, this is simply aliasing)
		 * length of new arrays is equal to number of columns in original array
		 */
		int [] colMaximum = new int[array[0].length];
		int [] colMinimum = new int[array[0].length];
		
		for (int h = 0; h < array[0].length; h++) {
			colMaximum[h] = array[0][h];
			colMinimum[h] = array[0][h];
		}
		
		// variable to store String object containing all max/min values for rows, and columns
		String rowMaximums = "[";
		String rowMinimums = "[";
		String colMaximums = "[";
		String colMinimums = "[";
				
		// iterating through outer Array object (rows), stopping before length of outer Array object (otherwise IndexError)
		for (int i = 0; i < array.length; i++) {
		
			// max/min values are by default the first elements in each inner Array object
			rowMaximum = array[i][0];
			rowMinimum = array[i][0];
			
			// iterating through inner Array object (columns), skipping first element, stopping before length of inner Array object (otherwise IndexError)
			for (int j = 1; j < array[i].length; j++) {
				
				// for given row i and column j, update if value is larger than current maximum
				if (array[i][j] > rowMaximum) {
					rowMaximum = array[i][j];
				// same as above, but for current minimum value
				} else if (array[i][j] < rowMinimum) {
					rowMinimum = array[i][j];
				}
				
			}
			
			// having searched through inner Array object (row), concatenate Integer to String object and symbol (conditioned on whether last row)
			rowMaximums += Integer.toString(rowMaximum) + ((i != array.length - 1) ? "," : "]");
			rowMinimums += Integer.toString(rowMinimum) + ((i != array.length - 1) ? "," : "]");
		}
		
		// iterating through outer Array objects (rows), excluding first row which is by default the minimum and maximum for columns
		for (int k = 1; k < array.length; k++) {
			
			// iterating through inner Array objects (columns)
			for (int m = 0; m < array[k].length; m++) {
				
				// integer larger or equal to current column maximum replaces it
				if (array[k][m] >= colMaximum[m]) {
					colMaximum[m] = array[k][m];
				// otherwise, it replaces the column minimum
				} else {
					colMinimum[m] = array[k][m];
				}
			}
		}
		
		// after building array, need to extract into String (extra space in method which converts Array to String)
		for (int n = 0; n < colMaximum.length; n++) {
			colMaximums += Integer.toString(colMaximum[n]) + ((n != colMaximum.length - 1) ? "," : "]");
			colMinimums += Integer.toString(colMinimum[n]) + ((n != colMinimum.length - 1) ? "," : "]");
		}
		
		
		return String.format("The maximum values along the rows are %s.\n"
						   + "The minimum values along the rows are %s.\n"
						   + "The maximum values along the columns are %s.\n"
						   + "The minimum values along the columns are %s.", rowMaximums, rowMinimums, colMaximums, colMinimums);
	}

	/*Create a public static String method named rotateArray that takes as an argument
	 * a square (NxN) two-dimensional int array and performs a 90-degree clockwise rotation on it.
	 * The method should return the rotated array in the form of a String as given in the example below.
	 * 
	 * A 90-degree clockwise rotation of an array involves moving the elements such that the element
	 * at array[i][j] moves to array[j][N-1-i] where N is the length of each side of the square array.
	 * 
	 * Suppose the following array is provided as argument: {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
	 * then rotateArray should return the String: {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}.
	 * 
	 * If the array is null, the return value should be: [null array].
	 * If the array is not square, the return value should be: [not a square array].
	*/
	
	public static String rotateArray(int[][] originalArray) 
	{
		
		// NEED TO TEST MORE THOROUGHLY
		
		// validating argument passed to originalArray method parameter
		if (originalArray == null) {
			return "[null array].";
		} else {
			// iterating through Array object since any inner array length different from outer array length makes it not square
			for (int i = 0; i < originalArray.length; i++) {
				if (originalArray.length != originalArray[i].length) {
					return "[not a square array].";
				}
			}
		}
		
		// initializing new Array object, rotated 90 degrees from original Array object, with same lengths for inner and outer arrays
		int [][] rotatedArray = new int[originalArray.length][originalArray.length];
		
		// iterating through original Array object to copy its integers into rotated Array object
		for (int j = 0; j < originalArray.length; j++) {
			for (int k = 0; k < originalArray.length; k++) {
				// using formula described in method documentation to insert integer values into rotated Array object
				rotatedArray[k][originalArray.length - 1 - j] = originalArray[j][k];
			}
		}
		
		// initializing String object to store outer array string, starting with open bracket and will add each inner array string sequentially
		String rotatedArrayStr = "{";
		
		// iterating through rotated Array object to unpack values and insert them into return String object
		for (int m = 0; m < rotatedArray.length; m++) {
			// initializing String object to store inner array string, starting with open bracket and will add each integer sequentially
			String innerArray = "{";
			for (int n = 0; n < rotatedArray.length; n++) {
				// converting integers to string and concatenating them to inner array string, adding symbols according to whether it is last integer
				innerArray += Integer.toString(rotatedArray[m][n]) + ((n != rotatedArray.length - 1) ? ", " : "}");
			}
			// concatenating inner array string to outer array string, adding symbols according to whether it is last inner array string
			rotatedArrayStr += innerArray + ((m != rotatedArray.length - 1) ? ", " : "}.");
		}
			
		return rotatedArrayStr;
	}

	/* An n x n  matrix is called a positive Markov matrix if each element is positive
	 * and the sum of the elements in each column is 1.
	 * Write a public static boolean method named isMarkovMatrix that performs this test
	 * on a double 2D array.
	 * 
	 * This array represents a Markov matrix: {{0.15,0.875,0.375}, {0.55,0.005,0.225}, {0.30,0.12,0.4}}
	 * 
	 * Assume that array will always be square. 
	*/
	public static boolean isMarkovMatrix(double [][] m) 
	{
	
		// NEED TO TEST MORE THOROUGHLY
		
		/* validating argument passed to method parameter, false for null or non-square matrices,
		 * separate from other conditions since copying doubles to new Array object
		 */
		if (m == null) {
			return false;
		} else {
			// iterating over all rows of matrix, to check their lengths
			for (int i = 0; i < m.length; i++) {
				// condition that matrix is not square
				if (m[i].length != m.length) {
					return false;
				}
			}
		}
		
		// rotating validated array, to simplify calculation of column sum (across a row, rather than column)
		double [][] rotatedMatrix = new double[m.length][m.length];
		
		// copying doubles from original Array object to the rotated Array object
		for (int k = 0; k < m.length; k++) {
			for (int n = 0; n < m[k].length; n++) {
				// formula for rotating matrix values in clockwise direction
				rotatedMatrix[n][m.length - 1 - k] = m[k][n];
			}
		}
		
		// iterating through rotated matrix rows (equivalent to original matrix columns)
		for (int i = 0; i < rotatedMatrix.length; i++) {
			// initializing variable to store sum for column (BEWARE was not working when type was integer, since all values were truncated)
			double colSum = 0.0;
			// iterating through doubles in matrix rows
			for (int j = 0; j < rotatedMatrix[i].length; j++) {
				// condition that double is positive and not greater than 1.0, since otherwise sum is also
				if (rotatedMatrix[i][j] <= 0.0 || rotatedMatrix[i][j] > 1.0) {
					return false;
				}
				// adding positive double from row into sum
				colSum += rotatedMatrix[i][j];
				}
			// condition that column sum is equal to 1, calculated after iterating through column doubles
			if (colSum != 1.0) {
				return false;
			}
		}
		
		// if it doesn't fail any of the above conditions
	    return true;
	}

	/* Consider a public static method findDistances that takes as argument an n x 2 double array.
	 * The geographical coordinates of n different places are stored in this n x 2 argument array.
	 * The method computes the distance of each place to each place and produces an n x n array
	 * where the distance of point i (row i of argument array) to point j (row j of argument array)
	 * is stored at element [i][j] of the resultant array. The distance is computed using Euclidean
	 * 2 dimensional distance formula.
	 * 
	 * For the argument array: {{1.0, 2.0}, {3.0, 2.0}}
	 * The return value would be: {{0.0, 2.0}, {2.0, 0.0}}
	 * 
	 * Assume there will always be at least one set of coordinates given. 
	*/
	public static double [][] findDistances(double [][] m) 
	{
		return new double [1][1];
	}

}
