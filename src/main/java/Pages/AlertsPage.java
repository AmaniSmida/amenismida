package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsPage {

	private WebDriver driver;
	private By triggerAlertButton  = By.xpath(".//button[text()='Click for JS Alert']");
	private By triggerConfirmButton  = By.xpath(".//button[text()='Click for JS Confirm']");
	private By triggerPromptButton  = By.xpath(".//button[text()='Click for JS Prompt']");
	private By results  = By.id("result");
	
	public AlertsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void ClickOn(By text) {
		WebElement alert = driver.findElement(text);
		alert.click();
	}

	public void TriggerAlert() {
		ClickOn(triggerAlertButton);
		}

	public void TriggerConfirmAlert() {
		ClickOn(triggerConfirmButton);
	}

	public void TriggerPromptAlert() {
		ClickOn(triggerPromptButton);
	}
	
	public void Click_to_accept() {
		driver.switchTo().alert().accept();
	}
	
	public void Click_to_dismiss() {
		driver.switchTo().alert().dismiss();
	}
	
	public String getTextAlert(){
		return driver.switchTo().alert().getText();
	}
	
	public void SendTextAlert(String text){
	 driver.switchTo().alert().sendKeys(text);
	}
	
	public String getResult() {
		return driver.findElement(results).getText();
	}
}
