/**
 * This class represents an object that stores the first name, last name, email, phone, and  notes for one person.
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

public class Person {
	private String firstName    = "";
	private String lastName     = "";
	private String house 		= "";
	private String city  		= "";
	private String state 		= "";
	private String zip   		= "";
	private String email        = "";
	private String phone        = "";
	private String notes        = "";
	private Scanner userInput   = new Scanner (System.in);
	
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
	 * Returns the value of firstname.
	 * By: MM
	 */
	public String getFirstname() {
		return "";
	}
	
	/**
	 * Returns the value of lastname.
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
	
	/**
	 * This method returns a toString.
	 * By: JT
	 */
	public String toString() {
		return "";
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