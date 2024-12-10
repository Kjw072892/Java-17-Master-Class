package Section_3_First_Steps;

public class _9_Floating_Point_Precision_and_a_Challenge {

    public static void main(String[] args) {

        int myIntValue = 5; float myFloatValue = 5f; double myDoubleValue = 5d;
        System.out.println(myIntValue + " \n" + myFloatValue + "\n" + myDoubleValue);
        // Outputs "5 5.0 5.0" in the console.

        // We use express our real numbers either with whole numbers, decimal numbers, or even scientific notation.

        myIntValue = 5 / 2;
        System.out.println(myIntValue);
        // Outputs the whole number 2 due to java calculated the expression using the variable's data type.

        myFloatValue = 5f / 2f;
        System.out.println(myFloatValue);
        // outputs 2.5 in the console

        myDoubleValue = 5d / 2d;
        System.out.println(myDoubleValue);
        // outputs 2.5 in the console.

        myIntValue = 5 / 3;
        System.out.println(myIntValue);
        // outputs 1 in the console.

        myFloatValue = 5f / 3f;
        System.out.println(myFloatValue);
        // outputs 1.6666666 in the console

        myDoubleValue = 5d / 3d;
        System.out.println(myDoubleValue);
        // outputs 1.6666666666666667 in the console.

        myDoubleValue = 5.00 / 2.00;
        System.out.println(myDoubleValue);
        //Outputs 2.5 in the console.
        //Here we don't need the d suffix since java will automatically look at a decimal number and see it as a double.

        /*
                Why should we choose double?
                    - It's actually faster to process on many modern computers.
                    - That's because computers have, at the chip level, the functionality to actually deal with these
                      double numbers faster than the equivalent float.
                    - The math functions in java are often written to process doubles and not floats, and to return the
                      result as a double.
         */


        /*
                Challenge:

                    The goal of this challenge, is to convert a given number of pounds to kilograms.

                    Steps:

                        1) Create a variable with the appropriate type to store the number of pounds that we want to
                           convert into kilograms.
                        2) Calculate kilograms, using the variable above, and store the result in a 2nd appropriately
                           typed variable.
                        3) Print the result.

                    Remember to use the conversion formula shown here:
                        1 pound is equal to 0.45359237 of a kilogram.
         */

        double poundToKilogram = 0.45359237d;
        double pound = 45d;
        double kilogram = pound * poundToKilogram;

        System.out.println("Converted kilograms = " + kilogram + " Kg");
        // outputs Converted kilograms = 20.41165665 Kg in the console
        // To verify, 45 pounds is approximately 20.4 Kg.

        /*
                In general, float and double are great for general floating point operations.

                But neither should be used when precise calculations are required - this is due to a limitation with how
                floating point numbers are stored, and not a Java problem as such.

                Java has a class called BigDecimal that overcomes this.
         */




    }
}
