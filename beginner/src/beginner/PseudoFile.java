package beginner;

import java.util.ArrayList;
import java.util.Random;

public class PseudoFile {

	// declaring ArrayList object without initialization or specified length (given during object instantiation)
	private ArrayList<Integer> numbers;
	private int size = 0;
	
	public PseudoFile(int size) {
		// initializing ArrayList object, with length given by argument passed to method parameter
		this.numbers = new ArrayList<Integer>(size);
		// initializing Random object which will generate values
		Random number = new Random();
		// not limiting to size of ArrayList object, since it will grow through loop iterations
		for (int i = 0; i < size; i++) {
			this.numbers.add(number.nextInt(100));
			this.size++;
		}
	}
	
	public ArrayList<Integer> getNumbers() {
		return this.numbers;
	}
	
	public ArrayList<Integer> reverseList() {
		for (int i = 0; i < numbers.size() / 2; i++) {
			int temp = this.numbers.get(i);
			this.numbers.set(i, this.numbers.get(numbers.size() - i - 1));
			this.numbers.set(this.numbers.size() - i - 1, temp);
		}
		return numbers;
	}
	
	public int computeAverage() {
		int sum = 0;
		for (int i = 0; i < this.size; i++) {
			sum += this.numbers.get(i);
		}
		return sum / this.size;
	}
	
	public void numHighLow() {
		numbers.sort(null);
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(this.size - 1));
	}
	
	public void filterEvens(ArrayList<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			// need to initialize as an Integer object, otherwise int data type is passed to remove method, which is interpreted as an index
			Integer number = numbers.get(i);
			if (number % 2 == 0) {
				numbers.remove(number);
				i--;
			}
		}
	}
	
	public static void main(String[] args) {
	
		PseudoFile file = new PseudoFile(9);
		
		System.out.println(file.computeAverage());
		file.numHighLow();
		System.out.println(file.getNumbers());
		file.filterEvens(file.getNumbers());
		System.out.println(file.getNumbers());
		file.reverseList();
		System.out.println(file.getNumbers());
		
	}
}