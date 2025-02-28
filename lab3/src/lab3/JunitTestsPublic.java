package lab3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Rule;


public class JunitTestsPublic {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(10000);
	
// TESTS FOR FINDEXTREMA METHOD
	
	@Test
	public void test_null_outer_array_findextrema_method() {
		// seems that an array cannot be declared simply using {}
		int [][] data = null;
		String correctOut = "[null array].";
		String result = TwoDArrayProblems.findExtrema(data);
		assertEquals("Test test_null_outer_array_findextrema_method failed.", correctOut, result);
	}
	
	@Test
	public void test_empty_inner_array_findextrema_method() {
		
		int [][] data = {{1, 2, 3},
						 {}};
		String correctOut = "[null array].";
		String result = TwoDArrayProblems.findExtrema(data);
		assertEquals("Test test_empty_inner_array_findextrema_method failed.", correctOut, result);
	}
	
	@Test
	public void test_null_inner_array_findextrema_method() {
		
		int [][] data = {{1, 2, 3}, 
						 null};
		String correctOut = "[null array].";
		String result = TwoDArrayProblems.findExtrema(data);
		assertEquals("Test test_null_inner_array_findextrema_method failed.", correctOut, result);
	}
	
	@Test
	public void test_singletons() {
		
		int [][] data = {{0}, 
						 {1}, 
						 {2}};
		String correctOut = "The maximum values along the rows are [0,1,2].\n"
				+ "The minimum values along the rows are [0,1,2].\n"
				+ "The maximum values along the columns are [2].\n"
				+ "The minimum values along the columns are [0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_0 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_0() {
		
		int [][] data = {{0, 0}, 
						 {0, 0}, 
						 {0, 0}};
		String correctOut = "The maximum values along the rows are [0,0,0].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [0,0].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_0 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_1() {
		
		int [][] data = {{0, 0}, 
						 {0, 0}, 
						 {0, 1}};
		String correctOut = "The maximum values along the rows are [0,0,1].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [0,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_1 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_2() {
		
		int [][] data = {{0, 0}, 
						 {0, 0}, 
						 {1, 0}};
		String correctOut = "The maximum values along the rows are [0,0,1].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [1,0].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_2 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_3() {
		
		int [][] data = {{0, 0}, 
						 {0, 0}, 
						 {1, 1}};
		String correctOut = "The maximum values along the rows are [0,0,1].\n"
				+ "The minimum values along the rows are [0,0,1].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_3 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_4() {
		
		int [][] data = {{0, 0}, 
						 {0, 1}, 
						 {0, 0}};
		String correctOut = "The maximum values along the rows are [0,1,0].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [0,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_4 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_5() {
		
		int [][] data = {{0, 0}, 
						 {0, 1}, 
						 {0, 1}};
		String correctOut = "The maximum values along the rows are [0,1,1].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [0,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_5 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_6() {
		
		int [][] data = {{0, 0}, 
						 {0, 1}, 
						 {1, 0}};
		String correctOut = "The maximum values along the rows are [0,1,1].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_6 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_7() {
		
		int [][] data = {{0, 0}, 
						 {0, 1}, 
						 {1, 1}};
		String correctOut = "The maximum values along the rows are [0,1,1].\n"
				+ "The minimum values along the rows are [0,0,1].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_7 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_8() {
		
		int [][] data = {{0, 0}, 
						 {1, 0}, 
						 {0, 0}};
		String correctOut = "The maximum values along the rows are [0,1,0].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [1,0].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_8 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_9() {
		
		int [][] data = {{0, 0}, 
						 {1, 0}, 
						 {0, 1}};
		String correctOut = "The maximum values along the rows are [0,1,1].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_9 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_10() {
		
		int [][] data = {{0, 0}, 
						 {1, 0}, 
						 {1, 0}};
		String correctOut = "The maximum values along the rows are [0,1,1].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [1,0].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_10 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_11() {
		
		int [][] data = {{0, 0}, 
						 {1, 0}, 
						 {1, 1}};
		String correctOut = "The maximum values along the rows are [0,1,1].\n"
				+ "The minimum values along the rows are [0,0,1].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_11 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_12() {
		
		int [][] data = {{0, 0}, 
						 {1, 1}, 
						 {0, 0}};
		String correctOut = "The maximum values along the rows are [0,1,0].\n"
				+ "The minimum values along the rows are [0,1,0].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_12 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_13() {
		
		int [][] data = {{0, 0}, 
						 {1, 1}, 
						 {0, 1}};
		String correctOut = "The maximum values along the rows are [0,1,1].\n"
				+ "The minimum values along the rows are [0,1,0].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_13 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_14() {
		
		int [][] data = {{0, 0}, 
						 {1, 1}, 
						 {1, 0}};
		String correctOut = "The maximum values along the rows are [0,1,1].\n"
				+ "The minimum values along the rows are [0,1,0].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_14 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_15() {
		
		int [][] data = {{0, 0}, 
						 {1, 1}, 
						 {1, 1}};
		String correctOut = "The maximum values along the rows are [0,1,1].\n"
				+ "The minimum values along the rows are [0,1,1].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_15 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_16() {
		
		int [][] data = {{0, 1}, 
						 {0, 0}, 
						 {0, 0}};
		String correctOut = "The maximum values along the rows are [1,0,0].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [0,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_16 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_17() {
		
		int [][] data = {{0, 1}, 
						 {0, 0}, 
						 {0, 1}};
		String correctOut = "The maximum values along the rows are [1,0,1].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [0,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_17 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_18() {
		
		int [][] data = {{0, 1}, 
						 {0, 0}, 
						 {1, 0}};
		String correctOut = "The maximum values along the rows are [1,0,1].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_18 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_19() {
		
		int [][] data = {{0, 1}, 
						 {0, 0}, 
						 {1, 1}};
		String correctOut = "The maximum values along the rows are [1,0,1].\n"
				+ "The minimum values along the rows are [0,0,1].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_19 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_20() {
		
		int [][] data = {{0, 1}, 
						 {0, 1}, 
						 {0, 0}};
		String correctOut = "The maximum values along the rows are [1,1,0].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [0,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_20 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_21() {
		
		int [][] data = {{0, 1}, 
						 {0, 1}, 
						 {0, 1}};
		String correctOut = "The maximum values along the rows are [1,1,1].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [0,1].\n"
				+ "The minimum values along the columns are [0,1].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_21 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_22() {
		
		int [][] data = {{0, 1}, 
						 {0, 1}, 
						 {1, 0}};
		String correctOut = "The maximum values along the rows are [1,1,1].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_22 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_23() {
		
		int [][] data = {{0, 1}, 
						 {0, 1}, 
						 {1, 1}};
		String correctOut = "The maximum values along the rows are [1,1,1].\n"
				+ "The minimum values along the rows are [0,0,1].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,1].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_23 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_24() {
		
		int [][] data = {{0, 1}, 
						 {1, 0}, 
						 {0, 0}};
		String correctOut = "The maximum values along the rows are [1,1,0].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_24 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_25() {
		
		int [][] data = {{0, 1}, 
						 {1, 0}, 
						 {0, 1}};
		String correctOut = "The maximum values along the rows are [1,1,1].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_25 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_26() {
		
		int [][] data = {{0, 1}, 
						 {1, 0}, 
						 {1, 0}};
		String correctOut = "The maximum values along the rows are [1,1,1].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_26 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_27() {
		
		int [][] data = {{0, 1}, 
						 {1, 0}, 
						 {1, 1}};
		String correctOut = "The maximum values along the rows are [1,1,1].\n"
				+ "The minimum values along the rows are [0,0,1].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_27 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_28() {
		
		int [][] data = {{0, 1}, 
						 {1, 1}, 
						 {0, 0}};
		String correctOut = "The maximum values along the rows are [1,1,0].\n"
				+ "The minimum values along the rows are [0,1,0].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_28 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_29() {
		
		int [][] data = {{0, 1}, 
						 {1, 1}, 
						 {0, 1}};
		String correctOut = "The maximum values along the rows are [1,1,1].\n"
				+ "The minimum values along the rows are [0,1,0].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,1].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_29 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_30() {
		
		int [][] data = {{0, 1}, 
						 {1, 1}, 
						 {1, 0}};
		String correctOut = "The maximum values along the rows are [1,1,1].\n"
				+ "The minimum values along the rows are [0,1,0].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_30 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_31() {
		
		int [][] data = {{0, 1}, 
						 {1, 1}, 
						 {1, 1}};
		String correctOut = "The maximum values along the rows are [1,1,1].\n"
				+ "The minimum values along the rows are [0,1,1].\n"
				+ "The maximum values along the columns are [1,1].\n"
				+ "The minimum values along the columns are [0,1].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_31 failed.", correctOut,result);
	}
	
	@Test
	public void test_binary_32() {
		
		int [][] data = {{1, 0}, 
						 {0, 0}, 
						 {0, 0}};
		String correctOut = "The maximum values along the rows are [1,0,0].\n"
				+ "The minimum values along the rows are [0,0,0].\n"
				+ "The maximum values along the columns are [1,0].\n"
				+ "The minimum values along the columns are [0,0].";
		
		// fails because order of numbers in array are backwards
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_binary_32 failed.", correctOut,result);
	}
	
	@Test
	public void test_increasing_arrays_increasing_nums() {
		
		int [][] data = {{1, 2, 3}, 
						 {4, 5, 6}, 
						 {7, 8, 9}};
		String correctOut = "The maximum values along the rows are [3,6,9].\n"
				+ "The minimum values along the rows are [1,4,7].\n"
				+ "The maximum values along the columns are [7,8,9].\n"
				+ "The minimum values along the columns are [1,2,3].";
		
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_increasing_arrays_increasing_nums failed.", correctOut,result);
	}
	
	@Test
	public void test_increasing_arrays_decreasing_nums() {
		
		int [][] data = {{3, 2, 1}, 
						 {6, 5, 4}, 
						 {9, 8, 7}};
		String correctOut = "The maximum values along the rows are [3,6,9].\n"
				+ "The minimum values along the rows are [1,4,7].\n"
				+ "The maximum values along the columns are [9,8,7].\n"
				+ "The minimum values along the columns are [3,2,1].";
		
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_increasing_arrays_decreasing_nums failed.", correctOut, result);
	}
	
	@Test
	public void test_decreasing_array_decreasing_nums() {
		
		int [][] data = {{9, 8, 7}, 
						 {6, 5, 4}, 
						 {3, 2, 1}};
		String correctOut = "The maximum values along the rows are [9,6,3].\n"
				+ "The minimum values along the rows are [7,4,1].\n"
				+ "The maximum values along the columns are [9,8,7].\n"
				+ "The minimum values along the columns are [3,2,1].";
		
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_decreasing_array_decreasing_nums failed.", correctOut,result);
	}
	
	@Test
	public void test_decreasing_array_increasing_nums() {
		
		int [][] data = {{7, 8, 9}, 
						 {4, 5, 6}, 
						 {1, 2, 3}};
		String correctOut = "The maximum values along the rows are [9,6,3].\n"
				+ "The minimum values along the rows are [7,4,1].\n"
				+ "The maximum values along the columns are [7,8,9].\n"
				+ "The minimum values along the columns are [1,2,3].";
		
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_decreasing_array_decreasing_nums failed.", correctOut,result);
	}
	
	@Test
	public void test_other_array_1() {
		
		int [][] data = {{2, 6, 3}, 
						 {5, 4, 8}, 
						 {1, 7, 9}};
		String correctOut = "The maximum values along the rows are [6,8,9].\n"
				+ "The minimum values along the rows are [2,4,1].\n"
				+ "The maximum values along the columns are [5,7,9].\n"
				+ "The minimum values along the columns are [1,4,3].";
		
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_other_array_1 failed.", correctOut,result);
	}
	
	@Test
	public void test_other_array_2() {
		
		int [][] data = {{9, 6, 3}, 
						 {8, 5, 2}, 
						 {7, 4, 1}};
		String correctOut = "The maximum values along the rows are [9,8,7].\n"
				+ "The minimum values along the rows are [3,2,1].\n"
				+ "The maximum values along the columns are [9,6,3].\n"
				+ "The minimum values along the columns are [7,4,1].";
		
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_other_array_2 failed.", correctOut,result);
	}
	
	@Test
	public void test_other_array_3() {
		
		int [][] data = {{-9, -6, -3}, 
						 {-8, -5, -2}, 
						 {-7, -4, -1}};
		String correctOut = "The maximum values along the rows are [-3,-2,-1].\n"
				+ "The minimum values along the rows are [-9,-8,-7].\n"
				+ "The maximum values along the columns are [-7,-4,-1].\n"
				+ "The minimum values along the columns are [-9,-6,-3].";
		
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_other_array_3 failed.", correctOut,result);
	}
	
	@Test
	public void test_other_array_4() {
		
		int [][] data = {{-9, 6, -3}, 
						 {8, 5, -2}, 
						 {-7, 4, 1}};
		String correctOut = "The maximum values along the rows are [6,8,4].\n"
				+ "The minimum values along the rows are [-9,-2,-7].\n"
				+ "The maximum values along the columns are [8,6,1].\n"
				+ "The minimum values along the columns are [-9,4,-3].";
		
		// NEED TO DEBUG, WRONG MINIMUM VALUES FOR FIRST COLUMN
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_other_array_4 failed.", correctOut,result);
	}
	
	@Test
	public void test_other_array_5() {
		
		int [][] data = {{6, -3, -9}, 
						 {5, -2, 8}, 
						 {4, 1, -7}};
		String correctOut = "The maximum values along the rows are [6,8,4].\n"
				+ "The minimum values along the rows are [-9,-2,-7].\n"
				+ "The maximum values along the columns are [6,1,8].\n"
				+ "The minimum values along the columns are [4,-3,-9].";
		
		// NEED TO DEBUG, WRONG MINIMUM VALUES FOR FIRST COLUMN
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_other_array_5 failed.", correctOut,result);
	}
	
	@Test
	public void test_other_array_6() {
		
		int [][] data = {{6, 3, 9, 7}, 
						 {5, 2, 8}, 
						 {0, 1},
						 {4}};
		String correctOut = "The maximum values along the rows are [9,8,1,4].\n"
				+ "The minimum values along the rows are [3,2,0,4].\n"
				+ "The maximum values along the columns are [6,3,9,7].\n"
				+ "The minimum values along the columns are [0,1,8,7].";
		
		// NEED TO DEBUG, WRONG MINIMUM VALUES FOR FIRST COLUMN
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_other_array_6 failed.", correctOut,result);
	}
	
	@Test
	public void test_other_array_7() {
		
		int [][] data = {{6}, 
						 {5, 8}, 
						 {0, 1, 7},
						 {4, 2, 3, 9}};
		String correctOut = "The maximum values along the rows are [6,8,7,9].\n"
				+ "The minimum values along the rows are [6,5,0,2].\n"
				+ "The maximum values along the columns are [6,8,7,9].\n"
				+ "The minimum values along the columns are [0,1,3,9].";
		
		// NEED TO DEBUG, WRONG MINIMUM VALUES FOR FIRST COLUMN
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_other_array_7 failed.", correctOut,result);
	}
	
	@Test
	public void test_other_array_8() {
		
		int [][] data = {{8, 7},
						 {5, 1, 9, 6}, 
						 {0},
						 {2, 4, 3}};
		String correctOut = "The maximum values along the rows are [8,9,0,4].\n"
				+ "The minimum values along the rows are [7,1,0,2].\n"
				+ "The maximum values along the columns are [8,7,9,6].\n"
				+ "The minimum values along the columns are [0,1,3,6].";
		
		// NEED TO DEBUG, WRONG MINIMUM VALUES FOR FIRST COLUMN
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_other_array_8 failed.", correctOut,result);
	}
	
	@Test
	public void test_other_array_9() {
		
		int [][] data = {{8, -7},
						 {-5, -1, 9, 6}, 
						 {0},
						 {-2, 4, -3}};
		String correctOut = "The maximum values along the rows are [8,9,0,4].\n"
				+ "The minimum values along the rows are [-7,-5,0,-3].\n"
				+ "The maximum values along the columns are [8,4,9,6].\n"
				+ "The minimum values along the columns are [-5,-7,-3,6].";
		
		// NEED TO DEBUG, WRONG MINIMUM VALUES FOR FIRST COLUMN
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_other_array_9 failed.", correctOut,result);
	}
	
	@Test
	public void test_other_array_10() {
		
		int [][] data = {{0},
						 {8, -7},
						 {-2, 4, -3},
						 {-5, -1, 9, 6}};
		String correctOut = "The maximum values along the rows are [0,8,4,9].\n"
				+ "The minimum values along the rows are [0,-7,-3,-5].\n"
				+ "The maximum values along the columns are [8,4,9,6].\n"
				+ "The minimum values along the columns are [-5,-7,-3,6].";
		
		// NEED TO DEBUG, WRONG MINIMUM VALUES FOR FIRST COLUMN
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test test_other_array_10 failed.", correctOut,result);
	}
	
	
