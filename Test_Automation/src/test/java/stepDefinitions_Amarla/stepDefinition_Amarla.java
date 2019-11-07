package stepDefinitions_Amarla;
import org.openqa.selenium.WebDriver;

import common.ParameterParser;
import common.SingeltonBaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageFactory_Amarla.Login;
import cucumber.api.java.en.Then;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;


public class stepDefinition_Amarla extends SingeltonBaseClass{


	public static WebDriver driver  ;
	
	
	
/*************************************************************************************************/
	
									/** Hooks **/

/*************************************************************************************************/

	@Before
	public void setUp() {
		driver = getdriver();
	}
	
	
	@After
	public void tearDown() {
		driver.close();
	}
	
	
/*************************************************************************************************/
	
								/** TEST STEP tag= @test **/
	
/*************************************************************************************************/
	@Given("^This is a test$")
	public void this_is_a_test() throws Throwable {
		ParameterParser pp = new ParameterParser();
		pp.deserializeProjects();
		System.out.println("Cookie Name : "+pp.cookieName.toString()+"\n"+"Cookie Value : "+pp.cookieValue.toString());
    
}

	
/*************************************************************************************************/
	
								/** Background Scenario **/

/*************************************************************************************************/
	
	
	@Given("^Navigate to \"([^\"]*)\" on \"([^\"]*)\" Login page$")
    public void navigate_to_something_on_something_login_page(String project, String environment) throws Throwable {
       
    
	}

    @When("^Submit username and password$")
    public void submit_username_and_password() throws Throwable {
        
    }

    @Then("^Homepage is Displayed$")
    public void homepage_is_displayed() throws Throwable {
        
    }
	
   /*************************************************************************************************/
   /*************************************************************************************************/
	
	
	
	
	
	
	
   

}
