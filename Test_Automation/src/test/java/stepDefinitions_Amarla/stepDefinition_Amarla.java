package stepDefinitions_Amarla;
import org.openqa.selenium.WebDriver;
import common.SingeltonBaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


public class stepDefinition_Amarla extends SingeltonBaseClass{


	public static WebDriver driver = getdriver();
	
	
	
	
    @Given("^Open browser and start the application$")
    public void open_browser_and_start_the_application() throws Throwable {
        driver.get("https://qa.blue-day.com");
    }

    @When("^Valid username is entered$")
    public void valid_username_is_entered() throws Throwable {
       
    }

    @Then("^Homepage is displayed$")
    public void homepage_is_displayed() throws Throwable {
       
    }

    @And("^Valid password is entered$")
    public void valid_password_is_entered() throws Throwable {
        
    }


}
