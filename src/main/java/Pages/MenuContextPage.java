package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenuContextPage {

	protected WebDriver driver;
	private By menuContext = By.id("hot-spot");
	
	public MenuContextPage(WebDriver driver) {
		this.driver = driver; 
	}
	
	public void ClickDroitToContext() {
		WebElement menuCxt = driver.findElement(menuContext);
		Actions action = new Actions(driver);
		action.moveToElement(menuCxt).contextClick().perform();
	}
	
	public void Click_alert_accept() {
		driver.switchTo().alert().accept();
	}
	public String Get_alert_text() {
		return driver.switchTo().alert().getText();
	}
	
}
