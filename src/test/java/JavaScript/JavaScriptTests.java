package JavaScript;

import org.testng.annotations.Test;

import Pages.InfinitScrollPage;
import Pages.LargeAndDeepPage;
import Selenium_practice.WebDriver_test.BaseTests;

public class JavaScriptTests extends BaseTests{

	
	@Test
	public void scrollToTable() {
		LargeAndDeepPage scrollTotable = homePage.ClickOnScrollLink();
		scrollTotable.scroll_to_table();
	}
	
	@Test
	public void scrollToParaghraph() {
		InfinitScrollPage infinitepage = homePage.ClickOnInfinitScrollLink();
		infinitepage.ScrollToParaghraph(6);
	}
}
