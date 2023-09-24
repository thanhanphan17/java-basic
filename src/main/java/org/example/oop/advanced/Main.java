package org.example.oop.advanced;


public class Main {
    public static void main(String[] args) {
        IVehicle car = new Car("My Car");
        IVehicle bicycle = new Bicycle("My Bicycle");

        car.start();
        car.accelerate();
        car.brake();
        car.stop();
        car.honk();

        System.out.println();

        bicycle.start();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.stop();
        bicycle.honk();
    }
}
