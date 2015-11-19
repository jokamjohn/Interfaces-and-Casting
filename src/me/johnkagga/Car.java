package me.johnkagga;

/**
 * Created by jokamjohn on 11/18/2015.
 */
public class Car implements Measurable {

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

    /**
     * This method returns a string of the largest car name
     *
     * @return Name of largest car
     */
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
