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
	private String firstName    = "?";
	private String lastName     = "?";
	private String newLastName  = "?";
	private String house 		= "?";
	private String city  		= "?";
	private String state 		= "?";
	private String zip   		= "?";
	private String email        = "?";
	private String phone        = "?";
	private String notes        = "?";
	private Scanner userInput   = new Scanner (System.in);
	
	private AllContactList allContactsFeature = new AllContactList();
	
	/**
	 * Read userInput
	 * By: 
	 */
	
	// FIXME: ASK GROUP IF WE CAN SHORTEN METHOD LIMIT OF 30 BY JUST HAVING ONE STREETADDRESS VARIABLE
	
	public boolean readPerson() {
		System.out.print("First name: ");
		String newFirstname = userInput.nextLine();
		setFirstname(newFirstname);
		System.out.print("Last name: ");
		newLastName = userInput.nextLine();
		if (newLastName.equals(""))
			return false;
		setnewLastname(newLastName);
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
	 * Sets the value for newLastname to "newLastname".
	 * By: DA
	 */
	public boolean setnewLastname(String newLastName) {
		if (newLastName.equalsIgnoreCase("")) {
			return false;
		}
		lastName = newLastName;
		return true;
	}
	
	/**
	 * This method Sets the value for house to "newHouse".
	 * By: DA
	 */
	public boolean setHouse(String newHouse) {
		if (newLastName.equalsIgnoreCase("")) {
			return false;
		}
		house = newHouse;
		return true;

	}

	/**
	 * Sets the value for city to "newCity".
	 * By: DA
	 */
	public boolean setCity(String newCity) { // newCity is a parameter
		if (newLastName.equalsIgnoreCase("")) {
			return false;
		}
		city = newCity;
		return true;
	}

	/**
	 * Sets the value for state to "newState".
	 * By: DA
	 */
	public boolean setState(String newState) { // newState is a parameter
		if (newLastName.equalsIgnoreCase("")) {
			return false;
		}
		state = newState;
		return true;
	}

	/**
	 * Sets the value for zip to "newZip".
	 * By: DA
	 */
	public boolean setZip(String newZip) { // newZip is a parameter
		if (newLastName.equalsIgnoreCase("")) {
			return false;
		}
		zip = newZip;
		return true;
	}
	
	/**
	 * Sets the value for email to "newEmail".
	 * By: DA
	 */
	public boolean setEmail(String newEmail) {
		if (newLastName.equalsIgnoreCase("")) {
			return false;
		}
		email = newEmail;
		return true;
	}
	
	/**
	 * Sets the value for phone to "newPhone".
	 * By: MM
	 */
	public boolean setPhone(String newPhone) {
		if (newLastName.equalsIgnoreCase("")) {
			return false;
		}
		else if (newPhone.length() > 10) {
			System.out.print("Please enter a 10-digit phone# to continue: ");
			newPhone = userInput.nextLine();
			newPhone = newPhone.substring(0, 3) + "-" + newPhone.substring(3, 6) + "-" + newPhone.substring(6, newPhone.length());
			phone = newPhone;
			return true;
			
		}
		else if (newPhone.length() == 10) {
			newPhone = newPhone.substring(0, 3) + "-" + newPhone.substring(3, 6) + "-" + newPhone.substring(6, newPhone.length());
			phone = newPhone;
			return true;
			
		}
		else {
			return false;
		}
		

	}
	
	/**
	 * Sets the value for notes to "newNotes".
	 * By: MM
	 */
	public boolean setNotes(String newNotes) {
		if (lastName.equalsIgnoreCase("")) {
			return false;
		}
		notes = newNotes;
		return true;
	}
	
	/**
	 * Returns the value of firstName.
	 * By: MM
	 */
	public String getFirstname() {
		return firstName;
	}
	
	/**
	 * Returns the value of newLastname.
	 * By: MM
	 */
	public String getnewLastname () {
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
	public void sortnewLastname() {
		
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