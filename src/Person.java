/**
4 * This class represents an object that stores the first name, last name, address, email, phone, and  notes for one person.
 * 
 * By: DA
 */
import java.util.Scanner;
import java.io.Serializable;

public class Person implements Serializable, Comparable<Person> {
	private String firstName;
	private String lastName;
	private String house;
	private String city;
	private String state;
	private String zip;
	private String email;
	private String phone;
	private String notes;
	
	/**
	 * This method reads userInput and prompts user to assign values to firstName, lastName, house, city, state, zip,
	 * email, phone and notes
	 * 
	 * By: DA
	 */
	public boolean read() { 							
		Scanner userInput;
		userInput = new Scanner(System.in);
		System.out.print("First name: ");
		setFirstname(userInput.nextLine());
		System.out.print("Last name: ");
		setLastname(userInput.nextLine());
		if (getLastName().equals("")) {
			System.out.println("Contact information not added. Last name required.");
			return false;
		}
		System.out.print("House: ");
		setHouse(userInput.nextLine());
		System.out.print("City: ");
		setCity(userInput.nextLine());
		System.out.print("State: ");
		setState(userInput.nextLine());
		System.out.print("Zipcode: ");
		setZip(userInput.nextLine());
		System.out.print("Email: ");
		setEmail(userInput.nextLine());
		System.out.print("phone: ");
		setPhone(userInput.nextLine());
		System.out.print("Notes: ");
		setNotes(userInput.nextLine());
		System.out.println("Contact information has been added successfully!");
		return true;
	}
	
	/**
	 * Sets the value for firstName to "newFirstName".
	 * By: DA
	 */
	public void setFirstname(String newFirstName) {
		firstName = newFirstName;
	}

	/**
	 * Sets the value for lastName to "newLastName".
	 * By: MM
	 */
	public void setLastname(String newLastName) {
		if (newLastName.equals("")) {
		}
		lastName = newLastName;
	}
	
	/**
	 * This method Sets the value for house to "newHouse".
	 * By: DA
	 */
	public void setHouse(String newHouse) {
		house = newHouse;
	}

	/**
	 * Sets the value for city to "newCity".
	 * By: DA
	 */
	public void setCity(String newCity) {
		city = newCity;
	}

	/**
	 * Sets the value for state to "newState".
	 * By: DA
	 */
	public void setState(String newState) { 
		state = newState;
	}

	/**
	 * Sets the value for zip to "newZip".
	 * By: MM
	 */
	public void setZip(String newZip) {
		zip = newZip;
	}

	/**
	 * Sets the value for email to "newEmail".
	 * By: MM
	 */
	public void setEmail(String newEmail) {
		email = newEmail;
	}

	/**
	 * Sets the value for phone to "newPhone".
	 * By: MM
	 */
	public void setPhone(String newPhone) {
		phone = newPhone;
	}

	/**
	 * Sets the value for notes to "newNotes".
	 * By: MM 
	 */
	public void setNotes(String newNotes) {
		notes = newNotes;
	}

	/**
	 * Returns the value of firstName.
	 * By: MM
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Returns the value of lastName.
	 * By: MM
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Returns the value of house.
	 * By: MM
	 */
	public String getHouse () {
		return house;
	}
	
	/**
	 * Returns the value of city.
	 * By: JT
	 */
	public String getCity () {
		return city;
	}
	
	/**
	 * Returns the value of state.
	 * By: JT
	 */
	public String getState () {
		return state;
	}
	
	/**
	 * Returns the value of zip.
	 * By: JT
	 */
	public String getZip () {
		return zip;
	}

	/**
	 * Returns the value of email.
	 * By: JT
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Returns the value of phone.
	 * By: JT
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Returns the value of zip.
	 * By: JT
	 */
	public String getNotes() {
		return notes;
	}
	
	/**
	 * This method returns a string that represents one object in person class.
	 * By: JT
	 */
	public String toString() { 
		
		return "Name: " + firstName + " " + lastName + "\n" + "Address: " + house + " " + city + " " +
		   state + " " + zip + "\n" + "E-mail: " + email + "\n" + "Phone: " + phone + "\n" + "Notes: " + notes;
	}
	
	/**
	 * This method sorts the contacts in the array list alphabetically by last name based on the returned value 
	 * When the return value equals 0, it's sorted case insensitively by first name 
	 * When the return value is not equal to 0, it's sorted case insensitively by last name  
	 * By: JT
	 */
	@Override
	public int compareTo(Person otherPerson) {
		if (this.lastName.equalsIgnoreCase(otherPerson.lastName)){  
			return this.firstName.compareToIgnoreCase(otherPerson.firstName);
		}
		return this.lastName.compareToIgnoreCase(otherPerson.lastName);
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