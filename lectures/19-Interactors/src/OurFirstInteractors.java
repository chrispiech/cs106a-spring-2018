/*
 * OurFirstInteractors.java
 * Brahm Capoor, May 2018
 *
 *
 * This program is a first attempt at adding Interactors to a window!
 * Eventually, these interactors will actually show up and we'll be
 * able to do cool things with them :) 
 */

import javax.swing.*;
import acm.program.*;

public class OurFirstInteractors extends ConsoleProgram {

	
	public void run() {
		JLabel label = new JLabel("banter");
		JTextField textField = new JTextField(20);
		JButton button = new JButton("Click me!");
		
		add(label, SOUTH);
		add(textField, SOUTH);
		add(button, SOUTH);
	
	}
	
}
