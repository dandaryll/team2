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

;

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
	
	private AllContactList allContactsFeature = new AllContactList();
	
	/**
	 * Read userInput
	 * By: 
	 */
	public boolean readPerson() {
		// Setters
		System.out.print("First name: ");
		String newFirstname = userInput.nextLine();
		setFirstname(newFirstname);
		System.out.print("Last name: ");
		String newLastname = userInput.nextLine();
		if (newLastname.equals("")) {
			return false;
		}
		setLastname(newLastname);
		System.out.print("House: ");
		String newHouse = userInput.nextLine();
		setHouse(newHouse);
		System.out.print("City: ");
		String newCity = userInput.nextLine();
		setCity(newCity);
		System.out.print("State: ");
		String newState = userInput.nextLine();
		setState(newState);
		System.out.print("Zip: ");
		String newZip = userInput.nextLine();
		setZip(newZip);
		System.out.print("E-mail: ");
		String newEmail = userInput.nextLine();
		setEmail(newEmail);
		System.out.print("Phone: ");
		String newPhone = userInput.nextLine();
		setPhone(newPhone);
		System.out.print("Notes: ");
		String newNotes = userInput.nextLine();
		setNotes(newNotes);
		System.out.println();
		return true;
		
	}
	
	/**
	 * Sets the value for firstName to "newFirstname".
	 * By: DA
	 */
	public boolean setFirstname(String newFirstname) {
		if (lastName.equalsIgnoreCase("")) {
			return false;
		}
		firstName = newFirstname;
		return true;
	}
	
	/**
	 * Sets the value for lastName to "newLastname".
	 * By: DA
	 */
	public boolean setLastname(String newLastname) {
		if (newLastname.equalsIgnoreCase("")) {
			return false;
		}
		lastName = newLastname;
		return true;
	}
	
	/**
	 * This method Sets the value for house to "newHouse".
	 * By: DA
	 */
	public void setHouse(String newHouse) {
		house = newHouse;

	}

	/**
	 * Sets the value for city to "newCity".
	 * By: DA
	 */
	public void setCity(String newCity) { // newCity is a parameter
		city = newCity;
		
	}

	/**
	 * Sets the value for state to "newState".
	 * By: DA
	 */
	public void setState(String newState) { // newState is a parameter
		state = newState;
		
	}

	/**
	 * Sets the value for zip to "newZip".
	 * By: DA
	 */
	public void setZip(String newZip) { // newZip is a parameter
		zip = newZip;
	}
	
	/**
	 * Sets the value for email to "newEmail".
	 * By: DA
	 */
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	
	/**
	 * Sets the value for phone to "newPhone".
	 * By: MM
	 */
	public void setPhone(String newPhone) {
		if (newPhone.length() > 10) {
			System.out.print("Please enter a 10-digit phone# to continue: ");
			newPhone = userInput.nextLine();
			newPhone = newPhone.substring(0, 3) + "-" + newPhone.substring(3, 6) + "-" + newPhone.substring(6, newPhone.length());
			phone = newPhone;
			
		}
		else if (newPhone.length() == 10) {
			newPhone = newPhone.substring(0, 3) + "-" + newPhone.substring(3, 6) + "-" + newPhone.substring(6, newPhone.length());
			phone = newPhone;
			
		}
		else {
			return;
			
		}

	}
	
	/**
	 * Sets the value for notes to "newNotes".
	 * By: MM
	 */
	public void setNotes(String newNotes) {
		notes = newNotes;
	}
	
	/**
	 * Returns the value of firstname.
	 * By: MM
	 */
	public String getFirstname() {
		return firstName;
	}
	
	/**
	 * Returns the value of lastname.
	 * By: MM
	 */
	public String getLastname () {
		return lastName;
	}
	
	
	/**
	 * Returns the value of house.
	 * By: MM
	 */
	public String getHouse () {
		return house;
	}
	
	/**
	 * Returns the value of city.
	 * By: MM
	 */
	public String getCity () {
		return city;
	}
	
	/**
	 * Returns the value of state.
	 * By: MM
	 */
	public String getState () {
		return state;
	}
	
	/**
	 * Returns the value of zip.
	 * By: JT
	 */
	public String getZip () {
		return zip;
	}
	
	/**
	 * Returns the value of email.
	 * By: JT
	 */
	public String getEmail () {
		return email;
	}
	
	/**
	 * Returns the value of phone.
	 * By: JT
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * Returns the value of zip.
	 * By: JT
	 */
	public String getNotes() {
		return notes;
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
		return "Name: " + firstName + " " + lastName + "\n" + "Address: " + house + " " + city + " " +
			   state + " " + zip + "\n" + "E-mail: " + email + "\n" + "Phone: " + phone + "\n" + "Notes: " + notes + "\n";
	}
}
/* ---OUTPUT---

*/