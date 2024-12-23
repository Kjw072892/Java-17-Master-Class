package Section_5_Expressions_Statements_More;

public class _2_DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        double factor = 1000.0d;

        if(num1 < 0 && num2 < 0) {
            num1 = Math.ceil(num1 * factor);
            num2 = Math.ceil(num2 * factor);
        }else {
            num1 = Math.floor(num1 * factor);
            num2 = Math.floor(num2 * factor);
        }
        return num1 == num2;
    }

    public static void main(String[] args) {
        System.out.println( areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }

}
