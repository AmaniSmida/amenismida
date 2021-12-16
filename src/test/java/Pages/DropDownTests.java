package Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import Selenium_practice.WebDriver_test.BaseTests;

public class DropDownTests extends BaseTests{
	
    String option = "Option 1"; 
	
	@Test
	public void SelectOption1() {
		DropdownPage dropdown = homePage.ClickOnDrodown();
		dropdown.SelectFromDropDown(option);
		List<String> selectedOption = dropdown.getSelectedOption();
		assertEquals(selectedOption.size(), 1, "Incorrect number of selections");
		assertTrue(selectedOption.contains(option),"Option not selected");
	}
	
	
}
