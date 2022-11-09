package Week52022;

import java.io.*;

import javax.swing.JOptionPane;

public class showCustomer {
	//Adedapo Adeniyi
	//10/30/2022

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Declare Variables
		 String mail, digits, first, last, fileEmail, line, fileMsg;
		 
		 //Create new customer object
		 Customer client = new Customer();
		 int startIndex = 0;
		 
		 //prompt user if customer is existing
		 int response = JOptionPane.showConfirmDialog(null, "Are you a new customer?", "Customer Info",
				 		JOptionPane.YES_NO_CANCEL_OPTION);
		 
		 if (response == 0)
		 {
			 
			 mail = JOptionPane.showInputDialog(null, "Enter email address", "Customer Info", 3);
			 digits = JOptionPane.showInputDialog(null, "Enter phone number", "Customer Info", 3); 
			 first = JOptionPane.showInputDialog(null, "Enter first name", "Customer Info", 3);
			 last = JOptionPane.showInputDialog(null, "Enter last name", "Customer Info", 3);
			 fileMsg = mail+ ", "+ digits +", " + first +" ," + last + "\n";
			 
			 client.setEmail(mail);
			 client.setPhone(digits);
			 client.setFName(first);
			 client.setLName(last);
			 
			 //print information on class using Get methods
			 
			 System.out.println("Customer Name:          " + client.getFName()+ " " +client.getLName());
			 System.out.println("Customer Email:         " + client.getEmail());
			 System.out.println("Customer Phone Number:  " + client.getPhone());
			 
			 
			 try
			 {
				 String fileName = "newCustomerInfo.txt";
				 FileWriter fw = new FileWriter (fileName);
				 fw.write(fileMsg);
				 fw.close();
				 
			 }
			 
			 catch (IOException e)
			 {
				 
			 }
			 
		 }
		 
		 else
		 {
			 mail = JOptionPane.showInputDialog(null, "Enter email address", "Customer Info", 3);
			 
			 //use email to search the customerInfo.txt file
			 try
				{
				FileReader fr = new FileReader("CustomerInfo.txt");
				BufferedReader br = new BufferedReader (fr);
				
				while((line = br.readLine()) != null)
				{
					
					startIndex=0;
					
					fileEmail = line.substring(startIndex, line.indexOf(","));
					
					
					//compare to email address entered by user
					if(mail.equalsIgnoreCase(fileEmail))
					{
						startIndex = line.indexOf(",") + 1;
						digits = line.substring(startIndex, line.indexOf(",",startIndex));
						startIndex = line.indexOf(",", startIndex) + 1;
						first = line.substring(startIndex ,line.indexOf(",", startIndex));
						startIndex = line.indexOf(",", startIndex) + 1;
						last = line.substring(startIndex ,line.length());
						
						
						client.setEmail(mail);
						client.setPhone(digits);
						client.setFName(first);
						client.setLName(last);
						
						System.out.println("Customer Name:          " + client.getFName()+ " " + client.getLName());
						System.out.println("Customer Email:         " + client.getEmail());
						System.out.println("Customer Phone Number:  " + client.getPhone());
					}
					
					
				}
				
				br.close();
					
				}
				catch (IOException e)
				{
					
				}
			 
		 }
		 
		 
		

	}

}
