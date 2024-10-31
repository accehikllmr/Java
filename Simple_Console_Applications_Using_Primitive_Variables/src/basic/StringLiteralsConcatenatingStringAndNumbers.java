package basic;

public class StringLiteralsConcatenatingStringAndNumbers {

	public static void main(String[] args) {
		System.out.println("We have various attempts to calculate the average of 5 and 2.");
		
		//print command prints on a line, without escaping to next line
		System.out.print("5 + 2 / 2");
		System.out.print(" = ");
		//println command prints on a line, and escapes to next line
		System.out.println(5 + 2 / 2);	//not 3.5, PEDMAS
		
		/*
		 * number literal resulting from mathematical expression is implicitly converted into
		 * string literal by concatenation operation, but need brackets around numbers
		 * works for both print and println commands
		 */
		System.out.println("(5 + 2) / 2 = " + ((5 + 2) / 2));	//not 3.5, integer division
		System.out.print("(5 + 2) / 2.0 = " + ((5 + 2) / 2.0));	//3.5, division by a float

		//string concatenation, like in Python
		System.out.println("\nHello, my name is Nunuhyuh Beezeeniss.");
		System.out.println("Hello, " + "my " + "name " + "is " + "Nunuhyuh " + "Beezeeniss.");
		
		System.out.println("Experimenting with concatenation (1 + 1): " + (1 + 1));
		//implicit conversion to string
		System.out.println("Experimenting with concatenation 1 + 1: " + 1 + 1);		
		
	}

}
