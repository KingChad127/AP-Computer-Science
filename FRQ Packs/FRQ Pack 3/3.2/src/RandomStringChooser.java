import java.util.ArrayList;

public class RandomStringChooser
{
    String[] wordBank;
    ArrayList<Integer> usedWordsIndex;

    public RandomStringChooser(String[] wordBank)
    {
        this.wordBank = wordBank;
        usedWordsIndex = new ArrayList<>();
    }

    public String getNext()
    {
        //initialize random number
        int randomIndex = 0;
        //if all the words have been used, return "NONE"
        if (usedWordsIndex.size() == wordBank.length)
        {
            return "NONE";
        }
        //generate new index number until a unique one has been determined
        boolean used = true;
        while (used == true)
        {
            randomIndex = (int) (Math.random() * wordBank.length);
            int matches = 0;
            for (Integer x : usedWordsIndex)
            {
                if (randomIndex != x)
                {
                    matches++;
                }
            }
            if (matches == usedWordsIndex.size())
            {
                used = false;
            }
        }
        usedWordsIndex.add(randomIndex);
        return wordBank[randomIndex];
    }

}
