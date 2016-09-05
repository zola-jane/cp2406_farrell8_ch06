/*
 * Created by Zola on 5/09/2016.
 */
import javax.swing.JOptionPane;
public class CountByAnything
{
    public static void main(String[] args)
    {
        final int STOP = 200;
        final int NUMBER_IN_LINE;
        String numString;
        numString = JOptionPane.showInputDialog(null, "Enter number to count: ");
        int stepNumber;
        stepNumber = Integer.parseInt(numString);
        NUMBER_IN_LINE = stepNumber * 10;
        for(int i = stepNumber; i <= STOP; i += stepNumber)
        {
            System.out.println(i + " ");
            if( i % NUMBER_IN_LINE == 0)
                System.out.println();
        }
    }
}
