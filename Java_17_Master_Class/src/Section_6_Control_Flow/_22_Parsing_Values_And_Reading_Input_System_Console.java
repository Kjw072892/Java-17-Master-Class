package Section_6_Control_Flow;

public class _22_Parsing_Values_And_Reading_Input_System_Console {

    /*
        When we read data in from either a file or from user input, it's common for the data to be initially stored
        as a String, which we'll need to convert to a numeric value.
     */

    public static void main(String[] args) {

        String currentYear = "2022";

        String usersDateOfBirth = "1999";

        // To use the data given as an int we use the Wrapper Method
        // parseInt(String) for Integers
        // parseDouble(String) for doubles.

        // So here we parse the data that are string literals of numbers we want
        int currentYearInt = Integer.parseInt(currentYear);
        int usersDateOfBirthInt = Integer.parseInt(usersDateOfBirth);

        // Now we can manipulate the data and use the data as integer

        System.out.println("Age: " + (currentYearInt - usersDateOfBirthInt));

        // Now we can do it with doubles as well

        String usersAgeWithPartialYear = "22.5";

        double usersAgeDouble = Double.parseDouble(usersAgeWithPartialYear);

        System.out.println("The user says they are " + usersAgeDouble);

        System.out.println(getInputFromConsole(currentYearInt));

        System.out.println(getInputFromScanner(currentYearInt));

    }

    public static String getInputFromConsole(int currentYear){

       String name = System.console().readLine("Hi, What's your name?");
       System.out.println("Hi " + name+ ", Thanks for taking the course!");

       String dateOfBirth = System.console().readLine("What year were you born? ");
       int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear){

        return "";

    }
}
