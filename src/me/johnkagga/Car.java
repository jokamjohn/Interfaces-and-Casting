package me.johnkagga;

/**
 * Created by jokamjohn on 11/18/2015.
 */
public class Car {

    private String name;

    private double fuelEffieciency;

    public Car(String name, int fuelEffieciency) {
        this.name = name;
        this.fuelEffieciency = fuelEffieciency;
    }

    public String getName() {
        return name;
    }

    public double getFuelEffieciency() {
        return fuelEffieciency;
    }
}
