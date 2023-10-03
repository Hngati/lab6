import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double gallons, price;
        int efficiency;

        while (true) {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                if (gallons >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a non-negative number for gallons.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for gallons.");
                in.next(); // Clear the invalid input
            }
        }

        while (true) {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextInt()) {
                efficiency = in.nextInt();
                if (efficiency > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a positive integer for efficiency.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer for efficiency.");
                in.next(); // Clear the invalid input
            }
        }

        while (true) {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                if (price >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a non-negative number for price.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for price.");
                in.next(); // Clear the invalid input
            }
        }

        double costPer100Miles = price * 100;
        double distance = efficiency * gallons;

        System.out.println("Cost per 100 miles for the given gas price " + price + " is " + costPer100Miles);
        System.out.println("The distance (in miles) the car can go with the gas in the tank is " + distance);

        in.close(); // Close scanner
    }
}
