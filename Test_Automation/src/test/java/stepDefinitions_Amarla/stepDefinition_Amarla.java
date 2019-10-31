package stepDefinitions_Amarla;
import org.openqa.selenium.WebDriver;

import common.SingeltonBaseClass;
import cucumber.api.java.en.Given;



public class stepDefinition_Amarla extends SingeltonBaseClass{

	public static WebDriver driver = getdriver();
	
	@Given("^Open browser$")
	public void Open_browser() throws Throwable {
		
		driver.get("https://qa.blue-day.com/");
	
	}


}
