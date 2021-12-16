package Alerts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.WysiwygEditor;
import Selenium_practice.WebDriver_test.BaseTests;

public class IframeTests extends BaseTests{

	private String text1 = "hello world ..";
	private String text2 = "hello ameni ..";
	
	@Test
	public void send_text_to_iframe() {
		WysiwygEditor wysiwygedit = homePage.ClickOnWysiwygEdt();
		wysiwygedit.cleartext();
		wysiwygedit.SendText(text1);
		wysiwygedit.decreaseIndention();
		wysiwygedit.SendText(text2);
		
		assertEquals(wysiwygedit.get_text(), text1 + text2,"text is incorrect");
	}
}
