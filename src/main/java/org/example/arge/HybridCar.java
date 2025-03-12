package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avmKmPerLitre;
    private  int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avmKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avmKmPerLitre = avmKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avmKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + "'s hybrid engine with " + batterySize + " kWh battery and " + cylinders + " cylinders is starting...");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println(getName() + " is now driving using both fuel and electricity.");
    }
}
