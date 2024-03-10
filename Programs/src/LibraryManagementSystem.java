import java.util.Scanner;

public class LibraryManagementSystem {
    // Constants
    static final int MAX_BOOKS = 100;

    // Variables
    static String[] books = new String[MAX_BOOKS];
    static boolean[] availability = new boolean[MAX_BOOKS];
    static int numBooks = 0;

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a book");
            System.out.println("2. Search for a book");
            System.out.println("3. Remove a book");
            System.out.println("4. Check out a book");
            System.out.println("5. Return a book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    searchBook(scanner);
                    break;
                case 3:
                    removeBook(scanner);
                    break;
                case 4:
                    checkoutBook(scanner);
                    break;
                case 5:
                    returnBook(scanner);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Method to add a book
    public static void addBook(Scanner scanner) {
        if (numBooks >= MAX_BOOKS) {
            System.out.println("Cannot add more books. Library is full.");
            return;
        }
        System.out.print("Enter the title of the book: ");
        String title = scanner.next();
        books[numBooks] = title;
        availability[numBooks] = true;
        numBooks++;
        System.out.println("Book added successfully.");
    }

    // Method to search for a book
    public static void searchBook(Scanner scanner) {
        System.out.print("Enter the title of the book to search: ");
        String title = scanner.next();
        boolean found = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].equalsIgnoreCase(title)) {
                System.out.println("Book found! Availability: " + (availability[i] ? "Available" : "Not Available"));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in the library.");
        }
    }

    // Method to remove a book
    public static void removeBook(Scanner scanner) {
        System.out.print("Enter the title of the book to remove: ");
        String title = scanner.next();
        boolean found = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].equalsIgnoreCase(title)) {
                for (int j = i; j < numBooks - 1; j++) {
                    books[j] = books[j + 1];
                    availability[j] = availability[j + 1];
                }
                numBooks--;
                found = true;
                System.out.println("Book removed successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in the library.");
        }
    }

    // Method to check out a book
    public static void checkoutBook(Scanner scanner) {
        System.out.print("Enter the title of the book to check out: ");
        String title = scanner.next();
        boolean found = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].equalsIgnoreCase(title)) {
                if (availability[i]) {
                    availability[i] = false;
                    System.out.println("Book checked out successfully.");
                } else {
                    System.out.println("Book is already checked out.");
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in the library.");
        }
    }

    // Method to return a book
    public static void returnBook(Scanner scanner) {
        System.out.print("Enter the title of the book to return: ");
        String title = scanner.next();
        boolean found = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].equalsIgnoreCase(title)) {
                if (!availability[i]) {
                    availability[i] = true;
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book is already available in the library.");
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in the library.");
        }
    }
}