// TESTS FOR ROTATEARRAY METHOD
	
	@Test
	public void test_null_outer_array_rotatearray_method() {
		int [][] data = null;
		String correctOut = "[null array].";
		String result = TwoDArrayProblems.rotateArray(data);
		assertEquals("Test test_null_outer_array_rotatearray_method failed.", correctOut, result);
	}
	
	@Test
	public void test_null_inner_array_rotatearray_method() {
		int [][] data = {{1, 3},
						 null};
		String correctOut = "[not a square array].";
		String result = TwoDArrayProblems.rotateArray(data);
		assertEquals("Test test_null_inner_array_rotatearray_method failed.", correctOut, result);
	}

	@Test
	public void test_empty_inner_array_rotatearray_method() {
		int [][] data = {{1, 3},
						 {}};
		String correctOut = "[not a square array].";
		String result = TwoDArrayProblems.rotateArray(data);
		assertEquals("Test test_empty_inner_array_rotatearray_method failed.", correctOut, result);
	}
	
	@Test
	public void test_rows_too_long() {
		int [][] data = {{2, 1, 3, 7}, 
						 {5, 4, 1, 0}, 
						 {8, 7, 9, 4}};
		String correctOut = "[not a square array].";
		String result = TwoDArrayProblems.rotateArray(data);
		assertEquals("Test test_rows_too_long failed.", correctOut, result);
	}
	
	@Test
	public void test_cols_too_long() {
		int [][] data = {{2, 1, 3}, 
						 {5, 4, 6}, 
						 {8, 7, 9},
						 {1, 3, 8}};
		String correctOut = "[not a square array].";
		String result = TwoDArrayProblems.rotateArray(data);
		assertEquals("Test test_cols_too_long failed.", correctOut, result);
	}
	
	@Test
	public void test_short_rows_cols() {
		int [][] data = {{2, 1, 3}, 
						 {5}, 
						 {8, 9},
						 {1, 3, 8, 0}};
		String correctOut = "[not a square array].";
		String result = TwoDArrayProblems.rotateArray(data);
		assertEquals("Test test_short_rows_cols failed.", correctOut, result);
	}
		
	@Test
	public void test_square_array_1() {
		int [][] data = {{1, 2, 3}, 
						 {4, 5, 6}, 
						 {7, 8, 9}};
		String correctOut = "{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}.";
		String result = TwoDArrayProblems.rotateArray(data);
		assertEquals("Test test_square_array_1 failed.", correctOut, result);
	}
	
	@Test
	public void test_square_array_2() {
		int [][] data = {{-1, -2, -3}, 
						 {-4, -5, -6}, 
						 {-7, -8, -9}};
		String correctOut = "{{-7, -4, -1}, {-8, -5, -2}, {-9, -6, -3}}.";
		String result = TwoDArrayProblems.rotateArray(data);
		assertEquals("Test test_square_array_2 failed.", correctOut, result);
	}
	
	@Test
	public void test_square_array_3() {
		int [][] data = {{-1, 2, -3}, 
						 {4, 5, -6}, 
						 {-7, -8, 9}};
		String correctOut = "{{-7, 4, -1}, {-8, 5, 2}, {9, -6, -3}}.";
		String result = TwoDArrayProblems.rotateArray(data);
		assertEquals("Test test_square_array_3 failed.", correctOut, result);
	}
	
