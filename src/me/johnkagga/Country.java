package me.johnkagga;

import java.util.Collection;

/**
 * Created by jokamjohn on 11/18/2015.
 */
public class Country implements Measurable,Comparable {

    private String name;
    private double area;


    public Country(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double getMeasure() {
        return getArea();
    }

    /**
     * Finds out whether the objects are equal
     *
     * @param other
     * @return Boolean
     */
    public boolean equals(Object other)
    {
        if (other instanceof Country)
        {
            Country country = (Country) other;
            return this.name.equals(country.name)
                    && this.area == country.area;
        }
        else {
            return false;
        }
    }

    @Override
    public int compareTo(Object otherObject) {

        Country country = (Country) otherObject;

        if (this.area < country.area)
        {
            return -1;
        }
        else if (this.area > country.area)
        {
            return 1;
        }
        else if (this.equals(country))
        {
            return 0;
        }

        //Break ties using the name
        //When two countries have the same area but different names
        return this.name.compareTo(country.name);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
