package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecureAreaPage {

	WebDriver driver; 
	private By SuccessAlert= By.id("flash");
	private By EmailAlert = By.linkText("Internal Server Error");
	
	public SecureAreaPage(WebDriver driver) {
		this.driver = driver; 
	}
	
	public String getAlertText() {
		WebElement SuccessMesageElement = driver.findElement(SuccessAlert);
		String AlertText = SuccessMesageElement.getText();
		return AlertText ;
	}
	
}
