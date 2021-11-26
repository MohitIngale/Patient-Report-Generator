import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTesting_OrthoCategoryPage {

	
	OrthoCategory orthocategorypage = new OrthoCategory("A", 58, "Ortho");
	
	@Test
	void CategoryButtonGroupClearCheck() throws InterruptedException {
		assertEquals(null, OrthoCategory.Category.getSelection());
		Thread.sleep(2000);
	}
	
	@Test
	void RoutingOrthoCheck() throws InterruptedException {
		assertEquals("Ortho", orthocategorypage.pspeciality);
		Thread.sleep(2000);
	}
	
	@Test
	void InitalRatingCheck() throws InterruptedException {
		assertEquals(0, orthocategorypage.rating);
		Thread.sleep(2000);
	}
}
