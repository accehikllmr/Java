package lab3;

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
		
		int rowMaximum;
		int rowMinimum;
		int [] colMaximum;
		int [] colMinimum;
		
		String rowMaximums = "[";
		String rowMinimums = "[";
		String colMaximums = "[";
		String colMinimums = "[";
				
		for (int i = 0; i < array.length; i++) {
		
			rowMaximum = array[i][0];
			rowMinimum = array[i][0];
			colMaximum = array[i];
			colMinimum = array[i];
			
			for (int j = 0; j < array[i].length; j++) {
				
				if (array[i][j] > rowMaximum) {
					rowMaximum = array[i][j];
				} else if (array[i][j] < rowMinimum) {
					rowMinimum = array[i][j];
				}
				
				// how to build values for columns
				
			}
			
			rowMaximums += Integer.toString(rowMaximum) + ((i != array.length - 1) ? "," : "]");
			rowMinimums += Integer.toString(rowMinimum) + ((i != array.length - 1) ? "," : "]");
		}
		
		
		
		
		return String.format("The maximum values along the rows are %s.\n"
						   + "The minimum values along the rows are %s.\n"
						   + "The maximum values along the columns are %s.\n"
						   + "The minimum values along the columns are %s.", rowMaximums.toString(), rowMinimums.toString(), 0, 0);
	}
	
	public static void main(String[] args) {
		int [][] new_array = {{1, 2, 3}, {4, 5, 6}, {2, 3, 4}};
		System.out.println(findExtrema(new_array));
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
		return "";
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
