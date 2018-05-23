

import java.awt.event.MouseEvent;
import java.util.HashMap;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.*;

public class Mindset extends GraphicsProgram implements MindsetConstants {

	private MindsetDataBase db = new MindsetDataBase();
	private BubbleMaker bubbleMaker = new BubbleMaker();
	
	private GLabel countryLabel = new GLabel("");
	private GLabel yearLabel = new GLabel("1800");
	private HashMap<GOval, String> nameMap = new HashMap<GOval, String>();
	
	public void run() {
	    for(int currYear = START_YEAR; currYear <= END_YEAR; currYear++) {
	    		redraw(currYear);
	    		pause(DELAY);
	    }
	}
	
	public void mousePressed(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		GObject clicked = getElementAt(x, y);
		if(clicked != null) {
			String name = nameMap.get(clicked);
			countryLabel.setLabel(name);
			addCenteredLabel(countryLabel, COUNTRY_LABEL_Y);
		}
	}

	private void redraw(int currYear) {
		clear();
		nameMap.clear();
		drawGraphBackground();
		yearLabel.setText("" + currYear);
		plotBubbles(currYear);
	}
	

	private void plotBubbles(int currYear) {
		for(String name : db.getAllCountryNames()) {
			Country country = db.findEntry(name);
			GOval bubble = bubbleMaker.makeBubble(country, currYear);
			add(bubble);
			nameMap.put(bubble, name);
		}
	}
	
	/***************************************************************
	 *           PRIVATE!!! trespassers will be prosecuted         *
	 ***************************************************************/
	
	private void drawGraphBackground() {
		drawXAxis();
		drawYAxis();
		addCenteredLabel(countryLabel, COUNTRY_LABEL_Y);
		addCenteredLabel(yearLabel, APPLICATION_HEIGHT - 150);
	}
	
	private void drawXAxis() {
		int y = APPLICATION_HEIGHT - X_AXIS_OFFSET;
		GLabel xAxisLabel = new GLabel("GDP (adjusted)");
		addCenteredLabel(xAxisLabel, y + 30);
		GLine line = new GLine(0, y, APPLICATION_WIDTH, y);
		add(line);
	}
	
	private void drawYAxis() {
		GLabel yAxisLabel = new GLabel("Life Expectancy (years)");
		yAxisLabel.rotate(90);
		yAxisLabel.setFont("Times-24");
		add(yAxisLabel, 25, APPLICATION_HEIGHT * 0.65);
		GLine line = new GLine(Y_AXIS_OFFSET, 0, Y_AXIS_OFFSET, getHeight());
		add(line);
	}
	
	private void addCenteredLabel(GLabel label, int y) {
		label.setFont("Times-24");
		double x = (APPLICATION_WIDTH - label.getWidth()) / 2;
		add(label, x, y);
	}
}
