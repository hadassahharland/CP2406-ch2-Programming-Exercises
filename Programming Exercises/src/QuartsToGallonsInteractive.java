import javax.swing.JOptionPane;
/**
 * Created by Dassa on 8/08/2016.
 * A class to convert a volume in quarts to gallons
 */

public class QuartsToGallonsInteractive
{
    public static void main(String[] args)
    {
        int conversion = 4;                         /* Conversion rate */
        String quartsString;
        quartsString = JOptionPane.showInputDialog(null, "Enter number of quarts required for job:  ", "Volume",
                JOptionPane.INFORMATION_MESSAGE);   /* Amount to be converted in quarts */
        int quarts = Integer.parseInt(quartsString);
        int gallons = quarts/conversion;            /* Number of complete Gallons */
        int remainder = quarts - (gallons*conversion);           /* Remaining quarts */
        System.out.println("A job that requires " + quarts + " quarts requires " + gallons + " gallons plus " + remainder + " quarts.");

    }

}

