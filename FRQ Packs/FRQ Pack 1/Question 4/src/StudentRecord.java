public class StudentRecord
{
    private final int[] scores; // contains scores.length values
    // scores.length > 1

    // constructor
    public StudentRecord(int[] s)
    {
        scores = s;
    }

    // returns the average (arithmetic mean) of the values in scores
    // whose subscripts are between first and last, inclusive
    // precondition: 0 <= first <= last < scores.length
    private double average(int first, int last)
    {
        double sum = 0.0;
        int total = 0;
        for (int i = first; i <= last; i++)
        {
            sum += scores[i];
            total++;
        }
        double average = (double) sum / total;
        return average;
    }

    // returns true if each successive value in scores is greater
    // than or equal to the previous value;
    // otherwise, returns false
    private boolean hasImproved()
    {
        for (int i = 0; i < scores.length - 1; i++)
        {
            if (scores[i] > scores[i + 1])
            {
                return false;
            }
        }
        return true;
    }

    // if the values in scores have improved, returns the average
    // of the elements in scores with indexes greater than or equal
    // to scores.length/2;
    // otherwise, returns the average of all of the values in scores
    public double finalAverage()
    {
        double finalScore = 0.0;
        if (hasImproved())
        {
            finalScore = average(scores.length / 2, scores.length - 1);
        } else
        {
            finalScore = average(0, scores.length - 1);
        }
        return finalScore;
    }
}
