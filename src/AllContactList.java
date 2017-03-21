/**
 * This class represents an object that represents how the contact list is printed as a whole. Also, 
 * one object of this class represents the search feature that find matches based on last name
 * and displaying them on the console. Another feature is save on exit where all contact list 
 * entries are stored in disk and reopens on the next run of the program.
 * 
 * By: DA
 */

import java.util.ArrayList; // Interface for ArrayList
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream; // Interface used for saving to disk
import java.io.FileOutputStream; // Interface used for saving to disk
import java.io.IOException; // Interface used for saving to disk
import java.io.ObjectInputStream; // Interface used for saving to disk
import java.io.ObjectOutputStream; // Interface used for saving to disk
import java.io.Serializable;// Interface used for saving to disk
import java.util.Comparator;
import java.util.Collections; // Class for sorting ArrayList
import java.util.List;

public class AllContactList {

	private ArrayList<Person> allPersonArray = new ArrayList<Person>();
	private Scanner userInput = new Scanner(System.in);
	/**
	 * This method adds a person object information to the ArrayList allPersonArray
	 * By: JT
	 */
	public void addContact(Person newPerson) {
		if (newPerson.getLastname().equals("")) {
			return;
		}
		else {
			allPersonArray.add(newPerson);
		}
	}

	public void addContact() {

		
		Person newPerson = new Person();
		System.out.print("First name: ");
		newPerson.setFirstname(userInput.nextLine());
		System.out.print("Last name: ");
		newPerson.setLastname(userInput.nextLine());
		System.out.print("House: ");
		newPerson.setHouse(userInput.nextLine());
		System.out.print("City: ");
		newPerson.setCity(userInput.nextLine());
		System.out.print("State: ");
		newPerson.setState(userInput.nextLine());
		System.out.print("Zipcode: ");
		newPerson.setZip(userInput.nextLine());
		System.out.print("Email: ");
		newPerson.setEmail(userInput.nextLine());
		System.out.print("phone: ");
		newPerson.setPhone(userInput.nextLine());
		System.out.print("Note: ");
		newPerson.setNotes(userInput.nextLine());
		allPersonArray.add(newPerson);		
		}
		
	/**
	 * This method defines a toString method. Display all
	 * 
	 * By: MM
	 */
	public String contactList() {
		String list = Arrays.toString(allPersonArray.toArray()).replace("[", "").replace("]", "");
		return list;
		
	}
	
	/**
	 * This method returns and prints all entries of the contact list sorted alphabetically.
	 * 
	 * By: JT
	 */
	
	
	public void printToConsole() {
		int index = 0;
		while (allPersonArray.size() > index) {
			System.out.println(allPersonArray.get(index) + "\n");
			index++;
		}
	}
	
	/**
	 * This method prints the search result according to the userInput last name.
	 * 
	 * By: MM
	 */
	public void searchLastName() {
		
	}
	
	/**
	 * This method saves all entries to the contact list program to disk.
	 * 
	 * By: DA
	 */
	public void save() {

	}
	
	/**
	 * This method reads the saved file when the program starts
	 * By: DA
	 */
	public void open() {
		
	}
	
	/**
	 * This method sorts the array list last name elements in alphabetical order.
	 * By: JT
	 */
	public void sortAllContacts() {
		
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