// TESTS FOR ISMARKOVMATRIX METHOD
	
	@Test
	public void test_null_outer_array_markovmatrix_method() {
		double [][] data = null;
		assertFalse("Test test_null_outer_array_markovmatrix_method failed.", TwoDArrayProblems.isMarkovMatrix(data));
	}
	
	@Test
	public void test_null_inner_array_markovmatrix_method() {
		double [][] data = {{0.15,0.875,0.375},  
							{0.30,0.12,0.4},
							null};
		assertFalse("Test test_null_outer_array_markovmatrix_method failed.", TwoDArrayProblems.isMarkovMatrix(data));
	}
	
	@Test
	public void test_empty_inner_array_markovmatrix_method() {
		double [][] data = {{0.15,0.875,0.375},  
							{0.30,0.12,0.4},
							{}};
		assertFalse("Test test_empty_outer_array_markovmatrix_method failed.", TwoDArrayProblems.isMarkovMatrix(data));
	}
	
	@Test
	public void test_not_square_array() {
		double [][] data = {{0.15,0.875,0.375}, 
							{0.55,0.005,0.225}, 
							{0.30,0.12}};
		assertFalse("Test test_not_square_array failed.", TwoDArrayProblems.isMarkovMatrix(data));
	}
	
	@Test
	public void test_column_exceed_one_matrix_1() {
		double [][] data = {{0.15,0.875,0.375}, 
							{0.55,0.005,0.225}, 
							{0.30,0.12,0.401}};
		assertFalse("Test test_column_exceed_one_matrix_1 failed.", TwoDArrayProblems.isMarkovMatrix(data));
	}
	
	@Test
	public void test_element_exceed_one_matrix_1() {
		double [][] data = {{0.15,0.875,0.00}, 
							{0.55,0.005,0.00}, 
							{0.30,0.12,1.01}};
		assertFalse("Test test_element_exceed_one_matrix_1 failed.", TwoDArrayProblems.isMarkovMatrix(data));
	}
	
	@Test
	public void test_negative_element() {
		double [][] data = {{0.15,0.875,0.375}, 
							{0.55,0.005,0.225}, 
							{0.30,0.12,-0.4}};
		assertFalse("Test test_negative_element failed.", TwoDArrayProblems.isMarkovMatrix(data));
	}
	
	@Test
	public void test_positive_matrix_1() {
		double [][] data = {{0.15,0.875,0.375}, 
							{0.55,0.005,0.225}, 
							{0.30,0.12,0.4}};
		assertTrue("Test test_positive_matrix_1 failed.", TwoDArrayProblems.isMarkovMatrix(data));
	}
	
	@Test
	public void test_positive_matrix_2() {
		double [][] data = {{0.01,0.11,0.66}, 
							{0.33,0.66,0.22}, 
							{0.66,0.23,0.12}};
		assertTrue("Test test_positive_matrix_2 failed.", TwoDArrayProblems.isMarkovMatrix(data));
	}
	
	@Test
	public void test_positive_matrix_3() {
		double [][] data = {{0.5,0.11,0.32}, 
							{0.3,0.41,0.33}, 
							{0.2,0.48,0.35}};
		assertTrue("Test test_positive_matrix_3 failed.", TwoDArrayProblems.isMarkovMatrix(data));
	}
	
