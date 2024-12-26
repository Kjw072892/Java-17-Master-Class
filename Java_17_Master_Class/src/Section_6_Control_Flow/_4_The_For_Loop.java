package Section_6_Control_Flow;

public class _4_The_For_Loop {

    public static void main(String[] args) {

      //  for(int i = 1; i <= 5; i++){
      //      System.out.println(i);
        //}

        // Calculating dollar amount with compound interest

       // System.out.println("10,000 at 2% interest = " + calculateInterest(10_000, 2));

      /*  for(int i = 1; i < 25; i++){
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10_000, i));
        }
      */

        for(double i = 7.5; i <= 10; i += 0.25){

            if(i > 8.5){
                break;
            }
            System.out.println("100 at " + i + "% interest = " + "$" + calculateInterest(100, i));
        }
    }

    public static double calculateInterest(double ammount, double interestRate){

        return (ammount * (interestRate / 100));
    }


}
