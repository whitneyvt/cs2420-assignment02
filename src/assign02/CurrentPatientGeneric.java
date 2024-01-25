package assign02;

import java.util.GregorianCalendar;

/**
 *
 * @author Julianna Bracamonte and Whitney Van Tassell
 * @version January 24, 2024
 *
 * @param <Type>
 */
public class CurrentPatientGeneric<Type> extends Patient
{
    private Type physician;
    private GregorianCalendar lastVisit;
    public CurrentPatientGeneric(String firstName, String lastName, UHealthID uHealthID, Type physician, GregorianCalendar lastVisit)
    {
        super(firstName, lastName, uHealthID);
        this.physician = physician;
        this.lastVisit = lastVisit;
    }
    public Type getPhysician()
    {
        return physician;
    }
    public GregorianCalendar getLastVisit()
    {
        return lastVisit;
    }
    public void updatePhysician(Type newPhysician)
    {
        physician = newPhysician;
    }
    public void updateLastVisit(GregorianCalendar date)
    {
        lastVisit = date;
    }
}
