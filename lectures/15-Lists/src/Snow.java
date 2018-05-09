import acm.program.*;
import acm.util.*;
import java.applet.*;
import java.awt.Color;
import java.io.*;
import java.util.*;

import acm.graphics.*;

public class Snow extends GraphicsProgram {

	// snow is so tiny!
	private static final int SNOW_SIZE = 5;
	
	// each snowflake is unique :-)
	private RandomGenerator rg = new RandomGenerator();

	public void run() {
		// typical animation loop
		while(true) {
			// make some new snow
			
			// move all existing snow

			// pause
			pause(10);
		}

	}

	private void makeNewSnow() {
		// make a new snowflake with 5% probability
		if(rg.nextBoolean(0.05)) {
			// get a random x location
			double x = rg.nextInt(getWidth() - SNOW_SIZE);
			
			// make the new flower
			GImage flake = new GImage("flower.png");
			flake.setSize(SNOW_SIZE, SNOW_SIZE);
			
			// adds to the screen
			add(flake, x, -SNOW_SIZE);
		}
	}
}
