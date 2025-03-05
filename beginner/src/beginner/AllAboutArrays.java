package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class AllAboutArrays {

	public static void main(String[] args) {

		// temperatures();
		
		// mysteryArray();
		
		// reverseRandomArrayAndSums();
		
		// int[] an_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// int[] other_array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
		
		/*
		System.out.println(Arrays.toString(an_array));
		System.out.println(Arrays.toString(other_array));
		swapArrays(an_array, other_array);
		System.out.println(Arrays.toString(an_array));
		System.out.println(Arrays.toString(other_array));
		*/
		
		/*
		System.out.println(Arrays.toString(an_array));
		swapNums(an_array, Math.round(Math.floor(Math.random() * 10)), Math.round(Math.floor(Math.random() * 10)));
		System.out.println(Arrays.toString(an_array));
		*/
		
		// System.out.println(Arrays.toString(doubleNums(an_array)));
		
		/*
		System.out.println(Arrays.toString(an_array));
		reverseMethod(an_array);
		System.out.println(Arrays.toString(an_array));
		*/
		
		/*
		int[] an_array = {1, 2, 3, 4};
		int[] other_array = {1, 3, 5, 7, 9};
		int[] some_array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
		*/
		
		// System.out.println(Arrays.toString(merge2(an_array, other_array)));
		
		// System.out.println(Arrays.toString(merge3(an_array, other_array, some_array)));
		
		// System.out.println(mostFrequentDigit(1330932821));
		
		/*
		int[] grades = new int[100];
		
		for (int i = 0; i < grades.length; i++) {
			int grade = (int)(Math.round(Math.floor(Math.random() * 100)));
			grades[i] = grade;
		}
		
		gradeHistogram(grades);

		Arrays.sort(grades);
		System.out.println(Arrays.toString(grades));
		*/
		
		/*
		String a = "In Casablanca, Humphrey Bogart never says \"Play it again, Sam.\"";
		characterTally(a);
		*/
		
	}
	
	public static void characterTally(String a) {
		
		int[] upperCharTally = new int[26];
		int[] lowerCharTally = new int[26];
		int lowerCharNum;
		int upperCharNum;
		int nonAlphaChar = 0;
		
		for (int i = 0; i < a.length(); i++) {
			char character = a.charAt(i);			
			if (character >= 'A' && character <= 'Z') {
			//if (Character.isAlphabetic(character) && Character.isUpperCase(character)) {
				upperCharNum = character - 'A';
				upperCharTally[upperCharNum]++;
			} 
			else if (character >= 'a' && character <= 'z') {
			//else if (!Character.isAlphabetic(character)){
				//nonAlphaChar++;
				lowerCharNum = character - 'a';
				lowerCharTally[lowerCharNum]++;
			} else {
				nonAlphaChar++;
			}
		}
		
		/*
		for (int k = 0; k < a.length(); k++) {
			char character = a.charAt(k);
			if (character >= 'a' && character <= 'z') {
			//if (Character.isAlphabetic(character) && Character.isLowerCase(character)) {
				lowerCharNum = character - 'a';
				lowerCharTally[lowerCharNum]++;
			}
		}
		*/
		
		for (int j = 0; j < upperCharTally.length; j++) {
			/* using 'A' and adding to index j to find first letter in ASCII,
			 * then converting to char using Typecasting
			 */
			System.out.print(String.format("%s: %d\t", (char)(j + 'A'), upperCharTally[j]));
			System.out.println(String.format("%s: %d", (char)(j + 'a'), lowerCharTally[j]));
		}
		
		// System.out.println(Arrays.toString(charTally));
		System.out.println(String.format("Non-alphabetic characters: %d", nonAlphaChar));
		
	}
	
	public static void gradeHistogram(int[] grades) {
		
		//String [] stars = new String[10];
		// above line has null at beginning of each string, since null is default value
		String [] stars = {"", "", "", "", "", "", "", "", "", ""};
		
		int index = 0;
		
		while (index != grades.length) {
			
			int addStar = grades[index] / 10;
			stars[addStar] += "*";
			index++;
		}
		
		for (int i = 1; i < stars.length + 1; i++) {
			System.out.println(String.format("%d0: %s", i, stars[i - 1]));
		}
		
	}
	
	// malfunctions when argument passed to method parameter begins with zeroes
	public static int mostFrequentDigit(int a) {
		
		int[] numList = new int[10];
		
		/* possible to use for loop like a while loop, only defining end condition
		 * and increment of variable to stop loop
		 */
		for ( ; a > 0; a = a / 10) {
			int count = a % 10;
			numList[count]++;
		}
		
		int maxCount = 0;
		
		for (int j = 0; j < numList.length; j++) {
			if (numList[j] > numList[maxCount]) {
				maxCount = j;
			}
		}
		
		System.out.println(Arrays.toString(numList));
		
		return maxCount;
	}
	
	public static int[] merge3(int[] a, int[] b, int[] c) {
		
		int[] merge3 = new int[a.length + b.length + c.length];
		
		for (int i = 0; i < a.length; i++) {
			merge3[i] = a[i];
		}
		
		for (int j = a.length; j < a.length + b.length; j++) {
			merge3[j] = b[j - a.length];
		}
		
		for (int k = a.length + b.length; k < a.length + b.length + c.length; k++) {
			merge3[k] = c[k - a.length - b.length];
		}
		
		return merge3;
	}
	
	public static int[] merge2(int[] a, int[] b) {
		
		int[] merge2 = new int[a.length + b.length];
		
		for (int i = 0; i < a.length; i++) {
			merge2[i] = a[i];
		}
		
		for (int j = a.length; j < a.length + b.length; j++) {
			merge2[j] = b[j - a.length];
		}
		
		return merge2;
	}
	
	public static void swapArrays(int[] array_1, int[] array_2) {
		int temp;
		
		for(int i = 0; i < array_1.length; i++) {
			temp = array_1[i];
			array_1[i] = array_2[i];
			array_2[i] = temp;
		}
	}
	
	public static void swapNums(long[] some_array, long num_1, long num_2) {
		long temp = some_array[(int)num_1];
		some_array[(int)num_1] = some_array[(int)num_2];
		some_array[(int)num_2] = temp;
	}

	public static int[] doubleNums(int[] some_array) {
		
		int[] double_array = new int[some_array.length * 2];
		int index = 0;
		
		// iterate through original array to get numbers
		for (int i = 0; i < some_array.length; i++) {
			// for each number, add to new array twice
			double_array[index] = some_array[i];
			index++;
			double_array[index] = some_array[i];
			index++;
		}

		return double_array;
	}
	
	public static void reverseMethod(int[] some_array) {
		
		for (int i = 0; i < some_array.length / 2; i++) {
			//int temp = some_array[i];
			some_array[i] = some_array[some_array.length - i - 1];
			//some_array[some_array.length - i - 1] = temp;
		}
	}
	
	public static void reverseRandomArrayAndSums() {
		
		// randomizing size, to make sure that program works regardless of odd or even size
		int SIZE = (Math.random() >= 0.5) ? 10 : 9;
		
		long[] numbers = new long[SIZE];
		long number;
		
		int numEven = 0;
		int numOdd = 0;
		long evenValueSum = 0;
		long oddValueSum = 0;
		long evenPosSum = 0;
		long oddPosSum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			// binary values, using conditional assignment to create digits
			// number = (Math.random() >= 0.5) ? 1 : 0;
			/* values from 0 to 5, no obvious means to convert from double to int
			 * using round (double -> long), so all data types changed to long
			 */
			number = Math.round(Math.floor(Math.random() * 6));
			
			if (number % 2 == 0) {
				numEven++;
				evenValueSum += number;
			} else {
				numOdd++;
				oddValueSum += number;
			}
			
			if (i % 2 == 0) {
				evenPosSum += number;
			} else {
				oddPosSum += number;
			}
			
			numbers[i] = number;
		}
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(String.format("numEven = %d", numEven));
		System.out.println(String.format("numOdd = %d", numOdd));
		System.out.println(String.format("evenValueSum = %d", evenValueSum));
		System.out.println(String.format("oddValueSum = %d", oddValueSum));
		System.out.println(String.format("evenPosSum = %d", evenPosSum));
		System.out.println(String.format("oddPosSum = %d", oddPosSum));
		
		for (int j = 0; j < numbers.length / 2; j++) {
			long temp = numbers[j];
			numbers[j] = numbers[numbers.length - 1 - j];
			numbers[numbers.length - 1 - j] = temp;
		}
		
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void mysteryArray() {
		int[] a = { 1, 7, 5, 6, 4, 14, 11 };
		/*
		 * stopping at a.length - 1 (index 5) prevents compiler from looking outside of
		 * Array index range (at index 6 it compares with index 7, which does not exist)
		 */
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				a[i + 1] = a[i + 1] * 2;
			}
		}
		System.out.println(Arrays.toString(a));
		Arrays.toString(a);
	}

	public static void temperatures() {

		Scanner console = new Scanner(System.in);

		System.out.print("How many days of temperature are there to record? ");
		int numDays = console.nextInt();
		// not sure if this is a convention, or simply for learning
		final int SIZE = numDays;

		double[] temperatures = new double[SIZE];
		double averageTemp = 0.0;

		for (int i = 1; i <= SIZE; i++) {
			System.out.print(String.format("What is the temperature high for day %d ?", i));
			/*
			 * data retrieved through console can be inserted directly into an Array object
			 * without intermediate variable to store the value
			 */
			temperatures[i - 1] = console.nextDouble();
			averageTemp += temperatures[i - 1];
		}

		console.close();

		averageTemp /= numDays;
		int aboveAverage = 0;

		for (int j = 0; j < temperatures.length; j++) {
			if (temperatures[j] > averageTemp) {
				aboveAverage++;
			}
		}

		System.out.println(String.format("Average temp = %.1f", averageTemp));
		System.out.println(String.format("%d days were above average.", aboveAverage));

		System.out.println(Arrays.toString(temperatures));

	}
}