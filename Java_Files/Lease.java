
public class Lease {
	
	//Adedapo Adeniyi
	//10/30/2022
	
	//data fields
	private String name;
	private int aptNo;
	private double rent;
	private int terms;
	private boolean isPetOwner = false;
	
	//Set methods
	public void setName(String renterName)
	{
		name = renterName;
	}

	public void setAptNo(int roomNumber)
	{
		aptNo = roomNumber;
	}

	public void setRent(double aptCost)
	{
		rent = aptCost;
	}

	public void setTerms(int months)
	{
		terms = months;
	}
	
	public void setisPetOwner(boolean isOwnerPet)
	{
		isPetOwner = isOwnerPet;
	}

	
	//Get/Accessor Methods
	
	public String getName()
	{
		return name;
	}

	public int getAptNo()
	{
		return aptNo;
	}
	
	public double getRent()
	{
		return rent;
	}
	
	public int getTerms()
	{
		return terms;
	}
	
	public boolean getisPetOwner()
	{
		return isPetOwner;
	}
	
	//Constructor
	Lease ()
	{
		name = "XXX";
		aptNo = 0;
		rent = 1000;
		terms = 12;
		isPetOwner = false;
	}
	
	public void addPetFee()
	{
		if (isPetOwner == true)
		{
			rent = rent +10;
		}
	}
}
