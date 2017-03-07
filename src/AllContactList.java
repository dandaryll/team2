/**
 * This class represents an object that represents how the contact list is printed as a whole. Also, 
 * one object of this class represents the search feature that find matches based on last name
 * and displaying them on the console. Another feature is save on exit where all contact list 
 * entries are stored in disk and reopens on the next run of the program.
 * 
 * By: DA
 */

import java.util.Scanner;
import java.io.*; // Interface used for saving to disk
import java.io.Serializable; // Interface used for saving to disk
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AllContactList {
	private ArrayList<Person> allPersonArray = new ArrayList<Person>();
	private int numOfEntry = 0; // initialize private variable for method read; Purpose: person counter 
	
	
	/**
	 * This methods reads userInput.
	 * 
	 * By: DA
	 */
	public void read() {
		
	}
	
	/**
	 * This method defines a toString method. Display all
	 * 
	 * By: DA
	 */
	public String toString() {
		return "";
	}
	
	/**
	 * This method returns and prints all entries of the contact list sorted alphabetically.
	 * 
	 * By: MM
	 */
	public void printToConsole() {
		
	}
	
	/**
	 * This method returns and prints the search result according to last name.
	 * 
	 * By: MM
	 */
	public void searchLastName() {
		
	}
	
	/**
	 * This method saves all entries to the contact list program to disk then exits the program.
	 * 
	 * By: JT
	 */
	public void saveOnExit() {

	}
	
	/**
	 * This method reads the saved file when the program starts
	 * By: JT
	 */
	public void openOnStart() {
		
	}
}
/* ---OUTPUT---
First name: Dan
Last name: Alvarez
House: 134 Washington St.
City: Santa Clara
State: CA
Zip: 95050
E-mail: dandaryll88@gmail.com
Phone: 408-728-8905
Notes: none

Reached the end of main(), Program ran successfully.
*/