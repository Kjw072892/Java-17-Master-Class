package Section_7_OOP_Part_1_Inheritance;

public class _2_Intro_to_Classes_Using_Getter_Methods {

    public static void main(String[] args) {

        Car car1 = new Car();

        Car_2 car2 = new Car_2();

        car1.describeCar(); // 0-Door null null null

        /*
            Default values for fields on classes:
                Fields on classes are assigned default valus automatically by Java, if you don't asssign values
                yourself.

                    Data type:              Default value assigned:

                    boolean                 false

                    (byte, short,           0
                    int, long, char)

                    (double, float)         0.0

                    any other types          null
         */

        //after adding values to the fields in 2_2_Car

        car2.describeCar(); // 2-Door Gray Tesla Model X convertible

        // because the fields were defined as private, you cant set values to the fields directly.

        // The purpose of getters and setters is to protect access to private fields.

        System.out.println("make = " + car2.getMake()); // make = Tesla
        System.out.println("Model = " + car2.getModel()); // Model = Model X
        System.out.println("Color = " + car2.getColor()); // Color = Gray
        System.out.println("# of doors = " + car2.getDoors()); // # of doors = 2
        System.out.println("Convertible = " + car2.isConvertible()); // Convertible = true


    }
}
