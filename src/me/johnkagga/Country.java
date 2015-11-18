package me.johnkagga;

/**
 * Created by jokamjohn on 11/18/2015.
 */
public class Country {

    private String name;
    private double size;


    public Country(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }
}
