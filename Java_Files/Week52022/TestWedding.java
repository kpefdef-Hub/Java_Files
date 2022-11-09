package Week52022;

import java.time.*;

public class TestWedding {
	//Name Adedapo Adeniyi
	//Date 10/23/2022
	//Course BINS 5312
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set Variables
		String wLocation = "Little Rock Convention Center";
		LocalDate wDate = LocalDate.of(2022, 11, 25);
		
		
		
		
		
		//create instance calling from 'Person' class, 'Couple' class and 'Wedding' class
		Person person1 = new Person("John","Smith",LocalDate.of(1980, 12, 15));
		Person person2 = new Person("Melinda","Jackson",LocalDate.of(1982, 06, 05));
		Couple marryingCouple = new Couple (person1, person2);
		Wedding wedding = new Wedding(wDate, marryingCouple, wLocation);
		
		//names of couple
		String wedPerson1Name = wedding.getWeddingCouple().getPerson1().getFirstName() + " "+
								wedding.getWeddingCouple().getPerson1().getLastName();
		String wedPerson2Name = wedding.getWeddingCouple().getPerson2().getFirstName() + " "+
								wedding.getWeddingCouple().getPerson2().getLastName();
		String wedCoupleName = wedPerson1Name + " &  "+ wedPerson2Name;
		
		//ages of couple
		int wedPerson1Age = LocalDate.now().compareTo(wedding.getWeddingCouple().getPerson1().getBirthDate() );
		int wedPerson2Age = LocalDate.now().compareTo(wedding.getWeddingCouple().getPerson2().getBirthDate() );
		String wedCoupleAge = wedPerson1Age + " &  "+ wedPerson2Age;
		
		//location of wedding
		
		String weddingLocation = wedding.getWeddingLocation();
		
		//date of wedding
		LocalDate weddingDate = wedding.getWeddingDate();
		
		System.out.println("Names of the Couple     " + wedCoupleName);
		System.out.println("Age of the Couple       " + wedCoupleAge);
		System.out.println("Location of the Wedding " + weddingLocation);
		System.out.println("Date of the Wedding     " + weddingDate);

	}

}
