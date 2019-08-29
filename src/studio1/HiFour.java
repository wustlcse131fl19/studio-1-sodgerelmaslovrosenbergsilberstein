package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String mood = ap.nextString("How are you all feeling today?");

		System.out.println("Hello and welcome to CSE 131!");
		System.out.println("Y'all seem to be feeling " + mood);
		String name = ap.nextString("What's your guys' names?");
		String name2 = ap.nextString("");
		String name3 = ap.nextString("");
		String name4 = ap.nextString("");
		System.out.println("Hi " + name +", " +name2 + ", " +name3 +", "+ name4 + "! How are you?");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
