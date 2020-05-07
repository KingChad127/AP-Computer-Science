import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class modes
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("pr50.dat"));
        int count = file.nextInt();
        file.nextLine();
        for (int i = 0; i < count; i++)
        {
            String input = file.nextLine();
            String[] arr = input.split(" ");
            ArrayList<Integer> modes = new ArrayList<>();
            int max = 0;
            for (int j = 0; j < arr.length; j++)
            {
                int match = 0;
                for (int k = 0; k < arr.length; k++)
                {
                    if (Integer.parseInt(arr[j]) == Integer.parseInt(arr[k]))
                    {
                        match++;
                    }
                }
                if (match > max)
                {
                    max = match;
                    modes.clear();
                    modes.add(Integer.parseInt(arr[j]));
                } else if (match == max && !modes.contains(Integer.parseInt(arr[j])))
                {
                    modes.add(Integer.parseInt(arr[j]));
                }
            }

            if (modes.size() == 1)
            {
                System.out.println("1 MODE");
            }

            else
            {
                System.out.println(modes.size() + " MODES");
            }

        }
    }
}