package Section_6_Control_Flow;

import java.util.Scanner;

public class _23_Exception_Handling_And_Intro_To_Scanner {

    /*
        What's an exception?

            An error that happens in code.

            Some types of errors can be predicted and named.

        Catching an exception:

            An exception is caught first by creating a code block around the code that gets the error.

            This is done with the try statement code block.

                try{
                    // statements that might get errors
                } catch (Exception e) {
                    // code to 'handle' the exception
                }

          The Scanner class:

                The scanner class is described as a simple text scanner, which can parse primitive types and strings.

                To use the Scanner class, we have to create an instance of Scanner.

                This means we're creating an object of type Scanner.

                We'll use the keyword, new, to do it.

          new Keyword:

                The new keyword is used in what Java calls a Class Instance Creation Expression.

                ClassName variableName = new ClassName();

                We can optionally pass arguments in those parentheses, as we saw with methods.

                ClassName variableName = new ClassName(argument1, argument2, ...);

            Instantiating Scanner

                For reading input from the console or terminal, we instantiate a scanner object using new, followed
                by the Scanner class name, and passing System.in, as an argument, in the parentheses.

                Scanner sc = new Scanner(System.in);

                For reading input form a file, we instantiate a scanner object using new, again with the Scanner
                class name, but pass a File object, as an argument, in the parentheses.

                File is another class provided by Java, for reading and writing files.

                Scanner sc = new Scanner(new File("nameOfFileOnFileSystem"));



     */

    public static String getInputFromConsole(int currentYear){

       String name = System.console().readLine("Hi, What's your name?");
       System.out.println("Hi " + name+ ", Thanks for taking the course!");

       String dateOfBirth = System.console().readLine("What year were you born? ");
       int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear){

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = sc.nextLine();
        int age;
        do {
            System.out.println("What year were you born? ");
            try {
                age = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){

                System.out.println("Please be sure to use integers for your birth year");
                age= -1;
            }
        }while(currentYear - age > 125 || currentYear - age <= 0);

        return "Well, " + name +", you are " + (currentYear - age) + " years old!";

    }

    public static void main(String[] args) {

        String currentYear = "2025";

        // To use the data given as an int we use the Wrapper Method
        // parseInt(String) for Integers
        // parseDouble(String) for doubles.

        // So here we parse the data that are string literals of numbers we want
        int currentYearInt = Integer.parseInt(currentYear);

        try {
            System.out.println(getInputFromConsole(currentYearInt));
            // Would give a null pointer exception due to intellij disabling external terminal.
        } catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYearInt));
            // What year were you born?
            //1966 // user input
            //You are 59 years old!
        }


    }
}
