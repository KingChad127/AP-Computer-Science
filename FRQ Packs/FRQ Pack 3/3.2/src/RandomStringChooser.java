import java.util.ArrayList;

public class RandomStringChooser
{
    String[] wordBank;
    ArrayList<String> usedWords;

    public RandomStringChooser(String[] wordBank)
    {
        this.wordBank = wordBank;
        usedWords = new ArrayList<>();
    }

    public String getNext()
    {
        //initialize random number
        int randomIndex = 0;
        //if all the words have been used, return "NONE"
        if (usedWords.size() == wordBank.length)
        {
            return "NONE";
        }
        //generate new index number until a unique one has been determined
        boolean used = true;
        while (used == true)
        {
            randomIndex = (int) (Math.random() * wordBank.length);
            int matches = 0;
            for (String s : usedWords)
            {
                if (!wordBank[randomIndex].equals(s))
                {
                    matches++;
                }
            }
            if (matches == usedWords.size())
            {
                used = false;
            }
        }
        usedWords.add(wordBank[randomIndex]);
        return wordBank[randomIndex];
    }

}
