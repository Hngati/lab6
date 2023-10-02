import java.util.Scanner;

import static java.lang.Math.round;

public class MetricConvertertask4 extends Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length in meter: "); // ask user to enter lenght
        double meters = 0;
        boolean done = false;

        do {
            if (scan.hasNextDouble()) {
                meters = scan.nextDouble();
                scan.nextLine(); // Clear the newline from the buffer
                done = true; // Valid input= end the loop
            } else {

                String trash = scan.nextLine();// use for bad input which will read as a String
                System.out.println("You entered: " + trash);
                System.out.println("You have to enter a valid number of meters!");
                System.out.print("Enter length in meters: ");
            }
        } while (!done);

        if (meters <= 0) {
            System.out.println("Enter valid input in meters.");
        } else {

            double metersToMiles = 0.000621371; // Constants to show  conversion
            double metersToFeet = 3.28084;
            double metersToInches = 39.3701;

            double miles = meters * metersToMiles;
            double roundedMiles = round(miles);

            double feet = meters * metersToFeet;
            double roundedFeet = round(feet);

            double inches = meters * metersToInches;
            double roundedInches = round(inches);

            System.out.println(meters + " meters is equal to " + miles + " rounded to " + roundedMiles + " miles.");
            System.out.println(meters + " meters is equal to " + feet + " rounded to " + roundedFeet + " feet.");
            System.out.println(meters + " meters is equal to " + inches + " rounded to " + roundedInches + " inches.");
        }

        scan.close(); // Close the scanner
    }
}

