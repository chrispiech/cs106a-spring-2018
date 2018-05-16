/*
 * JankyButton.java
 * Brahm Capoor, May 2018
 *
 *
 * This program is an example of how to make a button using just 
 * the tools we have so far in CS 106A. Specifically, it uses a 
 * GRect as the border of the button and a GLabel as the text
 * of the button. 
 *
 * NOTE: This is NOT a good way to do this so don't try to do 
 * something like this in your programs unless you absolutely have
 * to! Try to think about whether you could use an interactor 
 * instead. 
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.RandomGenerator;

import java.awt.Color;
import java.awt.event.MouseEvent;


public class JankyButton extends GraphicsProgram {
	
	// BUTTON CONSTANTS
	private static final double BUTTON_WIDTH = 85;
	private static final double BUTTON_HEIGHT = 30;
	private static final double BUTTON_PADDING = 10;
	private static final String BUTTON_TEXT = "Click me!";
	
	// RANDOM CIRCLE CONSTANTS
	private static final int MIN_RADIUS = 10;
	private static final int MAX_RADIUS = 50;
	
	// INSTANCE VARIABLES
	private GRect buttonBorder;
	private GLabel buttonText;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		makeButton();
	}


	/*
 	 * This method is responsible for making the button. It calls
 	 * two helper methods, one to make the border of the button,
 	 * and one to make the text in the button.
 	 */
	private void makeButton() {
		makeButtonBorder();
		makeButtonText();
	}
	
	
	/*
	 * This method is responsible for initializing buttonBorder
	 * to the correct size and for placing it in the right place
	 * on the screen.
	 */
	private void makeButtonBorder() {
		buttonBorder = new GRect(BUTTON_WIDTH, BUTTON_HEIGHT);
		double x = getWidth() / 2 - buttonBorder.getWidth() / 2;
		double y = getHeight() - buttonBorder.getHeight() - BUTTON_PADDING;
		add(buttonBorder, x, y);
	}
	

	/*
	 * This method is responsible for initializing buttonLabel
	 * to the correct text and for placing it in the right place 
	 * on the screen.
	 */
	private void makeButtonText() {
		buttonText = new GLabel(BUTTON_TEXT);
		double x = buttonBorder.getX() + buttonBorder.getWidth() / 2 - buttonText.getWidth() / 2;
		double y = buttonBorder.getY() + buttonBorder.getHeight() / 2 + buttonText.getAscent() / 2;
		add(buttonText, x, y);
	}
	

	/*
	 * This method draws a circle with a random color and radius
	 * somewhere on the canvas. 
	 * It's super similar to a problem from Section 3!
	 */
	private void drawRandomCircle() {
		int radius = rgen.nextInt(MIN_RADIUS, MAX_RADIUS);
		GOval circle = new GOval(2 * radius, 2 * radius);
		
		double x = rgen.nextDouble(0, getWidth());
		double y = rgen.nextDouble(0, getHeight());
		
		Color color = rgen.nextColor();
		circle.setFillColor(color);
		
		add(circle, x, y);
	}
	

	public void mouseClicked(MouseEvent e) {
		GObject clicked = getElementAt(e.getX(), e.getY());
		// the user might click on the GRect, or the GLabel so we
		// need to deal with both of these cases
		if (clicked == buttonBorder || clicked == buttonText) { 
			drawRandomCircle();
		}
	}
}

