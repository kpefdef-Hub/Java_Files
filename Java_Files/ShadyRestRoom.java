//Adedapo Adeniyi
//09/18/2022
//Code uses Switch and Case to guide User to select preferred Room type
import java.util.Scanner;
public class ShadyRestRoom {
    public static void main(String[] args) {
        int rooms;

        System.out.println("Select 1 for a Queen Bedroom \n Select 2 for a King Bedroom \n  Select 3 for a King Bedroom and a Pullout couch.");
        //Identifying the inputs
        Scanner scannerinput = new Scanner(System.in);
        System.out.println("Enter option: ");
        rooms = scannerinput.nextInt();

        //Switch and Case to select options
        switch (rooms){
            case 1:
                System.out.println("Option: "+rooms+ " Selected Bedroom ");
                int r1 = 125;
                System.out.println(r1+" for Queen Bedroom");

                break;
            case 2:
                System.out.println("Option: "+rooms+ " Selected Bedroom ");
                int r2 = 139;
                System.out.println(r2+" for King Bedroom");

                break;
            case 3:
                System.out.println("Option: "+rooms+ " Selected Bedroom");
                int r3 = 165;
                System.out.println(r3+" for suite with King Bedroom and a Pullout couch.");

                break;
            default:
                System.out.println("Invalid option selected");
                System.out.println("price 0");
        }

    }
}