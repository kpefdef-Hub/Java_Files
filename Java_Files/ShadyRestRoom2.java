//Adedapo Adeniyi
//09/18/2022
//Code uses Switch and Case to guide User to select preferred Room type and includes options to select room view

import java.util.Scanner;
public class ShadyRestRoom2 {
    public static void main(String[] args) {
    	//Identifying the inputs
        int rooms;
        int views;

        System.out.println("Select 1 for a Queen Bedroom \n Select 2 for a King Bedroom \n  Select 3 for a King Bedroom and a Pullout couch.");
        System.out.println("Select(1) for a Lake view or  (2) For a Park view");

        Scanner scannerinput= new Scanner(System.in);
        System.out.println("Enter option: ");
        rooms = scannerinput.nextInt();
        System.out.println("Enter 1 or 2");
        views = scannerinput.nextInt();
      //Switch and Case to select options
        switch (rooms){
            case 1:
                System.out.println("Option: "+rooms+ " Selected Bedroom ");
                int r1 = 125+15;
                System.out.println(r1+" for Queen Bedroom");
                System.out.println(views+ " selected an invalid option");
                break;
            case 2:
                System.out.println("Option: "+rooms+ " Selected Bedroom ");
                int r2 = 139+15;
                System.out.println(r2+" for King Bedroom");
                System.out.println(views+ " selected an invalid option");
                break;
            case 3:
                System.out.println("Option: "+rooms+ " Selected Bedroom");
                int r3 = 165+15;
                System.out.println(r3+" for suite with King Bedroom and a Pullout couch.");
                System.out.println(views+ " selected an invalid option");
                break;
            default:
                System.out.println("Invalid option selected");
                System.out.println("price 0");
        }

    }
}