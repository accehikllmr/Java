package challenges;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class other_tests {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
// CURRENT WEATHER SEASON
	
	@Test // testing all unknown dates in December
	public void test_dec_unknown_() {
		int m = 12;
		String expect = "Unknown";
		for (int d = 1; d <= 14; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}
	
	@Test // testing all winter dates in December
	public void test_dec_winter_() {
		int m = 12;
		String expect = "The current weather season is Winter";
		for (int d = 15; d <= 31; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}
		
	@Test // testing all winter dates in January
	public void test_jan_winter_() {
		int m = 1;
		String expect = "The current weather season is Winter";
		for (int d = 1; d <= 31; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}
	
	@Test // testing all winter dates in February
	public void test_feb_winter_() {
		int m = 2;
		String expect = "The current weather season is Winter";
		for (int d = 1; d <= 28; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}
	
	@Test // testing all winter dates in March
	public void test_mar_winter_() {
		int m = 3;
		String expect = "The current weather season is Winter";
		for (int d = 1; d <= 25; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}
	
	@Test // testing all unknown dates in March
	public void test_mar_unknown_() {
		int m = 3;
		String expect = "Unknown";
		for (int d = 26; d <= 31; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}

	@Test // testing all spring dates in April
	public void test_apr_spring_() {
		int m = 4;
		String expect = "The current weather season is Spring";
		for (int d = 1; d <= 30; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}
	
	@Test // testing all spring dates in May
	public void test_may_spring_() {
		int m = 5;
		String expect = "The current weather season is Spring";
		for (int d = 1; d <= 31; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}
	
	@Test // testing all summer dates in June
	public void test_jun_summer_() {
		int m = 6;
		String expect = "The current weather season is Summer";
		for (int d = 1; d <= 30; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}
	
	@Test // testing all summer dates in July
	public void test_jul_summer_() {
		int m = 7;
		String expect = "The current weather season is Summer";
		for (int d = 1; d <= 31; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}
	
	@Test // testing all summer dates in August
	public void test_aug_summer_() {
		int m = 8;
		String expect = "The current weather season is Summer";
		for (int d = 1; d <= 31; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}
	
	@Test // testing all summer dates in September
	public void test_sep_summer_() {
		int m = 9;
		String expect = "The current weather season is Summer";
		for (int d = 1; d <= 15; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}
	
	@Test // testing all fall dates in September
	public void test_sep_fall_() {
		int m = 9;
		String expect = "The current weather season is Fall";
		for (int d = 16; d <= 30; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}
	
	@Test // testing all fall dates in October
	public void test_oct_fall_() {
		int m = 10;
		String expect = "The current weather season is Fall";
		for (int d = 1; d <= 31; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}
	
	@Test // testing all fall dates in November
	public void test_nov_fall_() {
		int m = 11;
		String expect = "The current weather season is Fall";
		for (int d = 1; d <= 30; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			//System.out.println(String.format("%d %d: %s", m, d, result));
		}
	}
	
	@Test // testing all 0th and negative dates for each month
	public void test_invalid_date_all_() {
		String expect = "Unknown";
		for (int m = 1; m <= 12; m++) {
			for (int d = 0; d >= -10; d--) {
				String result = Lab1Utilities.weather(m, d);
				String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
				assertEquals(failed, expect, result);
				//System.out.println(String.format("%d %d: %s", m, d, result));
			}
		}
	}
	
	@Test // testing all dates too large
	public void test_dates_too_large_() {
		String expect = "Unknown";
		for (int m = 1; m <= 12; m++) {
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				for (int d = 32; d <= 42; d++) {
					String result = Lab1Utilities.weather(m, d);
					String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
						+ "but correct is ( %s )\n", m, d, result, expect);
					assertEquals(failed, expect, result);
					//System.out.println(String.format("%d %d: %s", m, d, result));
				}
			} else if (m == 4 || m == 6 || m == 9 || m == 11) {
				for (int d = 31; d <= 41; d++) {
					String result = Lab1Utilities.weather(m, d);
					String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
						+ "but correct is ( %s )\n", m, d, result, expect);
					assertEquals(failed, expect, result);
					//System.out.println(String.format("%d %d: %s", m, d, result));
				}
			} else {
				for (int d = 29; d <= 39; d++) {
					String result = Lab1Utilities.weather(m, d);
					String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
						+ "but correct is ( %s )\n", m, d, result, expect);
					assertEquals(failed, expect, result);
					//System.out.println(String.format("%d %d: %s", m, d, result));
				}
			}
		}
	}

// FAHRENHEIT TO CELSIUS
	
	@Test // testing below zero temperature
	public void below_absolute_zero_() {
		double f = -459.68;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Invalid temperature: Below absolute zero";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing absolute zero temperature
	public void absolute_zero_() {
		double f = -459.67;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (-459.7) is equivalent to (-273.15) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing zero temperature
	public void zero_() {
		double f = 0.00;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (0.0) is equivalent to (-17.78) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing approximately 10 degrees
	public void ten_() {
		double f = 10.40;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (10.4) is equivalent to (-12.00) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing approximately 20 degrees
	public void twenty_() {
		double f = 20.30;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (20.3) is equivalent to (-6.50) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing approximately 30 degrees
	public void thirty_() {
		double f = 30.20;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (30.2) is equivalent to (-1.00) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing 32 degrees
	public void thirty_two_() {
		double f = 32.00;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (32.0) is equivalent to (0.00) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing approximately 40 degrees
	public void forty_() {
		double f = 40.10;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (40.1) is equivalent to (4.50) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing approximately 50 degrees
	public void fifty_() {
		double f = 50.00;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (50.0) is equivalent to (10.00) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}

	@Test // testing approximately 60 degrees
	public void sixty_() {
		double f = 60.80;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (60.8) is equivalent to (16.00) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}

	@Test // testing approximately 70 degrees
	public void seventy_() {
		double f = 70.70;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (70.7) is equivalent to (21.50) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing approximately 80 degrees
	public void eighty_() {
		double f = 80.60;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (80.6) is equivalent to (27.00) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing approximately 90 degrees
	public void ninety_() {
		double f = 90.50;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (90.5) is equivalent to (32.50) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing approximately 100 degrees
	public void hundred_() {
		double f = 100.40;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (100.4) is equivalent to (38.00) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}

	@Test // testing approximately 110 degrees
	public void hundred_ten_() {
		double f = 110.30;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (110.3) is equivalent to (43.50) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing approximately 120 degrees
	public void hundred_twenty_() {
		double f = 119.30;
		String result = Lab1Utilities.temperatureConverter(f);
		String expect = "Fahrenheit (119.3) is equivalent to (48.50) in Celsius";
		String failed = String.format("\nTest temperatureConverter fail for (%.2f)  Returned ( %s )"
				+ "but correct is ( %s )\n", f, result, expect);
		assertEquals(failed, expect, result);
	}
	
// AGE IN YEARS
	
	@Test // testing for impossible age, less than zero
	public void negative_days_() {
		int d = -1;
		String result = Lab1Utilities.ageInYearsDetailed(d);
		String expect = "Invalid age in days: Below zero";
		String failed = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ),"
				+ " but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for day of birth
	public void zero_days_() {
		int d = 0;
		String result = Lab1Utilities.ageInYearsDetailed(d);
		String expect = "Age in days (0), age in years is (0), months (0), with remaining days (0)";
		String failed = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ),"
				+ " but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for one day old
	public void one_day_() {
		int d = 1;
		String result = Lab1Utilities.ageInYearsDetailed(d);
		String expect = "Age in days (1), age in years is (0), months (0), with remaining days (1)";
		String failed = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ),"
				+ " but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for less than month old
	public void less_than_month_() {
		int d = 29;
		String result = Lab1Utilities.ageInYearsDetailed(d);
		String expect = "Age in days (29), age in years is (0), months (0), with remaining days (29)";
		String failed = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ),"
				+ " but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for one month old
	public void one_month_() {
		int d = 30;
		String result = Lab1Utilities.ageInYearsDetailed(d);
		String expect = "Age in days (30), age in years is (0), months (1), with remaining days (0)";
		String failed = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ),"
				+ " but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for one month old
	public void more_than_one_month_() {
		int d = 31;
		String result = Lab1Utilities.ageInYearsDetailed(d);
		String expect = "Age in days (31), age in years is (0), months (1), with remaining days (1)";
		String failed = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ),"
				+ " but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for less than year old (output inexact, since 12 months = 360 days)
	public void less_than_year_() {
		int d = 364;
		String result = Lab1Utilities.ageInYearsDetailed(d);
		String expect = "Age in days (364), age in years is (0), months (12), with remaining days (4)";
		String failed = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ),"
				+ " but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for year old
	public void one_year_() {
		int d = 365;
		String result = Lab1Utilities.ageInYearsDetailed(d);
		String expect = "Age in days (365), age in years is (1), months (0), with remaining days (0)";
		String failed = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ),"
				+ " but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for more than year old
	public void more_than_one_year_() {
		int d = 366;
		String result = Lab1Utilities.ageInYearsDetailed(d);
		String expect = "Age in days (366), age in years is (1), months (0), with remaining days (1)";
		String failed = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ),"
				+ " but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for more than year old (again, issue with months since rounded to 30 days)
	public void less_than_ten_years_() {
		int d = 3649;
		String result = Lab1Utilities.ageInYearsDetailed(d);
		String expect = "Age in days (3649), age in years is (9), months (12), with remaining days (4)";
		String failed = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ),"
				+ " but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}

	@Test // testing for 10 years
	public void ten_years_() {
		int d = 3650;
		String result = Lab1Utilities.ageInYearsDetailed(d);
		String expect = "Age in days (3650), age in years is (10), months (0), with remaining days (0)";
		String failed = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ),"
				+ " but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for more than 10 years
	public void more_than_ten_years_() {
		int d = 3651;
		String result = Lab1Utilities.ageInYearsDetailed(d);
		String expect = "Age in days (3651), age in years is (10), months (0), with remaining days (1)";
		String failed = String.format("\nTest ageInYearsDetailed fail for (%d) Returned ( %s ),"
				+ " but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
// METRIC TO IMPERIAL (use conversion chart for values)
	
	
	
}