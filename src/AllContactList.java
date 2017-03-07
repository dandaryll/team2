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
	 * Below is to add class person contents to ArrayList allPersonArray
	 */
	public void addContact(Person newPerson) {
		allPersonArray.add(newPerson);
		
	}
	
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
		int index = 0;
		while (allPersonArray.size() > index) {
			System.out.println(allPersonArray.get(index));
			index++;

		}
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

*/