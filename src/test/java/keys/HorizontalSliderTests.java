package keys;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.HorizontalSliderPage;
import Selenium_practice.WebDriver_test.BaseTests;

public class HorizontalSliderTests extends BaseTests {

	
	@Test
	public void movetoValue() {
		HorizontalSliderPage horizslide = homePage.ClickOnHorizlink();
		horizslide.MoveToValueIncrease("3.5");
		assertEquals(horizslide.getValue(), "3.5");
		horizslide.MoveToValueDecrease("1.5");
		assertEquals(horizslide.getValue(), "1.5");
	}
	
	@Test
	public void movetoValue_by_action() {
		HorizontalSliderPage horizslide = homePage.ClickOnHorizlink();
		horizslide.MoveToValue(4);
		assertEquals(horizslide.getValue(), "4");
		horizslide.MoveToValue(2);
		assertEquals(horizslide.getValue(), "2");
	}
}
