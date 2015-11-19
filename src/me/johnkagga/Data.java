package me.johnkagga;

/**
 * Created by jokamjohn on 11/18/2015.
 */
public class Data {

    /**
     * Calculates the average
     * @param measurables
     * @return Average double
     */
    public static double average (Measurable[] measurables)
    {
        double sum = 0;

        if (measurables.length > 0)
        {
            for (Measurable object: measurables)
            {
                sum = sum + object.getMeasure();
            }
        }
        else {
            return 0;
        }

        return sum/ measurables.length;

    }

    /**
     * Finds the largest measurable object
     * @param objects
     * @return
     */
    public static Measurable largest (Measurable[] objects)
    {
        if (objects.length == 0)
        {
            return null;
        }

            Measurable largest = objects[0];

        for (Measurable current : objects) {
            if (current.getMeasure() > largest.getMeasure()) {
                largest = current;
            }
        }

        return largest;
    }
}
