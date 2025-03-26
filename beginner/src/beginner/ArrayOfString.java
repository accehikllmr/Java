package beginner;

import java.util.ArrayList;
import java.util.Random;

public class ArrayOfString {
	
	private ArrayList<String> strings;
	
	public ArrayOfString(int size) {
		this.strings = new ArrayList<String>(size);
		Random character = new Random();
		for (int i = 0; i < size; i++) {
			String word = "";
			int length = character.nextInt(1, 10);
			for (int j = 0; j < length; j++) {
				int upperLower = character.nextInt(0, 2);
				word += (upperLower == 0) ? (char)character.nextInt(65, 90) : (char)character.nextInt(97, 122);
			}
			this.strings.add(word);
		}
	}
	
	public ArrayList<String> getStrings() {
		return this.strings;
	}
	
	public String toString() {
		return this.strings.toString();
	}
	
	public static void reverseList(ArrayList<String> strings) {
		for (int i = 0; i < strings.size() / 2; i++) {
			String temp = strings.get(i);
			strings.set(i, strings.get(strings.size() - i - 1));
			strings.set(strings.size() - i - 1, temp);
		}
	}
	
	public static void capitalizePlurals(ArrayList<String> strings) {
		for (String str : strings) {
			if (str.charAt(str.length() - 1) == 's') {
				strings.set(strings.indexOf(str), str.toUpperCase());
			}
		}
	}
	
	public static void removePlurals(ArrayList<String> strings) {
		// does not work when using for each loop, for some reason...
		for (int i = 0; i < strings.size(); i++) {
			String word = strings.get(i);
			if (word.charAt(word.length() - 1) == 's' || word.charAt(word.length() - 1) == 'S') {
				strings.remove(word);
			}
		}
	}
	
	public static void addStars(ArrayList<String> strings) {
		for (int i = 1; i < strings.size(); i += 2) {
			strings.add(i, "*");
		}
	}
	
	public static void removeStars(ArrayList<String> strings) {
		while (strings.contains("*")) {
			strings.remove("*");
		}
	}
	
	public static void main(String[] args) {
		
		ArrayOfString strings = new ArrayOfString(10);
		
		System.out.println(String.format("Original strings: %s", strings));
		ArrayOfString.reverseList(strings.getStrings());
		System.out.println(String.format("Reversed strings: %s", strings));
		ArrayOfString.capitalizePlurals(strings.getStrings());
		System.out.println(String.format("Upper plurals: %s", strings));
		ArrayOfString.removePlurals(strings.getStrings());
		System.out.println(String.format("Removed plurals: %s", strings));
		ArrayOfString.addStars(strings.getStrings());
		System.out.println(String.format("With stars: %s", strings));
		ArrayOfString.removeStars(strings.getStrings());
		System.out.println(String.format("Remove stars: %s", strings));
	}

}
