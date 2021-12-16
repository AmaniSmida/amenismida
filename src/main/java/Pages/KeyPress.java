package Pages;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPress {

	WebDriver driver;
	private By keyPress = By.id("target");
	private By result = By.id("result");
	public KeyPress(WebDriver driver) {
		this.driver = driver;
	}

	public void SendText(String text) {
		WebElement keyEspace = driver.findElement(keyPress);
		keyEspace.sendKeys(text);
	}

	public String GetresultText() {
		WebElement resultText = driver.findElement(result);
		return resultText.getText();
	}

	public void SendNumPad() {
		SendText(Keys.chord(Keys.ALT, Keys.NUMPAD6));
	}
}
