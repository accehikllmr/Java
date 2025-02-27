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
