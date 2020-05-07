public class NumberRuns
{
    // Part (a)
    /** Returns an array of the values obtained by tossing a number cube numTosses times.
     * @param cube a NumberCube
     * @param numTosses the number of tosses to be recorded
     * Precondition: numTosses > 0
     * @return an array of numTosses values
     */
    public static int[] getCubeTosses(NumberCube cube, int numTosses)
    {
        int[] results = new int[numTosses];
        for (int i = 0; i < results.length; i++)
        {
            results[i] = cube.toss();
        }
        return results;
    }

    // Part (b)
    /** Returns the starting index of a longest run of two or more consecutive repeated values
     * in the array values.
     * @param values an array of integer values representing a series of number cube tosses
     * Precondition: values.length > 0
     * @return the starting index of a run of maximum size;
     * -1 if there is no run
     */
    public static int getLongestRun(int[] values)
    {
        int greatestRun = 0;
        int startingIndex = -1;
        int run = 0;
        for (int i = 0; i < values.length - 1; i++)
        {
            if(values[i] == values[i+1])
            {
                run++;
            }
            else
            {
                run = 0;
            }
            if(run > greatestRun)
            {
                greatestRun = run;
                startingIndex = i - run + 1;
            }
        }
        return startingIndex;
    }

    public String print(int[] arr)
    {
        String output = "";

        for(int i = 0; i < arr.length; i++)
        {
            output += String.format("%3d", i);
        }
        output += "\n";
        for(int n : arr)
        {
            output += ("---");
        }
        output += "\n";

        for(int n : arr)
        {
            output += String.format("%3d", n);
        }

        output += "\n\n";
        output += "Index of Longest Run = " + getLongestRun(arr);
        output += "\n";

        return output;
    }

    public static void main(String[] args)
    {
        NumberRuns app = new NumberRuns();

        int[] toss1 = app.getCubeTosses(new NumberCube(), 17);
        System.out.println(app.print(toss1));

        int[] toss2 = app.getCubeTosses(new NumberCube(), 17);
        System.out.println(app.print(toss2));

        int[] toss3 = app.getCubeTosses(new NumberCube(), 17);
        System.out.println(app.print(toss3));

        int[] toss4 = {1,3,2,4,6,5,1,3,2,4,6,5,1,3,2,4};
        System.out.println(app.print(toss4));

        int[] toss5 = {1,3,2,4,6,5,1,1,2,4,6,5,9,9,9,9};
        System.out.println(app.print(toss5));
    }
}
