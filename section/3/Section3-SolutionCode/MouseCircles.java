/*
 * File: MouseCircles.java
 * ------------------------
 * This program draws a circle each times the mouse is clicked,
 * centered where the click occurs.  Each circle has a randomly
 * chosen color and a randomly chosen radius between 5 and 50 
 * pixels.
 */

import java.awt.event.MouseEvent;

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class MouseCircles extends GraphicsProgram {


	/** Minimum radius */
	private static final double MIN_RADIUS = 5;

	/** Maximum radius */
	private static final double MAX_RADIUS = 50;

	public void run() {
		addMouseListeners();
	}
	
	/* Called on mouse click to create a new circle */
	public void mouseClicked(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		drawCircle(x,y);
	}
	
	/* Draws a single circle at (x, y) */
	private void drawCircle(double x, double y) {
		double r = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
		GOval circle = new GOval(x - r, y - r, 2 * r, 2 * r);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		add(circle);
	}
			
	/* Private instance variable */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
