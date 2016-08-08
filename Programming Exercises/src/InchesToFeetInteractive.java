import javax.swing.JOptionPane;
/**
 * Created by Dassa on 8/08/2016.
 * A class to Convert inches for feet and inches
 */

public class InchesToFeetInteractive {
    public static void main(String[] args)
    {
        int conversion = 12;                        /* Conversion rate */
        String inchesString;
        inchesString = JOptionPane.showInputDialog(null, "Enter number of inches to convert:  ", "Length",
                JOptionPane.INFORMATION_MESSAGE);   /* Amount to be converted in quarts */
        int inches = Integer.parseInt(inchesString);/* Amount to be converted in feet and inches */
        int feet = inches/conversion;               /* Number of complete feet */
        int remainder = inches - (feet*conversion);     /* Remaining quarts */
        System.out.println("A length of " + inches + " inches is equivalent to " + feet + "'" + remainder + "\".");

    }

}

