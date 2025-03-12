package org.example.arge;

public class Main {
    public static void main(String[] args) {
        CarSkeleton gasCar = new GasPoweredCar("Mustang", "A fast gas-powered car", 12.5, 8);
        CarSkeleton electricCar = new ElectricCar("Tesla Model S", "A high-performance electric car", 500, 100);
        CarSkeleton hybridCar = new HybridCar("Toyota Prius", "A fuel-efficient hybrid car", 20, 50, 4);

        CarSkeleton[] cars = {gasCar,electricCar,hybridCar};

        for(int i = 0 ; i < cars.length; i++){
            cars[i].printCarType();
            cars[i].startEngine();
            cars[i].drive();
        }
    }
}
