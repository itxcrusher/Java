package Procedural;
import java.util.Scanner;

    // ! Built-in String Operations in Java

public class Strings {
    public static void operations(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = scan.nextLine();

        System.out.println("Length of String: " + string.length());     // ? Find the number of characters in a String
        System.out.println("In Uppercase: " + string.toUpperCase());    // ? Convert to Uppercase
        System.out.println("In Lowercase: " + string.toLowerCase());    // ? Convert to Lowercase
        System.out.println("Index of 'a': " + string.indexOf("a")); // ? Find a character in string
        System.out.println("Concatination of A and B: " + "A"+"B");     // ? Add two strings

        scan.close();
    }
}