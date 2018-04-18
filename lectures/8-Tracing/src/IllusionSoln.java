/*
 * File: CheckerBoard.java
 * -----------------
 * Draws a checkerboard with alternating black and white tiles.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class IllusionSoln extends GraphicsProgram {	

	private static final int OFFSET_SCALE = 10;

	/* The size of a single square on the board */
	private static final int SQUARE_SIZE = 50;

	/* Number of cols */
	private static final int NCOLS = 9;

	public void run() {
		int screenHeight = getHeight();
		int nRows = (screenHeight / SQUARE_SIZE) + 1;
		drawGrid(nRows);
	}

	private void drawGrid(int nRows) {
		// draws many rows
		for(int rowIndex = 0; rowIndex < nRows; rowIndex++) {
			// first calculate how much to offset the current row
			double rowXOffset = getRowStart(rowIndex);
			// draws a single row
			for(int colIndex = 0; colIndex < NCOLS; colIndex++) {
				drawSquare(rowIndex, colIndex, rowXOffset);
			}
		}
	}

	private void drawSquare(int rowIndex, int colIndex, double rowXOffset) {
		double squareX = rowXOffset + colIndex * SQUARE_SIZE;
		double squareY = rowIndex * SQUARE_SIZE;
		GRect square = new GRect(SQUARE_SIZE, SQUARE_SIZE);
		square.setFilled(colIndex % 2 == 0);
		add(square, squareX, squareY);
	}

	private double getRowStart(int row) {
		int unitsRight = row % 4;
		return unitsRight * OFFSET_SCALE;
	}
}
