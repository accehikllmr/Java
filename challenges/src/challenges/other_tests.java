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
	
// CURRENT WEATHER SEASON (using loops and known values)
	
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

// FAHRENHEIT TO CELSIUS (using conversion table)
	
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
	
// AGE IN YEARS (using mental calculation)
	
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
	
	@Test // testing for less than 10 years old (again, issue with months since rounded to 30 days)
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
	
// METRIC TO IMPERIAL (using conversion table)
	
	@Test // testing for negative dimensions
	public void neg_dimensions_() {
		double d = -0.1;
		String result = Lab1Utilities.distanceConverter(d);
		String expect = "Invalid length: Less than zero";
		String failed = String.format("\\nTest distanceConverter fail for (%.2f)  Returned ( %s ), "
				+ "but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for 0 dimensions
	public void zero_dimensions_() {
		double d = 0.0;
		String result = Lab1Utilities.distanceConverter(d);
		String expect = "0.00cm is 0ft and 0.00in";
		String failed = String.format("\\nTest distanceConverter fail for (%.2f)  Returned ( %s ), "
				+ "but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for 1 inch
	public void one_inch_() {
		double d = 2.54;
		String result = Lab1Utilities.distanceConverter(d);
		String expect = "2.54cm is 0ft and 1.00in";
		String failed = String.format("\\nTest distanceConverter fail for (%.2f)  Returned ( %s ), "
				+ "but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for 10 inches
	public void ten_inches_() {
		double d = 25.40;
		String result = Lab1Utilities.distanceConverter(d);
		String expect = "25.40cm is 0ft and 10.00in";
		String failed = String.format("\\nTest distanceConverter fail for (%.2f)  Returned ( %s ), "
				+ "but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for 20 inches
	public void twenty_inches_() {
		double d = 50.80;
		String result = Lab1Utilities.distanceConverter(d);
		String expect = "50.80cm is 1ft and 8.00in";
		String failed = String.format("\\nTest distanceConverter fail for (%.2f)  Returned ( %s ), "
				+ "but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for 30 inches
	public void thirty_inches_() {
		double d = 76.20;
		String result = Lab1Utilities.distanceConverter(d);
		String expect = "76.20cm is 2ft and 6.00in";
		String failed = String.format("\\nTest distanceConverter fail for (%.2f)  Returned ( %s ), "
				+ "but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for 40 inches
	public void forty_inches_() {
		double d = 101.60;
		String result = Lab1Utilities.distanceConverter(d);
		String expect = "101.60cm is 3ft and 4.00in";
		String failed = String.format("\\nTest distanceConverter fail for (%.2f)  Returned ( %s ), "
				+ "but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for 50 inches
	public void fifty_inches_() {
		double d = 127.00;
		String result = Lab1Utilities.distanceConverter(d);
		String expect = "127.00cm is 4ft and 2.00in";
		String failed = String.format("\\nTest distanceConverter fail for (%.2f)  Returned ( %s ), "
				+ "but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for 60 inches
	public void sixty_inches_() {
		double d = 152.40;
		String result = Lab1Utilities.distanceConverter(d);
		String expect = "152.40cm is 5ft and 0.00in";
		String failed = String.format("\\nTest distanceConverter fail for (%.2f)  Returned ( %s ), "
				+ "but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for 70 inches
	public void seventy_inches_() {
		double d = 177.80;
		String result = Lab1Utilities.distanceConverter(d);
		String expect = "177.80cm is 5ft and 10.00in";
		String failed = String.format("\\nTest distanceConverter fail for (%.2f)  Returned ( %s ), "
				+ "but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for 80 inches
	public void eighty_inches_() {
		double d = 203.20;
		String result = Lab1Utilities.distanceConverter(d);
		String expect = "203.20cm is 6ft and 8.00in";
		String failed = String.format("\\nTest distanceConverter fail for (%.2f)  Returned ( %s ), "
				+ "but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for 90 inches
	public void ninety_inches_() {
		double d = 228.60;
		String result = Lab1Utilities.distanceConverter(d);
		String expect = "228.60cm is 7ft and 6.00in";
		String failed = String.format("\\nTest distanceConverter fail for (%.2f)  Returned ( %s ), "
				+ "but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // testing for 100 inches
	public void hundred_inches_() {
		double d = 254.00;
		String result = Lab1Utilities.distanceConverter(d);
		String expect = "254.00cm is 8ft and 4.00in";
		String failed = String.format("\\nTest distanceConverter fail for (%.2f)  Returned ( %s ), "
				+ "but correct is ( %s )\n", d, result, expect);
		assertEquals(failed, expect, result);
	}
	
// COMPOUND INTEREST (using no loops and existing cases)
	
	@Test // both negative values
	public void negative_values_() {
		double b = -1.0;
		double i = -1.0;
		String result = Lab1Utilities.fiveYearBalance(b, i);
		String expect = "Invalid balance: Less than zero AND Invalid interest rate: Not between 0 and 100";
		String failed = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), "
				+ "but correct is ( %s )\n", b, i, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // both negative values
	public void negative_balance_too_large_rate_() {
		double b = -1.0;
		double i = 100.1;
		String result = Lab1Utilities.fiveYearBalance(b, i);
		String expect = "Invalid balance: Less than zero AND Invalid interest rate: Not between 0 and 100";
		String failed = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), "
				+ "but correct is ( %s )\n", b, i, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // negative balance
	public void negative_balance_() {
		double b = -1.0;
		double i = 1.0;
		String result = Lab1Utilities.fiveYearBalance(b, i);
		String expect = "Invalid balance: Less than zero";
		String failed = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), "
				+ "but correct is ( %s )\n", b, i, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // negative interest
	public void negative_interest_() {
		double b = 1.0;
		double i = -1.0;
		String result = Lab1Utilities.fiveYearBalance(b, i);
		String expect = "Invalid interest rate: Not between 0 and 100";
		String failed = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), "
				+ "but correct is ( %s )\n", b, i, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // too large interest
	public void too_large_interest_() {
		double b = 1.0;
		double i = 100.1;
		String result = Lab1Utilities.fiveYearBalance(b, i);
		String expect = "Invalid interest rate: Not between 0 and 100";
		String failed = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), "
				+ "but correct is ( %s )\n", b, i, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // random test case
	public void six_racks_() {
		double b = 6000.00;
		double i = 4.25;
		String result = Lab1Utilities.fiveYearBalance(b, i);
		// storing balance in new variable, to compute final balance and conserve original
		double n = b;
		// converting rate to decimal
		double r = i / 100;
		// instead of looping, using formula five times (not identical to original formula either)
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		String expect = String.format("The balance was %.2f with interest %.2f, after five years balance is %.2f",
				b, i, n);
		String failed = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), "
				+ "but correct is ( %s )\n", b, i, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // random test case
	public void three_racks_() {
		double b = 3000.00;
		double i = 3.5;
		String result = Lab1Utilities.fiveYearBalance(b, i);
		double n = b;
		double r = i / 100;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		String expect = String.format("The balance was %.2f with interest %.2f, after five years balance is %.2f",
				b, i, n);
		String failed = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), "
				+ "but correct is ( %s )\n", b, i, result, expect);
		assertEquals(failed, expect, result);
	}

	@Test // random test case
	public void four_racks_() {
		double b = 4000.00;
		double i = 2.25;
		String result = Lab1Utilities.fiveYearBalance(b, i);
		double n = b;
		double r = i / 100;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		String expect = String.format("The balance was %.2f with interest %.2f, after five years balance is %.2f",
				b, i, n);
		String failed = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), "
				+ "but correct is ( %s )\n", b, i, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // random test case
	public void one_rack_() {
		double b = 1000.00;
		double i = 1.25;
		String result = Lab1Utilities.fiveYearBalance(b, i);
		double n = b;
		double r = i / 100;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		String expect = String.format("The balance was %.2f with interest %.2f, after five years balance is %.2f",
				b, i, n);
		String failed = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), "
				+ "but correct is ( %s )\n", b, i, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // random test case
	public void one_racks_() {
		double b = 1050.00;
		double i = 1.25;
		String result = Lab1Utilities.fiveYearBalance(b, i);
		double n = b;
		double r = i / 100;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		String expect = String.format("The balance was %.2f with interest %.2f, after five years balance is %.2f",
				b, i, n);
		String failed = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), "
				+ "but correct is ( %s )\n", b, i, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // random test case
	public void two_racks_() {
		double b = 2150.00;
		double i = 3.05;
		String result = Lab1Utilities.fiveYearBalance(b, i);
		double n = b;
		double r = i / 100;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		String expect = String.format("The balance was %.2f with interest %.2f, after five years balance is %.2f",
				b, i, n);
		String failed = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), "
				+ "but correct is ( %s )\n", b, i, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // random test case
	public void two_bands_() {
		double b = 150.00;
		double i = 3.45;
		String result = Lab1Utilities.fiveYearBalance(b, i);
		double n = b;
		double r = i / 100;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		String expect = String.format("The balance was %.2f with interest %.2f, after five years balance is %.2f",
				b, i, n);
		String failed = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), "
				+ "but correct is ( %s )\n", b, i, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // random test case
	public void one_racks_2_() {
		double b = 1455.00;
		double i = 4.5;
		String result = Lab1Utilities.fiveYearBalance(b, i);
		double n = b;
		double r = i / 100;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		String expect = String.format("The balance was %.2f with interest %.2f, after five years balance is %.2f",
				b, i, n);
		String failed = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), "
				+ "but correct is ( %s )\n", b, i, result, expect);
		assertEquals(failed, expect, result);
	}
	
	@Test // random test case
	public void four_racks_2_() {
		double b = 4055.00;
		double i = 1.5;
		String result = Lab1Utilities.fiveYearBalance(b, i);
		double n = b;
		double r = i / 100;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		n = n + n * r;
		String expect = String.format("The balance was %.2f with interest %.2f, after five years balance is %.2f",
				b, i, n);
		String failed = String.format("\nTest fiveYearBalance fail for Balance=%.2f and Interest=%.2f Returned ( %s ), "
				+ "but correct is ( %s )\n", b, i, result, expect);
		assertEquals(failed, expect, result);
	}
	
// BMI
	
}