package Week52022;

public class TestCourse {
		//Name Adedapo Adeniyi
		//Date 10/23/2022
		//Course BINS 5312
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set variables
		String courseName =  "BINS4312/5312" ;
		String courseDescr = "Object Oriented Programming";
		String courseDepart = "BINS";
		int courseCredit = 3;
		
		String roomID = "RBUS 108";
		String roomLoc = "College of Business";
		int roomCap = 35;
		boolean isComp = true;
		
		//create instance calling from 'ClassRoom' class and 'NewCourse' class
		NewCourse businessCourse = new NewCourse();
		ClassRoom businessRoom = new ClassRoom(roomID, roomLoc, roomCap, isComp);
		
		businessCourse.setClassRoom(businessRoom);
		businessCourse.setCourseName(courseName);
		businessCourse.setDepartment(courseDepart);
		businessCourse.setDescription(courseDescr);
		businessCourse.setCreditHours(courseCredit);
		businessRoom.setLocation(roomLoc);
		businessRoom.setRoomID(roomID);
		businessRoom.setCapacity(roomCap);
		businessRoom.setisComputer(isComp);
		
		//Display Course Details  
		System.out.println("Name of Course            " + businessCourse.getCourseName() + "\n" +
						   "Department Name           " + businessCourse.getDepartment() + "\n" +
						   "Course Descripription     " + businessCourse.getDescription() + "\n" +
						   "Credit Hours              " + businessCourse.getCreditHours() + "\n" +
						   "Class Room                " + businessRoom.getRoomID() + "\n" +
						   "                                                       " + "\n" +
						   businessRoom.getRoomID() + "   Information      " + "\n"+
						   "Location of RBUS108       " + businessRoom.getLocation() + "\n" +
						   "Capacity of RBUS108       " + businessRoom.getCapacity() + "\n" +
						   "Zoom and Computers        " + businessRoom.getisComputer());
	}

}
