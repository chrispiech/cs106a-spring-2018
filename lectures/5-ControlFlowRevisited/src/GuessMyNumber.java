/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class GuessMyNumber extends ConsoleProgram {

	public void run() {	
		// you guys can see terminal in lecture
		setFont("Courier-24");
		int answer = getHeight() % 100;
		println("I am thinking of a number between 0 and 99...");
		
		int guess = readInt("Enter a guess: ");
		
		// TODO: your code here
		
		println("Congrats you win");
		

	}

}
