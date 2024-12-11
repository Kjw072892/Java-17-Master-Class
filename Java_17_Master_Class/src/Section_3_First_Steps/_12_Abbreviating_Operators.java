package Section_3_First_Steps;

public class _12_Abbreviating_Operators {

    public static void main(String[] args) {

        int result = 1;
        result = result +1;
        System.out.println("result = " + result);
        // prints "result = 2" in the console

        /*
            *Shorthand (or Abbreviating) Operator
                - Post-fix Increment Operator => result++;

                - Compound Assignment Operator with + sing => result+=1;
         */

        result++;
        System.out.println("result = " + result);
        // Prints "result = 3" in the console
        // The value of "result" was incremented by one
        // Example of post-fix incrementing operator, only incrementing by one.

        result+=2;
        System.out.println("result = " + result);
        // Prints "result = 5" in the console
        // Example of compound assignment operator with + sign.
        // This took the value of result = 3, and added two to it; similar to saying "result = result + 2"

        result--;
        System.out.println("result = " + result);
        // Prints "result = 4" in the console;
        // Example of post-fix decrementing. Decreasing "result" by 1

        result-=2;
        System.out.println("result = " + result);
        // Prints "result = 2" in the console
        // Example of compound assignment operator with - sign; similar to saying "result = result - 2"

        /*
            Compound Assignment Operator
               - "x -= y" is really "x = (data type of x) (x - y)"
               - An implicit cast is done when using this operator, so no error occurs, but unexpected result may
                 happen, such as 10 -= 5.5 results to 4 instead of 4.5
               - You can use other operators such as "*=", "/=", "%="
               - The % is the modulo or mod operator. This operator gives you the remainder of a division expression,
                 for example, 5 / 3 = 1 remainder 2. 5 % 3 = 2; the 5 gives you the remainder of 5 / 3.
         */


    }
}
