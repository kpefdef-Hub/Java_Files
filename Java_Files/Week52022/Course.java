package Week52022;

public class Course {
	//Name Adedapo Adeniyi
	//Date 10/23/2022
	//Course BINS 5312
	
	
	//Properties
	private String cNumber;
	private String cName;
	private String cDept;
	
	//setter methods/mutator methods
	public void setNumber (String myCourseNumber)
	{
		cNumber = myCourseNumber;
	}
	
	public void setName (String myCourseName)
	{
		cName = myCourseName;
	}
	
	public void setDept (String myCourseDept)
	{
		cDept = myCourseDept;
	}
	
	//get/accessor methods
	public String getNumber()
	{
		return cNumber;
	}
	
	public String getName()
	{
		return cName;
	}
	
	public String getDept()
	{
		return cDept;
	}
	
	//default contructor for both classes
	public Course()
	{
		
	}
	
	//constructor to pass arguments for all properties
	public Course ( String number, String name, String BINS)
	{
		cNumber = number;
		cName = name;
		cDept = BINS;
	}
	
	
}
