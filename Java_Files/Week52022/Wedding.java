package Week52022;

import java.time.*;


public class Wedding {
	//Name Adedapo Adeniyi
	//Date 10/23/2022
	//Course BINS 5312
		
	//Properties
	private LocalDate wedDate;
	private Couple couple;
	private String wedLoc;
	
	//Set/Mutator methods
	public void setWeddingDate (LocalDate wedDay)
	{
		wedDate = wedDay;
	}

	public void setWeddingCouple (Couple wedCouple)
	{
		couple = wedCouple;
	}
	
	public void setWeddingLocation (String wedLocation)
	{
		wedLoc = wedLocation;
	}
	
	//Get/Accessor Methods
	
	public LocalDate getWeddingDate ()
	{
		return wedDate;
	}
	
	public Couple getWeddingCouple ()
	{
		return couple;
	}
	
	public String getWeddingLocation ()
	{
		return wedLoc;
	}
	
	//Constructor to accept parameters for each class
		public Wedding(LocalDate weddingdate, Couple weddingcouple, String weddinglocation)
		{
			wedDate = weddingdate;
			couple = weddingcouple;
			wedLoc = weddinglocation;
		}
}
