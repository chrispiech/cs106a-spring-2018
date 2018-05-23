/*
 * File: NameSurferEntry.java
 * --------------------------
 * This class represents a single entry in the database.  Each
 * NameSurferEntry contains a name and a list giving the popularity
 * of that name for each decade stretching back to 1900.
 */

import acm.graphics.GOval;
import acm.util.*;
import java.util.*;

public class Country implements MindsetConstants {

	private String countryName;
	private double[] lifeExpectancy;
	private double[] gdp;
	private double[] pop;

	/* Constructor: NameSurferEntry(line) */
	public Country(String name) {
		this.countryName = name;
		lifeExpectancy = new double[N_YEARS];
		gdp = new double[N_YEARS];
		pop = new double[N_YEARS];
	}

	/* Method: getName() */
	public String getName() {
		return countryName;
	}

	public void addLine(String type, String line) {
		if(type.equals("gdp")) {
			populateField(this.gdp, line);
		}
		if(type.equals("life")) {
			populateField(this.lifeExpectancy, line);
		}
		if(type.equals("pop")) {
			populateField(this.pop, line);
		}
	}

	/* Method: getLifeExpectancy(year) */
	public double getLifeExpectancy(int year) {
		int index = yearToIndex(year);
		return lifeExpectancy[index];
	}

	/* Method: getGdp(year) */
	public double getGdp(int year) {
		int index = yearToIndex(year);
		return gdp[index];
	}
	
	public double getPop(int year) {
		int index = yearToIndex(year);
		return pop[index];
	}

	/* Method: toString() */
	public String toString() {
		// You need to turn this stub into a real implementation //
		String str = countryName + "\n";
		str += "GDP: " + Arrays.toString(this.gdp) + "\n";
		str += "Life: " + Arrays.toString(this.lifeExpectancy);
		return str;
	}

	/* Method: add life expectancy */
	private void populateField(double[] field, String line) {
		String[] parts = line.split(",");
		for(int i = 1; i < parts.length; i++) {
			int index = i - 1;
			String valueStr = parts[i];
			field[index] = Double.parseDouble(valueStr);
		}
	}
	private int yearToIndex(int year) {
		return year - START_YEAR;
	}
}

