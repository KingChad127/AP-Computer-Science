import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scramWords
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("pr24.dat"));
        int count = file.nextInt();
        file.nextLine();
        for (int i = 0; i < count; i++)
        {
            String input = file.nextLine();
            String output = "";
            if (input.length() % 2 == 0)
            {
                for (int j = 0; j < input.length(); j = j + 2)
                {
                    String pos1 = input.substring(j, j + 1);
                    String pos2 = input.substring(j + 1, j + 2);
                    String temp = pos2;
                    pos2 = pos1;
                    pos1 = temp;
                    output += pos1 + pos2;
                }
                System.out.println(output);
            } else
            {
                String rearrange = input.substring(1, input.length()) + input.substring(0, 1);
                String lastLetter = input.substring(0, 1);
                for (int j = 0; j < rearrange.length() - 1; j = j + 2)
                {
                    String pos1 = rearrange.substring(j, j + 1);
                    String pos2 = rearrange.substring(j + 1, j + 2);
                    String temp = pos2;
                    pos2 = pos1;
                    pos1 = temp;
                    output += pos1 + pos2;
                }
                output += lastLetter;
                System.out.println(output);

            }
        }
    }
}