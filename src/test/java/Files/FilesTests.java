package Files;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.DownloadFilePage;
import Pages.UploadFilePage;
import Selenium_practice.WebDriver_test.BaseTests;

public class FilesTests extends BaseTests{

	
	@Test
	public void Upload_file_test() {
		UploadFilePage uploadPage = homePage.ClickOnUploadFile();
		uploadPage.ChoiceFile("D:\\amani\\Les différent type de coupe.docx");
		assertEquals(uploadPage.get_uploaded_file(), "Les différent type de coupe.docx", "file isn't uploaded correctly");
	}
	
	@Test
	public void Download_file_test() {
		DownloadFilePage downloadPage = homePage.ClickOnDownloadFile();
		downloadPage.Click_on_file_to_download();
		//assertEquals(uploadPage.get_uploaded_file(), "Les différent type de coupe.docx", "file isn't uploaded correctly");
	}
}
