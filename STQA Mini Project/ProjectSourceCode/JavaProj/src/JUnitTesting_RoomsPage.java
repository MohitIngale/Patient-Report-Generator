import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTesting_RoomsPage {

	Rooms roomspage = new Rooms("A", 58, "Ortho",5,"Fracture");
	
	@Test
	void RoomsCategoryButtonGroupClearCheck() throws InterruptedException {
		assertEquals(null, Rooms.Category.getSelection());
		Thread.sleep(2000);
	}

	@Test
	void PatientRatingCheck() throws InterruptedException {
		assertNotEquals(null, (double)roomspage.rating);	
		Thread.sleep(2000);
	}
	
	@Test
	void RoomsNutritionCheckboxClearCheck() throws InterruptedException {
		assertEquals(null, Rooms.Cbox.getSelection());
		Thread.sleep(2000);
	}
	
}
