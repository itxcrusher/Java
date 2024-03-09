package Fundamentals;
import java.util.Scanner;   // ? Importing Scanner to take user input

    // ! Taking User Input and Printing Output through the Terminal/Console

public class InputOutput {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);   // ? Using Scanner Package
        System.out.print("Enter your name: ");  // ? Print Does not add a new line in the end
        String name = scanner.nextLine();   // ? Taking user input
		System.out.println("My name is " + name + "!");     // ? Println Adds a new line at the end
        scanner.close();    // ? Releasing memory
	}
}