package org.example.oop.advanced;

public class Bicycle extends AbstractVehicle {
    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void honk() {
        System.out.println("Bicycle honks: Ring ring!");
    }
}