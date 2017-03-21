/**
 * This class represents an object that stores the first name, last name, email, phone, and  notes for one person.
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
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class Person implements Serializable, Comparable<Person> {
	private String firstName;
	private String lastName;
	private String newLastname;
	private String house;
	private String city;
	private String state;
	private String zip;
	private String email;
	private String phone;
	private String notes;
	
	/**
	 * Default constructor to initialize private data members
	 * 
	 * By: DA
	 */
	public Person() {
		firstName   = "";
		lastName    = "";
		house       = "";
		city        = "";
		state       = "";
		zip         = "";
		email       = "";
		phone       = "";
		notes       = "";
		newLastname = "";
		
	}
	
	/**
	 * This method reads userInput and prompts user to assign values to firstName, lastName,
	 * email, phone and notes
	 * 
	 * By: DA
	 */
	public boolean read() {
		Scanner userInput;
		userInput = new Scanner(System.in);
		
		// Setters
		System.out.print("First name: ");
		String newFirstname = userInput.nextLine();
		System.out.print("Last name: ");
		newLastname = userInput.nextLine();
		if (newLastname.equals("")) {
			System.out.println("Contact information not added. Last name required.");
			return false;
		}
		setFirstname(newFirstname);
		setLastname(newLastname);
		readAddress();
		System.out.print("E-mail: ");
		String newEmail = userInput.nextLine();
		setEmail(newEmail);
		System.out.print("Phone: ");
		String newPhone = userInput.nextLine();
		setPhone(newPhone);
		System.out.print("Notes: ");
		String newNotes = userInput.nextLine();
		setNotes(newNotes);
		return true;
	}
	
	/**
	 * This methods reads userInput for address section which are the house, city, state, and zip.
	 * 
	 * By: DA
	 */
	public void readAddress() {
		Scanner userInput;
		userInput = new Scanner(System.in);
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
		
	}
	
	/**
	 * Sets the value for firstname to "newFirstname".
	 * By: DA
	 */
	public void setFirstname(String newFirstname) {
		firstName = newFirstname;
		
	}

	/**
	 * Sets the value for lastname to "newLastname".
	 * By: MM
	 */
	public boolean setLastname(String newLastname) {
		if (newLastname.equals("")) {
			System.out.println("Contact information not added. Last name required.");
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
	 * By: MM
	 */
	public void setZip(String newZip) { // newZip is a parameter
		zip = newZip;
	}

	/**
	 * Sets the value for email to "newEmail".
	 * By: MM
	 */
	public boolean setEmail(String newEmail) {
		return true;
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
	public String getLastname() {
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
	 * By: JT
	 */
	public String getCity () {
		return city;
	}
	
	/**
	 * Returns the value of state.
	 * By: JT
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
	public String getEmail() {
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
	 * This method returns a toString.
	 * By: JT
	 */
	public String toString() { 
		return "Name: " + firstName + " " + lastName + "\n" + "Address: " + house + " " + city + ", " +
			   state + " " + zip + "\n" + "E-mail: " + email + "\n" + "Phone: " + phone + "\n" + "Notes: " + notes;
	}
	
	/**
	 * This method is used to complete Collections.sort method for alphabetizing lastnames and firstnames.
	 * By: JT
	 */
	@Override
	public int compareTo(Person otherPerson) {
		return 0;
	}

}
/* ---OUTPUT---
First name: Dan
Last name: Alvarez
House: 12345 El Monte Rd.
City: Los Altos Hills
State: CA
Zip: 94022
E-mail: dan@yahoo.com
Phone: 408-728-8905
Notes: none

Name: Dan Alvarez
Address: 12345 El Monte Rd. Los Altos Hills, CA 94022
E-mail: dan@yahoo.com
Phone: 408-728-8905
Notes: none

First name: Matt
Last name: Maksim
House: 12345 El Monte Rd. 
City: Los Altos Hills
State: CA
Zip: 94022
E-mail: matt@yahoo.com
Phone: 408-393-2665
Notes: none

Name: Dan Alvarez
Address: 12345 El Monte Rd. Los Altos Hills, CA 94022
E-mail: dan@yahoo.com
Phone: 408-728-8905
Notes: none

Name: Matt Maksim
Address: 12345 El Monte Rd.  Los Altos Hills, CA 94022
E-mail: matt@yahoo.com
Phone: 408-393-2665
Notes: none

First name: Nat
Last name: Tiyasan
House: 12345 El Monte Rd.
City: Los Altos
State: CA
Zip: 94022
E-mail: nat@yahoo.com
Phone: 408-777-1234
Notes: none

Name: Dan Alvarez
Address: 12345 El Monte Rd. Los Altos Hills, CA 94022
E-mail: dan@yahoo.com
Phone: 408-728-8905
Notes: none

Name: Matt Maksim
Address: 12345 El Monte Rd.  Los Altos Hills, CA 94022
E-mail: matt@yahoo.com
Phone: 408-393-2665
Notes: none

Name: Nat Tiyasan
Address: 12345 El Monte Rd. Los Altos, CA 94022
E-mail: nat@yahoo.com
Phone: 408-777-1234
Notes: none

*/