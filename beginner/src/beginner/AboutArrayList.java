package beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class AboutArrayList {

	public static void main(String[] args) {
		
		List<Integer> numList1 = new ArrayList<>(Arrays.asList(0, 10, 20, 2, 0, 10, 20, 2));
		List<Integer> numList2 = new ArrayList<>(Arrays.asList(0, 10, 20, 2));

		/*
		for (int num : numbers) {
			numList1.add(num);
			numList2.add(num);
		}
		*/
		
		System.out.println(numList1.toString());
		System.out.println(numList1.reversed().toString());
		
		removeLargerEnd(numList1, 9);
		removeLargerBegin(numList2, 9);
		
		System.out.println(numList1.toString());
		System.out.println(numList2.toString());
	}
	
	public static void removeLargerEnd(List<Integer> t, int a) {
		for (int i = t.size() - 1; i >= 0; i--) {
			if (t.get(i) > a) {
				t.remove(i);
			}
		}
	}
	
	public static void removeLargerBegin(List<Integer> t, int a) {
		for (int i = 0; i <= t.size() - 1; i++) {
			if (t.get(i) > a) {
				t.remove(i);
			}
		}
	}
}
