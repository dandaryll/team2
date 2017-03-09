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
		System.out.println(addressBook.toString());
		addressBook.printToConsole();
		addressBook.sortFirstName();
		addressBook.sortLastName();
		addressBook.searchLastName();
		addressBook.save();
		
		//Setters
		System.out.println("First name: ");
		person1.setFirstname("");
		System.out.println("Last name: ");
		person1.setLastname("");
		System.out.println("House: ");
		person1.setHouse("");
		System.out.println("City: ");
		person1.setCity("");
		System.out.println("State: ");
		person1.setState("");
		System.out.println("Zip: ");
		person1.setZip("");
		System.out.println("E-mail: ");
		person1.setEmail("");
		System.out.println("Phone: ");
		person1.setPhone("");
		System.out.println("Notes: ");
		person1.setNotes("");
		
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
First name: 
Last name: 
House: 
City: 
State: 
Zip: 
E-mail: 
Phone: 
Notes: 

Reached the end of main(), Program ran successfully.
*/