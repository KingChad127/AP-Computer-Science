import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class comments
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("pr25.dat"));
        int count = file.nextInt();
        file.nextLine();
        for (int i = 0; i < count; i++)
        {
            String input = file.nextLine();
            String output = "";
            int startPos = input.indexOf("/*");
            int endPos = input.indexOf("*/");
            if (startPos == -1)
            {
                output = input;
                System.out.println(output);
            } else
            {
                output = input.substring(0, startPos) + input.substring(endPos + 2);
                System.out.println(output);
            }

        }
    }
}