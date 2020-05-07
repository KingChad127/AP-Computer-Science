public class Standford implements College
{
    // instance variables
    private int tuition;

    // constructor
    public Standford(int t)
    {
        tuition = t;
    }
    public String getName()
    {
        return "Stanford University";
    }
    public String getRegion()
    {
        return "West";
    }
    public int getTuition()
    {
        return tuition;
    }
    public void setTuition(int newTuition)
    {
        tuition = newTuition;
    }
}
