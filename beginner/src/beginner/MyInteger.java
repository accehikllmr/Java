package beginner;

import java.util.Arrays;

public class MyInteger {
	
	private int value;
	
	public MyInteger(int i) {
		this.value = i;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public static void incrementObj (MyInteger x) {
		int v = x.getValue();
		x.setValue(v + 100);
	}
	
	@Override
	public String toString() {
		return String.format("%d", this.getValue());
	}
	
	public static void main(String[] args) {
	
		MyInteger a = new MyInteger(1);
		MyInteger b = new MyInteger(2);
		MyInteger c = new MyInteger(3);
		MyInteger[] numbers1 = {a, b, c};
		MyInteger[] numbers2 = new MyInteger[numbers1.length];
		
		for (int i = 0; i < numbers1.length; i++) {
			numbers2[i] = new MyInteger(i);
		}
		
		numbers1[0].setValue(4);
		
		System.out.println(Arrays.toString(numbers1));
		System.out.println(Arrays.toString(numbers2));
		
		MyInteger d = new MyInteger(3);
		System.out.println(d.getValue());
		incrementObj(d);
		System.out.println(d.getValue());		
		
	}
}
