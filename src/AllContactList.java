/**
 * This class represents the whole list of contacts. Also it contains the methods for sorting the whole list of contacts,
 * printing the whole list of contacts, to add new contact to the list of contacts, to search the contact by last name, 
 * to save and open the list of contacts to disk.
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
import java.util.Collections; // Class for sorting ArrayList

public class AllContactList {

	private ArrayList<Person> allPersonArray = new ArrayList<Person>();
	private Scanner userInput = new Scanner(System.in);

	/**
	 * This method adds a person object information to the ArrayList
	 * allPersonArray
	 * 
	 * By: JT
	 */

	public void addContact(Person newPerson) {
		if (newPerson.getLastname().equals("")) {
			
		}
		else {
			allPersonArray.add(newPerson);
		}
	}

	/**
	 * This method returns and prints all entries of the contact list sorted
	 * alphabetically.
	 * 
	 * By: JT ----------------------------------------------------------------------------------------****** Back to fix you later
	 */

	public void printToConsole() {
		int index = 0;
		while (allPersonArray.size() > index) {
			sortAllContacts();
			System.out.println(allPersonArray.get(index) + "\n");
			index++;
		}
	}

	/**
	 * This method prints the search result according to the userInput last name.
	 * 
	 * By: MM
	 */
	public void searchByLastName() {
		boolean found = false;
		String givenLastName = userInput.nextLine();
		for (int i = 0; i < allPersonArray.size(); i++) {
				if (allPersonArray.get(i).getLastname().equalsIgnoreCase(givenLastName)) {
					System.out.println("\n" + allPersonArray.get(i));
					found = true;
				}
			}
			if (!found) {
				System.out.println("We are sorry, but we have no contact information under that last name");
			}
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
	 * 
	 * By: DA
	 */
	public void open() {

	}

	/**
	 * This method sorts the array list last name elements in alphabetical
	 * order.
	 * 
	 * By: JT
	 */
	public void sortAllContacts() {
		Collections.sort(allPersonArray);

	}
}
/*
 * ---OUTPUT--- First name: Dan Last name: Alvarez House: 12345 El Monte Rd.
 * City: Los Altos Hills State: CA Zip: 94022 E-mail: dan@yahoo.com Phone:
 * 408-728-8905 Notes: none
 * 
 * Name: Dan Alvarez Address: 12345 El Monte Rd. Los Altos Hills, CA 94022
 * E-mail: dan@yahoo.com Phone: 408-728-8905 Notes: none
 * 
 * First name: Matt Last name: Maksim House: 12345 El Monte Rd. City: Los Altos
 * Hills State: CA Zip: 94022 E-mail: matt@yahoo.com Phone: 408-393-2665 Notes:
 * none
 * 
 * Name: Dan Alvarez Address: 12345 El Monte Rd. Los Altos Hills, CA 94022
 * E-mail: dan@yahoo.com Phone: 408-728-8905 Notes: none
 * 
 * Name: Matt Maksim Address: 12345 El Monte Rd. Los Altos Hills, CA 94022
 * E-mail: matt@yahoo.com Phone: 408-393-2665 Notes: none
 * 
 * First name: Nat Last name: Tiyasan House: 12345 El Monte Rd. City: Los Altos
 * State: CA Zip: 94022 E-mail: nat@yahoo.com Phone: 408-777-1234 Notes: none
 * 
 * Name: Dan Alvarez Address: 12345 El Monte Rd. Los Altos Hills, CA 94022
 * E-mail: dan@yahoo.com Phone: 408-728-8905 Notes: none
 * 
 * Name: Matt Maksim Address: 12345 El Monte Rd. Los Altos Hills, CA 94022
 * E-mail: matt@yahoo.com Phone: 408-393-2665 Notes: none
 * 
 * Name: Nat Tiyasan Address: 12345 El Monte Rd. Los Altos, CA 94022 E-mail:
 * nat@yahoo.com Phone: 408-777-1234 Notes: none
 * 
 */