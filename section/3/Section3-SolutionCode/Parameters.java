/*
 * File: Problem1.java
 * -------------------
 * Copy the code into the following functions to test whether your answers are
 * correct
 */

import acm.program.*;

public class Parameters extends ConsoleProgram {

	public void run() {
		int y = 5;
		int x = 3;
		int result = compute(y,x);
		println("Value of result is " + result);
		println("Value of x is " + x);
		println("Value of y is " + y);
	}
	
	public int compute(int x, int y) {
		println("I added 2 times " + x + " plus three times " + y);
		x *= 2;
		y *= 3;
		return x + y;
	}
}
