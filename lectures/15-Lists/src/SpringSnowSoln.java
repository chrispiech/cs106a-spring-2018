import acm.program.*;
import acm.util.*;
import java.applet.*;
import java.awt.Color;
import java.io.*;
import java.util.*;

import acm.graphics.*;

public class SpringSnowSoln extends GraphicsProgram {

	private static final int SNOW_SIZE = 20;
	private RandomGenerator rg = new RandomGenerator();

	private ArrayList<GImage> snowList = new ArrayList<GImage>();

	public void run() {

		while(true) {
			// update world
			makeNewSnow();
			moveSnow();

			// pause
			pause(20);
		}

	}

	private void moveSnow() {
		for(GImage nextFlake : snowList) {
			if(nextFlake.getY() + SNOW_SIZE < getHeight()) {
				nextFlake.move(0, 3);
			}
		}
	}

	private void makeNewSnow() {
		// make a new snowflake with 5% probability
		if(rg.nextBoolean(0.05)) {
			double x = rg.nextInt(getWidth() - SNOW_SIZE);
			GImage flake = new GImage("flower.png");
			flake.setSize(SNOW_SIZE, SNOW_SIZE);
			add(flake, x, -SNOW_SIZE);
			snowList.add(flake);
		}

	}
}
