package Section_3_First_Steps;


import java.sql.SQLOutput;

public class _5_byte_short_long_and_width {

    public static void main(String[] args) {
          /*
           * Whole Number Primitive Data Types:
            - byte: Has the smallest range
            - short
            - int: Java's default data type for whole numbers
            - long: Has the largest range
           * Size, or Width, is the amount of space that determines (or limits) the range of values of data types.
     */
        int myMinIntValue = Integer.MIN_VALUE; // minimum value of int data type (-2147483648)

        int myMaxIntValue = Integer.MAX_VALUE; // max value of int data type (2147483647)

        System.out.println("Byte Value Range (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
        // Byte Value Range (-128 to 127)
        // Shows the max range of byte data types as well as min [max: 127; min: -128]
        // Reason as to why you may want to use byte data type is if you have a ton of numbers within the range,
        // and you want to save space. byte data type takes up less space and maybe quicker to access.
        // Width (in bits) 8 bits

        System.out.println("Short Value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
        // Short Value Range (-32768 to 32767)
        // The range of a short data type is -32768 to 32767.
        // Width (in bits) 16 bits


        long myLongValue = 100L;

        //  Java allows certain numeric literals to have a suffix appended to the value, to force it to be a different
        //data type from the default type.
        //  The long is one of these types, and it's suffix is an 'L'.
        //  This is one of the few instances Java is not case-sensitive, a lowercase 'l' or an uppercase 'L' at the end
        //of a whole number mean the same thing - the number is a long.
        //   A long has a width of 64 bits.

        System.out.println("A long has a width of " + Long.SIZE);
        // A long has a width of 64

        System.out.println("Long Value Range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
        //Long Value Range (-9223372036854775808 to 9223372036854775807)

        // long bigLongLiteralValue = 2147483648; - won't compile because the number is too large, even though it has a
        //                                    long data type, you must append an "L" at the end for it to be recognized



    }

    


}
