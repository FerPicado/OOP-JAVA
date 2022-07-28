package object.oriented.programming;

public class Car {
    
    String color, enginee, type;
    byte numPass;
    int year;

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "Black";
        car1.type = "BMW X6 M edition";
        car1.numPass = 5;
        car1.year = 2022;
        car1.enginee = "4.4-liter V8";

        System.out.println("El carro #1 es un " + car1.type + " anio " + car1.year + " color " + car1.color + " con un motor " + car1.enginee);

        car2.color = "Purple";
        car2.type = "R8 Twin Turbo";
        car2.numPass = 2;
        car2.year = 2022;
        car2.enginee = "V10 Sutututu";

        System.out.println("El carro #2 es un " + car2.type + " anio " + car2.year + " color " + car2.color + " con un motor " + car2.enginee);
    }
}
