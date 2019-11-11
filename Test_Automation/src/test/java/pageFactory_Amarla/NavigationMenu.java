package pageFactory_Amarla;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NavigationMenu {
	
	
	WebDriver driver;
	
	
	public NavigationMenu(WebDriver driver) {
		
		this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	
	

}
