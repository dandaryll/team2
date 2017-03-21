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

	public static void main(String[] args) {
		// Object contactsEdit from class AllContactList
		AllContactList addressBook;
		addressBook = new AllContactList();
		addressBook.addContact();
		System.out.println('\n'+ addressBook.contactList());
		addressBook.addContact();
		System.out.println('\n'+ addressBook.contactList());
	}
}
		
		
		
		
		// Object person1 from class Person
		/* Person person1;
		person1 = new Person();
		person1.read();
		addressBook.addContact(person1);
		System.out.println();
		addressBook.printToConsole();
		*/
		
		// Object person1 from class Person
		
		/*Person person2;
		person2 = new Person();
		person2.read();
		addressBook.addContact(person2);
		System.out.println();
		addressBook.printToConsole();
	}
}
*/
		
		
/* ---OUTPUT---
Reached the end of main(), Program ran successfully.
*/