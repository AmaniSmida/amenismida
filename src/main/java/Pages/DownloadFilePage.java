package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DownloadFilePage {

	protected WebDriver driver;
	private By fileDownload = By.xpath("//*[@id=\"content\"]/div/a[3]");
	
	public DownloadFilePage(WebDriver driver) {
		this.driver = driver; 
	}
	
	public void Click_on_file_to_download() {
		WebElement downloadedFile = driver.findElement(fileDownload);
		downloadedFile.click();		
	}
}
