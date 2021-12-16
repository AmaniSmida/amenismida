package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver; 
	private By Authentification = By.linkText("Form Authentication");
	private By dropDownField = By.linkText("Dropdown");
	private By ForgotPasswrd = By.linkText("Forgot Password");
	private By Hovers = By.linkText("Hovers");
	private By Keys = By.linkText("Key Presses");
	private By HorizSlider = By.linkText("Horizontal Slider");
	private By alerts = By.xpath("//*[@id=\"content\"]/ul/li[29]/a");
	private By uploadFile = By.xpath("//*[@id=\"content\"]/ul/li[18]/a");
	private By downloadFile = By.xpath("//*[@id=\"content\"]/ul/li[17]/a");
	private By menuContexet = By.xpath("//*[@id=\"content\"]/ul/li[7]/a");
	private By wysiwygEditor = By.xpath("//*[@id=\"content\"]/ul/li[44]/a");
	private By largeDeep = By.xpath("//*[@id=\"content\"]/ul/li[32]/a");
	private By infinitscroll = By.xpath("//*[@id=\"content\"]/ul/li[26]/a");
	
	public HomePage(WebDriver driver) {
		this.driver = driver; 
	}
	
	private void ClickLink(By LinkText) {
		WebElement Lien = driver.findElement(LinkText);
		Lien.click();
	}
	
	public LoginPage ClickOnAuthentification() {
		ClickLink(Authentification);
		return new LoginPage(driver);
	}
	
	public DropdownPage ClickOnDrodown() {
		ClickLink(dropDownField);
		return new DropdownPage(driver);
	}
	
	public ForgotPasswrdPage ClickOnForgotPasswrd() {
		ClickLink(ForgotPasswrd);
		return new ForgotPasswrdPage(driver);
	}

	public HoversPage ClickOnHover() {
		ClickLink(Hovers);
		return new HoversPage(driver);
	}
	
	public KeyPress ClickOnKeyPress() {
		ClickLink(Keys);
		return new KeyPress(driver);		
	}
	public HorizontalSliderPage ClickOnHorizlink() {
		ClickLink(HorizSlider);
		return new HorizontalSliderPage(driver);
	}
	public AlertsPage ClickOnAlertLink() {
		ClickLink(alerts);
		return new AlertsPage(driver);		
	}
	public UploadFilePage ClickOnUploadFile() {
		ClickLink(uploadFile);
		return new UploadFilePage(driver);		
	}
	public DownloadFilePage ClickOnDownloadFile() {
		ClickLink(downloadFile);
		return new DownloadFilePage(driver);		
	}
	public MenuContextPage ClickOnMenuContext() {
		ClickLink(menuContexet);
		return new MenuContextPage(driver);		
	}
	public WysiwygEditor ClickOnWysiwygEdt() {
		ClickLink(wysiwygEditor);
		return new WysiwygEditor(driver);		
	}
	public LargeAndDeepPage ClickOnScrollLink() {
		ClickLink(largeDeep);
		return new LargeAndDeepPage(driver);
		
	}
	public InfinitScrollPage ClickOnInfinitScrollLink() {
		ClickLink(infinitscroll);
		return new InfinitScrollPage(driver);
		
	}
}
