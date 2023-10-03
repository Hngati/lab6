import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                double height, width, diagonal;
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter the height and width  of sides of the rectangle:"); // ask user for length
                height = scanner.nextDouble();
                width = scanner.nextDouble();

                if (height <= 0 || width <= 0) { // sides should  be greater than zero
                    System.out.println("Enter valid input (both sides should be greater than 0).");
                } else {
                    double area = height * width;  // Calculate the area of the rectangle (length x width)
                    System.out.println("Area of the rectangle is: " + area);
                    double perimeter = 2 * (width + height);
                    System.out.println(" The perimeter is :"+ perimeter);

                    diagonal = Math.sqrt(height * height + width * width); // Calculate the length of the diagonal using the Pythagorean
                    System.out.println("The length of the diagonal: " + diagonal);
                }

                scanner.close(); // Close the scanner to release resources
            }
        }


