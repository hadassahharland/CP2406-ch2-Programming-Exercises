/**
 * Created by Dassa on 8/08/2016.
 * A class to convert a length in inches to inches and feet.
 */
public class InchesToFeet {
    public static void main(String[] args)
    {
        int conversion = 12;                        /* Conversion rate */
        int inches = 18;                            /* Amount to be converted in feet and inches */
        int feet = inches/conversion;               /* Number of complete feet */
        int remainder = inches - (feet*conversion);     /* Remaining quarts */
        System.out.println("A length of " + inches + " inches is equivalent to " + feet + "'" + remainder + "\".");

    }

}