// TESTS FOR FINDDISTANCES METHOD
	
	@Test
	public void test_pb_05_01() {
		
		double [][] data = {{1.0, 2.0}, {3.0, 2.0}};
		double [][] correctOut = {{0.0, 2.0}, {2.0, 0.0}};
		
		assertArrayEquals("Test pb_05_01 failed.", correctOut,TwoDArrayProblems.findDistances(data));
	}
	@Test
	public void test_pb_05_02() {
		
		double [][] data = {{1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0}};
		double [][] correctOut = {{0.0, 2.83, 5.66}, {2.83, 0.0, 2.83}, {5.66, 2.83, 0.0}};
		
		assertArrayEquals("Test pb_05_02 failed.", correctOut,TwoDArrayProblems.findDistances(data));
	}
	@Test
	public void test_pb_05_03() {
		
		double [][] data = {{1.2, -2.7}, {3.9, -5.7}, {9.3, 6.8}, {-7.1, -4.4}};
		double [][] correctOut = {{0.0, 4.04, 12.48, 8.47}, {4.04, 0.0, 13.62, 11.08}, {12.48, 13.62, 0.0, 19.86}, {8.47, 11.08, 19.86, 0.0}};
		
		assertArrayEquals("Test pb_05_02 failed.", correctOut,TwoDArrayProblems.findDistances(data));
	}
	
	
