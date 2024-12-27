package Section_6_Control_Flow;

public class _7_While_Loop_Challenge {

    /*
        Step 1:

            create a method called isEvenNumber that takes a parameter of type int.

            Its purpose is to determine if the argument passed to the method is an even number or not.

            Return true from the method if it's an even number; otherwise, return false.

            Next, use a while loop to test a range of numbers from 5 up to and including 20, but printing out only the
             even numbers determined by the call to the isEvenNumber method.

     */

    public static boolean isEvenNumber(int num){
        return num % 2 == 0;
    }

    public static void whileLoop() {

        int num = 4;

        while (num <= 20){
             num ++;
            if(isEvenNumber(num)){
                System.out.println("Even number " + num);
            }

        } // Even number 6 ... Even number 20

    }

    /*
        Step 2:

            Modify the while code.

            Make it also record the total number of even numbers it has found.

            Break out of the loop once 5 even numbers are found.

            Finally, display the total number of odd and even numbers found.
     */

    public static void main(String[] args) {

        int num = 4;
        int numOfEven = 0;
        int numOfOdd = 0;

        while (num <= 20) {

            num ++;

            if(isEvenNumber(num)){

                numOfEven++;

                if(numOfEven == 5){

                    break;
                }

            } else {

                numOfOdd ++;
            }
        }

        System.out.println("Number of odd numbers found: " + numOfOdd);
        System.out.println("Number of even numbers found: " + numOfEven);

        // Number of odd numbers found: 5
        // Number of even numbers found: 5
    }

}
