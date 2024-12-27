package Section_6_Control_Flow;

public class _13_Even_Digit_Sum_Challenge {
    /*
        Even Digit Sum
    Write a method named getEvenDigitSum with one parameter of type int called number.

    The method should return the sum of the even digits within the number.

    If the number is negative, the method should return -1 to indicate an invalid value.



    EXAMPLE INPUT/OUTPUT:

    getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20

    getEvenDigitSum(252); → should return 4 since 2 + 2 = 4

    getEvenDigitSum(-22); → should return -1 since the number is negative



    NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.

    NOTE: Do not add a main method to the solution code.

     */

    public static int getEvenDigitSum(int number){

        if(number < 0){
            return -1;
        }

        int sumOfEven = 0;

        while(number > 0){
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                sumOfEven += lastDigit;
            }
            number /= 10;
        }

        return sumOfEven;

    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123452));
        // 8
    }

}
