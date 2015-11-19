package me.johnkagga;

/**
 * Created by jokamjohn on 11/18/2015.
 */
public class Car implements Measureable {

    private String name;

    private double fuelEffieciency;

    public Car(String name, double fuelEffieciency) {
        this.name = name;
        this.fuelEffieciency = fuelEffieciency;
    }

    public String getName() {
        return name;
    }

    public double getFuelEffieciency() {
        return fuelEffieciency;
    }

    /**
     * Implements the methods of Measurable
     * @return Fue; Efficiency
     */
    @Override
    public double getMeasure() {
        return getFuelEffieciency();
    }
}
