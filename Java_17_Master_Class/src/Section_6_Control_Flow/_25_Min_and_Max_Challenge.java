package Section_6_Control_Flow;

import java.util.Scanner;

public class _25_Min_and_Max_Challenge {

    /*
        You'll be using an endless loop which:

            Prompts the user to enter a number or any character to quit.

            Validates if the user-entered data really is a number. You can choose either an integer or double
            validation method

            If the user-entered data is not a number, quit the loop.

            Keep track of the minimum number entered.

            Keep track of the maximum number entered.

         If the user has previously entered a set of numbers (or even just one), display the minimum and maximum
         number that the user entered.

     */

    public static void main(String[] args) {

        int min = 0;
        int max = 1;
        int currentNum;
        Scanner sc = new Scanner(System.in);
        String userInput = "";


        while(true){
            try{

                System.out.println("Enter a number or enter any character to quit: ");
                userInput = sc.nextLine();
                currentNum = Integer.parseInt(userInput);
                if(currentNum >= max){
                    max = currentNum;
                } else if(currentNum <= min){
                    min = currentNum;
                } else {

                    System.out.println("Current min = " + min + "\nCurrent max = " + max);
                }

            } catch(NumberFormatException nfe){

                break;
            }
        }
    }
}
