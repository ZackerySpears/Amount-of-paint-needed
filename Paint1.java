package getAmountOfPaintNeeded;
import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        //Added a do while loop to check the wall height
        do {
        	//Added a try catch to make sure the user is typing non-negative numbers and making sure the user is entering a number
        	try {
        		System.out.println("Enter wall height (feet): ");
            	wallHeight = scnr.nextDouble();
        		if(wallHeight > 0) {
        			break;
        		}
        		else {
        			System.out.println("Please enter a non-negative number.");
        		}
        		      	
        	} catch (Exception e) {
        		System.out.println("Please enter a valid number.");
        	}
        }while (true);
      //Added a do while loop to check the  wall width
        do {
        	System.out.println("Enter wall width (feet): ");
        	wallWidth = scnr.nextDouble();
        	//Added a try catch to make sure the user is typing non-negative numbers and making sure the user is entering a number
        	try {
        		if(wallWidth > 0) {
        			break;
        		}
        		else {
        			System.out.println("Please enter a non-negative number.");
        		}
        	} catch (Exception e) {
        		System.out.println("Please enter a valid number.");
        	}
        }while(true);
        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area:  square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
		scnr.close();
    }
}
