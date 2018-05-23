/*
 * File: NameSurferDataBase.java
 * -----------------------------
 * This class keeps track of the complete database of names.
 * The constructor reads in the database from a file, and
 * the only public method makes it possible to look up a
 * name and get back the corresponding NameSurferEntry.
 * Names are matched independent of case, so that "Eric"
 * and "ERIC" are the same names.
 */

import acm.util.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class MindsetDataBase implements MindsetConstants {

	private HashMap<String, Country> countryMap = new HashMap<String, Country>();

	/* Constructor: MindsetDataBase() */
	public MindsetDataBase() {
		addData("gdp", "gdp.csv");
		addData("life", "life.csv");
		addData("pop", "pop.csv");
	}
	
	/* Method: findEntry(name) */
	public Country findEntry(String name) {
		// You need to turn this stub into a real implementation //
		return countryMap.get(name);
	}
	
	/* Method: getAllCountryNames() */
	public Set<String> getAllCountryNames() {
		return countryMap.keySet();
	}

	/* Method: addData(type, fileName) */
	private void addData(String type, String fileName) {
		try {
			Scanner sc = new Scanner(new File(fileName)); 
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				String name = line.split(",")[0];
				if(!countryMap.containsKey(name)) {
					Country newCountry = new Country(name);
					countryMap.put(name, newCountry);
				}
				countryMap.get(name).addLine(type, line);
			}
			sc.close();
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}
}

