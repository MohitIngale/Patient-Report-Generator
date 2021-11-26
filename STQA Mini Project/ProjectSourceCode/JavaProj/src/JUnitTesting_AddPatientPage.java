import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JUnitTesting_AddPatientPage {

	AddPatient addPatientPage = new AddPatient();
	JUnitTesting_AddPatientPage()
	{}
	
	@Test
	void SpecialityButtonGroupClearCheck() throws InterruptedException {
		assertEquals(null, AddPatient.Speciality.getSelection());
		Thread.sleep(2000);
	}
	
	@Test
	void PatientNameCheck() throws InterruptedException {
		assertNotEquals(null, addPatientPage.pnameTextField);	
		Thread.sleep(2000);
	}

	@Test
	void PatientAgeNullCheck() throws InterruptedException {
		assertNotEquals(null, addPatientPage.pageTextField);	
		Thread.sleep(2000);
	}
	
	@Test
	void PatientAgeValidCheck() throws InterruptedException {
		assertNotEquals(0, addPatientPage.pageTextField);	
		Thread.sleep(2000);
	}
	
}
