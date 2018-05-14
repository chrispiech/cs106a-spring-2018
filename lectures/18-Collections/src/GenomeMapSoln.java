import acm.graphics.GOval;
import acm.program.*;
import java.awt.*;

import java.util.*;
import java.io.*;

public class GenomeMapSoln extends GraphicsProgram {
	
	private static final String DATA_FILE = "genome_data.csv";
	
	private HashMap<String, ArrayList<Double[]>> database;
	private HashMap<String, ArrayList<String[]>> metadata;

	public void run() {
		database = new HashMap<String, ArrayList<Double[]>>();
		metadata = new HashMap<String, ArrayList<String[]>>();
		loadDatabase();
		graphData();
	}
	
	private void loadDatabase() {
		try {
			Scanner data = new Scanner(new File(DATA_FILE));
			while (data.hasNextLine()) {
				addCountry(data.nextLine());
			}
			data.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	private void addCountry(String line) {
		String[] lineArray = line.split(",");
		String countryCode = lineArray[1];
		ArrayList<Double[]> datapoints = database.get(countryCode);
		if (datapoints == null) {
			datapoints = new ArrayList<Double[]>();
		}
		Double[] xy = new Double[2];
		xy[0] = Double.parseDouble(lineArray[3]);
		xy[1] = Double.parseDouble(lineArray[4]);
		datapoints.add(xy);
		database.put(lineArray[1], datapoints);
		addMetadata(line);
	}

	private void graphData() {
		for (String country : database.keySet()) { // go through all countries
			ArrayList<Double[]> countrySamples = database.get(country);
			for (Double[] sampleXY : countrySamples) { // go through all samples
				graphSample(sampleXY, country);
			}
		}
	}
	
	private void graphSample(Double[] xy, String country) {
		println(country);
		ArrayList<String[]> countryMetadata = metadata.get(country);
		//int size = Integer.parseInt(countryMetadata.get(0)[0]);
		Color color = getColor(Integer.parseInt(countryMetadata.get(0)[1]));
		double adjX = xy[0] * 2500 + getWidth() / 2;
		double adjY = xy[1] * 2500 + getHeight() / 2 - 80;
		GOval point = new GOval(adjX, adjY, 15, 15);
		point.setFilled(true);
		point.setColor(color);
		add(point);
	}
	
	private void addMetadata(String line) {
		String[] lineArray = line.split(",");
		String countryCode = lineArray[1];
		ArrayList<String[]> countryMetadata = metadata.get(countryCode);
		if (countryMetadata == null) {
			countryMetadata = new ArrayList<String[]>();
		}
		String[] details = new String[2];
		details[0] = lineArray[2];
		details[1] = lineArray[5];
		countryMetadata.add(details);
		metadata.put(lineArray[1], countryMetadata);
	}
	
	private Color getColor(int colorCode) {
		println(colorCode + "\n");
		switch (colorCode) {
		case 0: return Color.CYAN;
		case 1: return new Color(2, 156, 4); // dark green
		case 2: return new Color(65, 123, 199); // blue
		case 3: return new Color(105, 232, 69); // light green
		case 4: return new Color(135, 45, 199);
		case 5: return new Color(130, 43, 0);
		case 6: return new Color(233, 81, 180);
		case 7: return Color.ORANGE;
		case 8: return new Color(255, 163, 242);
		case 9: return Color.RED;
		}
		return Color.BLACK;
	}
}
