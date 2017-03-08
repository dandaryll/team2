/**
 * This program allows a user to enter a new person into a contact list, print the entire contact list in the console,
 * search a person's information by last name, saves sessions on exit, and start the program again with saved info.
 *  
 * By: DA
 */
public class TestContactList {

	public static void main(String[] args) {
		
		// Object person1 from class Person
		Person person1;
		person1 = new Person();
		// Object contactsEdit from class AllContactList
		AllContactList addressBook;
		addressBook = new AllContactList();
		
		addressBook.open();
		addressBook.read();
		System.out.println(addressBook.toString());
		addressBook.printToConsole();
		addressBook.searchLastName();
		addressBook.save();
		
		//Setters
		System.out.println("First name: ");
		person1.setFirstname("");
		System.out.println("Last name: ");
		person1.setLastname("");
		System.out.println("House: ");
		person1.setHouse("134 Washington St.");
		System.out.println("City: ");
		person1.setCity("Santa Clara");
		System.out.println("State: ");
		person1.setState("CA");
		System.out.println("Zip: ");
		person1.setZip("95050");
		System.out.println("E-mail: ");
		person1.setEmail("");
		System.out.println("Phone: ");
		person1.setPhone("4087288905");
		System.out.println("Notes: ");
		person1.setNotes("none");
		
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

		addressBook.sortFirstName();
		addressBook.sortLastName();
		
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