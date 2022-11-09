package Week52022;

import java.time.*;

public class Person {
	//Name Adedapo Adeniyi
	//Date 10/23/2022
	//Course BINS 5312
	
	//Properties
	private String fName;
	private String lName;
	private LocalDate bDate;
	
	//Set/Mutator Methods
	public void setFirstName (String firstName)
	{
		fName = firstName;
	}
	
	public void setLastName (String lastName)
	{
		lName = lastName;
	}
	
	public void setBirthDate (LocalDate birthDate)
	{
		bDate = birthDate;
	}
	
	//Get/Accessor Methods
	public String getFirstName ()
	{
		return fName;
	}
	
	public String getLastName ()
	{
		return lName;
	}
	
	public LocalDate getBirthDate ()
	{
		return bDate;
	}
	
	//constructor to pass arguments for all properties
		public Person ( String firstname, String lastname, LocalDate birthdate)
		{
			fName = firstname;
			lName = lastname;
			bDate = birthdate;
		}
}
