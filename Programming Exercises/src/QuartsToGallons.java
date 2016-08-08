/**
 * Created by Dassa on 8/08/2016.
 * A class to convert a volume in quarts to gallons
 */
public class QuartsToGallons
{
    public static void main(String[] args)
    {
        int conversion = 4;                 /* Conversion rate */
        int quarts = 18;                    /* Amount to be converted in quarts */
        int gallons = quarts/conversion;    /* Number of complete Gallons */
        int remainder = 18 - (gallons*conversion);   /* Remaining quarts */
        System.out.println("A job that requires " + quarts + " quarts requires " + gallons + " gallons plus " + remainder + " quarts.");

    }

}

