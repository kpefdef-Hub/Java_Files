package Week52022;

public class showStudent {
		//Name Adedapo Adeniyi
		//Date 10/23/2022
		//Course BINS 5312
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set variables
		
		String name = "Jessica Stone";
		String courseNum = "BINS4312";
		String courseName = "OOP";
		double GPA = 3.25;
		String studentTNum = "T1277546";
		String department = "Business Information Systems";
		
		//create instance calling from student and course (pass arguments)
		Student oopStudent = new Student();
		Course fallCourse = new Course (courseNum,courseName, department);
		
		oopStudent.setStudentName(name);
		oopStudent.setCourse(fallCourse);
		oopStudent.setGPA(GPA);
		oopStudent.setTNumber(studentTNum);
		
		//Print student information
		
		System.out.println("Student Name     " + oopStudent.getStudentName() + "\n" +
						   "Student TNumber  " + oopStudent.getTNumber() +"\n" +
						   "Student GPA      " + oopStudent.getGPA() + "\n" +
						   "Student Course   " + oopStudent.getStudentCourse().getNumber()+ "\n"+
						   "Course Name      " + oopStudent.getStudentCourse().getName() + "\n" +
						   "Department       " + oopStudent.getStudentCourse().getDept());
		
		

	}

}
