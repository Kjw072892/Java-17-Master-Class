package Section_6_Control_Flow;

public class _5_Is_It_Prime_Challenge {

    public static boolean isPrime(int num){

        if(num < 2){
            return true;
        }
        for(int i = 2; i < num ; i++){
            if(num % i == 0){
                    return false;
            }
        }

        return true;
    }

    public static int numOfPrimes(int maxRange){

        int numberOfPrimes = 0;

        for(int i = 10; i < maxRange; i++){
            if(isPrime(i)){

                System.out.println(i);
                numberOfPrimes++;
                if(numberOfPrimes == 3){
                    break;
                }
            }
        }

        return numberOfPrimes;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 99; i++){
            System.out.println(i + " is " + (isPrime(i) ? "" : "NOT ") + "a prime number");
        }


        numOfPrimes(50);

    }
}
