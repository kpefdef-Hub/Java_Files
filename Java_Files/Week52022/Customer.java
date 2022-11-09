package Week52022;

public class Customer {
	//Adedapo Adeniyi
	//10/30/2022

	//Create the fields
	private String email, phone, fName, lName;
	
	//Create set methods
	public void setEmail ( String yourEmail)
	{
		email = yourEmail;
	}
	
	public void setPhone ( String yourPhone)
	{
		phone = yourPhone;
	}
	
	public void setFName ( String yourFName)
	{
		fName = yourFName;
	}
	
	public void setLName ( String yourLName)
	{
		lName = yourLName;
	}
	
	//Create Get Methods
	
	public String getEmail()
	{
		return email;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public String getFName()
	{
		return fName;
	}
	
	public String getLName()
	{
		return lName;
	}
	
	//Default Constructor
	Customer ()
	{
		
	}
	
}
