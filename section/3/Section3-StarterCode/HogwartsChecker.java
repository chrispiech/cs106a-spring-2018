/*
 * File: HogwartsChecker.java
 * -------------------
 * This program will test your answers to the questions 
 * on the lab handouts.

 */

import acm.program.*;


public class HogwartsChecker extends ConsoleProgram {

	private static final int[] codes = {1537215, 1537217,
		1537215, 1596800, 1537215, -2081177780, -1750070753,
		-1883165792};
	
	private static final String[] prompts = {
		"1. What is the value of the first parameter for bludger?",
		"2. What is the value of the first parameter for quaffle?",
		"3. What is the value of the second parameter for quaffle?",
		"4. What is the value of the first parameter for snitch?",
		"5. What is the value of the second parameter for snitch",
		"6. What is the output of the first println?",
		"7. What is the output of the second println?",
		"8. What is the output of the third println?"
		};
	
	private static final int NUM_QUESTIONS = 8;
	
	public void run() {
		for (int i = 0; i < NUM_QUESTIONS; i++) {
			String answer = readLine(prompts[i]);
			while (cleaned_hash_code(answer) != codes[i]) {
				println("Try again!");
				answer = readLine(prompts[i]);
			}
		}
		println("CONGRATS! You got all of the answers correct!");
	}
	
	// Don't worry about what this function does
	private int cleaned_hash_code(String input) {
		String res = "";
	    for (Character c : input.toCharArray()) {
	        if(Character.isLetterOrDigit(c))
	            res += Character.toLowerCase(c);
	    }
	    return res.hashCode();
	}
}
