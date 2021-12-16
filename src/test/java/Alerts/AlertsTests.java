package Alerts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.AlertsPage;
import Selenium_practice.WebDriver_test.BaseTests;

public class AlertsTests extends BaseTests{

	@Test
	public void click_to_accept_alert() {
		AlertsPage alertpop_up = homePage.ClickOnAlertLink();
		alertpop_up.TriggerAlert();
		assertTrue(alertpop_up.getTextAlert().contains("I am a JS Alert"), "message is correct");
		alertpop_up.Click_to_accept();
		assertEquals(alertpop_up.getResult(), "You successfully clicked an alert");
	}

	@Test
	public void click_to_accept_alert_accept() {
		AlertsPage alertpop_up = homePage.ClickOnAlertLink();
		alertpop_up.TriggerConfirmAlert();
		assertTrue(alertpop_up.getTextAlert().contains("I am a JS Confirm"), "message is correct");
		alertpop_up.Click_to_accept();
		assertEquals(alertpop_up.getResult(), "You clicked: Ok");
	}

	@Test
	public void click_to_accept_alert_dismiss() {
		AlertsPage alertpop_up = homePage.ClickOnAlertLink();
		alertpop_up.TriggerConfirmAlert();
		assertTrue(alertpop_up.getTextAlert().contains("I am a JS Confirm"), "message is correct");
		alertpop_up.Click_to_dismiss();
		assertEquals(alertpop_up.getResult(), "You clicked: Cancel");
	}

	@Test
	public void click_to_accept_alert_prompt() {
		AlertsPage alertpop_up = homePage.ClickOnAlertLink();
		alertpop_up.TriggerPromptAlert();
		assertTrue(alertpop_up.getTextAlert().contains("I am a JS prompt"), "message is correct");
		alertpop_up.SendTextAlert("ameni");
		alertpop_up.Click_to_accept();
		assertEquals(alertpop_up.getResult(),"You entered: ameni");
	}
	
}
