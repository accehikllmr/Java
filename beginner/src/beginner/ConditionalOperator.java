package beginner;

public class ConditionalOperator {
	
	public static void main(String[] args) {
		
		// generating two random, converting to integers by type casting
		int a = (int)(Math.random() * 100), b = (int)(Math.random() * 100);
		
		// if a is larger than b, then a is assigned to the variable
		int larger = (a > b) ? a : b;
		
		System.out.println(String.format("a = %d, b = %d, larger = %d", a, b, larger));
		
		int count = 11;
		
		// if number of cents is not equal to 1, then the plural form of the word is printed
		System.out.println("Your change is " + count + ( (count == 1) ? " cent." : " cents."));
		
	}
	

}
