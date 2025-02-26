package lab3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Rule;


public class JunitTestsPublic {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	@Test
	public void test_pb_01_01() {
		
		int [][] data = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		String correctOut = "The maximum values along the rows are [3,6,9].\n"
				+ "The minimum values along the rows are [1,4,7].\n"
				+ "The maximum values along the columns are [7,8,9].\n"
				+ "The minimum values along the columns are [1,2,3].";
		
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test pb_01_01 failed.", correctOut,result);
	}
	@Test
	public void test_pb_01_02() {
		
		int [][] data = null;
		String correctOut = "[null array].";
		
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test pb_01_02 failed.", correctOut,result);
	}
	@Test
	public void test_pb_01_03() {
		
		int [][] data = { {2, 1, 3}, {5, 4, 6}, {8, 7, 9} };
		String correctOut = "The maximum values along the rows are [3,6,9].\n"
				+ "The minimum values along the rows are [1,4,7].\n"
				+ "The maximum values along the columns are [8,7,9].\n"
				+ "The minimum values along the columns are [2,1,3].";
		
		String result = TwoDArrayProblems.findExtrema(data);
		
		assertEquals("Test pb_01_03 failed.", correctOut, result);
	}
	@Test
	public void test_pb_02_01() {
		
		int [][] data = null;
		String correctOut = "[null array].";
		
		String result = TwoDArrayProblems.rotateArray(data);
		
		assertEquals("Test pb_02_01 failed.", correctOut, result);
	}
	@Test
	public void test_pb_02_02() {
		
		int [][] data = { {2, 1, 3}, {5, 4}, {8, 7, 9} };
		String correctOut = "[not a square array].";
		
		String result = TwoDArrayProblems.rotateArray(data);
		
		assertEquals("Test pb_02_02 failed.", correctOut, result);
	}
	@Test
	public void test_pb_02_03() {
		
		int [][] data = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		String correctOut = "{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}.";
		
		String result = TwoDArrayProblems.rotateArray(data);
		
		assertEquals("Test pb_02_03 failed.", correctOut, result);
	}
	@Test
	public void test_pb_04_01() {
		
		double [][] data = {{0.15,0.875,0.375}, {0.55,0.005,0.225}, {0.30,0.12,0.4}};
		
		assertTrue("Test pb_04_01 failed.", TwoDArrayProblems.isMarkovMatrix(data));
	}	
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
	@Test
	public void test_pb_06_01() {
		
		assertNotNull("Test pb_06_01 failed.", new Temperature(25.3));
	}	
	@Test
	public void test_pb_06_02() {
		Temperature t = new Temperature(32.0);
		assertEquals("Test pb_06_02 failed.", 0.0, t.getCelsius(),0.0);
	}	
	@Test
	public void test_pb_06_03() {
		Temperature t = new Temperature(32.0);
		double []correctOut = {32.0,0.0,273.15};
		assertArrayEquals("Test pb_06_03 failed.", correctOut, t.getAll(),0.0);
	}	
	@Test
	public void test_pb_07_01() {
		// checking that that Car object is instantiated, rather than nothing (null)
		assertNotNull("Test pb_07_01 failed.", new Car(2025, "Toyota"));
	}	
	@Test
	public void test_pb_07_02() {
		// instantiating Car object with arguments passed to object attributes
		Car c = new Car(2025, "Toyota");
		// calling method to accelerate car one time (increase speed by 5)
		c.accelerate();
		// checking whether speed has changed from 0 to 5, since accelerate method was called
		assertEquals("Test pb_07_02 failed.", 5, c.getSpeed());
	}	
	@Test
	public void test_pb_07_03() {
		Car c = new Car(2025, "Toyota");
		String [] correctOut = {"This is a 2025 model vehicle.","It is made by Toyota.", "It is cruising at 0 kmph."};
		assertArrayEquals("Test pb_07_03 failed.", correctOut, c.getDescription());
	}
	@Test
	public void test_pb_07_04() {
		Car c = new Car(2025, "Toyota");
		// calling accelerate method multiple times car multiple times
		for (int i = 0; i < 10; i++) {
			c.accelerate();
		}
		assertEquals("Test pb_07_04 failed.", 50, c.getSpeed());
	}
	@Test
	public void test_pb_07_05() {
		Car c = new Car(2025, "Toyota");
		for (int i = 0; i < 10; i++) {
			c.brake();
		}
		assertEquals("Test pb_07_05 failed.", -50, c.getSpeed());
	}
	@Test
	public void test_pb_07_06() {
		Car c = new Car(2025, "Toyota");
		for (int i = 0; i < 5; i++) {
			c.accelerate();
		}
		for (int j = 0; j < 3; j++) {
			c.brake();
		}
		assertEquals("Test pb_07_06 failed.", 10, c.getSpeed());
	}
	@Test
	public void test_pb_07_07() {
		Car c = new Car(2025, "Toyota");
		c.getYearModel();
		assertEquals("Test pb_07_07 failed.", 2025, c.getYearModel());
	}
	@Test
	public void test_pb_07_08() {
		Car c = new Car(2025, "Toyota");
		c.getMake();
		assertEquals("Test pb_07_08 failed.", "Toyota", c.getMake());
	}
	@Test
	public void test_pb_07_09() {
		Car c = new Car(2025, "Toyota");
		c.setYearModel(1991);
		assertEquals("Test pb_07_09 failed.", 1991, c.getYearModel());
	}
	@Test
	public void test_pb_07_10() {
		Car c = new Car(2025, "Toyota");
		c.setMake("Ford");
		assertEquals("Test pb_07_10 failed.", "Ford", c.getMake());
	}
	@Test
	public void test_pb_07_11() {
		Car c = new Car(2025, "Toyota");
		c.setSpeed(100);
		assertEquals("Test pb_07_11 failed.", 100, c.getSpeed());
	}
}
