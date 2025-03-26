package beginner;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Initializing {

	private int x;
	private int y;
	
	public Initializing(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public static void main(String[] args) {
		Initializing test = new Initializing('x', 1);
		System.out.println(test.getX());
	}
}
