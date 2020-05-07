import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class remDups
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("pr23.dat"));
        int times = file.nextInt();
        file.nextLine();
        for (int i = 0; i < times; i++)
        {
            String input = file.nextLine();
            String output = input.substring(0, 1);
            for (int j = 1; j < input.length(); j++)
            {
                String current = input.substring(j, j + 1);
                // check output string for any matches
                if (output.indexOf(current) == -1 && !current.equals(" "))
                {
                    output += current;
                }
            }
            System.out.println(output);
        }
    }
}