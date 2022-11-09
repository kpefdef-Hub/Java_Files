package Week52022;

public class NewCourse {
	//Name Adedapo Adeniyi
	//Date 10/23/2022
	//Course BINS 5312
	
	//Properties
	private String cName;
	private String description;
	private String department;
	private ClassRoom cRoom;
	private double cHours;
	
	//create set methods
	public void setCourseName (String courseName)
	{
		cName = courseName;
	}
	
	public void setDescription (String courseDesc)
	{
		description= courseDesc;
	}
	
	public void setDepartment (String courseDept)
	{
		department = courseDept;
	}
	
	public void setClassRoom (ClassRoom courseRoom)
	{
		cRoom = courseRoom;
	}
	
	public void setCreditHours (int courseCredit)
	{
		cHours = courseCredit;
	}
	
	//Get/Accessor Methods
	public String getCourseName ()
	{
		return cName;
	}
	
	public String getDescription ()
	{
		return description;
	}
	
	public String getDepartment ()
	{
		return department;
	}
	
	public ClassRoom getClassRoom ()
	{
		return cRoom;
	}
	
	public double getCreditHours ()
	{
		return cHours;
	}
	
	
	//Default Constructor for both classes
	public NewCourse()
	{
			
	}
}
