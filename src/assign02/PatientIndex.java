package assign02;

import java.util.Map;
import java.util.TreeMap;
/**
 * PatientIndex extends Patient class. PatientIndex provides additional information
 * about the patient's last visit and physician.
 *
 * @author Julianna Bracamonte and Whitney Van Tassell
 * @version January 24, 2024
 */
public class PatientIndex
{
    private TreeMap<UHealthID, String> map;


    /**
     * The class constructor uses defines the comparator using a lambda function
     * which compare the string representation of the 2 UHealthID's.
     */
    public PatientIndex ()
    {
        this.map = new TreeMap <>((patient1, patient2) -> patient1.toString().compareTo(patient2.toString()));
    }

    /**
     * This method adds a patient to the tree map. If the patient already exists it is updated.
     * @param p
     */
    public void addPatient(Patient p)
    {
            boolean patientFound = false;
            for (Map.Entry<UHealthID, String> patient : map.entrySet()) {
                if (p.getUHealthID().equals(patient.getKey())) {
                    patient.setValue(p.getFirstName() + " " + p.getLastName());
                    patientFound = true;
                }
            }
            if (!patientFound) {
                map.put(p.getUHealthID(), p.getFirstName() + " " + p.getLastName());
            }
    }

    /**
     * Removes the patient from map if it exists, otherwise does nothing.
     * @param incomingPatient
     */
    public void removePatient(Patient incomingPatient)
    {
        for (var patientName: map.entrySet())
        {
            if (incomingPatient.getUHealthID().equals(patientName.getKey())) {
                map.remove(incomingPatient.getUHealthID());
            }
        }
    }

    /**
     * Gives the name of the patient with the corresponding ID.
     * @param id
     * @return name of patient.
     */
    public String getName(UHealthID id)
    {
        return (map.get(id));
    }


    /**
     * Helper method for getting map size.
     * @return map size
     */
    public int getMapSize()
    {
        return map.size();
    }
}
