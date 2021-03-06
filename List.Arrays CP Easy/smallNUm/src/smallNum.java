import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class smallNum
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("pr42.dat"));
        int count = file.nextInt();
        file.nextLine();
        for (int i = 0; i < count; i++)
        {
            String input = file.nextLine();
            String[] list = input.split(" ");
            double smallest = Double.parseDouble(list[0]);
            for (String num : list)
            {
                double current = Double.parseDouble(num);
                if (current < smallest)
                {
                    smallest = current;
                }
            }
            System.out.print(input + " = ");
            System.out.printf("%.2f", smallest);
            System.out.println("");
        }
    }
}