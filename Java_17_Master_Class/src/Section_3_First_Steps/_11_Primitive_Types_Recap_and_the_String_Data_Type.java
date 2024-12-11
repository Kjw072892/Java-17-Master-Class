package Section_3_First_Steps;

public class _11_Primitive_Types_Recap_and_the_String_Data_Type {

    public static void main(String[] args) {

        /*
            * Strings aren't a primitive type, but rather a class

            * String is a class that contains a sequence of characters.

            * It's only limited by the max memory size of your computer, which is around 1.4 billion characters

            * Strings are Immutable:
                Immutable means that you can't change a String after it's created.

            * String Vs StringBuilder:
                - The String class is immutable but can be used much like a primitive data type.
                - The StringBuilder class is mutable, meaning it can be changed, but does not share the String's
                  special features, such as being able to assign it a String literal or use the plus operator on it.

         */

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        //Prints 'myString is equal to This is a string' in the console

        myString = myString + ", and this is more.";
        System.out.println(myString);
        //Prints 'This is a string, and this is more.' in the console

        // when the plus sign follows a string, it's called the concatenated operator since it concatenates a string
        // following the operator in front of the previous text.

        myString = myString + " \u0024";
        System.out.println(myString);
        // Prints 'This is a string, and this is more. $' in the console

        // Here you can also see that we can concatenate a Unicode to the previous string.

        // int myInt = "10"; will throw and error "java.lang.String cannot be converted to int

        String lastString = "10"; int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        //Prints "1050" in the console and the 50 becomes a string since it was concatenated to a string

        //Here, whenever the plus sign is used with a string, it always acts as a concatenation rather than addition.

        double doubleNumber = 120.47; lastString = lastString + doubleNumber;
        System.out.println(lastString);
        // prints 1050120.47 in the console.
        // so the text value of the double got appended as text to our string variable


    }
}
