package Section_6_Control_Flow;

import java.util.Scanner;

public class _26_InputCalculator_Challenge {
    /*
        Input Calculator
Write a method called inputThenPrintSumAndAverage that does not have any parameters.

The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.

When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".

XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.



EXAMPLES OF INPUT/OUTPUT:

EXAMPLE 1:

INPUT:

1
2
3
4
5
a
OUTPUT

SUM = 15 AVG = 3



EXAMPLE 2:

INPUT:

hello

OUTPUT:

SUM = 0 AVG = 0



TIP: Use Scanner to read an input from the user.

TIP: Use casting when calling the round method since it needs double as a parameter.

NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.

NOTE: Be mindful of spaces in the printed message.

NOTE: Be mindful of users who may type an invalid input right away (see example above).

NOTE: The method inputThenPrintSumAndAverage should be defined as public static like we have been doing so far
in the course.

NOTE: Do not add the main method to the solution code.
     */

    public static void inputThenPrintSumAndAverage(){

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int counter = 1;

        while(true){
            try{
                String numString = sc.nextLine();
                sum+=Integer.parseInt(numString);
                avg = Math.round((double)(sum) / counter);
                counter++;
            }catch(NumberFormatException npe){
                System.out.println("SUM = " + sum + " AVG = " + avg   );
                break;

            }
        }
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }
}
