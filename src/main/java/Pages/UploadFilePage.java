package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadFilePage {

	protected WebDriver driver;
	private By fileUpload = By.id("file-upload");
	private By btnfileUpload = By.id("file-submit");
	private By uploadedFile = By.id("uploaded-files");
	
	public UploadFilePage(WebDriver driver) {
		this.driver = driver;
	}
	public void ChoiceFile(String absolutePathOfFile) {
		WebElement fileChoice = driver.findElement(fileUpload);
		fileChoice.sendKeys(absolutePathOfFile);	
		ClickOnUploadButton();
	}
	
	private void ClickOnUploadButton() {
		WebElement uploadButton = driver.findElement(btnfileUpload);
		uploadButton.click();
	}
	
	public String get_uploaded_file() {
		WebElement uploadedfile = driver.findElement(uploadedFile);
		return uploadedfile.getText();
	}
}
