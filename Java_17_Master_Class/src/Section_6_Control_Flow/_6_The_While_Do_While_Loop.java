package Section_6_Control_Flow;

public class _6_The_While_Do_While_Loop {

    /*
        The while loop will check the if expression is true, loop the statement if true until the expression is false.

        The Do while loop will execute the statement first, then check if the while expression is true, and loop if
        it's true, or continues to the next line if false. Good application for a Do while loop is when asking for
        someone for the password, and you want to continue to ask for it until they remember the password.
     */

    public static void main(String[] args) {

        // While loop
        int num = 9;
        while (num > 0){
            System.out.println(num);
            num--;
        } // 9 8 7 6 5 4 3 2 1

        System.out.println(" ");
        // Do while loop

        num = 9;
        do {
            System.out.println(num);
            num --;

        } while (num > 9); // 9

        /*
            Here it is demonstrated that even though num is not greater than 9, the statement is then still
            executed, because the check comes after the statement gets exacted once.

            The continue statement, in its simplest form, will stop executing the current iteration of a block of
            code in a loop, and start a new iteration.
         */

        int number = 0;
        while ( number < 50){
            number +=5;
            if (number % 25 == 0){
                continue;
            }
            System.out.print(number + "_");
        } // 5_10_15_20_30_35_40_45

        // here we see that 25 was skipped over because of the if statement saying, continue on with the loop if number
        // mod 25 has no remainder.
    }

}
