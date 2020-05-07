import java.util.*;

public class CollegeGroup
{
    private ArrayList <College> myColleges;

    public CollegeGroup()
    {
        myColleges = new ArrayList <College>();
    }

    // precondition:  collegeName exists in this CollegeGroup
    // postcondition: tuition for collegeName is changed to newTuition
    public void updateTuition(String collegeName, int newTuition)
    {
        for (int i = 0; i < myColleges.size(); i++)
        {
            College currentCollege = myColleges.get(i);
            if(currentCollege.getName().equals(collegeName))
            {
                currentCollege.setTuition(newTuition);
            }
        }
    }

    // precondition:  low <= high
    // postcondition: returns an ArrayList of colleges in region
    // where low <= tuition <= high;
    public ArrayList <College> getCollegeList(String region, int low, int high)
    {
        ArrayList<College> list = new ArrayList<>();
        boolean regionMatch;
        boolean range;
        for (int i = 0; i < myColleges.size(); i++)
        {
            regionMatch = false;
            range = false;
            College current = myColleges.get(i);
            if(current.getRegion().equals(region))
            {
                regionMatch = true;
            }
            if(current.getTuition() >= low && current.getTuition() <= high)
            {
                range = true;
            }
            if(range && regionMatch)
            {
                list.add(current);
            }
        }
        return list;
    }

    public void addCollege(College c)
    {
        myColleges.add(c);
    }

    public ArrayList <College> getColleges()
    {
        return myColleges;
    }

}
