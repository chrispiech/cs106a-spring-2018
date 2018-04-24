/*
 * File: RandomCircles.java
 * ------------------------
 * This program draws a set of 10 circles with different sizes,
 * positions, and colors.  Each circle has a randomly chosen
 * color, a randomly chosen radius between 5 and 50 pixels,
 * and a randomly chosen position on the canvas, subject to
 * the condition that the entire circle must fit inside the
 * canvas without extending past the edge.
 */

import java.awt.event.MouseEvent;

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class MakeBoxes extends GraphicsProgram {

	public void run() {
		for (int i = 0; i < 3; i++) {
			GRect newBox = createBox(i + 1);
			add(newBox, i * 100, i * 100);
		}
	}

	private GRect createBox(int i) {
		GRect box = new GRect(i * 20, i * 20);
		i += 5;
		return box;
	}
}
