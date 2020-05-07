import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class markingVowels
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("pr26.dat"));
        int count = file.nextInt();
        file.nextLine();
        for (int i = 0; i < count; i++)
        {
            String input = file.nextLine();
            String output = "";
            int vowelCount = 0;
            for (int j = 0; j < input.length(); j++)
            {
                if (input.substring(j, j + 1).equalsIgnoreCase("a") || input.substring(j, j + 1).equalsIgnoreCase("e")
                        || input.substring(j, j + 1).equalsIgnoreCase("i")
                        || input.substring(j, j + 1).equalsIgnoreCase("o")
                        || input.substring(j, j + 1).equalsIgnoreCase("u"))
                {
                    vowelCount++;
                    output += vowelCount;
                } else
                {
                    output += input.substring(j, j + 1);
                }
            }
            System.out.println(output);
        }
    }
}