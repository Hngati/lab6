import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                Scanner in = new Scanner(System.in); //scanner object
                double gallons = 0;
                int efficiency = 0;
                double price = 0;
                boolean done = false;

                do {
                    System.out.print("Enter the number of gallons of gas in the tank: ");
                    if (in.hasNextDouble()) {
                        gallons = in.nextDouble();
                        done = true;
                    } else {
                        System.out.println("Invalid input. Please enter a valid number for gallons.");
                        in.nextLine(); // Clear the newline
                    }
                } while (!done);

                done = false; // Reset

                do {
                    System.out.print("Enter the fuel efficiency in miles per gallon: ");
                    if (in.hasNextInt()) {
                        efficiency = in.nextInt();
                        done = true;
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer for efficiency.");
                        in.nextLine(); // Clear the newline from the buffer
                    }
                } while (!done);

                done = false; // Reset for the next input

                do {
                    System.out.print("Enter the price of gas per gallon: ");
                    if (in.hasNextDouble()) {
                        price = in.nextDouble();
                        done = true;
                    } else {
                        System.out.println("Invalid input. Please enter a valid number for price.");
                        in.nextLine(); // Clear the newline
                    }
                } while (!done);

                if (gallons > 0 && efficiency > 0 && price > 0) {
                    System.out.println("Cost per 100 miles for the given gas price " + price + " is " + (price * 100));
                    System.out.println("The distance (in miles) the car can go with the gas in the tank is " + (int)(efficiency * gallons));
                } else {
                    System.out.println("Invalid input for gallons, efficiency, or price.");
                }

                in.close(); // Close scanner
            }
        }
