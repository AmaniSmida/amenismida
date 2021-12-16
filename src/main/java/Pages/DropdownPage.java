package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
	
	WebDriver driver;
	
	private By dropDownOption = By.id("dropdown");
	
	
	public DropdownPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void SelectFromDropDown(String option) {
		Select dropDownElement = findDropdownElement() ;
		dropDownElement.selectByVisibleText(option);
	}
	
	private Select findDropdownElement() {
		return new Select(driver.findElement(dropDownOption) );
	}
	
	public List<String> getSelectedOption() {
		List<WebElement> listOption = findDropdownElement().getAllSelectedOptions();
		List<String> strings = new ArrayList<String>();
		for(WebElement e : listOption){
		    strings.add(e.getText());
		}
		return strings;
	}
	
	
}
