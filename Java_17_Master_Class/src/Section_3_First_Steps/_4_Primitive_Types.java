package Section_3_First_Steps;

public class _4_Primitive_Types {

    public static void main(String[] args) {

        /*
            * Java's Primitive Types:
                - Primitive types are the most basic data types.
                - The eight primitive data types in Java are:

                    * Whole number:
                        - byte
                        - short
                        - int
                        - long

                    * Real Number (floating point or decimal):
                        - float
                        - double

                    * Single Character:
                        - char

                    * Boolean value:
                        - boolean

                 - The + sign when used in System.out.print will print different data types together as a single line of
                   text.
                 - Whatever follows the plus sign in System.out.print here, is converted to a String by Java, and
                   concatenated to the String before it.


             * Classes:
                - What is a class?
                    - A class is a building block for OOP, and allows us to build custom data types.

             * Wrapper classes:
                - The wrapper class name, for your primitive data type are the same name with the first letter uppercase.
                - Primitive: byte => Wrapper Class: Byte
                - Primitive: short => Wrapper Class: Short

         */

        int myValue = 10000; // an int is a whole number, int has a MAX (2147483647) range and  a MIN (-2147483648) range

        int myMinIntValue = Integer.MIN_VALUE; // minimum value of int data type (-2147483648)

        int myMaxIntValue = Integer.MAX_VALUE; // max value of int data type (2147483647)



        System.out.println("Integer Minimum Value = " + myMinIntValue);

        System.out.println("Integer Max Value = " + myMaxIntValue);

        System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");

        System.out.println("Busted Max Value = " + (myMaxIntValue + 1)); // this outputs a negative integer (called Overflow)

        System.out.println("Busted Min Value = " + (myMinIntValue - 1));// this outputs a positive integer (called underflow)

        /*
            * The maximum value, when it overflows, wraps around to the minimum value, and just continues processing
                without an error.
            * The minimum value, when it underflow's, wraps around to the maximum value, and continues processing.
            * This is not usually behavior you really want, and as a developer, you need to be aware that this can
                happen, and choose the appropriate data type.
         */

        System.out.println("Integer Maximum Value = " + Integer.MAX_VALUE);

        //int myMaxIntTest = 2147483648; // will not compile due to the int being too large.

        int myMaxIntTest = 2147483647; //will compile due to the int being at the max

        // In Java, you cannot put commas in a numeric literal.
        // For example int myMaxIntTest = 2,147,483,647; will not compile

        // So Java provided an alternate way to improve readability, the underscore.
        // For example int myMaxIntTest = 2_147_483_647; will compile.

        // You can put the underscore anywhere you might want a comma, but you can't use an underscore at the start
        // or end of the numeric literal.



    }
}
