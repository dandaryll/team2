/**
 * This class represents the whole list of contacts. Also it contains the methods for sorting the whole list of contacts,
 * printing the whole list of contacts, to add new contact to the list of contacts, to search the contact by last name, 
 * to save and open the list of contacts to disk.
 * By: DA
 */

import java.util.ArrayList; 
import java.util.Scanner;
import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.util.Collections;

public class AllContactList {

	private ArrayList<Person> allPersonArray = new ArrayList<Person>();
	private Scanner userInput = new Scanner(System.in);

	/**
	 * This method adds a person object's information to the ArrayList 
	 * allPersonArray
	 * 
	 * By: JT
	 */
	public void addContact(Person newPerson) {
		if (newPerson.getLastName().equals("")) {	
		}
		else {
			allPersonArray.add(newPerson);
		}
	}

	/**
	 * This method returns and prints all entries of the contact list sorted
	 * alphabetically.
	 * 
	 * By: JT 
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
		sortAllContacts();
		for (int i = 0; i < allPersonArray.size(); i++) {
				if (allPersonArray.get(i).getLastName().equalsIgnoreCase(givenLastName)) {
					
					System.out.println(allPersonArray.get(i) + "\n");
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
		
		FileOutputStream outFile;
		ObjectOutputStream outObject;
		try {
			outFile = new FileOutputStream("Contactlist 2.0.sav");
			outObject = new ObjectOutputStream(outFile);
			
			outObject.writeObject(allPersonArray);
			
			outFile.close();
			outObject.close();
		} catch (IOException ioe) {
			System.out.println("Error writing objects to the file: " + ioe.getMessage());
		}
	}

	/**
	 * This method reads the saved file when the program starts
	 * 
	 * By: DA
	 */
	public void open() {
		
		FileInputStream inFile;
		ObjectInputStream inObject;

		try {
			inFile = new FileInputStream("Contactlist 2.0.sav");
			inObject = new ObjectInputStream(inFile);
			
			allPersonArray = (ArrayList<Person>)inObject.readObject();
			
			inObject.close();
			inFile.close();
		}
		catch (FileNotFoundException fnf) {
			return;
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		}
		catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Current Contact List entries: " + allPersonArray.size());	
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
