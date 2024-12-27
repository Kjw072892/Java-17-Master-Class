package Section_6_Control_Flow;

public class _11_Number_Palindrome_Challenge {

    public static boolean isPalindrome(int number) {

        int num = number;
        int reverseNumber = 0;
        int previousNumber = num % 10;

        if (num < 0) {
           return isPalindrome(number * -1);
        }

        while (num > 9) {
                reverseNumber = (previousNumber * 10) + (reverseNumber * 10);
                num /= 10;
                previousNumber = num % 10;
        }

        return (reverseNumber + num) == number;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(-12321));
        // True
    }
}
