/*
 * InteractorsDemo.java
 * Brahm Capoor, May 2018
 *
 *
 * This is a short demo to show how to respond to 
 * user actions with interactors
 */

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.*;
import acm.program.*;
import acm.util.*;

public class InteractorsDemo extends ConsoleProgram {

    private JTextField field = new JTextField(20);
    
    public void init() {
        JButton button = new JButton("Click me!"); 
        
        field.addActionListener(this);     // enable pressing enter
        field.setActionCommand("Typed"); // set field's action command
        
        add(field, SOUTH);
        add(button, SOUTH);
        addActionListeners();
    }
    
    public void run() {
    		setFont("Courier-26");
    }

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        if (command.equals("Click me!")) { 
            println("Button clicked!");
        }
        if (command.equals("Typed")) {                  
            println(field.getText()); // needs to be an instance variable
        }        
    }


}
