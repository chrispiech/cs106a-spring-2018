/*
 * File: CountLetterFrequencies.java
 * ---------------------------------
 * This program counts the frequency of letters in user-entered text.
 */

import java.util.Arrays;

import acm.program.*;

/**
 * This program creates a table of the letter frequencies in a 
 * paragraph of input text terminated by a blank line.
 */
public class CountLetterFrequencies extends ConsoleProgram {


	public void run() {
		println("This program counts letter frequencies.");
		
		// make a frequency histogram which is initially empty
		int[] table = initFrequencyTable();
		String line = readLine("Enter a line: ");
		
		// make this histogram of characters in the string
		countLetterFrequencies(table, line);
		
		// print out the histogram
		printFrequencyTable();
	}
	
	/* Initializes the frequency table to contain zeros */
	private int[] initFrequencyTable() {
		int[] table = new int[26];
		return table;
	}
	
	/* Counts the letter frequencies in a line of text */
	private void countLetterFrequencies(int[] table, String line) {
		
		for(int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if(Character.isLetter(ch)) {
				int index = Character.toUpperCase(ch) - 'A';
				table[index]++;
			}
		}
	}


	/* Displays the frequency table */
	private void printFrequencyTable() {
		// TODO
	}


}
