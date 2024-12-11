package Section_3_First_Steps;

import java.lang.reflect.Array;

public class _10_The_char_and_boolean_Primitive_Data_Types {

    public static void main(String[] args) {

        char myChar = 'D';

        //myChar = 'DD';
            // This will give you an error unclosed character literal since there are too many characters

        // A char is different from a string

        // A char holds one, and only one, character; Literal enclosed in Single Quotes

        // A string can hold multiple characters; Literal enclosed in Double Quotes

        /*
            * Examples as to why you may only want to store a single character in a variable

               - Might be to store the last key pressed by a user in a game.
               - Might be to loop programmatically through the letters in an alphabet.
               - Might be to store an array of some sort

             * A char occupies two bytes of memory, or 16 bits, and thus has a width of 16.
             * The reason it's not just a single byte, is that a char is stored as a 2 byte number, similar to the short
             * This number gets mapped to a single character by java
                - So, when you print a char, you will see the mapped character, and the not representative number.
                - And you can use single quotes and a character literal to assign a value to a char, which is much
                  simpler than looking up the representative number.
             * Unicode:
                - Unicode is an international encoding standard for use with different languages and scripts
                  by which each letter, digit, or symbol is assigned a unique numeric value that applies across
                  different platforms and programs.
         */

        char myUnicode = '\u0044';
        System.out.println(myUnicode);
        //prints the letter D in the console.

        char myDecimalCode = 68;
        System.out.println(myDecimalCode);
        //Prints the character D in the console

        /*
            The char Challenge
                Create three char variables to store the character for the question-mark symbol.
                - mySimpleChar should be assigned the literal question-mark character '?'
                - myUnicodeChar should be assigned the Unicode value for the question-mark
                - myDecimalChar should be assigned the decimal value for the question-mark
                - Print all three variables in one statement, that starts with the label "My values are".

         */

        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDecimalChar = 63;

        System.out.println("My values are" + mySimpleChar + myUnicodeChar + myDecimalChar);
        //Prints My values are??? in the console.


        /*
            Boolean Primitive Type
                - A boolean value allows for Two opposite choices, true or false, yes or no, one or zero.
                - In java terms, we've got a boolean primitive type, and it can be set to two values only, either true
                  or false.
                - The wrapper for boolean is Boolean with a capital B.

         */

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

    }
}
