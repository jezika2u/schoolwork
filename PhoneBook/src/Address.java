
public class Address 
{
	String street;
	String city;
	String state;
	String zip;
	
	// default constructor
	public Address() {
		
	}
	
	//parameterized constructor
	public Address(String street, String city, String state,String zip)
	{
		
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip=zip;
	}
	
	//getters and setters
	public String getStreet()
	{
		return this.street;
	}
	public void setStreet(String street) 
	{
		this.street = street;
	}
	
	public String getCity()
	{
		return this.city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getState()
	{
		return this.state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	
	public String getZip()
	{
		return this.zip;
	}
	public void setZip(String zip)
	{
		this.zip = zip;
	}
	
	@Override
	public String toString(){
	    return street +", "+city+", "+state+", "+zip;
	}

}
