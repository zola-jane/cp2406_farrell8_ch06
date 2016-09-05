/*
 * Created by Zola on 5/09/2016.
 */
import javax.swing.*;
public class EventEntryLoop
{
    public static void main(String[] args)
    {
        int num;
        String entry_number, message;
        final int SENTINEL_STOP = 999;
        entry_number = JOptionPane.showInputDialog(null, "Enter an even number or " +
            SENTINEL_STOP + " to quit.");
        num = Integer.parseInt(entry_number);
        while(num != SENTINEL_STOP)
        {
            if(num % 2 == 0)
                message = "Good job!";
            else
                message = entry_number + " is not an even number";
            JOptionPane.showMessageDialog(null, message);
            entry_number = JOptionPane.showInputDialog(null, "Enter an even number or " +
                    SENTINEL_STOP + " to quit.");
            num = Integer.parseInt(entry_number);
        }
    }
}
