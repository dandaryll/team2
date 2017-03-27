/**
 * This program allows a user to enter a new person into a contact list, print the entire contact list in the console,
 * search a person's information by last name, saves sessions on exit, and start the program again with saved info.
 *  
 * By: DA
 */

public class TestContactList {

	public static void main(String[] args) {
		  
			AllContactList addressBook;
			addressBook = new AllContactList();
			// Opens file if any
			addressBook.open();
			
			Person person1;
			person1 = new Person();
			person1.read();
			addressBook.addContact(person1);
			
			Person person2;
			person2 = new Person();
			person2.read();
			addressBook.addContact(person2);
			
			// new 3.27.2017 12:26pm
			Person person3;
			person3 = new Person();
			person3.read();
			addressBook.addContact(person3);
			
			System.out.println();
			
			addressBook.printToConsole();
			System.out.print( "Please enter the last name of the person you wish to find: ");
			addressBook.searchByLastName();
			// Last method to run in main so it will save at exit
			addressBook.save();
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