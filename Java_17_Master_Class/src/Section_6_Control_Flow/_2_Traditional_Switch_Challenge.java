package Section_6_Control_Flow;

import java.lang.reflect.Array;

public class _2_Traditional_Switch_Challenge {

    /*
        In this challenge, we'll be using the NATO alphabet to replace a character or letter, with NATO's
        standardized word for the letter.

        In radio transmissions, the word cat, "C", "A", "R", would be read, "Charlie Alpha Romeo", for clarity.

        To do this:
            1. Create a new char variable.
            2. Use the traditional switch statement (with a colon in case labels) that tests the value in the
                variable from Step 1.
                * Create cases for the characters, A, B, D, and E.
                * Display a message in each case block, with the letter and the NATO word, then break.
                * Add a default block, which displays the letter with a message saying not found.
     */

    public static String natoLetters(char ltr){
        switch (ltr){
            case 'a': case 'A':
                return "ALPHA";

            case 'b': case 'B':
                return "BRAVO";

            case 'c': case 'C':
                return "CHARLIE";

            case 'd': case 'D':
                return "DELTA";

            case 'e': case 'E':
                return "ECHO";

            case 'f': case 'F':
                return "FOXTROT";

            case 'g': case 'G':
                return "GOLF";

            case 'h': case 'H':
                return "HOTEL";

            case 'i': case 'I':
                return "INDIA";

            case 'j': case 'J':
                return "JULIET";

            case 'k': case 'K':
                return "KILO";

            case 'l': case 'L':
                return "LIMA";

            case 'm': case 'M':
                return "MAMA";

            case 'n': case 'N':
                return "NOVEMBER";

            case 'o': case 'O':
                return "OSCAR";

            case 'p': case 'P':
                return "PAPA";

            case 'q': case 'Q':
                return "QUEBEC";

            case 'r': case 'R':
                return "ROMEO";

            case 's': case 'S':
                return "SIERRA";

            case 't': case 'T':
                return "TANGO";

            case 'u': case 'U':
                return "UNIFORM";

            case 'v': case 'V':
                return "VICTOR";

            case 'w': case 'W':
                return "WHISKEY";

            case 'x': case 'X':
                return "X-RAY";

            case 'y': case 'Y':
                return "YANKEE";

            case 'z': case 'Z':
                return "ZEBRA";

            default:
                return "Letter " + ltr + " was not found!";
        }
    }


    /*
        In this challenge, we're going to use the enhanced switch expression.

        1. Create a method called printDayOfWeek, that takes an int parameter called day, but doesn't return any values.
            * Use the enhanced switch statement, to return the name of the day, based on the parameter passed to the
                switch statement, so that 0 will return "Sunday", 1 will return "Monday", and so on. Any number not
                between 0 and 6 should return "Invalid Day". Note that return here means the value returned from the
                enhanced switch statement.
            * Use the enhanced switch statement as an expression, returning the result to a String named dayOfTheWeek.
            * Print both the day variable and the dayOfTheWeek variable.

         2. In the main method, call this method for the values 0 through 7.

         3. Bonus: Create a second method called printWeekDay, that uses an if then else statement, instead of a
            switch, to produce the same output.
     */



    public static void printDayOfWeek(int day){
           String dayOfWeek = switch (day){
                case 0 -> day + " stands for Sunday";
                case 1 -> day + " stands for Monday";
                case 2 -> day + " stands for Tuesday";
                case 3 -> day + " stands for Wednesday";
                case 4 -> day + " stands for Thursday";
                case 5 -> day + " stands for Friday";
                case 6 -> day + " stands for Saturday";
                default -> "Invalid Day";
            };

        System.out.println(dayOfWeek);
    }

    public static void printWeekDay(int day){
        if(day == 0){
            System.out.println(day + " stands for Sunday");
        } else if(day == 1){
            System.out.println(day + " stands for Monday");
        } else if(day == 2){
            System.out.println(day + " stands for Tuesday");
        } else if(day == 3){
            System.out.println(day + " stands for Wednesday");
        } else if(day == 4){
            System.out.println(day + " stands for Thursday");
        } else if(day == 5){
            System.out.println(day + " stands for Friday");
        } else if(day == 6){
            System.out.println(day + " stands for Saturday");
        } else{
            System.out.println("Invalid Day");
        }
    }
    public static void main(String[] args) {
        System.out.println(natoLetters('t') + " " + natoLetters('h') + " " +  natoLetters('e') + " " + " " +
                natoLetters('c') + " " + natoLetters('a') + " " + natoLetters('r') + " " + " " +
                natoLetters('i') + " " + natoLetters('s') + " " + " " + natoLetters('r') + " " +
                natoLetters('e') + " " + natoLetters('d'));
        // TANGO HOTEL ECHO  CHARLIE ALPHA ROMEO  INDIA SIERRA  ROMEO ECHO DELTA

        System.out.println(natoLetters('2'));
        // Letter 2 was not found!

        /*
            System.out.println(" ");

            String oneMonth = "january";
            String oneMonthBackwards = "";

            for(int i = oneMonth.length() - 1; i >= 0; --i ){
             char monthChar = oneMonth.charAt(i);
             oneMonthBackwards += monthChar;
            }

            System.out.println(oneMonthBackwards);
        */

        System.out.println(" ");

        for(int i = 0; i <= 7; i++ ){
            printDayOfWeek(i);
        }

        System.out.println(" ");

        for(int i = 0; i <= 7; i++){
            printWeekDay(i);
        }
    }



}