// TEST CASES FOR TEMPERATURE CLASS
	
	@Test
	public void test_not_null_temp() {
		assertNotNull("Test test_not_null_temp failed.", new Temperature(25.3));
	}
	
	@Test
	public void test_get_Fahrenheit_method() {
		Temperature t = new Temperature(32.0);
		assertEquals("Test test_get_Fahrenheit_method failed.", 32.0, t.getFahrenheit(), 0.0);
	}
	
	@Test
	public void test_get_Celsius_method() {
		Temperature t = new Temperature(32.0);
		assertEquals("Test test_get_Celsius_method failed.", 0.0, t.getCelsius(), 0.0);
	}
	
	@Test
	public void test_get_Kelvin_method() {
		Temperature t = new Temperature(32.0);
		assertEquals("Test test_get_Kelvin_method failed.", 273.15, t.getKelvin(), 0.0);
	}
	
	@Test
	public void test_set_Fahrenheit_method() {
		Temperature t = new Temperature(32.0);
		t.setFahrenheit(0.0);
		assertEquals("Test test_set_Fahrenheit_method failed.", 0.0, t.getFahrenheit(), 0.0);
	}
	
	@Test
	public void test_getAll_method() {
		Temperature t = new Temperature(32.0);
		double [] correctOut = {32.0, 0.0, 273.15};
		// 0.0 represents delta, maximum allowed difference between corresponding values [i] in Array objects
		assertArrayEquals("Test getAll_method failed.", correctOut, t.getAll(), 0.0);
	}	

	@Test
	public void test_combination_temp() {
		Temperature t = new Temperature(32.0);
		t.setFahrenheit(t.getCelsius() + t.getKelvin());
		// 0 + 273.15
		double sumTemp = t.getCelsius() + t.getKelvin() + t.getFahrenheit();
		// 133.97 + 407.12 + 273.15
		// delta not equal to zero since variable has trailing 4s, but not sure how to round a double value succinctly
		assertEquals("Test test_combination_temp failed.", 814.24, sumTemp, 0.01);
	}
	
