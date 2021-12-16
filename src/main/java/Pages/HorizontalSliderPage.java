package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {

	private WebDriver driver;
	private By slider = By.xpath("//*[@id=\"content\"]/div/div/input");
	private By resultValue = By.id("range");
	
	public HorizontalSliderPage(WebDriver driver) {
		this.driver =driver; 
	}
	
	public void MoveToValueIncrease(String value) {
		WebElement sliderElement = driver.findElement(slider);
		while (!getValue().equals(value)) {
			sliderElement.sendKeys(Keys.ARROW_RIGHT);
		}		
	}
	
	public void MoveToValueDecrease(String value2) {
		WebElement sliderElement = driver.findElement(slider);
		if (Double.parseDouble(getValue())> Double.parseDouble(value2) ) {
			while (!getValue().equals(value2)) {
				sliderElement.sendKeys(Keys.ARROW_LEFT);
			}
		}
	}
	
	public String getValue() {
		WebElement resultrange =driver.findElement(resultValue);
		return resultrange.getText();	
	}
	
	// how to move to double number ??? 
	public void MoveToValue(int value) {
		WebElement valueNumber = driver.findElement(slider);
		Actions action = new Actions(driver);
		//action.moveToElement(valueNumber).moveByOffset(value, 0).perform();
		action.moveToElement(valueNumber, value, 0).perform();
	}
}
