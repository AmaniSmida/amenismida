package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
WebDriver driver; 
private By UserNameField = By.id("username");
private By PassWordField = By.id("password");
private By submitbutton = By.className("radius");

public LoginPage(WebDriver driver) {
	this.driver = driver;
}


public void SetUsername(String yourName) {
	WebElement username =driver.findElement(UserNameField);
	username.sendKeys(yourName);
}

public void SetPassword(String yourpasswd) {
	WebElement password = driver.findElement(PassWordField);
	password.sendKeys(yourpasswd);
}

public SecureAreaPage ClickSubmit() {
	WebElement submit = driver.findElement(submitbutton);
	submit.click();
	return new SecureAreaPage(driver);
}

}
