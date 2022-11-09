import java.io.*;

import javax.swing.JOptionPane;

public class showLease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Adedapo Adeniyi
		//10/30/2022
		
		//variable
		String input;
		String rName, line;
		int suiteNo, terms;
		double rent;
		boolean isDogOwner;
		
		//collect information from user
		rName = JOptionPane.showInputDialog(null, "Enter your Name", "Lease Info", 3);
		
		input = JOptionPane.showInputDialog(null, "Enter your Apartment Number", "Lease Info", 3);
		suiteNo = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null, "Enter your Rent amount", "Lease Info", 3);
		rent = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog(null, "Enter your Lease period in months", "Lease Info", 3);
		terms = Integer.parseInt(input);
		
		int response = JOptionPane.showConfirmDialog(null, "Are you a Pet owner?", "Lease info",
					   JOptionPane.YES_NO_CANCEL_OPTION);
		if (response == 0)
		{
			isDogOwner = true;
		}
		else
		{
			isDogOwner = false;
		}
		
		//Create Lease Object
		Lease yourLease = new Lease();
		yourLease.setAptNo(suiteNo);
		yourLease.setisPetOwner(isDogOwner);
		yourLease.setName(rName);
		yourLease.setRent(rent);
		yourLease.setTerms(terms);
		yourLease.addPetFee();
		
		
		String msg ="";
		
		if (isDogOwner == true)
		{
			try
			{
			FileReader fr = new FileReader("petPolicy.txt");
			BufferedReader br = new BufferedReader (fr);
			
			while((line = br.readLine()) != null)
			{
				msg = msg + line + "\n";
			}
			
			br.close();
				
			}
			catch (IOException e)
			{
				
			}
				
			//Display lease object fields using get methods
			System.out.println("Renter Name:" + yourLease.getName());
			System.out.println("Apartment Number:" + yourLease.getAptNo());
			System.out.println("Rent Amount:" + "$" + String.format("%,.2f", yourLease.getRent()));
			System.out.println("Lease Terms:" + yourLease.getTerms());
			System.out.println("Pet Owner:" + yourLease.getisPetOwner());
			System.out.println("*************************************");
			System.out.println(msg);
			
		}
			
		else 
		{
			System.out.println("Renter Name:" + yourLease.getName());
			System.out.println("Apartment Number:" + yourLease.getAptNo());
			System.out.println("Rent Amount:" + "$" + String.format("%,.2f", yourLease.getRent()));
			System.out.println("Lease Terms:" + yourLease.getTerms());
			System.out.println("Pet Owner:" + yourLease.getisPetOwner());
			System.out.println("*************************************");
			System.out.println("You dont own a pet, No pet fee");
		}

}
}