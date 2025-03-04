package Lab4;

import java.util.Arrays;

public class quiz {
	
	public static void main(String[] args) { 
		
		int [] other_array = {1, 2, 3};
		timesthree(other_array);
		
	}
	
	public static int[] timesthree(int[] arr) {
		
		int newLength = arr.length * 3;
		int [] newArr = new int[newLength];
		 
		System.out.println(newArr.length);
		
		for (int i = 0; i < newLength; i++) {
		     newArr[i] = arr[i];
		     newArr[i + 1] = arr[i];
		     newArr[i + 2] = arr[i];
		 }
		 
		 System.out.println(Arrays.toString(newArr));
		 return newArr;
	}
	

}
