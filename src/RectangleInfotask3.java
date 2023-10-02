import java.util.Scanner;

public class RectangleInfotask3 extends Main{

        public static void main(String[] args) {
            double length, width, diagonal;
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the lengths of the sides of the rectangle
            System.out.println("Enter the lengths of sides of the rectangle:");
            length = scanner.nextDouble();
            width = scanner.nextDouble();

            // Check for valid inputs (both sides should be greater than 0)
            if (length <= 0 || width <= 0) {
                System.out.println("Enter valid input (both sides should be greater than 0).");
            } else {
                // Calculate the area of the rectangle (length x width)
                double area = length * width;
                System.out.println("Area of the rectangle is: " + area);

                // Calculate the length of the diagonal using the Pythagorean theorem
                diagonal = Math.sqrt(length * length + width * width);
                System.out.println("The length of the diagonal: " + diagonal);
            }

            // Close the scanner to release resources
            scanner.close();
        }
    }

