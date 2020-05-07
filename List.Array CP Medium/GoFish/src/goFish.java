import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class goFish
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("pr52.dat"));
        String playerOne = file.nextLine();
        ArrayList<String> handOne = new ArrayList<>(Arrays.asList(playerOne.split(" ")));
        String playerTwo = file.nextLine();
        ArrayList<String> handTwo = new ArrayList<>(Arrays.asList(playerTwo.split(" ")));
        for (int i = 0; i < 5; i++)
        {
            String playerOneMove = file.nextLine();
            boolean match1 = false;
            int index1 = 0;
            for (int j = 0; j < handTwo.size(); j++)
            {
                if (playerOneMove.equals(handTwo.get(j)))
                {
                    match1 = true;
                    index1 = j;
                }
            }
            if (match1 == true)
            {
                handTwo.remove(index1);
                System.out.println("HERE'S MY CARD");
            } else
            {
                System.out.println("GO FISH");
            }

            String playerTwoMove = file.nextLine();
            boolean match2 = false;
            int index2 = 0;
            for (int j = 0; j < handOne.size(); j++)
            {
                if (playerTwoMove.equals(handOne.get(j)))
                {
                    match2 = true;
                    index2 = j;
                }
            }
            if (match2 == true)
            {
                handOne.remove(index2);
                System.out.println("HERE'S MY CARD");
            } else
            {
                System.out.println("GO FISH");
            }
        }

    }
}