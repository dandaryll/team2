/**
 * This class represents an object that stores the first name, last name, email, phone, and  notes for one person.
 * 
 * By: DA
 */

import java.io.FileInputStream; // Interface used for saving to disk
import java.io.FileOutputStream; // Interface used for saving to disk
import java.io.IOException; // Interface used for saving to disk
import java.io.ObjectInputStream; // Interface used for saving to disk
import java.io.ObjectOutputStream; // Interface used for saving to disk
import java.io.Serializable;// Interface used for saving to disk

public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private String house;
	private String city;
	private String state;
	private String zip;
	private String email;
	private String phone;
	private String notes;
	
	/**
	 * This method reads userInput and prompts user to assign values to firstName, lastName, house, city, state, zip,
	 * email, phone and notes.
	 * 
	 * By: DA
	 */
	public void read() {
		
	}
	
	/**
	 * Sets the value for firstname to "newFirstname".
	 * By: DA
	 */
	public void setFirstname(String newFirstname) {
		
	}
	
	/**
	 * Sets the value for lastname to "newLastname".
	 * By: DA
	 */
	public void setLastname(String newLastname) {
		
	}
	
	/**
	 * This method Sets the value for house to "newHouse".
	 * By: DA
	 */
	public void setHouse(String newHouse) {

	}

	/**
	 * Sets the value for city to "newCity".
	 * By: DA
	 */
	public void setCity(String newCity) { // newCity is a parameter
		
	}

	/**
	 * Sets the value for state to "newState".
	 * By: DA
	 */
	public void setState(String newState) { // newState is a parameter
		
	}

	/**
	 * Sets the value for zip to "newZip".
	 * By: DA
	 */
	public void setZip(String newZip) { // newZip is a parameter
		
	}
	
	/**
	 * Sets the value for email to "newEmail".
	 * By: DA
	 */
	public void setEmail(String newEmail) {
		
	}
	
	/**
	 * Sets the value for phone to "newPhone".
	 * By: MM
	 */
	public void setPhone(String newPhone) {
		
	}
	
	/**
	 * Sets the value for notes to "newNotes".
	 * By: MM
	 */
	public void setNotes(String newNotes) {
		
	}
	
	/**
	 * Returns the value of firstName.
	 * By: MM
	 */
	public String getFirstname() {
		return "";
	}
	
	/**
	 * Returns the value of lastName.
	 * By: MM
	 */
	public String getLastname () {
		return "";
	}
	
	
	/**
	 * Returns the value of house.
	 * By: MM
	 */
	public String getHouse () {
		return "";
	}
	
	/**
	 * Returns the value of city.
	 * By: MM
	 */
	public String getCity () {
		return "";
	}
	
	/**
	 * Returns the value of state.
	 * By: MM
	 */
	public String getState () {
		return "";
	}
	
	/**
	 * Returns the value of zip.
	 * By: JT
	 */
	public String getZip () {
		return "";
	}
	
	/**
	 * Returns the value of email.
	 * By: JT
	 */
	public String getEmail () {
		return "";
	}
	
	/**
	 * Returns the value of phone.
	 * By: JT
	 */
	public String getPhone() {
		return "";
	}
	
	/**
	 * Returns the value of zip.
	 * By: JT
	 */
	public String getNotes() {
		return "";
	}
	
	/**
	 * This method returns a toString.
	 * By: JT
	 */
	public String toString() {
		return "";
	}
	
	/**
	 * This method is used to complete Collections.sort method for alphabetizing lastnames and firstnames.
	 */
	@Override
	public int compareTo(Person otherPerson) {
		return 0;
	}
}
/* ---OUTPUT---
Reached the end of main(), Program ran successfully.
*/