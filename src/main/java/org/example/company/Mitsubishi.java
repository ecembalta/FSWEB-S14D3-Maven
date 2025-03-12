package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi the car's engine is starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi the car is accelerating";
    }

    @Override
    public String brake() {
        return "Mitsubishi the car is braking";
    }
}
