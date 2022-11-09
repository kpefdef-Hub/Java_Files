package Week52022;

public class TaxReturn {
	
	//Adedapo Adeniyi
	//10/30/2022
	
	//Data fields
	private String socSec, lName, state;
	private boolean isMarried;
	private double annIncome;
	
	//Set methods
	public void setSocSec (String socialSec)
	{
		socSec = socialSec;
	}
	
	public void setLName (String lastN)
	{
		lName = lastN;
	}
	
	public void setState (String livingState)
	{
		state = livingState;
	}
	
	public void setMStatus (boolean maritalS)
	{
		isMarried = maritalS;
	}
	
	public void setAnnIncome (double finIncome)
	{
		annIncome = finIncome;
	}
	
	//Get Methods
	
	public String getSocSec ()
	{
		return socSec;
	}
	
	public String getLName ()
	{
		return lName;
	}
	
	public String getState ()
	{
		return state;
	}
	
	public boolean getMStatus ()
	{
		return isMarried;
	}
	
	public double getAnnIncome ()
	{
		return annIncome;
	}
	
	// compute liabilty method
	
	public double computeLiability()
	{	
		double taxLiability = 0;
		
		if (annIncome < 20000)
		{
			if (isMarried == true){
				taxLiability = 0.08 * annIncome;
			}
			else {
				taxLiability = 0.1 * annIncome;
			}		
		}
		
		if (annIncome >= 20001 && annIncome<= 50000)
		{
			if (isMarried == true)
			{
			taxLiability = 0.12 * annIncome;
			}
			else
			{
			taxLiability = 0.15 * annIncome;	
			}
		}
		
		if (annIncome >= 50001 && annIncome<= 70000)
		{
			if (isMarried == true)
			{
			taxLiability = 0.18 * annIncome;
			}
			else
			{
			taxLiability = 0.21 * annIncome;	
			}
		}
		
		if (annIncome >= 70001)
		{
			if (isMarried == true)
			{
			taxLiability = 0.25 * annIncome;
			}
			else
			{
			taxLiability = 0.28 * annIncome;	
			}
		}
		return taxLiability;
	}

}
		
	
