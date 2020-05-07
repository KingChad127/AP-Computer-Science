import java.util.*;

public class SchoolRoster
{
    // a list of students on the school's roster
    private ArrayList <StudentInfo> roster;

    public SchoolRoster()
    {
        roster = new ArrayList <StudentInfo>();
        roster.add(new StudentInfo("King", 45, 171));
        roster.add(new StudentInfo("Norton", 128, 448));
        roster.add(new StudentInfo("Solo", 125, 350));
        roster.add(new StudentInfo("Kramden", 150, 150));
    }

    // precondition:  The name, creditHours and gradePoints
    //                data members have been initialized for each record in
    //                in roster.
    // postcondition: the GPA data member of each record in roster has
    //                been calculated.
    public void computeGPA()
    {
        double GPA = 0.0;
        for (StudentInfo student : roster)
        {
            if(student.getCreditHours() == 0)
            {
                GPA = 0.0;
            }
            GPA = student.getGradePoints() / student.getCreditHours();
            student.setGPA(GPA);
        }
    }

    // postcondition: returns true if this student's credit
    //                hours >= 125 and GPA >= 2.0; otherwise,
    //                returns false.
    public boolean isSenior(StudentInfo student)
    {
        if(student.getGPA() >= 2.0 && student.getCreditHours() >= 125)
        {
            return true;
        }
        return false;
    }
    // postcondition: determines which students in the roster are
    //                seniors and returns an ArrayList containing
    //                those records.
    public ArrayList <StudentInfo> fillSeniorList()
    {
        ArrayList<StudentInfo> seniors = new ArrayList<>();
        for (StudentInfo student : roster)
        {
            if(isSenior(student))
            {
                seniors.add(student);
            }
        }
        return seniors;
    }

    public String toString()
    {
        String str="";
        for(int i=0; i < roster.size(); i++)
        {
            str += roster.get(i) + "\n";
        }

        return str;
    }
}