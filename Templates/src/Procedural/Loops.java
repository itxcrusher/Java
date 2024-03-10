package Procedural;

// ! Different types of Loops in Java

public class Loops {
    public static void iterate(int x){
        System.out.println();
        // * While Loop
        int i = 0;
        while(i < x){       // ? Runs the code block until the condition is false
            System.out.println(x);
            i++;
        }
        System.out.println();
        // * Do While Loop
        i = 0;
        do{                 // ? same as while loop but runs the code block at least once
            System.out.println(x);
            i++;
        }while(i < x);
        System.out.println();
        // * For Loop
        for(i=0; i<x; i++){       // ? Runs the code block a fixed times
            System.out.println(x);
            i++;
        }
    }
}