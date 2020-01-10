package stepDefinitions_Amarla;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Parser;
import common.SingeltonBaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory_Amarla.Calendar;
import pageFactory_Amarla.Common_Method;
import pageFactory_Amarla.LoginPage;
import pageFactory_Amarla.NavigationMenu;


public class stepDefinition_Amarla {

	
	public  static WebDriver driver ;
	public WebDriverWait wait ;
	public Parser parser = new Parser();
	public static String glb_role;
	
/*************************************************************************************************/
	
									/** Hooks **/ 

/*************************************************************************************************/

	@Before
	public void setUp() {
		
		SingeltonBaseClass instance = SingeltonBaseClass.getInstance();
		driver = instance.getdriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	}
	
	
	@After
	public void tearDown() {
		
		driver.manage().deleteAllCookies();
		driver.quit();
		SingeltonBaseClass.getInstance().driver=null;
	
	}
	
	
	
/*************************************************************************************************/
	
								/** Background Scenario **/

/*************************************************************************************************/
	
	
	@Given("^Navigate to \"([^\"]*)\" on \"([^\"]*)\" Login page and connect$")
    public void navigate_to_something_on_something_login_page_and_connect(String project, String environment) throws Throwable {
       
			parser.deserializeProjects(project,environment);
			driver.get(parser.path);
			/*
			//Setting up cookies
			Cookie projectCookie = new Cookie(parser.cookieName,parser.cookieValue);
			driver.manage().addCookie(projectCookie);
			*/
			//Connecting using username and password
			LoginPage loginPage = new LoginPage(driver);
			loginPage.submit_username_and_password(parser.userName,parser.password);
			
			Select s = new Select(driver.findElement(By.xpath("//select[@id='sw-siteSwitcher']")));
			s.selectByValue(parser.projectName);
			
			Thread.sleep(2000);
			
	
	}
	
	@Then("^Home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
			
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkSiteMap")));
	    	WebElement bluedayButton = driver.findElement(By.id("linkSiteMap"));
	    		
	    	Assert.assertEquals(true,bluedayButton.isDisplayed());
	}

   
/*************************************************************************************************/
/*************************************************************************************************/
	
	
	
/*************************************************************************************************/
	
								/** Common Steps **/

/*************************************************************************************************/
	 @Given("^Role (.+) is selected$")
	 public void role_is_selected(String role) throws Throwable {
		    
		 	glb_role = role;
			parser.deserializeMenu(role);
		       
			Common_Method common = new Common_Method(driver);
		    common.SelectRole(role);
		      
		    String footer = driver.findElement(By.xpath("//div[@class='runOn']")).getText().toString();
		    footer = footer.substring(footer.length()-3);
		    System.out.println(footer);
		    assertEquals(role.toLowerCase(),footer.toLowerCase());
		       
	}
	
	
	@When("^The default page is displayed$")
	public void the_default_page_is_displayed() throws Throwable {
		   org.testng.Assert.assertEquals(driver.findElement(By.xpath("//div[@id='dNavigationBar']/div/div[contains(@class,'selected')]")).getAttribute("innerHTML").toString(),"Calendar");
	}
	
	
	@Given("^Select role \"([^\"]*)\"$")
    public void select_role_something(String role) throws Throwable {
			
		   glb_role = role;
		   Common_Method common = new Common_Method(driver);
	       try{
	    	   common.SelectRole(role);
	       
	       }catch(Exception e) {}
	       
	       String footer = driver.findElement(By.xpath("//div[@class='runOn']")).getText().toString();
		   footer = footer.substring(footer.length()-3);
		   System.out.println(footer);
		   assertEquals(role.toLowerCase(),footer.toLowerCase());
	}
/*************************************************************************************************/
/*************************************************************************************************/	
	 
	 
	 
/*************************************************************************************************/
		
