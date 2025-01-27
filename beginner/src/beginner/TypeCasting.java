package beginner;

public class TypeCasting {

	public static void main(String[] args) {
		float f = 3.8f;
		int i = 3;
		
		/* operands for summation are of different types (Integer and Float)
		 * but sum can be calculated, since integer type is promoted to float type
		 * but type of Integer object remains unchanged, only promoted for summation
		 */
		float summ = f + i;
		
		System.out.println(String.format("%f %d %f", f, i, summ));

		// the same phenomenon can occur during assignment
		float ff = 3;
		// int ii = 3.8; this one does not work, for some reason
		
		System.out.println(String.format("%f", ff));
		
		int x = 5, y = 2;
		float fff = 2.0f;
		
		/* integer division returns the result of regular division, truncated
		 * division with at least one float type returns the result of regular division
		 * if an integer type is present, it is promoted to a more precise type (e.g. double)
		 */
		System.out.println(String.format("%d %d %f %f", x/y, y/x, x/fff, fff/x));
		
		// conversions can be done explicitly, using type casting
		int a = 9, b = 2;
		
		float g;

		// integer division, = 4
		g = a / b;
		System.out.println(g);
		
		// division by float, = 4.5
		g = a / (float)b;
		System.out.println(g);
		
		// float divided, = 4.5
		g = (float) a / b;
		System.out.println(g);
		
		// integer division, converted to float, = 4.0
		g = (float)(a / b);
		System.out.println(g);
	

	}
}
