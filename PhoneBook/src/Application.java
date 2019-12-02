import java.util.Scanner;



public class Application 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input="";
		boolean exit = false;
		int choice =0;
		
		String aStreet = "";
		String aCity = "";
		String aState = "";
		String aZip = "";
		String aFirst = "";
		String aLast = "";
		String aPhone = "";
		Person[] myContacts = null;
		
		printHeader();
		
		while(exit!=true) {
		choice = runMenu(exit, choice);
		
		switch(choice)
		{
		case 1:
		
			input=Directory.getPersonInput(input);
			

			String[] entry = input.split(", ");
			String[] name = entry[0].split(" ");
			
			aFirst=name[0];
			aLast=name[1];
			aStreet = entry[1];
			aCity = entry[2];
			aState = entry[3];
			aZip = entry[4];
			aPhone=entry[5];
			aPhone=Person.formatPhone(aPhone);
			
			Directory phonebook = new Directory();
			Address address = new Address(aStreet, aCity, aState, aZip);
			Person person = new Person(aFirst, aLast, aPhone, address);
			
			
			System.out.println("\nNEW ENTRY:");
			System.out.print(person.getFirstName()+" "+person.getLastName()+", "+address.getStreet()
			+", "+address.getCity()+", "+address.getState()+", "+address.getZip()+", "+person.getPhoneNumber()+"\n\n");
		
		
			if(myContacts==null) {
				myContacts = Directory.addNewContact(person);
			}
			else {
				myContacts = Directory.addNewContact(person, myContacts);
			}
				phonebook.printContacts(myContacts);
				System.out.println("\n\n\n\n");
				break;
		
		case 2:
			Person p = new Person();
			System.out.println("Enter the Full Name of the contact you wish to DELETE: ");
	        String removeName = sc.nextLine();
			int removeIndex=Directory.findIndexRemoveContact(removeName, myContacts);
			myContacts =Directory.deleteContact(removeIndex, myContacts);
			break;
			
		case 3:
			
			 System.out.println("Enter the First Name You Wish to Search For: ");
		        String nameSearch = sc.nextLine();
		        Directory.searchContactFirstName(nameSearch, myContacts);
		        if (myContacts == null) {
		            System.out.println("Contact not found.");
		        }
		        break;
			
		case 4:
			
			 System.out.println("Enter the Last Name You Wish to Search For: ");
		        String LastName = sc.nextLine();
		        Directory.searchContactLastName(LastName, myContacts);
		        if (myContacts == null) {
		            System.out.println("Contact not found.");
		        }
		        break;
			
		case 5:
			
			
			 System.out.println("Enter the Full Name You Wish to Search For: ");
		        String fullName = sc.nextLine();
		        Directory.searchFullName(fullName, myContacts);
		        if (myContacts == null) {
		            System.out.println("Contact not found.");
		        }
		        break;
			
			
		case 6:
			
			Directory.printAscendingOrder(myContacts);
			break;
			
		case 7:
			
			System.out.println("Please phone number you would like to search for(no dashes or parentheses): ");
	        	String phoneNumber = sc.nextLine();
	        	phoneNumber=Person.formatPhone(phoneNumber);
	        	Directory.searchPhone(phoneNumber, myContacts);
		        if (myContacts == null) {
		            System.out.println("Contact not found.");
		        }
		        break;
			
		case 8:
			
			 System.out.println("Enter the City You Wish to Search For: ");
		        String city = sc.nextLine();
		        Directory.searchContactCity(city, myContacts);
		        if (myContacts == null) {
		            System.out.println("Contact not found.");
		        }
		        break;
		        
		case 9:
			
			 System.out.println("Enter the State You Wish to Search For: ");
		        String state = sc.nextLine();
		        Directory.searchContactState(state, myContacts);
		        if (myContacts == null) {
		            System.out.println("Contact not found.");
		        }
		        break;
		        
		case 10:
			
			System.out.println("Whose number would you like to DELETE? "
					+ "\nPlease enter their Full Name: ");
	        String nameOfContact = sc.nextLine();
	        Directory.removePhone(nameOfContact, myContacts);
	        if (myContacts == null) {
	            System.out.println("Contact not found.");
	        }
	   
	        break;
		case 11:
			
			System.out.println("Enter the full name of the person you would like to update the phone number for: ");
	        String whoseNumber = sc.nextLine();
	        Directory.updatePhone(whoseNumber, myContacts);
	        if (myContacts == null) {
	            System.out.println("Contact not found.");
	        }
	   
	        break;
		
		case 12:
			exit = true;
			System.out.println("-------------------------------------------------------------");
			System.out.println("-                         GOODBYE                           -");
			System.out.println("-         Thanks for coming by, see you again soon!         -");
			System.out.println("-------------------------------------------------------------");
			break;
		default: 
			System.out.println("GREAT.... You broke the application... Go Home. ");
		}
	}

}

	
	
	public static void printHeader()
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("-                        WELCOME!                           -");
		System.out.println("-    TO YOUR LOCAL PURPLE PAGES PHONEBOOK APPLICATION!      -");
		System.out.println("-------------------------------------------------------------");
	}
	
	public static void printSelections()
	{
		System.out.println("\n                What would you like to do? \n");
		System.out.println(" 1: Add Contact                7: Search by Telephone Number ");
		System.out.println(" 2: Delete Contact             8: Search by City");
		System.out.println(" 3: Search by First Name       9: Search by State");
		System.out.println(" 4: Search by Last Name       10: Remove Phone Number");
		System.out.println(" 5: Search by Full Name       11: Update Telephone Number");
		System.out.println(" 6: Print Listing Asc Order   12: EXIT");
	}
	public static int runMenu(boolean exit, int choice)
	{
		
		while (!exit)
		{
			printSelections();
			choice = getInput();
			return choice;
			
		}
		return choice;
	}
		
		public static int getInput()
		{
			int choice = 0;
			Scanner sc = new Scanner(System.in);
			
			while(choice < 1 || choice > 12 )
			{
				try
				{
					System.out.print("\nPlease enter your selection: ");
					choice = Integer.parseInt(sc.nextLine());
				}
				catch (NumberFormatException e)
				{
					System.out.println("Invalid selection. Please try again.");
				}
			}
			return choice;
		}
	}

	



