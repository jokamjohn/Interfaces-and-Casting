package me.johnkagga;

/**
 * Created by jokamjohn on 11/18/2015.
 */
public class Data {

    /**
     * Calculates the average
     * @param measureables
     * @return Average double
     */
    public static double average (Measureable[] measureables)
    {
        double sum = 0;

        if (measureables.length > 0)
        {
            for (Measureable object: measureables)
            {
                sum = sum + object.getMeasure();
            }
        }
        else {
            return 0;
        }

        return sum/measureables.length;

    }

    /**
     * Finds the largest measurable object
     * @param objects
     * @return
     */
    public static Measureable largest (Measureable[] objects)
    {
        if (objects.length == 0)
        {
            return null;
        }

            Measureable largest = objects[0];

            for (int i = 0; i < objects.length; i++)
            {
                Measureable current = objects[i];

                if (current.getMeasure() > largest.getMeasure())
                {
                    largest = current;
                }
            }

        return largest;
    }
}
