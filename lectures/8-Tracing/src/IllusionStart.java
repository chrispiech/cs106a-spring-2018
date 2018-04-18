/*
 * File: CheckerBoard.java
 * -----------------
 * Draws a checkerboard with alternating black and white tiles.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class IllusionStart extends GraphicsProgram {	

	/* The size of a single square on the board */
	private static final int SQUARE_SIZE = 50;
	
	/* Number of rows */
	private static final int NROWS = 9;
	
	/* Number of cols */
	private static final int NCOLS = 9;

	public void run() {
		for(int j = 0; j < NROWS; j++) {
			for(int i = 0; i < NCOLS; i++) {
				double x = i * SQUARE_SIZE;
				double y = j * SQUARE_SIZE;
				GRect square = new GRect(SQUARE_SIZE, SQUARE_SIZE);
				// in this line we evaluate a boolean which we pass
				// to set filled. Filled if the row + col is odd
				square.setFilled((j + i) % 2 != 0);
				add(square, x, y);
			}
		}
	}
}
