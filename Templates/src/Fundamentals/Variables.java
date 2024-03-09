package Fundamentals;

    // ! Using different kinds of variables in Java and their scope

public class Variables {
    //* Instance Variables */
    int instanceVar;  // ? Different for each object
    
    //* Final Variables */
    final int finalVar;  // ? Value of final variable cannot be changed

    //* Static Variables */
    static int staticVar;  // ? Same for all objects

    //* Local Variables */
    public Variables(int parameter){    // ? Parameters are placeholders for values in a method
        int localVar = parameter;  // ? Local variable has scope within a code block
        finalVar = localVar;
    }
}