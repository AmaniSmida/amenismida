package keys;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Pages.KeyPress;
import Selenium_practice.WebDriver_test.BaseTests;

public class KeysTests extends BaseTests{
	
	
	@Test
	public void SendKeys() {
	KeyPress keysPress = homePage.ClickOnKeyPress();
	keysPress.SendText("a"+ Keys.BACK_SPACE);
	assertEquals(keysPress.GetresultText(), "You entered: BACK_SPACE"); 
	}
	
	@Test
	public void AltTest() {
	KeyPress keysPress = homePage.ClickOnKeyPress();
	//keysPress.SendText("a"+ Keys.BACK_SPACE);
	keysPress.SendNumPad();
	assertEquals(keysPress.GetresultText(), "You entered: NUMPAD6"); 
	}
	

}
