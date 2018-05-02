/*
 * File: CountLetterFrequencies.java
 * ---------------------------------
 * This program counts the frequency of letters in user-entered text.
 */

import acm.program.*;

/**
 * This program creates a table of the letter frequencies in a 
 * paragraph of input text terminated by a blank line.
 */
public class ThaiNumerals extends ConsoleProgram {

	private static final char THAI_ZERO = '๐';

	public void run() {
		for(int i = 0; i < 10; i++) {
			char thai = THAI_ZERO + i;
			println(i + ": " + thai);
		}
		while(true) {
			String thai = readLine("Enter arabic number: ");
			String westernArabic = translate(thai);
			println("Western arabic translation: " + westernArabic);
		}
	}

	private String translate(String thai) {
		String arabic = "";
		for(int i = 0; i < thai.length(); i++) {
			char thaiCh = thai.charAt(i);
			int value = thaiCh - THAI_ZERO;
			char westernCh = '0' + value;
			arabic += westernCh;
		}
		return arabic;
	}


}
