import javax.swing.*;

/**
 * Created by Dassa on 8/08/2016.
 * A Class to convert Nautical miles to miles and kilometers
 */
public class NauticalMilesInteractive {
    public static void main(String[] args)
    {
        double kilometersCon = 1.852;                 /* Kilometers in a Nautical Mile */
        double milesCon = 1.150779;                   /* Miles in a Nautical Mile */
        String NmilesString;
        NmilesString = JOptionPane.showInputDialog(null, "Enter number of Nautical Miles to convert:  ", "Distance",
                JOptionPane.INFORMATION_MESSAGE);     /* Distance to be converted */
        double Nmiles = Double.parseDouble(NmilesString);  /* Converting string to double to be used in calculation */
        double kilometers = kilometersCon*Nmiles;
        double miles = milesCon*Nmiles;
        System.out.println(Nmiles + " nautical miles is equivalent to " + kilometers + "km or " + miles + "mi.");

    }
}




