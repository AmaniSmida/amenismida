package Pages;

import org.openqa.selenium.WebDriver;

public class EmailSentPage {

	WebDriver driver;
	
	public EmailSentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getAlertTextPassword() { 
		String AlertText = driver.getTitle();
		return AlertText ;
	}
	
	
}
