package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditor {

	WebDriver driver;
	private String editoriframe = "mce_0_ifr";
	private By textArea = By.id("tinymce");
	private By decreaseIndentButton = By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]");

	public WysiwygEditor(WebDriver driver) {
		this.driver = driver;
	}


	public void SwitchToIframe() {
		driver.switchTo().frame(editoriframe);
	}

	public void SwitchToFrameContext() {
		driver.switchTo().parentFrame();
	}

	public void cleartext() {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		SwitchToIframe();
		driver.findElement(textArea).clear();
		SwitchToFrameContext();
	}

	public void SendText(String text) {
		SwitchToIframe();
		driver.findElement(textArea).sendKeys(text);
		SwitchToFrameContext();
	}

	public String get_text() {
		SwitchToIframe();
		String text = driver.findElement(textArea).getText();
		SwitchToFrameContext();
		return text;
	}
	public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }

}
