/**
 * This program allows a user to enter a new person into a contact list, print the entire contact list in the console,
 * search a person's information by last name, saves sessions on exit, and start the program again with saved info.
 *  
 * By: DA
 */

import java.util.Scanner;


public class TestContactList {
	static Scanner userInput = new Scanner(System.in);
	static AllContactList addressbook = new AllContactList();
	static Person newContact;
	static String menuChoice;

	public static void main(String[] args) {
		System.out.println("Welcome to the ContactLister2.0!");
		showMenu();
		System.out.println("Thank you for using the ContactLister2.0!");
	}
	
	/**
	 * NOTE: CURRENTLY HAVE 29 LINES!
	 */
	public static void showMenu() {
		boolean done = false;
		addressbook.open();
		while (!done) {
			System.out.print("[1] add contact.\n" + "[2] print the contact list.\n" + "[3] retrieve contact information.\n"
							 + "[4] quit the program.\n" + "Please select an option from the above menu: ");
			
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
				break;
			}
		}
	}
}
/* --OUTPUT--
Welcome to the ContactLister2.0!
[1] add contact
[2] print the contact list
[3] retrieve contact information.
[4] quit the program
Please select an option from the above menu: 1
First name: John
Last name: Smith
House: 856 Robin way
City: Sunnvale
State: Ca
Zipcode: 94087
Email: j.smith@gmail.com
phone: 408-727-9528
Notes: Not available on sundays.
Contact information has been added successfully!
[1] add contact
[2] print the contact list
[3] retrieve contact information.
[4] quit the program
Please select an option from the above menu: 1
First name: Sarah
Last name: Barkley
House: 112 right street
City: Sunnyvale
State: Ca
Zipcode: 
Email: sarah.bark@yahoo.com
phone: 408-363-7225
Notes: 
Contact information has been added successfully!
[1] add contact
[2] print the contact list
[3] retrieve contact information.
[4] quit the program
Please select an option from the above menu: 1
First name: Sam
Last name: 
Contact information not added. Last name required.
[1] add contact
[2] print the contact list
[3] retrieve contact information.
[4] quit the program
Please select an option from the above menu: 4
Thank you for using the ContactLister2.0!

Welcome to the ContactLister2.0!
Current Contact List entries: 2
[1] add contact
[2] print the contact list
[3] retrieve contact information.
[4] quit the program
Please select an option from the above menu: 2

Name: Sarah Barkley
Address: 112 right street Sunnyvale Ca 
E-mail: sarah.bark@yahoo.com
Phone: 408-363-7225
Notes: 

Name: John Smith
Address: 856 Robin way Sunnvale Ca 94087
E-mail: j.smith@gmail.com
Phone: 408-727-9528
Notes: Not available on sundays.

[1] add contact
[2] print the contact list
[3] retrieve contact information.
[4] quit the program
Please select an option from the above menu: 3
Please enter the last name of the person you wish to find: cunningham
We are sorry, but we have no contact information under that last name
[1] add contact
[2] print the contact list
[3] retrieve contact information.
[4] quit the program
Please select an option from the above menu: 1
First name: Sam
Last name: Cunningham
House: 1490 Duck road
City: Sunnyvale
State: Ca
Zipcode: 94087
Email: s.cunningham@yahoo.com
phone: 408-464-7889
Notes: 
Contact information has been added successfully!
[1] add contact
[2] print the contact list
[3] retrieve contact information.
[4] quit the program
Please select an option from the above menu: 1
First name: Rachel
Last name: Cunningham
House: 1090 cuesta avenue
City: Los Altos
State: Ca
Zipcode: 94022
Email: rachel.cunningham@gmail.com
phone: 408-566-7238
Notes: 
Contact information has been added successfully!
[1] add contact
[2] print the contact list
[3] retrieve contact information.
[4] quit the program
Please select an option from the above menu: 4
Thank you for using the ContactLister2.0!

Welcome to the ContactLister2.0!
Current Contact List entries: 4
[1] add contact
[2] print the contact list
[3] retrieve contact information.
[4] quit the program
Please select an option from the above menu: 3
Please enter the last name of the person you wish to find: cunningham
Name: Rachel Cunningham
Address: 1090 cuesta avenue Los Altos Ca 94022
E-mail: rachel.cunningham@gmail.com
Phone: 408-566-7238
Notes: 

Name: Sam Cunningham
Address: 1490 Duck road Sunnyvale Ca 94087
E-mail: s.cunningham@yahoo.com
Phone: 408-464-7889
Notes: 

[1] add contact
[2] print the contact list
[3] retrieve contact information.
[4] quit the program
Please select an option from the above menu: 1
First name: Bob
Last name: Zinger
House: 865 Circle court
City: Sunnyvale
State: 
Zipcode: 
Email: bobzinger@yahoo.com
phone: 408-343-7228
Notes: 
Contact information has been added successfully!
[1] add contact
[2] print the contact list
[3] retrieve contact information.
[4] quit the program
Please select an option from the above menu: 4
Thank you for using the ContactLister2.0!

Welcome to the ContactLister2.0!
Current Contact List entries: 5
[1] add contact
[2] print the contact list
[3] retrieve contact information.
[4] quit the program
Please select an option from the above menu: 2

Name: Sarah Barkley
Address: 112 right street Sunnyvale Ca 
E-mail: sarah.bark@yahoo.com
Phone: 408-363-7225
Notes: 

Name: Rachel Cunningham
Address: 1090 cuesta avenue Los Altos Ca 94022
E-mail: rachel.cunningham@gmail.com
Phone: 408-566-7238
Notes: 

Name: Sam Cunningham
Address: 1490 Duck road Sunnyvale Ca 94087
E-mail: s.cunningham@yahoo.com
Phone: 408-464-7889
Notes: 

Name: John Smith
Address: 856 Robin way Sunnvale Ca 94087
E-mail: j.smith@gmail.com
Phone: 408-727-9528
Notes: Not available on sundays.

Name: Bob Zinger
Address: 865 Circle court Sunnyvale  
E-mail: bobzinger@yahoo.com
Phone: 408-343-7228
Notes: 

[1] add contact
[2] print the contact list
[3] retrieve contact information.
[4] quit the program
Please select an option from the above menu: 4
Thank you for using the ContactLister2.0!
*/