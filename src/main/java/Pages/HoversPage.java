package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

	WebDriver driver;
	private By figure = By.className("figure");
	
	public HoversPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// @param -- the first index is 1 
	public void HoverOnFigure(int index) {
		
		WebElement figure1 =driver.findElements(figure).get(index -1);
		
		Actions action = new  Actions(driver);
		action.moveToElement(figure1).perform();
	}
}
