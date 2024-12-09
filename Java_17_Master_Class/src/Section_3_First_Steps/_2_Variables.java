package Section_3_First_Steps;

public class _2_Variables {
    public static void main(String[] args) {
        /*
            * Keywords:
                - Any one of a number of reserved words, that have a predefined meaning in the Java language
                - All code is case-sensitive in Java => Int /= int

            * Variables:
                - Variables are a way to store information in our computer
                - Can be accessed by a name we give them, and the computer does the hard work, of figuring out where
                  they get stored, in the computer's random access memory, or RAM.
                - There are lots of different types of data that we can define for our variables
                - OOP will allow you to essentially make up your own data types for these variables
                - Data types that are built into Java are called "primitive data types"
                - To define a variable we must define our variable with a data type.
                - Type is a shortcut for saying Data Type.
                - Just need to call the variable name without double quotes to get the data from the variable.

         */

        int myFirstNumber = 5; //This is called the declaration statement, since you are declaring a variable.

        System.out.println(myFirstNumber); //Prints 5 in the console.

        myFirstNumber = 10; // because "myFirstNumber" was previously declared, we do not have to redeclare it with int
                            // and we just changed the value of the variable

        System.out.println(myFirstNumber); //prints 10

        myFirstNumber = 1000;
        System.out.println(myFirstNumber);

        myFirstNumber = 10 + 5; // Changed the value of the variable to an expression

        System.out.println(myFirstNumber); // prints 15 in the console

        myFirstNumber = (10 + 5) + (2 * 10); // changed the variable to a mathematical expression

        System.out.println(myFirstNumber); // prints 35 in the console
    }
}
