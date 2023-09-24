package org.example.oop.advanced;

public class Car extends AbstractVehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void honk() {
        System.out.println("Car honks: Beep beep!");
    }
}