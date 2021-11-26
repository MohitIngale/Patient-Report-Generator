import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JUnitTesting_LoginPage {

	LoginTest loginPage = new LoginTest();
	
	JUnitTesting_LoginPage(){
		
	}
	
	@Test
	void LoginButtonDisableCheck() throws InterruptedException {
		assertEquals(false, loginPage.loginButton.isEnabled());
		Thread.sleep(2000);
	}
	
	@Test
	void ViewPasswordButtonDisableCheck() throws InterruptedException {
		assertEquals(false, loginPage.showPassword.isSelected());
		Thread.sleep(2000);
	}
	
	@Test
	void LoginNameCheck() throws InterruptedException {
		assertNotEquals(null, loginPage.usernameTextField);	
		Thread.sleep(2000);
	}

	@Test
	void LoginPasswordCheck() throws InterruptedException {
		assertNotEquals(null, loginPage.passwordField);	
		Thread.sleep(2000);
	}
}
