package Selenium_practice.WebDriver_test;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.HomePage;
import okio.Options;

public class BaseTests {

	private WebDriver driver;
	protected HomePage homePage;

	@BeforeClass
	public void SetUp() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
 
		//ChromeOptions
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", "D:\\Selenium\\Cours-révision");
		ChromeOptions options = new ChromeOptions();
		
		//options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--disable-infobars");
        
		driver = new ChromeDriver(options);

		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle());

		homePage = new HomePage(driver);

	}

	 @AfterClass
	 public void close() {
	 //close window
	 driver.quit();
	
	 }

}

/*
 * public void Shifting() {
 * 
 * WebElement shifingContent =
 * driver.findElement(By.linkText("Shifting Content")); shifingContent.click();
 * WebElement Menu1 =
 * driver.findElement(By.linkText("Example 1: Menu Element")); Menu1.click(); }
 * 
 * public int CalculeList() { List<WebElement> links =
 * driver.findElements(By.tagName("li")); int sizeLinks = links.size(); return
 * sizeLinks ;
 * 
 * }
 */
