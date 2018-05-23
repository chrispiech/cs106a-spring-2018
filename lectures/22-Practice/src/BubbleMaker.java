import java.awt.Color;

import acm.graphics.GOval;

public class BubbleMaker implements MindsetConstants {

	public GOval makeBubble(Country country, int year) {
		double gdp = country.getGdp(year);
		double life = country.getLifeExpectancy(year);
		double pop = country.getPop(year);
		return makeBubbleHelper(gdp, life, pop);
	}

	private GOval makeBubbleHelper(double gdp, double life, double pop) {
		double r = Math.sqrt(pop) / 700;
		int screenWidth = APPLICATION_WIDTH - Y_AXIS_OFFSET;
		int screenHeight = APPLICATION_HEIGHT - X_AXIS_OFFSET;
		double logGdp = Math.log(gdp);
		double x = scale(logGdp, MAX_GDP, MIN_GDP, screenWidth) + Y_AXIS_OFFSET;
		double y = scale(life, MAX_LIFE, MIN_LIFE, screenHeight) + X_AXIS_OFFSET;
		y = APPLICATION_HEIGHT - y;
		y = Math.min(y, APPLICATION_HEIGHT - X_AXIS_OFFSET);
		GOval bubble = makeCenteredBubble(x, y, 2 * r);
		return bubble;
	}

	private double scale(double v, int max, int min, int screenMax) {
		double p = (v - min) / max;
		return p * screenMax;
	}
	
	private GOval makeCenteredBubble(double centerX, double centerY, double size) {
		double x = centerX - size/2;
		double y = centerY - size/2;
		GOval bubble = new GOval(x, y, size, size);
		Color color = new Color(0, 0, 255, 100);
		bubble.setColor(color);
		bubble.setFilled(true);
		return bubble;
	}
}
