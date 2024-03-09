package Fundamentals;   // ? Package is used to organize our code

    // ! Every line of code that runs in Java must be inside a class

public class Fundamentals {   // ? Class name should be same as file name
    public static void main(String[] args) throws Exception {   // ? Main method is the starting point of an app
        System.out.println();
		executeFiles();   // ? We can organize our code into multiple files but it will be executed inside one main method
	}

    public static void executeFiles(){     // ? This method is bringing the code from other files
        // * Input/Output
        InputOutput.greeting();

        // * Variables
        Variables.staticVar = 99;   // ? Static Variable is used through class
        Variables var = new Variables(Variables.staticVar);
        System.out.println("The final value is " + var.finalVar);    // ? Instance variable is used through object
    }
}