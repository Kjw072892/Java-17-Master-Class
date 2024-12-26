package Section_6_Control_Flow;

public class _3_Coding_Exercise_14_Number_of_days_in_Month {
     public static boolean isLeapYear(int year) {
         if (year < 1 || year > 9999) {
             return false;
         }

         if(year % 4 == 0 && year % 100 != 0) {
             return true;
         }else if(year % 400 == 0){
             return true;
         } else {
             return false;
         }
     }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(9,3172));
    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }

        if (isLeapYear(year) && month == 2) {
            return 29;
        } else {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 28;
                case 4, 6, 9, 11 -> 30;
                default -> -1;
            };

        }
    }

}
