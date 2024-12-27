package Section_6_Control_Flow;

public class _8_Digit_Sum_Challenge {

    /*
        In this challenge, your task is to write a method with the name sumDigits that has a single parameter named
        number, of type int, and it should return an int

        The method should only take a number that is a positive number.

        If a negative number is passed, it should return -1, meaning, an invalid value was passed.

        The method should parse out each digit from the number and sum the digits up.

        so, if 125 is the value passed to the method, the code should sum each digit, in this case, 1 + 2 + 5, and
        return 8 as a value

        And another example, if the value is 1000, the code should sum each digit, 1 + 0 + 0 + 0, and return 1 as a
        value.

        If the number is a single digit number, simply return the number itself as the result.

     */

    public static int sumDigits(int num){

        // num has to be greater than 0
        if(num < 0){
            return -1;
        }

        int sumOfDigits = num % 10; // stores the furthest right digit in the number, so if num == 432, stores 2
        int nextDigit = num / 10; // stores the next group of digits previous to last digit, so if num == 432, stores 43

        if(num > 9) { // This is my base case, breaks the recursion if there is only 1 digit left in num

            return sumOfDigits + sumDigits(nextDigit); // Calling a recursion to add the previous digit to the next
                                                        // digit, so if num is 432, it adds 2 + 3 + 4 in stack order
        }
        return num; // ends the recursion returning the final digit in the stack, to then be added with previous digits
    }

    public static int whileSumDigits(int num){


        int sumOfDigits = 0;

        if(num < 0){
            return -1;
        }

        while (num > 0) {

            int nextDigit = num % 10;
            sumOfDigits += nextDigit;
            num = num / 10;

            }

        return sumOfDigits;

    }

    public static void main(String[] args) {

        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234 ));
        // The sum of the digits in number 1234 is 10

        System.out.println("The sum of the digits in number 59726 is " + whileSumDigits(59726));
        // The sum of the digits in number 59726 is 29
    }


}
