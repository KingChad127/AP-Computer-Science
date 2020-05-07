import java.util.*;

public class DailyTransactions
{
    // instance variables
    private ArrayList <Transaction> allTransactions;  // contains all transactions in a single day


    public DailyTransactions()
    {
        allTransactions = new ArrayList <Transaction> ();
    }

    public void addTransaction(Transaction transaction)
    {
        allTransactions.add(transaction);
    }

    public String printTransactions()
    {
        String output = "";

        for(Transaction t : allTransactions)
        {
            output += t.toString() + "\n";
        }

        return output;
    }
}
