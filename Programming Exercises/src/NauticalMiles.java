/**
 * Created by Dassa on 8/08/2016.
 * A class to convert a distance in Nautical miles to miles and kilometers
 */
public class NauticalMiles {
    public static void main(String[] args)
    {
        double kilometersCon = 1.852;                 /* Kilometers in a Nautical Mile */
        double milesCon = 1.150779;                   /* Miles in a Nautical Mile */
        double Nmiles = 5;                         /* Nautical Miles */
        double kilometers = kilometersCon*Nmiles;
        double miles = milesCon*Nmiles;
        System.out.println(Nmiles + " nautical miles is equivalent to " + kilometers + "km or " + miles + "mi.");

    }
}




