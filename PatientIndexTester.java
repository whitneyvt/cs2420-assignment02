package assign02;

import org.junit.jupiter.api.Test;

public class PatientIndexTester {

    private PatientIndex patientIndex = new PatientIndex();
    private Patient patient01 = new Patient("Eric", "Heisler", new UHealthID("123"));
    private Patient getPatient02 = new Patient("John", "Doe", new UHealthID("456")) ;



@Test
    void testduplicateName(){
    patientIndex.addPatient(patient01);
    patientIndex.addPatient(patient01);


}




}