// TEST CASES FOR CAR CLASS	
	
	@Test
	public void test_not_null_car() {
		// checking that that Car object is instantiated, rather than nothing (null)
		assertNotNull("Test test_not_null_car failed.", new Car(2025, "Toyota"));
	}

	@Test
	public void test_getYearModel_method() {
		Car c = new Car(2025, "Toyota");
		// 0.0 represents delta, the allowed range within which the test passes; in this case the numbers must be equal
		assertEquals("Test test_getYearModel_method failed.", 2025, c.getYearModel(), 0.0);
	}
	
	@Test
	public void test_getMake_method() {
		Car c = new Car(2025, "Toyota");
		assertEquals("Test test_getMake_method failed.", "Toyota", c.getMake());
	}
	
	@Test
	public void test_getSpeed_method() {
		Car c = new Car(2025, "Toyota");
		assertEquals("Test test_getSpeed_method failed.", 0, c.getSpeed(), 0.0);
	}
	
	@Test
	public void test_setYearModel_method() {
		Car c = new Car(2025, "Toyota");
		c.setYearModel(1991);
		assertEquals("Test test_setYearModel_method failed.", 1991, c.getYearModel(), 0.0);
	}
	
	@Test
	public void test_setMake_method() {
		Car c = new Car(2025, "Toyota");
		c.setMake("Ford");
		assertEquals("Test test_setMake_method failed.", "Ford", c.getMake());
	}
	
	@Test
	public void test_setSpeed_method() {
		Car c = new Car(2025, "Toyota");
		c.setSpeed(100);
		assertEquals("Test test_setSpeed_method failed.", 100, c.getSpeed(), 0.0);
	}	
	
	@Test
	public void test_accelerate_method() {
		// instantiating Car object with arguments passed to object attributes
		Car c = new Car(2025, "Toyota");
		// calling method to accelerate car one time (increase speed by 5)
		c.accelerate();
		// checking whether speed has changed from 0 to 5, since accelerate method was called
		assertEquals("Test test_accelerate_method failed.", 5, c.getSpeed(), 0.0);
	}
	
	@Test
	public void test_brake_method() {
		// instantiating Car object with arguments passed to object attributes
		Car c = new Car(2025, "Toyota");
		// calling method to brake car one time (decrease speed by 5)
		c.brake();
		// checking whether speed has changed from 0 to -5, since brake method was called
		assertEquals("Test test_brake_method failed.", -5, c.getSpeed(), 0.0);
	}
	
	@Test
	public void test_getDescription_method() {
		Car c = new Car(2025, "Toyota");
		String [] correctOut = {"This is a 2025 model vehicle.","It is made by Toyota.", "It is cruising at 0 kmph."};
		assertArrayEquals("Test test_getDescription_method failed.", correctOut, c.getDescription());
	}
	
	@Test
	public void test_accelerate_method_loop() {
		Car c = new Car(2025, "Toyota");
		// calling accelerate method multiple times car multiple times
		for (int i = 0; i < 10; i++) {
			c.accelerate();
		}
		assertEquals("Test test_accelerate_method_loop failed.", 50, c.getSpeed(), 0.0);
	}
	
	@Test
	public void test_brake_method_loop() {
		Car c = new Car(2025, "Toyota");
		for (int i = 0; i < 10; i++) {
			c.brake();
		}
		assertEquals("Test test_brake_method_loop failed.", -50, c.getSpeed(), 0.0);
	}
	
	@Test
	public void test_accelerate_brake_method_loop() {
		Car c = new Car(2025, "Toyota");
		for (int i = 0; i < 5; i++) {
			c.accelerate();
		}
		for (int j = 0; j < 3; j++) {
			c.brake();
		}
		assertEquals("Test test_accelerate_brake_method_loop failed.", 10, c.getSpeed(), 0.0);
	}
	
	@Test
	public void test_combination_method_car() {
		Car c = new Car(2025, "Toyota");
		c.setSpeed(c.getYearModel() / 20);
		// speed is 101
		for (int i = 0; i < 5; i++) {
			c.accelerate();
		}
		// speed is 126
		c.brake();
		// speed is 121
		c.setYearModel(1980);
		c.setMake(c.getMake() + "huh");
		c.setSpeed(c.getSpeed() + 1);
		// speed is 122
		String [] correctOut = {"This is a 1980 model vehicle.","It is made by Toyotahuh.", "It is cruising at 122 kmph."};
		assertArrayEquals("Test test_combination_method_car failed.", correctOut, c.getDescription());
	}
}
