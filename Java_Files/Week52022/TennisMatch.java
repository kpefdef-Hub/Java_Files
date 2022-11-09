package Week52022;

import java.time.*;

public class TennisMatch {
	//Name Adedapo Adeniyi
	//Date 10/23/2022
	//Course BINS 5312
	
	//Properties of Tennis Match
	private String tLocation;
	private LocalDate tDate;
	private String matchType;
	private String matchID;
	
	//Creating the set/mutator methods
	public void setLocation (String tennisLoc)
	{
		tLocation = tennisLoc;
	}

	public void setDate (LocalDate tennisDate)
	{
		tDate = tennisDate;
	}
	
	public void setMatchType (String tennisMatch)
	{
		matchType = tennisMatch;
	}
	
	public void setMatchID (String tennisID)
	{
		matchID = tennisID;
	}
	
	//Creating the get/accessor methods
	
	public String getLocation()
	{
		return tLocation;
	}
	
	public LocalDate getDate()
	{
		return tDate;
	}
	
	public String getMatchType()
	{
		return matchType;
	}
	
	public String getMatchID()
	{
		return matchID;
	}
	
	//constructor to pass arguments for all properties
	public TennisMatch ( String location, LocalDate date, String type, String id)
	{
		tLocation = location;
		tDate = date;
		matchType = type;
		matchID = id;
	}
}
