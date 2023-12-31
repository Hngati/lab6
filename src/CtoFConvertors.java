import java.util.Scanner;

public class CtoFConvertors extends Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float celsius, fahrenheit;

        System.out.print("Please enter Temperature in Celsius: "); // ask user to enter valid temp in celsius
        while (!scan.hasNextFloat()) {
            System.out.println(" Please enter a valid number.");
            scan.nextLine(); // Clear
        }
        celsius = scan.nextFloat(); // valid input as a float and store it in celsius variable

        if (celsius == 0) {
            System.out.println("Freezing point.");
        } else if (celsius == 100) {
            System.out.println("Boiling points.");
        } else {
            fahrenheit = celsius * 9/5 + 32; // Calculate temp in Fahrenheit
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        }

        scan.close();
    }
}


