package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	static //1. Create a main method to test the other methods you write.
	String[] s = {"a", "b", "c", "e", "f", "g"};
	public static void main(String[] args) {
//		printStrings(s);
//		printStringsReverse(s);
//		printStringsOther(s);
		printStringsRandom(s);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void printStrings(String[] s) {
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printStringsReverse(String[] s) {
		for(int i = s.length -1; i >= 0; i--) {
			System.out.println(s[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printStringsOther(String[] s) {
		for(int i = 0; i < s.length; i++) {
			if(i % 2 == 0) {
				System.out.println(s[i]);	
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void printStringsRandom(String[] s) {
		ArrayList <String> t = new ArrayList<String>();
		Random rand = new Random();
		for(int i = 0; i < s.length; i++) {
			t.add(s[i]);
		}
		
		for(int i = 0; i < s.length; i++) {
			int num = rand.nextInt(t.size());
			System.out.println(t.get(num));
			t.remove(num);
		}
	}
	
}
