package Week52022;

public class Couple {
	//Name Adedapo Adeniyi
	//Date 10/23/2022
	//Course BINS 5312
	
	//Properties
	private Person person1;
	private Person person2;
	
	//Set/Mutator Methods
	public void setPerson1 (Person firstPerson)
	{
		person1 = firstPerson;
	}
	
	public void setPerson2 (Person secondPerson)
	{
		person2 = secondPerson;
	}
	
	//Get/Accessor Methods
	public Person getPerson1()
	{
		return person1;
	}
	
	public Person getPerson2()
	{
		return person2;
	}
	
	//Constructor to accept parameters for each class
	public Couple(Person firstperson, Person secondperson)
	{
		person1 = firstperson;
		person2 = secondperson;
	}
	
}

