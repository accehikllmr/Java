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
	
	@Test // testing all unknown dates in December
	public void test_dec_unknown_() {
		int m = 12;
		String expect = "Unknown";
		for (int d = 1; d <= 14; d++) {
			String result = Lab1Utilities.weather(m, d);
			String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
					+ "but correct is ( %s )\n", m, d, result, expect);
			assertEquals(failed, expect, result);
			System.out.println(String.format("%d %d: %s", m, d, result));
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
			System.out.println(String.format("%d %d: %s", m, d, result));
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
			System.out.println(String.format("%d %d: %s", m, d, result));
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
			System.out.println(String.format("%d %d: %s", m, d, result));
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
			System.out.println(String.format("%d %d: %s", m, d, result));
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
			System.out.println(String.format("%d %d: %s", m, d, result));
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
			System.out.println(String.format("%d %d: %s", m, d, result));
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
			System.out.println(String.format("%d %d: %s", m, d, result));
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
			System.out.println(String.format("%d %d: %s", m, d, result));
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
			System.out.println(String.format("%d %d: %s", m, d, result));
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
			System.out.println(String.format("%d %d: %s", m, d, result));
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
			System.out.println(String.format("%d %d: %s", m, d, result));
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
			System.out.println(String.format("%d %d: %s", m, d, result));
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
			System.out.println(String.format("%d %d: %s", m, d, result));
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
				System.out.println(String.format("%d %d: %s", m, d, result));
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
					System.out.println(String.format("%d %d: %s", m, d, result));
				}
			} else if (m == 4 || m == 6 || m == 9 || m == 11) {
				for (int d = 31; d <= 41; d++) {
					String result = Lab1Utilities.weather(m, d);
					String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
						+ "but correct is ( %s )\n", m, d, result, expect);
					assertEquals(failed, expect, result);
					System.out.println(String.format("%d %d: %s", m, d, result));
				}
			} else {
				for (int d = 29; d <= 39; d++) {
					String result = Lab1Utilities.weather(m, d);
					String failed = String.format("\nTest weather fail for (%d) and (%d) Returned ( %s ), "
						+ "but correct is ( %s )\n", m, d, result, expect);
					assertEquals(failed, expect, result);
					System.out.println(String.format("%d %d: %s", m, d, result));
				}
			}
		}
	}
	
}