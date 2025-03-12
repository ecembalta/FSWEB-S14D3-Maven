package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
        this.name = "Unknown Car";
        this.description = "No Description";
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine(){
        System.out.println(name + " engine is starting.");
    }

    public void drive(){
        runEngine();
        System.out.println(name + " is now driving.");
    }

    protected void runEngine(){
        System.out.println("Running engine of " + name);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void printCarType(){
        System.out.println("Car type: " + this.getClass().getSimpleName());
    }
}
