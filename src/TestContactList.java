/**
 * This program allows a user to enter a new person into a contact list, print the entire contact list in the console,
 * search a person's information by last name, saves sessions on exit, and start the program again with saved info.
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

public class TestContactList {
	static Scanner userInput = new Scanner(System.in);
	static AllContactList addressbook = new AllContactList();
	static Person newContact;
	static String menuChoice;

	public static void main(String[] args) {
		System.out.println("Welcome to the ContactLister2.0!");
		
		showMenu();

		System.out.println("Reached the end of main(), Program ran successfully.");
		System.out.println("Thank you for using the ContactLister2.0!");
	}
	
	/**
	 * NOTE: CURRENTLY HAVE 29 LINES!
	 */
	public static void showMenu() {
		boolean done = false;
		addressbook.open(); // Opens existing ContactList file if any
		while (!done) {
			System.out.print("[1] add contact\n" + "[2] print the contact list\n" + "[3] retrieve contact information.\n"
							 + "[4] quit the program\n" + "Please select an option from the above menu: ");
			
			menuChoice = userInput.nextLine();
			switch (menuChoice) {
			case "1":
				newContact = new Person();
				newContact.read();
				addressbook.addContact(newContact);
				break;
			case "2":
				System.out.println();
				addressbook.printToConsole();
				break;
			case "3":
				System.out.print("Please enter the last name of the person you wish to find: ");
				addressbook.searchByLastName();
				break;
			case "4":
				addressbook.save();
				done = true;
				break;
			default:
				System.out.println("Please select from [1]-[4]");
				break;
			}
		}
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