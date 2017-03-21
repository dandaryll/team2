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
		// Creates an object of "addressBook" from class AllContactList
		AllContactList addressBook;
		addressBook = new AllContactList();
		addressBook.addContact();
		System.out.println('\n'+ addressBook.contactList());
		addressBook.addContact();
		System.out.println('\n'+ addressBook.contactList());
	}
	

		
		
		
		

		// Creates an object of "person1" from class Person
		//Person person1;

		// Object person1 from class Person
		/* Person person1;

		person1 = new Person();
		person1.read();
		addressBook.addContact(person1);
		System.out.println();
		addressBook.printToConsole();
		*/
		

		// Creates an object "person2" from class Person
		//Person person2;

		// Object person1 from class Person
		
		/*Person person2;
		person2 = new Person();
		person2.read();
		addressBook.addContact(person2);
		System.out.println();
		addressBook.printToConsole();
		
		// Creates an object "person3" from class Person
		Person person3;
		person3 = new Person();
		person3.read();
		addressBook.addContact(person3);
		System.out.println();
		addressBook.printToConsole();
	} */
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