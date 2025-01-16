package beginner;
// importing scanner to take user input
import java.util.Scanner;

public class Exchange {
	
	public static void main(String[] args) {
	
		// taking user input for values to be exchanged
		Scanner console = new Scanner(System.in);
		System.out.println("Please provide two distinct values: ");
		// nextInt asks for double, it is also possible to use nextDouble
		int a = console.nextInt();
		int b = console.nextInt();
		int c;
			
		// how to get type cast working (???)
		c = a; // storing value assigned to a, in c
		a = b; // assigning value of b to a (first exchange)
		a = c; // assigning stored value of a, in c, to be
		
		// creating string object to facilitate printing
		String abc;
		
		abc = String.format("a = %d, b = %d, c = %d", a, b, c);
		System.out.println(abc);
		
		// closing scanner, to prevent resource leak (what does this mean?)
		console.close();

		// TO DISCOVER NEW METHODS, SIMPLY TYPE THE OBJECT NAME FOLLOWED BY A PERIOD
	}	
}
