package Alerts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.MenuContextPage;
import Selenium_practice.WebDriver_test.BaseTests;

public class MenuContextTests extends BaseTests{

	@Test
	public void Menu_context_click() {
		MenuContextPage menu_context = homePage.ClickOnMenuContext();
		menu_context.ClickDroitToContext();
		String text = menu_context.Get_alert_text();
		menu_context.Click_alert_accept();
		assertEquals(text, "You selected a context menu" , "incorrect");
	}
}
