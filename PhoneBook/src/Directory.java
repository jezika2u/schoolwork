import java.util.Scanner;

public class Directory 
{
	Person[] myContacts;
	
	
	//constructor

	public Directory() 
	{
		
		
	}
	
//-------------------------------------------------
	
	public static String getPersonInput(String input)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nEnter New Directory Listing: ");
		System.out.println("(FORMAT: John Doe, 114 Market St, St Louis, MO, 63403, 6366435698)");
		input = sc.nextLine();
		System.out.println("\nYou entered:\n" + input+ "\n");
		return input;
	}
	

	
	public void printContacts(Person[] myContacts) 
	{
		System.out.println("\n\n\n    -------CONTACT ADDED-------");
		System.out.println("You have " + myContacts.length + " contacts in your phone book.");
        	
	
	}
	
	public static Person[] addNewContact(Person person) {
		Person[] myContacts = new Person[1];
		myContacts[0] = person;
		return myContacts;
	}
	
	public static Person[] addNewContact(Person person, Person[] myContacts )
	{
		Person[] myReturnContacts = new Person[myContacts.length + 1];
		
		for(int i = 0; i < myContacts.length; i++) {
			myReturnContacts[i] = myContacts[i];
		}
		myReturnContacts[myContacts.length] = person;
		
		return myReturnContacts;	
	}
	
		
	public static void searchContactFirstName(String name, Person[] myContacts)
	{
		int count = 1;
		int [] position= findIndexFirstName(name, myContacts);
		
		if (position[0]==-1)
		{
			System.out.println("\n\n----- NO RESULTS FOUND -----\n\n");
		}
		
		
		for(int i=0; i<position.length; i++) 
		{
		if(position[i]<0) 
		{
			break;
		}
		else
		{
 
            System.out.println((count) + ". " + myContacts[position[i]].getFirstName() + " " +
                                              myContacts[position[i]].getLastName() + ", " +
                                              myContacts[position[i]].getAddress() + ", " +
                                              myContacts[position[i]].getPhoneNumber());
            count++;
            
		}
		
		}
		
		
	}
	public static int[] findIndexFirstName(String name, Person[] myContacts)
	{
		int[] myIndexes = new int[myContacts.length];
		int counter = 0;
		
		for(int i = 0; i < myIndexes.length; i++) {
			myIndexes[i] = -1;
		}
		
		
		for (int i = 0; i < myContacts.length; i++) 
		{
			
		  Person person = myContacts[i];
		  
		 
		        if (person.getFirstName().equals(name)) 
		        {
		            myIndexes[counter] = i;
		            counter++;
		        }
		  
		}
		return myIndexes;
	}
	//-----------------------------------------------------------------------------
	public static void searchContactLastName(String name, Person[] myContacts)
	{
		int count = 1;
		int [] position= findIndexLastName(name, myContacts);
		
		if (position[0]==-1)
		{
			System.out.println("\n\n----- NO RESULTS FOUND -----\n\n");
		}
		else {
		
		for(int i=0; i<position.length; i++) 
		{
			if(position[i]<0) 
			{
				break;
			}
			else
			{
 
				System.out.println((count) + ". " + myContacts[position[i]].getFirstName() + " " +
                                              myContacts[position[i]].getLastName() + ", " +
                                              myContacts[position[i]].getAddress() + ", " +
                                              myContacts[position[i]].getPhoneNumber());
				count++;
            
			}
		}
		}
		
		
	}
	public static int[] findIndexLastName(String name, Person[] myContacts)
	{
		int[] myIndexes = new int[myContacts.length];
		int counter = 0;
		
		for(int i = 0; i < myIndexes.length; i++) {
			myIndexes[i] = -1;
		}
		
		
		for (int i = 0; i < myContacts.length; i++) 
		{
			
		  Person person = myContacts[i];
		  
		 
		        if (person.getLastName().equals(name)) 
		        {
		            myIndexes[counter] = i;
		            counter++;
		        }
		  
		}
		return myIndexes;
	}
	
	//---------------------------------------------------------------------------------
	
	public static void searchContactCity(String city, Person[] myContacts)
	{
		int count = 1;
		int [] position= findIndexCity(city, myContacts);
		
		if (position[0]==-1)
		{
			System.out.println("\n\n----- NO RESULTS FOUND -----\n\n");
		}
		else {
		
		for(int i=0; i<position.length; i++) 
		{
			if(position[i]<0) 
			{
				break;
			}
			else
			{
 
				System.out.println((count) + ". " + myContacts[position[i]].getFirstName() + " " +
                                              myContacts[position[i]].getLastName() + ", " +
                                              myContacts[position[i]].getAddress() + ", " +
                                              myContacts[position[i]].getPhoneNumber());
				count++;
            
			}
		}
		}
		
		
	}
	public static int[] findIndexCity(String city, Person[] myContacts)
	{
		int[] myIndexes = new int[myContacts.length];
		int counter = 0;
		
		for(int i = 0; i < myIndexes.length; i++) {
			myIndexes[i] = -1;
		}
		
		
		for (int i = 0; i < myContacts.length; i++) 
		{
			
		  Person person = myContacts[i];
		  
		 
		        if (person.getAddress().getCity().equals(city)) 
		        {
		            myIndexes[counter] = i;
		            counter++;
		        }
		  
		}
		return myIndexes;
	}
	//---------------------------------------------------------------------------------
	
	public static void searchContactState(String state, Person[] myContacts)
	{
		int count = 1;
		int [] position= findIndexState(state, myContacts);
		
		if (position[0]==-1)
		{
			System.out.println("\n\n----- NO RESULTS FOUND -----\n\n");
		}
		else {
		
		for(int i=0; i<position.length; i++) 
		{
			if(position[i]<0) 
			{
				break;
			}
			else
			{
 
				System.out.println((count) + ". " + myContacts[position[i]].getFirstName() + " " +
                                              myContacts[position[i]].getLastName() + ", " +
                                              myContacts[position[i]].getAddress() + ", " +
                                              myContacts[position[i]].getPhoneNumber());
				count++;
            
			}
		}
		}
		
		
	}
	public static int[] findIndexState(String state, Person[] myContacts)
	{
		int[] myIndexes = new int[myContacts.length];
		int counter = 0;
		
		for(int i = 0; i < myIndexes.length; i++) {
			myIndexes[i] = -1;
		}
		
		
		for (int i = 0; i < myContacts.length; i++) 
		{
			
		  Person person = myContacts[i];
		  
		 
		        if (person.getAddress().getState().equals(state)) 
		        {
		            myIndexes[counter] = i;
		            counter++;
		        }
		  
		}
		return myIndexes;
	}
	
	//---------------------------------------------------------------------------------
	
	public static void searchFullName(String fullName, Person[] myContacts)
	{
		int count = 1;
		int [] position= findIndexFullName(fullName, myContacts);
		
		if (position[0]==-1)
		{
			System.out.println("\n\n----- NO RESULTS FOUND -----\n\n");
		}
		else {
		
		for(int i=0; i<position.length; i++) 
		{
			if(position[i]<0) 
			{
				break;
			}
			else
			{
 
				System.out.println((count) + ". " + myContacts[position[i]].getFirstName() + " " +
                                              myContacts[position[i]].getLastName() + ", " +
                                              myContacts[position[i]].getAddress() + ", " +
                                              myContacts[position[i]].getPhoneNumber());
				count++;
            
			}
		}
		}
		
		
	}
	public static int[] findIndexFullName(String fullName, Person[] myContacts)
	{
		int[] myIndexes = new int[myContacts.length];
		int counter = 0;
		
		
		String[] Name = fullName.split(" ");
		String firstName = Name[0];
		String lastName = Name[1];
		
		for(int i = 0; i < myIndexes.length; i++) {
			myIndexes[i] = -1;
		}
		
		
		for (int i = 0; i < myContacts.length; i++) 
		{
			
		  Person person = myContacts[i];
		  
		 
		        if (person.getFirstName().equals(firstName) && person.getLastName().contentEquals(lastName)) 
		        {
		            myIndexes[counter] = i;
		            counter++;
		        }
		  
		}
		return myIndexes;
	}
	
	//--------------------------------------------------------------------------------------------------
	
	public static void searchPhone(String phoneNumber, Person[] myContacts)
	{
		int count = 1;
		int [] position= findIndexPhone(phoneNumber, myContacts);
		
		if (position[0]==-1)
		{
			System.out.println("\n\n----- NO RESULTS FOUND -----\n\n");
		}
		else {
		
		for(int i=0; i<position.length; i++) 
		{
			if(position[i]<0) 
			{
				break;
			}
			else
			{
 
				System.out.println((count) + ". " + myContacts[position[i]].getFirstName() + " " +
                                              myContacts[position[i]].getLastName() + ", " +
                                              myContacts[position[i]].getAddress() + ", " +
                                              myContacts[position[i]].getPhoneNumber());
				count++;
            
			}
		}
		}
		
		
	}
	public static int[] findIndexPhone(String phoneNumber, Person[] myContacts)
	{
		int[] myIndexes = new int[myContacts.length];
		int counter = 0;
		
		for(int i = 0; i < myIndexes.length; i++) {
			myIndexes[i] = -1;
		}
		
		
		for (int i = 0; i < myContacts.length; i++) 
		{
			
		  Person person = myContacts[i];
		  
		 
		        if (person.getPhoneNumber().equals(phoneNumber)) 
		        {
		            myIndexes[counter] = i;
		            counter++;
		        }
		  
		}
		return myIndexes;
	}
	
	public static void printDescendingOrder(Person[] myContacts)
	{
		System.out.println("You have " + myContacts.length + " contacts in your phone book.");
    	for (int i = myContacts.length-1; i >= 0; i--) 
    	{

        System.out.println((i+1) + ". " + myContacts[i].getFirstName() + " " +
                                          myContacts[i].getLastName() + ", " +
                                          myContacts[i].getAddress() + ", " +
                                          myContacts[i].getPhoneNumber());
        }
	}
	
	public static void printAscendingOrder(Person[] myContacts)
	{
		System.out.println("\n\n\nCONTACTS:");
    	for (int i = 0; i <myContacts.length; i++) 
    	{

        System.out.println((i+1) + ". " + myContacts[i].getFirstName() + " " +
                                          myContacts[i].getLastName() + ", " +
                                          myContacts[i].getAddress() + ", " +
                                          myContacts[i].getPhoneNumber());
        }
		System.out.println("\n\n\n");
	}
	
	public static Person[] deleteContact(int returnedIndex, Person[] myContacts)
	
		{
			Person[] myReturnContacts = new Person[myContacts.length - 1];
			
			boolean temp = true;

			for(int i = 0; i < myContacts.length; i++) 
			{
				if(returnedIndex == i) {
					temp = false;
				} else if (temp == true) {
					myReturnContacts[i] = myContacts[i];
				} else {
					myReturnContacts[i - 1] = myContacts[i];
				}
			}
			
			return myReturnContacts;	
		}
		
		
	
	
	
	public static int findIndexRemoveContact(String fullName, Person[] myContacts)
	{
		int myReturnIndex = 0;
		
		String[] Name = fullName.split(" ");
		String firstName = Name[0];
		String lastName = Name[1];
		
		
		
		for (int i = 0; i < myContacts.length; i++) 
		{
			
		  Person person = myContacts[i];
		  
		 
		        if (person.getFirstName().equals(firstName) && person.getLastName().contentEquals(lastName)) 
		        {
		            myReturnIndex = i;
		            
		        }
		  
		}
		return myReturnIndex;
	}
	
	public static void removePhone(String name,Person[] myContacts)
	{
		
		String removed = "REMOVED";
		int [] position= findIndexFullName(name, myContacts);
		int resetPosition = 0;
		
		if (position[0]==-1)
		{
			System.out.println("\n\n----- CONTACT CANT BE FOUND FOR UPDATE -----\n\n");
		}
		else {
		
		for(int i=0; i<position.length; i++) 
		{
			if(position[i]<0) 
			{
				break;
			}
			else
			{
				i = resetPosition;
			}
		}
		 
	        myContacts[position[resetPosition]].setPhoneNumber(removed);
	        
	        System.out.println("- UPDATED - "  + myContacts[position[resetPosition]].getFirstName() + " " +
                    myContacts[position[resetPosition]].getLastName() + ", " +
                    myContacts[position[resetPosition]].getAddress() + ", " +
                    myContacts[position[resetPosition]].getPhoneNumber());
	        
		}
	}
	
	public static void updatePhone(String name, Person[] myContacts)
	{
		Scanner sc = new Scanner(System.in);
			int [] position= findIndexFullName(name, myContacts);
			int resetPosition = 0;
			
			if (position[0]==-1)
			{
				System.out.println("\n\n----- CONTACT CANT BE FOUND FOR UPDATE -----\n\n");
			}
			else {
			
			for(int i=0; i<position.length; i++) 
			{
				if(position[i]<0) 
				{
					break;
				}
				else
				{
	 
					System.out.println("- "  + myContacts[position[i]].getFirstName() + " " +
	                                              myContacts[position[i]].getLastName() + ", " +
	                                              myContacts[position[i]].getAddress() + ", " +
	                                              myContacts[position[i]].getPhoneNumber());
					i = resetPosition;
					
	            
				}
			}
			 	System.out.println("Please enter the new phone number, no dashes or parentheses please: ");
		        String phoneNumber = sc.nextLine();
		        phoneNumber=Person.formatPhone(phoneNumber);
		        myContacts[position[resetPosition]].setPhoneNumber(phoneNumber);
		        
		        System.out.println("- UPDATED - "  + myContacts[position[resetPosition]].getFirstName() + " " +
                        myContacts[position[resetPosition]].getLastName() + ", " +
                        myContacts[position[resetPosition]].getAddress() + ", " +
                        myContacts[position[resetPosition]].getPhoneNumber());
		        
			}
	}
	
	
}
