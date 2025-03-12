package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avmKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avmKmPerCharge, int batterySize) {
        super(name, description);
        this.avmKmPerCharge = avmKmPerCharge;
        this.batterySize = batterySize;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerCharge() {
        return avmKmPerCharge;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " 's electric motor with " + batterySize + " kWh battery is starting.");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println(getName() + " is now driving using electricity.");
    }


}
