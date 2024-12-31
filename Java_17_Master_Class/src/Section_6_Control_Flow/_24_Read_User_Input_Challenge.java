package Section_6_Control_Flow;

import java.util.Scanner;

public class _24_Read_User_Input_Challenge {

    /*
        Reading User Input Challenge

                You'll read 5 valid numbers from the console entered by the user and print the sum of those five numbers.

                By valid numbers, I mean you need to check that the numbers entered are valid integers.

                If they are not, print out the message "Invalid number" to the console, but continue looping until
                you do have 5 valid numbers.

                Before the user enters each number, prommpt with the message, "Enter number #x:", where x represents
                the count 1,2,3,etc

     */

    public static void main(String[] args) {


        int counter = 1;
        String numString = "";
        int sumOfUserInput = 0;
        Scanner sc = new Scanner(System.in);
        do{
            try{
                System.out.println("Enter number #" + counter);
                numString = sc.nextLine();
                sumOfUserInput+= Integer.parseInt(numString);
                counter ++;

            }catch(NumberFormatException userNumber){
                System.out.println("Please Enter an Integer");
                System.out.println(" ");
            }

        }while (counter <= 5);

        System.out.println("Your total: " + sumOfUserInput);

    }
}
