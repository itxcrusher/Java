package Procedural;

// ! Procedural Programming in Java

public class Procedural {
    public static void main(String[] args) throws Exception {
        System.out.println();
		executeFiles();
	}

    public static void executeFiles(){
        // * String
        Strings.operations();
        // * Conditionals
        Conditionals.isTrue(10);
        // * Loops
        Loops.iterate(5);
        // * Array
        Array.operations();
    }
}