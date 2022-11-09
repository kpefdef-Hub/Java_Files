package Week52022;

public class Student {
	
	//Name Adedapo Adeniyi
	//Date 10/23/2022
	//Course BINS 5312
	
	//properties
	private String sName;
	private String TNumber;
	private double GPA;
	private Course studentCourse;
	
	//get/accessor methods
	
	public String getStudentName()
	{
		return sName;
	}
	
	public String getTNumber()
	{
		return TNumber;
	}
	
	public double getGPA()
	{
		return GPA;
	}
	
	public Course getStudentCourse()
	{
		return studentCourse;
	}

	
	//set/mutator accessor methods
	
	public void setStudentName(String myName) 
	{
		sName = myName;
	}
	
	public void setTNumber(String myTNumber) 
	{
		TNumber = myTNumber;
	}
	
	public void setGPA(double myGPA) 
	{
	GPA = myGPA;
	}
	
	public void setCourse(Course myCourse) 
	{
		studentCourse = myCourse;
	}
	
	//default contructor for both classes
	
	public Student()
	{
		
	}
}
