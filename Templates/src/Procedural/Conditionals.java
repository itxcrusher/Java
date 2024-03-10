package Procedural;

// ! Conditional Statements are used to Control the flow of execution

public class Conditionals {
    public static void isTrue(int x){
        System.out.println();
        // * If Statement
        if (x > 5) {
            System.out.println("x is greater than 5");  // ? Runs Block only when true otherwise skip
        }
        // * If Else Statement
        if (x > 5) {
            System.out.println("x is greater than 5");      // ? Runs Block when true
        } else {
            System.out.println("x is not greater than 5");  // ? Runs Block when false
        }
        // * If Else If Statement
        if (x > 15) {
            System.out.println("x is greater than 15");     // ? Runs Block when condition 1 is true
        } else if (x > 10) {
            System.out.println("x is greater than 10");     // ? Runs Block when condition 2 is true
        } else {
            System.out.println("x is not greater than 10"); // ? Runs Block when all conditions are false
        }
        // * Nested If Statement
        if (x > 5) {
            if (x < 15) {
                System.out.println("x is between 5 and 15");    // ? Runs Block only when both conditions are true
            }
        }
        // * Ternary Operator
        String result = (x > 5) ? "x is greater than 5" : "x is not greater than 5";    // ? Single line if else statement
        System.out.println(result);

        // * Switch Statement
        int day = 2;
        String dayName;

        switch (day) {                  // ? Evaluates the statement
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";    // ? Runs only the code block whose case matches
                break;
            case 3:
                dayName = "Wednesday";
                break;
            // additional cases...
            default:
                dayName = "Invalid day";    // ? Runs default block when no above case is matched
        }

        System.out.println("Today is " + dayName);
    }
}