package Section_3_First_Steps;

public class _3_Starting_out_with_Expressions {


    public static void main(String[] args) {

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;

        myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;

        System.out.println(myLastOne);
        /*
            * Java code is case-sensitive.
                - This includes not only keywords and language syntax, but variable names and data types as well.
                - Keywords needs to be in lowercase
                - Variables will always be exactly as you declare them, including capitalization.
                - CASE MATTERS IN JAVA CODE
                - The /vars command in JShell can help you identify any misspellings you may have made.
         */
    }
}
