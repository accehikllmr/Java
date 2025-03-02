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
		
		// description of method does not specify the following...
		// whether integers in arrays can be negative values (implemented)
		// whether the inner arrays are of the same length (i.e. square, rectangle, triangle or irregular array) (implemented)
		// whether the inner arrays can be empty or null (implemented)
		// whether numbers in output String object need to be listed in increasing order (not implemented)
		
		// validating argument passed to array parameter of method (not a null array)
		if (array == null) {
			return "[null array].";
		}
		
		// no null inner arrays
		for (int q = 0; q < array.length; q++) {
			if (array[q] == null) {
				return "[null array].";
			}
		}
			
		// no need to validate data type of argument inner array elements, since method only accepts arrays containing integers
		
		// variable to store max/min integer values for each row (nested Array object), value to be concatenated to return String object
		int rowMaximum;
		int rowMinimum;

		/* variables to store max/min integer values for each column, storing longest inner Array object as default has max/min values for columns
		 * notice syntax for initializing new array object (cannot simply assign argument Array object to new Array object, this is simply aliasing)
		 * finding maximum length inner array in outer array, otherwise if first inner array is shorter than following, IndexError occurs
		 */
		int maxLength = 0;
		int maxLengthPosition = 0;
		for (int a = 0; a < array.length; a++) {
			if (array[a].length > maxLength) {
				// need length for size of new arrays
				maxLength = array[a].length;
				// need index to find values that will be stored as default
				maxLengthPosition = a;
			}
		}
		
		// using maximum length array as size for these arrays, otherwise will not be able to store values from indices in larger arrays
		int [] colMaximum = new int[maxLength];
		int [] colMinimum = new int[maxLength];
		
		// storing values of longest inner array into values for column max/min
		for (int h = 0; h < colMaximum.length; h++) {
			colMaximum[h] = array[maxLengthPosition][h];
			colMinimum[h] = array[maxLengthPosition][h];
		}
		
		// variable to store String object containing all max/min values for rows, and columns
		String rowMaximums = "[";
		String rowMinimums = "[";
		String colMaximums = "[";
		String colMinimums = "[";
				
		// iterating through outer Array object (rows), stopping before length of outer Array object (otherwise IndexError)
		for (int i = 0; i < array.length; i++) {
			// max/min values are by default the first elements in each inner Array object, unless empty array
			if (array[i].length > 0) {
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
		}
		
		// iterating through outer Array objects (rows), not excluding first column since not by default longest array
		for (int k = 0; k < array.length; k++) {
			// iterating through inner Array objects (columns)
			for (int m = 0; m < array[k].length; m++) {
				// integer larger or equal to current column maximum replaces it
				if (array[k][m] > colMaximum[m]) {
					colMaximum[m] = array[k][m];
				// otherwise, it replaces the column minimum
				} else if (array[k][m] < colMinimum[m]){
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
		
		// description of method does not specify the following...
		// whether integers in arrays can be negative values (implemented)
		// whether inner arrays can be empty or null (implemented)
		
		// validating argument passed to originalArray method parameter
		if (originalArray == null) {
			return "[null array].";
		} else {
			// iterating through Array object since any inner array length different from outer array length makes it not square
			for (int i = 0; i < originalArray.length; i++) {
				if (originalArray[i] == null || originalArray.length != originalArray[i].length || originalArray[i].length == 0) {
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
	
		// description of method does not specify the following...
		// whether inner arrays can be empty or null (implemented)
		
		/* validating argument passed to method parameter, false for null or non-square matrices,
		 * separate from other conditions since copying doubles to new Array object
		 */
		if (m == null) {
			return false;
		} else {
			// iterating over all rows of matrix, to check their lengths
			for (int p = 0; p < m.length; p++) {
				// condition that matrix is not square or has null inner array
				if (m[p] == null || m[p].length != m.length) {
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
				if (rotatedMatrix[i][j] < 0.0 || rotatedMatrix[i][j] > 1.0) {
					return false;
				}
				// adding positive double from row into sum
				colSum += rotatedMatrix[i][j];
				}
			// converting to String and back to Double in order to round, 10 decimal places for increased precision
			String roundColSum = String.format("%.10f", colSum);
			colSum = Double.parseDouble(roundColSum);
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
		
		// description of method does not specify the following...
		// whether integers in arrays can be negative values (implemented)
		// whether the inner arrays can be empty or null (implemented)
		
		// validating argument passed to method parameter, returning null not n x 2 arrays
		if (m == null) {
			return null;
		} else {
			for (int a = 0; a < m.length; a++) {
				if (m[a] == null || m[a].length != 2) {
					return null;
				}
			}
		}
		
		
		// initialize Array object of all distances, every set of coordinates compared to all others, including itself, so resulting matrix is square
		double [][] all_pts_dist = new double[m.length][m.length];
		// iterate through outer Array object (through every set of coordinates)
		for (int i = 0; i < m.length; i++) {
			// initialize Array object for coordinates at position i in outer Array object (will store all distances for i)
			double [] this_pt_dist = new double[m.length];
			// initialize double variable for distance between points (from coordinates at position i to coordinates at position j)
			double distance;
			// iterate through outer Array object (again, since comparing each coordinate to all other coordinates, including itself)
			for (int j = 0; j < m.length; j++) {
				// condition for points which have same coordinates (itself or duplicate)
				if (Arrays.equals(m[i], m[j])) {
					distance = 0.0;
				} else {
					// calculate distance between x coordinates, for coordinates at position i and j
					double diff_x = Math.abs(m[i][0] - m[j][0]);
					// calculate distance between y coordinates, for coordinates at position i and j
					double diff_y = Math.abs(m[i][1] - m[j][1]);
					// calculate Euclidean 2D distance, using standard formula
					distance = Math.sqrt(Math.pow(diff_x, 2) + Math.pow(diff_y, 2));
				}		
				// unable to round using Math.round method, so instead converting into formatted string with two decimal places
				String distring = String.format("%.2f", distance);
				// parsing String to extract formatted double data type
				distance = Double.parseDouble(distring);
				// add distance to array at position j, since adding distance for each set of coordinates (0 <= m.length < j)
				this_pt_dist[j] = distance;
			}
			// add array of distances for i to outer array at position i, since corresponds to set of coordinates at position i
			all_pts_dist[i] = this_pt_dist;
		}
		// return array of all distances
		return all_pts_dist;
	}
}
