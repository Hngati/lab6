import java.util.Random;
import java.util.Scanner;

public class HighorLowtask5 extends Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10) + 1; // generate random number from 1-10
        int userGuess;

        do {
            System.out.print("Guess the number between 1 and 10: "); // ask user to guess number
            while (!in.hasNextInt()) {
                System.out.println("Try again. Please enter a number between 1 and 10.");
                in.nextLine(); // Clear the input
            }
            userGuess = in.nextInt();

            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
            } else if (userGuess < val) {
                System.out.println("low! Try again.");
            } else if (userGuess > val) {
                System.out.println(" high! Try again.");
            } else {
                System.out.println(" You guessed the correct number: " + val);
            }
        } while (userGuess != val);

        in.close(); // close
    }
}

