package Week52022;

import java.time.*;

public class TestMatchTracker {
		//Name Adedapo Adeniyi
		//Date 10/23/2022
		//Course BINS 5312

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set Variables
		String tmatchID = "TL023";
		String tmatchType = "Doubles";
		LocalDate localdate = LocalDate.now();
		LocalDate tmatchDate = localdate.minusDays(1);
		String tmatchlocation = "Little Rock Athletic Club";
		int tmatchMin = 157;
		double tmatchDis = 3.5;
		
		//create instance calling from 'TennisMatch' class and 'MatchTracker' class
		MatchTracker gameTracker  = new MatchTracker();
		TennisMatch tennisGame = new TennisMatch(tmatchlocation,tmatchDate,tmatchType,tmatchID);
		
		gameTracker.setDistance(tmatchDis);
		gameTracker.setMatch(tennisGame);
		gameTracker.setMinutes(tmatchMin);
		tennisGame.setDate(tmatchDate);
		tennisGame.setLocation(tmatchlocation);
		tennisGame.setMatchID(tmatchID);
		tennisGame.setMatchType(tmatchType);
		
		//Display Tennis Match Details
		
		System.out.println("Tennis Match ID:     	 " + tennisGame.getMatchID() );  
		System.out.println("Type of Match:        	 " + tennisGame.getMatchType());
		System.out.println("Duration in Minutes      " + gameTracker.getMinutes() );
		System.out.println("Distance Covered in KM   " + gameTracker.getDistance());			   
						   
						
		
		
	}

}
