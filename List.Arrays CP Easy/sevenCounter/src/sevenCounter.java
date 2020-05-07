import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class sevenCounter
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("pr44.dat"));
        int count = file.nextInt();
        file.nextLine();
        for (int i = 0; i < count; i++)
        {
            String input = file.nextLine();
            String[] list = input.split(" ");
            int numOfSevens = 0;
            for (String x : list)
            {
                if (x.equals("7"))
                {
                    numOfSevens++;
                }
            }
            System.out.println(input + " # 7 count = " + numOfSevens);
        }
    }
}