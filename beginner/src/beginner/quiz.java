package beginner;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class quiz {
	
	import java.util.ArrayList;

	public class ICPQ3 {
		
		ArrayList<Point> points; // make non-private for testing convinence; DON'T MODIFY
		
	    /* FYI: Point is a class with this code. Dont modify or uncooment here.
	    public class Point {

		 
		// TODO Auto-generated constructor stub
		private double x;
		private double y;
			
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public double getX(){ return x; }
		public double getY(){ return y; }
		
		*/



	  /*    ypour code starts here -**************/
	    public ICPQ3() {
			
			// IMPLEMENT the constructor
			 
		}
		

		/**
		 * 
		 * Return the number of a points in this point list whose x and y coordinates are of different signs, i.e., one is positive and one is negative.
		 * 
		 * Considre 0 as positive
		 * 

	     * Precondition:  this.points is an arraylist that is not null
		 
		 *  
		 * @return the nubmer of points in its whose x and y coordinates are of different signs
		 */
		public  int countPoints(   ) {
			/* Your implementation of this method starts here. 
			 * Recall that :
			 * 1. No System.out.println statements should appear here.
			 * 	  Instead, you need to return the result.
			 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
			 *    Instead, refer to the input parameters of this method.   
			 */
			
			int count = 0;
			
			for (Point point: points) {
				if((point.getX() < 0 && point.getY() > 0) || (point.getX() > 0 && point.getY() < 0)) {
					count++;
				}
			}
			
			return count;
			
		}

	}