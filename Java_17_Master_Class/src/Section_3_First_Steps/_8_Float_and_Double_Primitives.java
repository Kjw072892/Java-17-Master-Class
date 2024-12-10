package Section_3_First_Steps;

public class _8_Float_and_Double_Primitives {

    public static void main(String[] args) {

        /*
                *Unlike whole numbers, floating-point numbers have fractional parts that we express with a decimal point.

                *Whole number example:
                    - 100000
                    - 3
                    - -2147483649L

                * Floating Point examples (Real Numbers):
                    - 3.14159
                    - 10.0
                    - -0.666666666666666666666667

                * Java's Data Types for Floating Point Numbers:
                    - float
                        - Width (in bits): 32; Min Value: 1.4E-45; Max Value: 3.4028235E38

                    - double (Java's default type for any decimal or real number)
                        - Width (in bits): 64; Min Value: 4.9E-324; Max Value: 1.7976931348623157E308
                        - double is Javas default real number data type, and its more precise than float.
         */

        System.out.println("Float Value Range( " + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
        // Outputs "Float Value Range( 1.4E-45 to 3.4028235E38)" in the console.

        System.out.println("Double Value Range( " + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
        // Outputs "Double Value Range( 4.9E-324 to 1.7976931348623157E308)" in the console.

        int myIntValue = 5; float myFloatValue = 5; double myDoubleValue = 5;
        // We can assign an integer literal to a float or double without having to put in a suffix.

        myFloatValue = 6f; myDoubleValue = 6d;
        // We put in the suffix to give more information about the values on integer literals. prevents potential
        // conversion errors down the line.
        System.out.println(myFloatValue);

        System.out.println(myDoubleValue);


        // *** myFloatValue = 5.25; ***
        // This gives you an error because java defaults to double so you must put in a suffix in order for java to
        // recognize the real number as a float rather than a double.

        myFloatValue = 5.25f; myDoubleValue = 5.25;
        // As we see here we did not need to put a suffix in the myDouble Value since, just like the int, its a default
        // data type

        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        /*
            Challenge:

                        Thinking back to our discussion on castin, how do you thing you'd do the same for the float to
                        remove this error? I am talking about using casting here, specifically, because, as you have
                        learned, we could just use the suffix f to tell java this is a float. Here I want you to use
                        casting.
         */

        float myFloat;

        myFloat = (float) 6.3741;
        // Not recommended to use this method with floats since the suffix is much clearer.

        System.out.println(myFloat);




    }
}
