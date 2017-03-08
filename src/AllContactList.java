/**
 * This class represents an object that represents how the contact list is printed as a whole. Also, 
 * one object of this class represents the search feature that find matches based on last name
 * and displaying them on the console. Another feature is save on exit where all contact list 
 * entries are stored in disk and reopens on the next run of the program.
 * 
 * By: DA
 */

import java.util.ArrayList; // Interface for ArrayList
import java.util.Scanner;
import java.io.FileInputStream; // Interface used for saving to disk
import java.io.FileOutputStream; // Interface used for saving to disk
import java.io.IOException; // Interface used for saving to disk
import java.io.ObjectInputStream; // Interface used for saving to disk
import java.io.ObjectOutputStream; // Interface used for saving to disk
import java.io.Serializable;// Interface used for saving to disk
public class AllContactList {
	private ArrayList<Person> allPersonArray = new ArrayList<Person>();
	private Person addPerson;
	
	/**
	 * This method reads userInput and prompts user to assign values to firstName, lastName, house, city, state, zip,
	 * email, phone and notes.
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
	public void save() {

	}
	
	/**
	 * This method reads the saved file when the program starts
	 * By: JT
	 */
	public void open() {
		
	}
	
	/**
	 * This method sorts the array list last name in alphabetical order.
	 * By: JT
	 */
	public void sortLastName() {
		
	}
	
	/**
	 * This method sorts the array list first name in alphabetical order.
	 * By: JT
	 */
	public void sortFirstName() {

	}
}
/* ---OUTPUT---
First name: 
Last name: 
House: 
City: 
State: 
Zip: 
E-mail: 
Phone: 
Notes: 

Reached the end of main(), Program ran successfully.
*/