

public class Person 
{
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Address address;
	
	
	//default constructor
	public Person() {
		
		this.address = new Address();
	}
	   
	//constructor with arguments
	public Person(String firstName, String lastName, String phoneNumber, Address address)
	   {
		  
		   this.firstName = firstName;
		   this.lastName = lastName;
		   this.phoneNumber = phoneNumber;
		   this.address = address;
		   
	   }
	   
			//gets and sets
	   		public String getFirstName()
	   		{
	   			return this.firstName;
			}
			public void setFirstName(String firstName) 
			{
				this.firstName = firstName;
			}
			public String getLastName()
			{
				return this.lastName;
			}
			public void setLastName(String lastName) 
			{
				this.lastName = lastName;
			}
			public String getPhoneNumber() 
			{
				return this.phoneNumber;
			}
			public void setPhoneNumber(String phoneNumber) 
			{
				this.phoneNumber = phoneNumber;
			}
			public Address getAddress()
			{
				return this.address;

			}
			public void setAddress(Address address)
			{
				this.address = address;
			}
			
//-----------------------------------------------------------
			
		    public static Person createContact(String firstName, String lastName, String phoneNumber, Address address) 
		    {
		        return new Person(firstName, lastName, phoneNumber, address);
		    }
		    
			public static String formatPhone(String aPhone)
			{
				aPhone = "("+aPhone.substring(0,3)+")-"+aPhone.substring(3,6)+"-"+aPhone.substring(6);
				return aPhone;
			}
		

	
		
}
