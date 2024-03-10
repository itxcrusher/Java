import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) throws Exception {
        System.out.println();
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        // Calculate sum using a for loop
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        // Print the factorial
        System.out.println("Sum of first " + n + " natural numbers: " + sum);

        // Close the scanner
        scanner.close();
    }
}