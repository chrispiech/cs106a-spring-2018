/*
 * File: DrawFlag.java
 * -----------------------------
 * Draws various flags from around the world (that have
 * only horizontal bands)
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class DrawForest extends GraphicsProgram {

	private static final int LEAF_SIZE = 70;
	private static final int TRUNK_WIDTH = 40;

	public void run() {	
		//calculate the bottom middle of the screen
		double centerX = getWidth()/2;
		double bottomY = getHeight();

		// sorry about the magic numbers!!
		drawTree(50, bottomY, 300);
		drawTree(centerX, bottomY, 130);
		drawTree(600, bottomY, 200);
	}

	private void drawTree(double startX, double startY, double height) {
		// first, make the trunk
		double endX = startX;
		double endY = startY - height;
		
		drawTrunk(startX, startY, endX, endY);
		drawLeaves(endX, endY);
	}

	private void drawTrunk(double startX, double startY, double endX, double endY) {
		GLine trunk = new GLine(startX, startY, endX, endY);
		trunk.setColor(Color.RED);
		trunk.setLineWidth(TRUNK_WIDTH);
		add(trunk);
	}
	
	private void drawLeaves(double centerX, double centerY) {
		// again, apologies for the magic numbers. These define the offsets for
		// the three different clumps of leaves (circles)
		drawLeaf(centerX- 42, centerY + 30);
		drawLeaf(centerX + 8, centerY - 6);
		drawLeaf(centerX + 20, centerY + 45);
	}

	private void drawLeaf(double centerX, double centerY) {
		GOval oval = new GOval(LEAF_SIZE, LEAF_SIZE);
		oval.setFilled(true);
		oval.setColor(Color.GREEN);
		add(oval, centerX - LEAF_SIZE / 2, centerY - LEAF_SIZE / 2);
	}

}
