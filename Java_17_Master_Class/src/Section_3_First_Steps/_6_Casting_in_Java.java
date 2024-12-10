package Section_3_First_Steps;

public class _6_Casting_in_Java {

    public static void main(String[] args) {

        short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE;

        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;

        /*
               * Rules for declaring multiple variables in one statement
                    - You cannot declare variables with different data types in a single statement.
                    - If you declare multiple variables of the same data type in a single statement, you must specify
                      the data type only once before any variable names.

               * Casting in Java:
                    - Casting means to treate or convert a number, from one type to another. We put the type we want the
                      number to be, in parentheses like this:
                      (byte) (myMinByteValue / 2);

         */

        // *** short firstShort = 1, int firstInteger = 2; ***
        // This will give an error since you must use ';' instead of ','.

        // *** byte firstByte = 1, byte secondByte = 2; ***
        // This will give an error since you must only declare a data type once

        byte myNewByteValue = (-128 / 2);
        System.out.println(myNewByteValue);
        // If your calculation uses literal values, Java can figure out the end result at compile time, and whether it
        // fits into the variable, and won't throw an error if it does.

        int myTotal = (myMinIntValue / 2);
        System.out.println(myTotal);

        //*** byte myNewByteValue = (myMinByteValue / 2);***
        // The Java compiler does not attempt to evaluate the value in a variable, when it's used in a calculation,
        // so it doesn't know if the value fits, and throws an error.
        // Because the default data type for numbers is an int, the variable is treated as an int during calculations.

        // Casting example:

        myNewByteValue = (byte) (myMinByteValue / 3);
        System.out.println(myNewByteValue);
        // Outputs -42 in the console.
        // This ensures that Java resorts to the byte data type with this variable to avoid conversion errors during
        // calculations, otherwise Java will resort to the dualist data type int.

        // *** short myNewShortValue = myMinShortValue / 2; ***
        // This throws an error of lossy conversion from short to int.

        short myNewShortValue = (short) (myMinShortValue / 2);
        // when casting, you must declare the data type again in parentheses with the statement in parentheses as well.


    }
}
