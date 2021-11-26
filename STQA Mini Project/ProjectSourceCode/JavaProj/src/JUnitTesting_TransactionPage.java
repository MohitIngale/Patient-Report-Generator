import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JUnitTesting_TransactionPage {

	JUnitTesting_TransactionPage()
	{}
	
	Transaction transactionPage = new Transaction("A", 58, "Dental",7 , "Fracture","ICU");

	@Test
	void TranscationInitialAmtLabelCheck() throws InterruptedException {
		assertNotEquals("", transactionPage.totalAmtLabel);
		Thread.sleep(2000);
	}

	@Test
	void TransactionParameterAgeInitialCheck() throws InterruptedException {
		assertNotEquals(0, transactionPage.page);
		Thread.sleep(2000);
	}
	
	@Test
	void TranscationInitialAmtValueCheck() throws InterruptedException {
		assertNotEquals(null, transactionPage.baseCostTextField);	
		Thread.sleep(2000);
	}
	
	@Test
	void TranscationRecordNameCheck() throws InterruptedException {
		assertEquals("A", transactionPage.pname);	
		Thread.sleep(2000);
	}
	
	
}
