package stepDefinitions_Amarla;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Parser;
import common.SingeltonBaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


import pageFactory_Amarla.LoginPage;
import pageFactory_Amarla.NavigationMenu;
import cucumber.api.java.en.Then;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;


public class stepDefinition_Amarla extends SingeltonBaseClass{


	public  WebDriver driver ;
	public  WebDriverWait wait ;
	
	public Parser parser = new Parser();
	
/*************************************************************************************************/
	
									/** Hooks **/ 

/*************************************************************************************************/

	@Before
	public void setUp() {
		driver = getdriver();	
		wait = new WebDriverWait(driver, 10);
		
	}
	
	
	@After
	public void tearDown() {
		//driver.manage().deleteAllCookies();
		driver.close();
		}
	
	
/*************************************************************************************************/
	
								/** TEST STEP tag= @test **/
	
/*************************************************************************************************/
	@Given("^This is a test$")
	public void this_is_a_test() throws Throwable {
		
		System.out.println("This is a test");
		
		//parser.deserializeMenu("STM");
		
		/*ParameterParser pp = new ParameterParser();
		pp.deserializeProjects("a","b");
		System.out.println("Cookie Name : "+pp.cookieName.toString()+"\n"+"Cookie Value : "+pp.cookieValue.toString()); */
		
}

	
	  @Given("^This is a 2nd test$")
	    public void this_is_a_2nd_test() throws Throwable {
		  System.out.println("test2");
	    }
	
/*************************************************************************************************/
	
								/** Background Scenario **/

/*************************************************************************************************/
	
	
	@Given("^Navigate to \"([^\"]*)\" on \"([^\"]*)\" Login page$")
    public void navigate_to_something_on_something_login_page(String project, String environment) throws Throwable {
       
		parser.deserializeProjects(project,environment);
		driver.get(parser.path);
		//Setting up cookies
		Cookie projectCookie = new Cookie(parser.cookieName,parser.cookieValue);
		driver.manage().addCookie(projectCookie);
	
	}

    @When("^Submit username and password$")
    public void submit_username_and_password() throws Throwable {
    	
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.submit_username_and_password(parser.userName,parser.password);
    	
		
    }

    @Then("^Homepage is Displayed$")
    public void homepage_is_displayed() throws Throwable {
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkSiteMap")));
    	WebElement bluedayButton = driver.findElement(By.id("linkSiteMap"));
    	Assert.assertEquals(true,bluedayButton.isDisplayed());
    }
	
   /*************************************************************************************************/
   /*************************************************************************************************/
    @Given("^Role (.+) is selected$")
    public void role_is_selected(String role) throws Throwable {
       
    //@Given("^Role \"([^\"]*)\" is selected$")
    //public void role_something_is_selected(String role) throws Throwable {
       
       parser.deserializeMenu(role);
       
       NavigationMenu navMenu = new NavigationMenu(driver);
       navMenu.SelectRole(role);
      
       String footer = driver.findElement(By.xpath("//div[@class='runOn']")).getText().toString();
       footer = footer.substring(footer.length()-3);
       System.out.println(footer);
       assertEquals(role.toLowerCase(),footer.toLowerCase());
       
    }

    @When("^Navigate from menus$")
    public void navigate_from_menus() throws Throwable {
        
    }

    @Then("^Menu is correctly displayed$")
    public void menu_is_correctly_displayed() throws Throwable {
      
    }

    @And("^Default page is displayed$")
    public void default_page_is_displayed() throws Throwable {
        
    }
	
	
	
	
	
	
   

}
