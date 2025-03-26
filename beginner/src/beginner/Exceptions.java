package beginner;

import java.util.ArrayList;

public class Exceptions {

	public static void main(String[] args) {
	
		ArrayList<Integer> numList = new ArrayList<Integer>(5);
		for (int i = 1; i < 6; i++) {
			numList.add(i);
		}
		
		try {
			for (int j = 0; j < 5; j++) {
				if (j >= numList.toArray().length) {
					throw new ArrayIndexOutOfBoundsException("index outside of ArrayList range");
				}
				if (numList.get(j) == 0) {
					throw new ArithmeticException("division by zero");
				}
				System.out.println(1.0 / numList.get(j));
			}
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException f) {
			System.out.println(f);
		} finally {
			System.out.println("caught the exception?");
		}
		System.out.println("caught the exception!");
	}
}