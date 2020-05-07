import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class numberLine
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("pr22.dat"));
        while (file.hasNextLine())
        {
            int number = file.nextInt();
            // file.nextLine();
            for (int j = 0; j <= number; j++)
            {
                if (j % 10 == 0)
                {
                    System.out.print("0");
                } else if (j % 10 == 5)
                {
                    System.out.print("5");
                } else
                {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }

    }
}