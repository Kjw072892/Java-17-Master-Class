package Section_7_OOP_Part_1_Inheritance;

public class _1_2_Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar(){
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "convertible" : ""));
    }
    
}
