/*
 * Created by Zola on 5/09/2016.
 */
public class CountByThrees
{
    public static void main(String[] args)
    {
        final int START = 3;
        final int STOP = 300;
        final int NUMBER_IN_LINE = 30;
        for(int i = START; i <= STOP; i += START)
        {
            System.out.println(i + " ");
            if(i % NUMBER_IN_LINE == 0)
                System.out.println();
        }
    }
}
