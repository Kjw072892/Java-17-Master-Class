package Section_7_OOP_Part_1_Inheritance;

public class _3_Classes_Using_Setters_and_Creating_Objects {

    public static void main(String[] args) {
        Car_2 car = new Car_2();

        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("Black");
        System.out.println("make = " + car.getMake()); // make = Porsche
        System.out.println("model = " + car.getModel());// model = Carrera
        car.describeCar(); // 2-Door Black Porsche Carrera convertible

        Car_2 targa = new Car_2();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("Red");

        targa.describeCar();

    }
}
