package Section_5_Expressions_Statements_More;

public class _1_Speed_Converter_Challenge {

     public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0){
            return -1; // Indicates invalid entry
        }

        return (long) (Math.round(kilometersPerHour / 1.609d));
    }

    public static void printConversion(double kilomertersPerHour){

        if(kilomertersPerHour < 0){
            System.out.println("Invalid Value");
        }

        long mphRounded = Math.round(kilomertersPerHour / 1.609d);

        System.out.println(kilomertersPerHour + " km/h = " + mphRounded + " mi/h");
    }

    public static void main(String[] args) {
        System.out.println(2500 % 1024);
    }

}
