package Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Selenium_practice.WebDriver_test.BaseTests;

public class ForgotPasswordTests extends BaseTests{
	
	@Test
	public void ChangePwd() {
		
	ForgotPasswrdPage forgotPage = homePage.ClickOnForgotPasswrd();
	EmailSentPage emailpage = forgotPage.retrievePassword("ameni.smida@outlook.fr");
	String TextAlerttxt = emailpage.getAlertTextPassword();
    //assertEquals(emailpage.getAlertTextPassword(), "Your e-mail's been sent!", "Message is incorrect");
	//assertTrue(TextAlerttxt.contains("Error"), "the message is correct");
	
	}

}
