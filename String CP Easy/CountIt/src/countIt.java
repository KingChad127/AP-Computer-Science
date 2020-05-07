import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class countIt
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("pr21.dat")); // create the file and hook scanner to it
        int times = file.nextInt();
        file.nextLine();

        for (int i = 0; i < times; i++)
        {
            int count = 0;
            String line = file.nextLine();
            String firstLetter = line.substring(0, 1);
            for (int j = 0; j < line.length(); j++)
            {
                if (line.substring(j, j + 1).equals(firstLetter))
                {
                    count++;
                }
            }
            System.out.println(firstLetter + ": " + count);
        }
    }
}