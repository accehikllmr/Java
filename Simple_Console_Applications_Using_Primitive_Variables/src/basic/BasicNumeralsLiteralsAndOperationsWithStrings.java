package basic;

public class BasicNumeralsLiteralsAndOperationsWithStrings {

	public static void main(String[] args) {
		// addition
		System.out.println("15 + 4 = " + (15 + 4));	// 19
		// subtraction
		System.out.println("15 - 4 = " + (15 - 4));	// 11
		// multiplication
		System.out.println("15 * 4 = " + (15 * 4));	// 60
		// division, but since both are integers acts as integer division
		System.out.println("integer division: 15 / 4 = " + (15 / 4));	// 3
		// division, but since one term is a float, result is not integer division
		System.out.println("not integer division: 15.0 / 4 = " + (15.0 / 4)); // 3.75
		// remainder (modulo)
		System.out.println("15 % 4 = " + (15 % 4)); // 3
		// division of integers is different from standard mathematical result
		System.out.println("4 * (15 / 4) + (15 % 4)" + (4 * (15 / 4) + (15 % 4))); // 15 rather than 18
		System.out.println("4 * (15.0 / 4) + (15 % 4)" + (4 * (15.0 / 4) + (15 % 4))); // 18, the expected result
				
		// as in Python, strings can only be concatenated
	}
}
