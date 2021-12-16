package Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Selenium_practice.WebDriver_test.BaseTests;

public class LoginTests extends BaseTests {
	
	
	
	@Test
	public void SuccessLoginAction() {
		LoginPage login = homePage.ClickOnAuthentification();
		login.SetUsername("tomsmith");
		login.SetPassword("SuperSecretPassword!");
		SecureAreaPage secureArea = login.ClickSubmit();
		String Alerttxt = secureArea.getAlertText();
		assertTrue(Alerttxt.contains("You logged into a secure area!"),"Success");
		}
	@Test
	public void FailureLoginAction() {
		LoginPage login = homePage.ClickOnAuthentification();
		login.SetUsername("ameni");
		login.SetPassword("SuperSecretPassword!");
		SecureAreaPage secureArea = login.ClickSubmit();
		String Alerttxt = secureArea.getAlertText();
		assertTrue(Alerttxt.contains("Your username is invalid!"),"Success");
	}

}
