/**
 * This program allows a user to enter a new person into a contact list, print the entire contact list in the console,
 * search a person's information by last name, saves sessions on exit, and start the program again with saved info.
 *  
 * By: DA
 */
import java.util.Scanner;
import java.io.*; // Interface used for saving to disk
import java.io.Serializable; // Interface used for saving to disk
import java.util.Arrays;
import java.util.ArrayList; // ArrayList class to store info
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestContactList {

	public static void main(String[] args) {
		// Object userInput from class Scanner
		Scanner userInput;
		userInput = new Scanner(System.in);
		// Object person1 from class Person
		Person person1;
		person1 = new Person();
		// Object contactsEdit from class AllContactList
		AllContactList contactsEdit;
		contactsEdit = new AllContactList();

		// Setters
		System.out.print("First name: ");
		String newFirstname = userInput.nextLine();
		person1.setFirstname(newFirstname);
		System.out.print("Last name: ");
		String newLastname = userInput.nextLine();
		person1.setLastname(newLastname);
		System.out.print("House: ");
		String newHouse = userInput.nextLine();
		person1.setHouse(newHouse);
		System.out.print("City: ");
		String newCity = userInput.nextLine();
		person1.setCity(newCity);
		System.out.print("State: ");
		String newState = userInput.nextLine();
		person1.setState(newState);
		System.out.print("Zip: ");
		String newZip = userInput.nextLine();
		person1.setZip(newZip);
		System.out.print("E-mail: ");
		String newEmail = userInput.nextLine();
		person1.setEmail(newEmail);
		System.out.print("Phone: ");
		String newPhone = userInput.nextLine();
		person1.setPhone(newPhone);
		System.out.print("Notes: ");
		String newNotes = userInput.nextLine();
		person1.setNotes(newNotes);

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

		person1.sortFirstName();
		person1.sortLastName();

		contactsEdit.read();
		System.out.println(contactsEdit.toString());
		contactsEdit.printToConsole();
		contactsEdit.searchLastName();
		contactsEdit.saveOnExit();

		userInput.close();
		
		System.out.println("Reached the end of main(), Program ran successfully.");

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