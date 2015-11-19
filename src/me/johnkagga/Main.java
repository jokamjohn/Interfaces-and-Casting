package me.johnkagga;

public class Main {

    public static void main(String[] args) {

        Country[] countries = {
                new Country("Uganda", 11745),
                new Country("Kenya", 24580),
                new Country("Tanzania", 11750),
                new Country("Sudan", 45820)
        };

        Car[] cars = {
                new Car("Benz",230),
                new Car("Toyota", 20),
                new Car("Alteza", 15),
                new Car("Nissan", 250)
        };

        //use of the same algorithm to compute the average
        //of the different classes that implement Measurable

        double countryAvArea = Data.average(countries);
        System.out.println("Country average: " + countryAvArea);

        double carAvFuelUse = Data.average(cars);
        System.out.println("Car fuel average: " + carAvFuelUse);

        //Finding the largest
        Measurable largestCar = Data.largest(cars);
        System.out.println("Largest car: " + largestCar);

        //Casting
        Measurable largest = Data.largest(countries);
        Country largestCountry = (Country) largest;
        assert largestCountry != null;
        System.out.println("largest country is: " + largestCountry.getName());

        //Comparable interface
        int result = "Badminton" .compareTo("Football");
        System.out.println("Result is: "+ result);
    }
}