								/** Navigation_Menu.feature **/

/*************************************************************************************************/	
	
	
   
	 
    @When("^Navigate from menus$")
    public void navigate_from_menus() throws Throwable {
    	
    	NavigationMenu navMenu = new NavigationMenu(driver);
    	navMenu.CheckMenu(parser.default_menu,parser.more_menu);
    
    }	

    @Then("^Menu is correctly displayed$")
    public void menu_is_correctly_displayed() throws Throwable {
    	
    	NavigationMenu navMenu = new NavigationMenu(driver);
    	org.testng.Assert.assertTrue(navMenu.equals, "The menu is changing");
    	
    }

   
/*************************************************************************************************/
/*************************************************************************************************/
   
	
    
/*************************************************************************************************/
	
							/** Calendar.feature **/

/*************************************************************************************************/	    
   
   

    
    
    
    @Then("^Calendar menu is selected$")
    public void calendar_menu_is_selected() throws Throwable {
    		Common_Method com = new Common_Method(driver);
    		com.page_isloaded();
    		org.testng.Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'dMenu') and contains(text(),'Calendar')]")).getAttribute("class").contains("selected"),"Calendar is not displayed as selected");
    	  
    }
    
    @And("^Page Title is displayed$")
    public void page_title_is_displayed() throws Throwable {
    	
    	  org.testng.Assert.assertEquals(driver.getTitle(),"Calendar","Page Title is wrong");
    	  
    }

    @And("^Navigation buttons are displayed$")
    public void navigation_buttons_are_displayed() throws Throwable {
    	 
    		Common_Method com = new Common_Method(driver);
    		
        	
    		org.testng.Assert.assertEquals(com.next_btn.isDisplayed(), true,"Next Month button is not Displayed");
    		org.testng.Assert.assertEquals(com.previous_btn.isDisplayed(), true,"Previous Month Button is not Displayed");
    		org.testng.Assert.assertEquals(com.next_year_btn.isDisplayed(), true,"Next Year Button is not Displayed");
    		org.testng.Assert.assertEquals(com.last_year_btn.isDisplayed(), true,"Last Year Button is not Displayed");
    		
    }
    
    @And("^Summary table is displayed$")
    public void summary_table_is_displayed() throws Throwable {
    		
    		Calendar calendar = new Calendar(driver);
    		org.testng.Assert.assertTrue(calendar.summary_table.isDisplayed(),"Summary Table is not displayed");
    		calendar.check_summaryTable(glb_role);
    }
    
    @And("^Variance color display default color$")
    public void variance_color_display_default_color() throws Throwable {
    	Calendar calendar = new Calendar(driver);
    	Select s = new Select(calendar.colored_listbox);
    	
    	org.testng.Assert.assertTrue(calendar.variance_color.getText().contains(s.getFirstSelectedOption().getText()),"Selected Color is not displayed in the Variance Color Measure label");
    }

    @And("^Pencil icon is displayed$")
    public void pencil_icon_is_displayed() throws Throwable {
    	
    		Calendar calendar = new Calendar(driver);
    		org.testng.Assert.assertTrue(calendar.pencil_btn.isDisplayed(),"Common Selector is not displayed");
    	
    }
    

    @And("^Displayin is displayed$")
    public void displayin_is_displayed() throws Throwable {
    	
    		Common_Method com = new Common_Method(driver);
    		org.testng.Assert.assertTrue(com.displayin_label.isDisplayed(), "Display in Label is not displayed");
    		org.testng.Assert.assertTrue(com.displayin_listbox.isDisplayed(), "Display in Listbox is not displayed");
    		com.check_displayin();
    }

    
    @And("^Colored by is displayed$")
    public void colored_by_is_displayed() throws Throwable {
    	
    		Calendar calendar  = new Calendar(driver);
    		org.testng.Assert.assertTrue(calendar.colored_label.isDisplayed(), "Colored Label is not displayed");
    		org.testng.Assert.assertTrue(calendar.colored_listbox.isDisplayed(), "Colored listbox is not displayed");
    		calendar.check_colored();
    		
    }

    
    @And("^Segment is displayed$")
    public void segment_is_displayed() throws Throwable {
    	
    		Calendar calendar = new Calendar(driver);
    		org.testng.Assert.assertTrue(calendar.segment_label.isDisplayed(), "Segment Label is not displayed");
    		org.testng.Assert.assertTrue(!calendar.segment_listbox.isEmpty(), "Segment listbox is not displayed");
    		calendar.check_segment();
    }
	
    
    @And("^Legends are displayed$")
    public void legends_are_displayed() throws Throwable {
    	Calendar calendar = new Calendar(driver);
    	org.testng.Assert.assertTrue(calendar.legend.isDisplayed(),"Legends are not displayed");
    }

    @Then("^Weeks are displayed from Week1 to Week52$")
    public void weeks_are_displayed_from_week1_to_week52() throws Throwable {
    	Calendar calendar = new Calendar(driver);
    	calendar.check_weeks_from1to52();
    }

    @Then("^Weather icons are displayed for all days$")
    public void weather_icons_are_displayed_for_all_days() throws Throwable {
    	Calendar calendar = new Calendar(driver);
    	calendar.check_weatherIcons_vs_days();
    	
    }

    @Then("^Weather is in Celsuis$")
    public void weather_is_in_Celsuis() throws Throwable {
    	Calendar calendar = new Calendar(driver);
    	calendar.check_weather_unit();
    }
    
    @When("^Click on next month$")
    public void click_on_next_month() throws Throwable {
    	Common_Method com = new Common_Method(driver);
    	
		
		String label = com.navigation_label.getText();
    	Common_Method.label_month=label.substring(label.indexOf(',')-3, label.indexOf(','));
    	Common_Method.index_label_month=com.months.indexOf(Common_Method.label_month);
    	
    	com.next_btn.click();
    }

    @When("^Click on previous month$")
    public void click_on_previous_month() throws Throwable {
    	Common_Method com = new Common_Method(driver);
    	
    	String label = com.navigation_label.getText();
    	Common_Method.label_month=label.substring(label.indexOf(',')-3, label.indexOf(','));
    	Common_Method.index_label_month=com.months.indexOf(Common_Method.label_month);
    	
    	com.previous_btn.click();
    }

    @When("^Click on next year$")
    public void click_on_next_year() throws Throwable {
    	Common_Method com = new Common_Method(driver);
    	
    	String label = com.navigation_label.getText();
    	Common_Method.label_month=label.substring(label.length()-4);
    	
    	com.next_year_btn.click();
    	
    }

    @When("^Click on last year$")
    public void click_on_last_year() throws Throwable {
    	Common_Method com = new Common_Method(driver);
    	
    	String label = com.navigation_label.getText();
    	Common_Method.label_month=label.substring(label.length()-4);
    	
    	com.last_year_btn.click();
    	
    }

    @Then("^Next month is displayed$")
    public void next_month_is_displayed() throws Throwable {
    	Common_Method com = new Common_Method(driver);
    	com.page_isloaded();
    	Thread.sleep(1000);
    	String label = com.navigation_label.getText();
    	label = label.substring(label.indexOf(',')-3, label.indexOf(','));
    	
    	if(Common_Method.label_month.equalsIgnoreCase("Dec"))
    		 org.testng.Assert.assertEquals("Jan",label);
    	else {
    	
    	 boolean comparison = (Common_Method.index_label_month < com.months.indexOf(label))?true:false ;
    	 org.testng.Assert.assertEquals(comparison,true);
    	}
    	
    }

    @Then("^Previous month is displayed$")
    public void previous_month_is_displayed() throws Throwable {
    	Common_Method com = new Common_Method(driver);
    	com.page_isloaded();
    	Thread.sleep(1000);
    	
    
    	String label = com.navigation_label.getText();
    	label = label.substring(label.indexOf(',')-3, label.indexOf(','));
    	
    	if(Common_Method.label_month.equalsIgnoreCase("Jan"))
   		 org.testng.Assert.assertEquals("Dec",label);
    	else {
    		boolean comparison = (Common_Method.index_label_month > com.months.indexOf(label))?true:false ;
    		org.testng.Assert.assertEquals(comparison,true);
    	}
    }

    @Then("^Next year is displayed$")
    public void next_year_is_displayed() throws Throwable {
    	Common_Method com = new Common_Method(driver);
    	com.page_isloaded();
    	Thread.sleep(1000);
    	
    	String label = com.navigation_label.getText();
    	label=label.substring(label.length()-4);
    	int actual_year = Integer.parseInt(label);
    	int last_year = Integer.parseInt(Common_Method.label_month);
    	boolean comparison =(actual_year>last_year)?true:false;
    	org.testng.Assert.assertEquals(comparison,true);
    }

    @Then("^Last year is displayed$")
    public void last_year_is_displayed() throws Throwable {
    	Common_Method com = new Common_Method(driver);
    	com.page_isloaded();
    	Thread.sleep(1000);
    	
    	String label = com.navigation_label.getText();
    	label=label.substring(label.length()-4);
    	int actual_year = Integer.parseInt(label);
    	int last_year = Integer.parseInt(Common_Method.label_month);
    	boolean comparison =(actual_year<last_year)?true:false;
    	org.testng.Assert.assertEquals(comparison,true);
    }
    
    
    @Then("^Today is highlighted Bold$")
    public void today_is_highlighted_bold() throws Throwable {
       Calendar calendar = new Calendar(driver);
       
       Calendar.day_num = Integer.parseInt(calendar.today.findElement(By.xpath(".//div[@class='dProdCalCellDate']")).getText());
   		
       String str =  calendar.today.getCssValue("border");
       org.testng.Assert.assertEquals(str, "4px solid rgb(0, 0, 0)","Today is not Highlighted Bold");
    }
    
    @When("^Click on today from the calendar$")
    public void click_on_today_from_the_calendar() throws Throwable {
    	Calendar calendar = new Calendar(driver);
    	
    	calendar.today.click();
    }

    @Then("^Store Day page for today is displayed$")
    public void store_day_page_for_today_is_displayed() throws Throwable {
    	Common_Method com = new Common_Method(driver);
    	com.page_isloaded();
    	Thread.sleep(1000);
    	
    	String label = com.navigation_label.getText();
    	label = label.substring(label.lastIndexOf(",")-1, label.lastIndexOf(","));
    	int day_num = Integer.parseInt(label);
    	
    	 org.testng.Assert.assertEquals(driver.getTitle(), "Daily Plan","Daily Plan page is not displayed");
    	 org.testng.Assert.assertEquals(Calendar.day_num,day_num,"Store day number is not the same as in Calendar");
    	
    }
    
    @When("^Click on yesterday from the calendar$")
    public void click_on_yesterday_from_the_calendar() throws Throwable {
    	Calendar calendar = new Calendar(driver);
    	Calendar.day_num = Integer.parseInt(calendar.yesterday.findElement(By.xpath(".//div[@class='dProdCalCellDate']")).getText());
    	calendar.yesterday.click();
    }

    @Then("^Store Day page for yesterday is displayed$")
    public void store_day_page_for_yesterday_is_displayed() throws Throwable {
    	Common_Method com = new Common_Method(driver);
    	com.page_isloaded();
    	Thread.sleep(1000);
    	
    	String label = com.navigation_label.getText();
    	label = label.substring(label.lastIndexOf(",")-1, label.lastIndexOf(","));
    	int day_num = Integer.parseInt(label);
    	
    	 org.testng.Assert.assertEquals(driver.getTitle(), "Daily Plan","Daily Plan page is not displayed");
    	 org.testng.Assert.assertEquals(Calendar.day_num,day_num,"Store day number is not the same as in Calendar");
    }
    
}