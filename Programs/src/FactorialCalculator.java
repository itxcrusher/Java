import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) throws Exception {
        System.out.println();
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        
        // Validate that the number is non-negative
        if (number < 0) {
            System.out.println("Error: Factorial is undefined for negative numbers.");
            scanner.close();    // Close the scanner
            return;     // Exit the program
        }
        
        // Initialize factorial to 1
        int factorial = 1;
        
        // Calculate factorial using a for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by current number
        }
        
        // Print the factorial
        System.out.println("Factorial of " + number + " is: " + factorial);
        
        // Close the scanner
        scanner.close();
    }
}