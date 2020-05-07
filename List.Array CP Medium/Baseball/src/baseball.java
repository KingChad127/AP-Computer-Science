import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class baseball
{
    public static boolean isNumeric(String str)
    {
        if (str == null || str.length() == 0)
        {
            return false;
        }

        for (char c : str.toCharArray())
        {
            if (!Character.isDigit(c))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("pr51.dat"));
        int times = file.nextInt();
        file.nextLine();

        for (int i = 0; i < times; i++)
        {

            String line = file.nextLine(); // reading from the file/scanner
            String[] arr = line.split(" ");
            boolean check1 = false;
            int lastIndex = 0;
            int count = 0;
            for (String item : arr)
            {
                if (isNumeric(item))
                {
                    lastIndex = count;
                    check1 = true;
                }
                count++;
            }
            if (check1)
            {
                double average = 0;
                if (isNumeric(arr[lastIndex - 3]))
                {
                    average = (double) Integer.parseInt(arr[lastIndex - 3]) / Integer.parseInt(arr[lastIndex]);
                } else if (isNumeric(arr[lastIndex - 2]))
                {
                    average = (double) Integer.parseInt(arr[lastIndex - 2]) / Integer.parseInt(arr[lastIndex]);
                }
                String newLine = "";
                for (int j = 0; j < arr.length; j++)
                {
                    if (j == lastIndex)
                    {
                        System.out.print(arr[j] + " (");
                        System.out.printf("%.3f", average);
                        System.out.print(") ");
                    } else
                    {
                        System.out.print(arr[j] + " ");
                    }
                }
                System.out.println();
            } else
            {
                System.out.println(line);
            }
        }
    }
}