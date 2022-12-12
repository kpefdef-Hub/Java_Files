import java.util.Arrays;
import java.util.Random;

public class FiveDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Adedapo Adeniyi
		// 11/13/2022

		// declaring the variables
		int[] computer = new int[5];
		int[] player = new int[5];
		Random rn = new Random();
		int compNum = 0;
		int playerNum = 0;

		System.out.print("Computer Rolled = "); // printing the results of the loop
		for (int i = 0; i < computer.length; i++) { // looping through die array
			computer[i] = rn.nextInt(6) + 1; // randomizing the results
			System.out.print(computer[i] + " ");
		}

		Arrays.sort(computer); // sorting the results
		System.out.print(" \n");

		
		System.out.print("Player Rolled = "); //repeating the above for Player
		for (int i = 0; i < player.length; i++) {
			player[i] = rn.nextInt(6) + 1;
			System.out.print(player[i] + " ");
		}
		Arrays.sort(player);
		System.out.print(" \n");
	
		int currComputerSequence = 1;
		int currPlayerSequence = 1;

		int currComputer = computer[0];
		int currPlayer = player[0];
		

		for (int i = 1; i < player.length; i++) {
			if (computer[i] == currComputer) { //comparing the results of the die roll with the array
				currComputerSequence++;		//incrementing the sequence if result exists in the array
			} else {  //if not sequence remains the same
				currComputerSequence = 1;
				currComputer = computer[i];
			}
			compNum = Math.max(currComputerSequence, compNum); //CompNum is the larger of the 2 values
			
			if (player[i] == currPlayer) { //repeating the above for Player
				currPlayerSequence++;	
			} else {	
				currPlayerSequence = 1;
				currPlayer = player[i];
			}
			playerNum = Math.max(currPlayerSequence, playerNum); 

			
		}
		
		System.out.println("Computer has " + compNum + " of a kind"); //displaying the number of combinations rolled
		System.out.println("Player has " + playerNum + " of a kind");
		
		if (playerNum > compNum) { //display if player combinations > computer combinations
			System.out.println("Player Wins ");
		}

		else if (compNum > playerNum) {//display if computer combinations >  player combinations
			System.out.println("Computer Wins ");
		}

		else {//display if player combinations = computer combinations
			System.out.print("It's a tie ");
		}
	}

}
