import acm.program.*;
import java.awt.*;

import java.util.*;
import java.io.*;

public class ReverseMapSoln extends ConsoleProgram {

	public void run() {
		HashMap<String, String> pets = new HashMap<String, String>();
		pets.put("Chris", "dog");
		pets.put("Julia", "cat");
		pets.put("Brahm", "parrot");
		pets.put("Annie", "dog");
		println(pets.toString());
		HashMap<String, ArrayList<String>> reversedPets = reverseMap(pets);
		println(reversedPets.toString());
	}
	
	private HashMap<String, ArrayList<String>> reverseMap(HashMap<String, String> ogMap) {
		HashMap<String, ArrayList<String>> newMap = new HashMap<String, ArrayList<String>>();
		for (String person : ogMap.keySet()) {
			String pet = ogMap.get(person);
			ArrayList<String> owners = newMap.get(pet);
			if (owners == null) {
				owners = new ArrayList<String>();
			}
			owners.add(person);
			newMap.put(pet, owners);
		}
		return newMap;
	}
}
