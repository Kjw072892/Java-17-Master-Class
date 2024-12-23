package Section_5_Expressions_Statements_More;

public class _5_Seconds_And_Minutes_Challenge {

    /*
        Seconds and Minutes Challenge:

            In this challenge, we're going to create a method, that takes time, represented in seconds, as the
            parameter.

            We'll then want to transform the seconds into hours.

            Next, you'll display the time in hours with the remaining minutes and seconds in a String.

            We'll do this transformation in two steps, which allows us to use overloaded methods.

            We want to create two methods with the same name: getDurationString
                * The first method has one parameter of type int, named seconds.
                * The second method has two parameters, named minutes and seconds, both ints.
                * Both methods return a String in the format 'XXh YYm ZZs'.
                * The first method should in turn call the second method to return its results.

            Make both methods public and static.

            Remember that one minute is 60 seconds, and one hour equals 60 minutes, or 3600 seconds.

            Add validation to the methods as a bonus:
                * For the first method, the seconds parameter should be >= 0.
                * For the second method, the minutes paramter should be >= 0, and the seconds paramter should be >= 0,
                  and <= 59
                * If either method is passed an invalid value, print out some type of meaningful message to the user.
     */

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "(" + seconds + ")" + " is an invalid value for seconds, please enter a positive value for seconds.";
        }

        int minutes = seconds / 60;
        int remainderSec = seconds % 60;

        return getDurationString(minutes, remainderSec);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid input, please enter a time in minutes and seconds";
        }
        int hour = minutes / 60;
        int min = minutes % 60;

     return(hour + "h "+ min + "m " + seconds + "s");
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));

        double pi = Math.PI;

    }



}
