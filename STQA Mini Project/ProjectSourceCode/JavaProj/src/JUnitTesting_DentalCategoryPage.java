import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTesting_DentalCategoryPage {

	DentalCategory dentalcategorypage = new DentalCategory("A", 58, "Dental");
	
	@Test
	void CategoryButtonGroupClearCheck() throws InterruptedException {
		assertEquals(null, DentalCategory.Category.getSelection());
		Thread.sleep(2000);
	}
	
	@Test
	void RoutingDentalCheck() throws InterruptedException {
		assertEquals("Dental", dentalcategorypage.pspeciality);
		Thread.sleep(2000);
	}
	
	@Test
	void InitalRatingCheck() throws InterruptedException {
		assertEquals(0, dentalcategorypage.rating);
		Thread.sleep(2000);
	}
}
