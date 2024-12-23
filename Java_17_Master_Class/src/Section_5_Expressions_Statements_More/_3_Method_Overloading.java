package Section_5_Expressions_Statements_More;

public class _3_Method_Overloading {

    public static void main(String[] args) {

        /*
            Method Overloading:

                Occurs when a class has multiple methods with the same name, but the methods are declared with
                    different parameters.

                So, you can execute multiple methods with the same name, but call it with different arguments.

                Java can resolve which method it needs to execute based on the arguments being passed when the method
                    is invoked.

             Method Signatures:

                A method signature consists of the name of the method, and the uniqueness of the declaration of its
                    parameters.

                The signature is unique, not just by the method name, but in combination with the number of
                    parameters, their types, and the order in which they are declared.

                A Method return type is not part of the signature.

                A parameter name is also not part of the signature.


             Valid-Overloaded Methods:

                The type, order, and number of parameters, in conjunction with the name, make a method signature unique.

                A unique method signature is the key for the Java compiler, to determine if a method is overloaded
                    correctly.

                The name of the parameter is not part of the signature, and therefore it doesn't matter, from Java's
                    point of view, what we call our parameters.


         */

        System.out.println("New score is " + calculateScore("Kassie", 500));
        System.out.println("New score is " + calculateScore(10));
    }

    /*

    //Valid overloaded methods

    public static void doSomething(int parameterA){
        // method body
    }

    public static void doSomething(float parameterA){
        // method body
    }

    public static void doSomething(int parameterA, int parameterB){
        // method body
    }

    public static void doSomething(int parameterA, float parameterB){
        // method body
    }

    public static void doSomething(int parameterA, int parameterB, float parameterC){
        // method body
    }
    */

    public static int calculateScore(String playerName, int score){

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

     public static int calculateScore(int score){

       return calculateScore("Anonymous", score);
    }

}
