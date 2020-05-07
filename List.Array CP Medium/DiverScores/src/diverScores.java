import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class diverScores
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("pr17.dat"));
        int count = file.nextInt();
        file.nextLine();
        for (int i = 0; i < count; i++)
        {
            String input = file.nextLine();
            // create array of Strings then convert to Arraylist of Doubles
            String[] scoresS = input.split(" ");
            ArrayList<Double> scores = new ArrayList<>();
            for (String string : scoresS)
            {
                double current = Double.parseDouble(string);
                scores.add(current);
            }
            double lowest = 10.0;
            double highest = 0.0;
            double degree = scores.get(scores.size() - 1);
            // find the highest value first then remove from ArrayLIst
            int indexOfHighest = 0;
            for (int j = 0; j < scores.size(); j++)
            {

                if (scores.get(j) > highest)
                {
                    highest = scores.get(j);
                    indexOfHighest = j;
                }
            }
            scores.remove(indexOfHighest);
            // find the Lowest value then remove it from the ArrayList
            int indexOfLowest = 0;
            for (int j = 0; j < scores.size(); j++)
            {
                if (scores.get(j) < lowest)
                {
                    lowest = scores.get(j);
                    indexOfLowest = j;
                }
            }
            scores.remove(indexOfLowest);
            double sum = 0.0;
            for (int j = 0; j < scores.size() - 1; j++)
            {
                sum += scores.get(j);
            }
            double average = (double) sum / 5;
            double finalScore = average * degree;
            System.out.printf("%.3f", finalScore);
            System.out.println("");
        }

    }
}