package Week52022;

public class ClassRoom {
	//Name Adedapo Adeniyi
	//Date 10/23/2022
	//Course BINS 5312
	
	//Data Fields
	private String rmID;
	private String rmLocation;
	private int rmCapacity;
	private boolean isComputer = false;
	
	//Set methods
	
	public void setRoomID(String RoomID)
	{
		rmID = RoomID;
	}
	public void setLocation(String roomLocation)
	{
		rmLocation = roomLocation;
	}
	public void setCapacity (int roomCapacity)
	{
		rmCapacity = roomCapacity;
	}
	public void setisComputer(boolean yesComputer)
	{
		isComputer = yesComputer;
	}
	
	//get methods
	
	public String getRoomID()
	{
		return rmID;
	}
	
	public String getLocation()
	{
		return rmLocation;
	}
	
	public int getCapacity()
	{
		return rmCapacity;
	}
	
	public boolean getisComputer()
	{
		return isComputer;
	}
	
	//Default Constructor for both classes
	public ClassRoom()
	{
		
	}
	
	//Constructor to pass arguments for all properties
	public ClassRoom(String room, String location, int capacity, boolean computer)
	{
		room = rmID;
		location = rmLocation;
		capacity = rmCapacity;
		computer = isComputer;
	}
}
