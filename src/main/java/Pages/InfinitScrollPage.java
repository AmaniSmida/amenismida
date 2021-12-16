package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfinitScrollPage {

	protected WebDriver driver;
	private By textBlocks  = By.className("jscroll-added");
	
	public InfinitScrollPage(WebDriver driver) {
		this.driver = driver; 
	}
	
	/**
	* Scrolls until paragraph with index specified is in view
	* @param index 1-based
	*/
	public void ScrollToParaghraph(int index) {
		while (GetNumberOfParaghraphs()< index ) {
		String script = "window.scrollTo(0, document.body.scrollHeight)";
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		
		jsExecutor.executeScript(script);
		}
	}
	public int GetNumberOfParaghraphs() {
		 return driver.findElements(textBlocks).size();
	}
	
}
