/*
 * OurFirstInteractorsSoln.java
 * Brahm Capoor, May 2018
 *
 *
 * This is our first program that uses interactors 
 * which actually show up on the screen!
 */

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.*;
import acm.program.*;
import acm.util.*;

public class OurFirstInteractorsSoln extends ConsoleProgram {

	
	public void init() {
		JLabel label = new JLabel("banter");
		JTextField textField = new JTextField(20);
		JButton button = new JButton("Click me!");
		
		add(label, SOUTH);
		add(textField, SOUTH);
		add(button, SOUTH);
	}

}
