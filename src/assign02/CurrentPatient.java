package assign02;

import java.util.GregorianCalendar;

/**
 *
 * @author Eric Heisler and Julianna Bracamonte and Whitney Van Tassell
 * @version Jan 24, 2024
 */
public class CurrentPatient extends Patient
{
    private int physician;
    private GregorianCalendar lastVisit;
    public CurrentPatient(String firstName, String lastName, UHealthID uHealthID, int physician, GregorianCalendar lastVisit)
    {
        super(firstName, lastName, uHealthID);
        this.physician = physician;
        this.lastVisit = lastVisit;
    }
    public int getPhysician()
    {
        return physician;
    }
    public GregorianCalendar getLastVisit()
    {
        return lastVisit;
    }
    public void updatePhysician(int newPhysician)
    {
        physician = newPhysician;
    }
    public void updateLastVisit(GregorianCalendar date)
    {
        lastVisit = date;
    }
}
