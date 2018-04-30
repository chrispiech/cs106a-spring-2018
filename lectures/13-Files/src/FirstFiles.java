/*
 * File: SeeTheUS.java
 * ===============================================================
 * A program to visualize the United States based on US Census
 * records from 2000.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class FirstFiles extends ConsoleProgram {	
	public void run() {
		try {
			Scanner sc = new Scanner(new File("holdup.txt"));
			while(sc.hasNext()) {
				String line = sc.nextLine();
				println(line);
			}
			sc.close();
		} catch(IOException e) {
			println("Opps the file didn't open");
		}
	}
}
