package Section_3_First_Steps;

public class _7_Primitive_Types_Challenge {

    /*
       * Your challenge is to create four new variables:

            - A byte variable, set it to any valid byte number, it doesn't matter.

            - A short variable, set it to any valid short number.

            - An int variable, set it to any valid integer number.

            - Lastly, create a variable of type long. Make it equal to 50,000 plus 10 times the sum of the values of the
              first 3 variables (your byte, your short and your int values). In other words, use the variable names in
              your expression to calculate the sum.
     */

    public static void main(String[] args) {

        byte myByte = (byte) (127);
        short myShort = (short) (1256);
        int myInt = 1357;

        long myLong = (50000L + 10L * (myByte + myShort + myInt));
        System.out.println(myLong);
        // outputs 77400 in the console.

        short myShort2 = (short) (50000L + 10L * (myByte + myShort + myInt));
        System.out.println(myShort2);
        // Outputs 11864 in the console.
        // This is a perfect example of an integer overflow. Since the value is supposed to be 77,400, the integer
        // overflowed, reverting to -32,768 and continuing on until the value became 11,864
        // For instance: 77,400 - 32,768 = 44,632 (overflowed again) 44,632 - 32,768 = 11,864 (final result).

    }
}
