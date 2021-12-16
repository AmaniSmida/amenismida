package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepPage {

	protected WebDriver driver;
	private By table = By.id("large-table");
	private By colum9 = By.xpath("//*[@id=\"large-table\"]/tbody/tr[2]/td[9]");
	
	public LargeAndDeepPage(WebDriver driver) {
		this.driver = driver;
	}
	 
	public void scroll_to_table() {
		WebElement tableElement = driver.findElement(table);
		String script = "arguments[0].scrollIntoView();";
		((JavascriptExecutor)driver).executeScript(script, tableElement);
	}
}
