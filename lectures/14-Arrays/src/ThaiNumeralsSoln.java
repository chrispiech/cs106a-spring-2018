

import acm.program.*;


public class ThaiNumeralsSoln extends ConsoleProgram {

	private static final char THAI_ZERO = '๐';

	public void run() {
		for(int i = 0; i < 10; i++) {
			char thai = (char)(THAI_ZERO + i);
			println(i + ": " + thai);
		}
		while(true) {
			String thai = readLine("Enter arabic number: ");
			String westernArabic = translate(thai);
			println("Western arabic translation: " + westernArabic);
		}
	}

	/**
	 * Translate
	 * Turns thai numerals into western-arabic numerals
	 */
	private String translate(String thai) {
		String arabic = "";
		for(int i = 0; i < thai.length(); i++) {
			char thaiCh = thai.charAt(i);
			int value = thaiCh - THAI_ZERO;
			char westernCh = (char)('0' + value);
			arabic += westernCh;
		}
		return arabic;
	}


}
