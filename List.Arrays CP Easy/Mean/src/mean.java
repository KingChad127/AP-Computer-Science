import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class mean
{
    public static void main(String[] args) throws IOException
    {
        final double DIAMETER = 10;
        Scanner file = new Scanner(new File("pr43.dat"));
        int count = file.nextInt();
        file.nextLine();
        for (int i = 0; i < count; i++)
        {
            double sum = 0.0;
            String input = file.nextLine();
            String[] list = input.split(" ");
            for (String x : list)
            {
                double current = Double.parseDouble(x);
                sum += current;
            }
            double mean = sum / DIAMETER;
            System.out.printf("%.2f", mean);
            System.out.println("");
        }
    }
}