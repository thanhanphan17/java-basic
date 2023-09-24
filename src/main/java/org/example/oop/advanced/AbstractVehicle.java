package org.example.oop.advanced;

public abstract class AbstractVehicle implements IVehicle {
    private final String name;
    private int speed;

    public AbstractVehicle(String name) {
        this.name = name;
        this.speed = 0;
    }

    @Override
    public void start() {
        System.out.println(name + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping.");
    }

    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(name + " is accelerating. Current speed: " + speed + " km/h");
    }

    @Override
    public void brake() {
        speed -= 10;
        System.out.println(name + " is braking. Current speed: " + speed + " km/h");
    }

    public abstract void honk();
}
