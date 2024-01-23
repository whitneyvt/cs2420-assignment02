package assign02;

import java.util.TreeMap;
import java.util.*;
/**
 *
 */
public class PatientIndex
{
    /**
     *
     */
    private TreeMap<UHealthID, String> map;
    public PatientIndex ()
    {
        this.map = new TreeMap <>((patient1, patient2) -> patient1.toString().compareTo(patient2.toString()));
    }

    /**
     *
     * @param p
     */
    public void addPatient(Patient p)
    {
        for (var patient: map.entrySet())
        {
            if (p.getUHealthID().equals(patient.getKey()))
                patient.setValue(p.getFirstName() + " " + p.getLastName());
            map.put(p.getUHealthID(), p.getFirstName() + " " + p.getLastName());
        }
    }

    /**
     *
     * @param p
     */
    public void removePatient(Patient p)
    {
        for (var patient: map.entrySet())
        {
            if (p.getUHealthID().equals(patient.getKey()))
                map.remove(patient);
        }
    }

    /**
     *
     * @param id
     * @return
     */
    public String getName(UHealthID id)
    {
        return (map.get(id));
    }
}
