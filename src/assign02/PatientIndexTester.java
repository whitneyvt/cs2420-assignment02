package assign02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * This class contains tests for PatientIndex.
 *
 * @author Julianna Bracamonte and Whitney Van Tassell
 * @version January 24, 2024
 */
public class PatientIndexTester {


    @Test
    void testAddPatient() {
        PatientIndex patientIndex = new PatientIndex();
        Patient patient1 = new Patient("John", "Doe", new UHealthID("abcd1234"));
        Patient patient2 = new Patient("Jane", "Smith", new UHealthID("abcd5678"));

        patientIndex.addPatient(patient1);
        assertEquals("John Doe", patientIndex.getName(new UHealthID("abcd1234")));

        patientIndex.addPatient(patient1);
        assertEquals("John Doe", patientIndex.getName(new UHealthID("abcd1234")));

        patientIndex.addPatient(patient2);
        assertEquals("Jane Smith", patientIndex.getName(new UHealthID("abcd5678")));
    }

    @Test
    void testAddPatientSizeCorrect() {
        PatientIndex patientIndex = new PatientIndex();
        Patient patient1 = new Patient("John", "Doe", new UHealthID("abcd1234"));
        Patient patient2 = new Patient("Jane", "Smith", new UHealthID("abcd5678"));

        patientIndex.addPatient(patient1);
        assertEquals("John Doe", patientIndex.getName(new UHealthID("abcd1234")));

        patientIndex.addPatient(patient1);
        assertEquals("John Doe", patientIndex.getName(new UHealthID("abcd1234")));
        assertEquals(patientIndex.getMapSize(), 1);

        Patient updatedPatient1 = new Patient("John", "Smith", new UHealthID("abcd1234"));
        patientIndex.addPatient(updatedPatient1);
        assertEquals("John Smith", patientIndex.getName(new UHealthID("abcd1234")));
        assertEquals(patientIndex.getMapSize(), 1);

        patientIndex.addPatient(patient2);
        assertEquals("Jane Smith", patientIndex.getName(new UHealthID("abcd5678")));
        assertEquals(patientIndex.getMapSize(), 2);
    }


    @Test
    void testRemovePatient() {
        PatientIndex patientIndex = new PatientIndex();
        UHealthID healthID123 = new UHealthID("abcd1234");
        Patient patient1 = new Patient("John", "Doe", healthID123);

        patientIndex.addPatient(patient1);
        assertEquals("John Doe", patientIndex.getName(healthID123));

        patientIndex.removePatient(patient1);
        assertNull(patientIndex.getName(healthID123));
    }

    @Test
    void testGetName() {
        PatientIndex patientIndex = new PatientIndex();
        Patient patient1 = new Patient("John", "Doe", new UHealthID("abcd1234"));
        Patient patient2 = new Patient("Jane", "Smith", new UHealthID("abcd5678"));

        patientIndex.addPatient(patient1);
        patientIndex.addPatient(patient2);

        assertEquals("John Doe", patientIndex.getName(new UHealthID("abcd1234")));
        assertEquals("Jane Smith", patientIndex.getName(new UHealthID("abcd5678")));
        assertNull(patientIndex.getName(new UHealthID("asdf9876")));
    }





}



