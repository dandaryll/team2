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

public class TestContactList {

	public static void main(String[] args) {
		
		// Object person1 from class Person
		Person person1;
		person1 = new Person();
		person1.read();
		
		// Object contactsEdit from class AllContactList
		AllContactList addressBook;
		addressBook = new AllContactList();
		
		addressBook.open();
		addressBook.sortAllContacts();
		System.out.println(addressBook.toString());
		addressBook.printToConsole();
		addressBook.searchLastName();
		addressBook.save();
		
		//Setters
		person1.setFirstname("Mickey");
		person1.setLastname("Mouse");
		person1.setHouse("1313 Disneyland Dr.");
		person1.setCity("Anaheim");
		person1.setState("CA");
		person1.setZip("92803");
		person1.setEmail("mickey.mouse@disney.com");
		person1.setPhone("123-456-7890");
		person1.setNotes("Disneyland mascot");
		
	    // Getters
		System.out.println(person1.getFirstname());
		System.out.println(person1.getLastname());
		System.out.println(person1.getHouse());
		System.out.println(person1.getCity());
		System.out.println(person1.getState());
		System.out.println(person1.getZip());
		System.out.println(person1.getEmail());
		System.out.println(person1.getPhone());
		System.out.println(person1.getNotes());
		
		// toString to print a class Person object
		System.out.println(person1.toString());

		System.out.println("Reached the end of main(), Program ran successfully.");

	}
}
/* ---OUTPUT---
Reached the end of main(), Program ran successfully.
*/