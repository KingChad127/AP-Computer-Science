import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sumEm
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("pr40.dat"));
        int count = file.nextInt();
        file.nextLine();
        for (int i = 0; i < count; i++)
        {
            String input = file.nextLine();
            String[] array = input.split(" ");
            double sum = 0.00;
            for (String string : array)
            {
                sum += Double.parseDouble(string);
            }
            System.out.print(input + " = ");
            System.out.printf("%.2f", sum);
            System.out.println("");
        }
    }
}