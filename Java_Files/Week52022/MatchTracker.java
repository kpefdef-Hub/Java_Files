package Week52022;

public class MatchTracker {
	//Name Adedapo Adeniyi
	//Date 10/23/2022
	//Course BINS 5312
	
	//Match properties
	private TennisMatch tMatch;
	private int matchMin;
	private double matchDis;
	
	//Set/Mutator Methods
	public void setMatch (TennisMatch tenMatch)
	{
		tMatch = tenMatch;
	}
	
	public void setMinutes (int tenMinutes)
	{
		matchMin = tenMinutes;
	}
	
	public void setDistance (double tmatchDis)
	{
		matchDis = tmatchDis;
	}
	
	//get/accessor methods
	
	public TennisMatch getMatch()
	{
		return tMatch;
	}
	
	public int getMinutes()
	{
		return matchMin;
	}
	
	public double getDistance()
	{
		return matchDis;
	}
	
	//Create default constructor
	public MatchTracker()
	{
		
	}

	
	

}
