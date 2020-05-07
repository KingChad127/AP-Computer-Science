import java.util.ArrayList;

public class DailySchedule
{
    // contains Appointment objects, no two Appointments overlap
    private final ArrayList<Appointment> apptList;

    public DailySchedule()
    {
        apptList = new ArrayList<Appointment>();
    }

    // part (b)
    // removes all appointments that overlap the given Appointment
    // postcondition: all appointments that have a time conflict with
    //appt have been removed from this DailySchedule
    public void clearConflicts(Appointment appt)
    {
        for (int i = 0; i < apptList.size(); i++)
        {
            if (apptList.get(i).conflictsWith(appt))
            {
                apptList.remove(apptList.get(i));
                i--;
            }
        }
    }


    // part (c)
    // if emergency is true, clears any overlapping appointments and adds
    // appt to this DailySchedule; otherwise, if there are no conflicting
    // appointments, adds appt to this DailySchedule;
    // returns true if the appointment was added;
    // otherwise, returns false
    public boolean addAppt(Appointment appt, boolean emergency)
    {
        if (emergency)
        {
            clearConflicts(appt);
            apptList.add(appt);
            return true;
        } else
        {
            for (int i = 0; i < apptList.size(); i++)
            {
                if(apptList.get(i).conflictsWith(appt))
                {
                    return false;
                }
            }
            apptList.add(appt);
            return true;
        }

    }

    public String toString()
    {
        String str = "";

        for (Appointment appt : apptList)
        {
            str += appt.getDescription() + "     " + appt.getTime().toString() + "\n";
        }

        return str;
    }
}
