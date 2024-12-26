package Section_6_Control_Flow;

public class _1_The_Switch_Statement {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 5;
        int num = 2;
        switch (switchValue) {
            // switch is good to use when trying to test for a single variable,
            // can only be used with value types:
            //  byte, short, int, char
            //  Byte, Short, Integer, Character
            //  String
            //  enum
            // Cannot use long, float, double, or boolean or their wrappers
            case 1:
                // Code for value == 1
                System.out.println("Value was 1");
                break; // ensures that switch closes otherwise will move to case 2;
            case 2:
                // Code for value == 2
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                // Code for value == 3
                System.out.println("Value was 3, 4, or 5");
                break;

            default:
                // Code for value not equal to 1 or 2
                System.out.println("Was not 1, 2, 3, 4 or 5");
        }

        // Enhanced Switch statement
        switch (switchValue){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3, 4, or 5");
                System.out.println("Value was actually " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        String month = "january";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
        // More code here
    }
    public static String getQuarter(String month){
        return switch (month) { // here the return statement when before the switch statement.
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st"; // you may use a return block ofter the return arrow, but
                                                            // you must use yield to return the value.
            case "APRIL", "MAY", "JUNE" -> {
                yield "2nd"; // example of using a code block
            }
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse; // new keyword to return a value back; return == yield
            } // Needs to be included in all switch statements to cover all cases
        };
    }
}
