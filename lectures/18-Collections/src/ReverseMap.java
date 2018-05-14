import acm.program.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class ReverseMap extends ConsoleProgram {

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
		
		// TODO: fill in this method
		
		return newMap;
	}
}
