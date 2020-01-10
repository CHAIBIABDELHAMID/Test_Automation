package pageFactory_Amarla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.JavascriptExecutor;


public class Common_Method {
	
	WebDriver driver;
	List <String> display_in = Arrays.asList("Gross Sales $","Net Sales $");
	List <String> display_in_lc = Arrays.asList("Gross Sales LC","Net Sales LC");
	public List <String> months = Arrays.asList("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec");
	public static String label_month;
	public static int index_label_month;
	
	@FindBy (xpath = "//div[contains(text(),'Settings')]")
	WebElement settings_btn ;
	@FindBy(xpath = "//div[contains(text(),'Change Role »')]")
	WebElement changeRole_btn ;
	@FindBy (xpath = "//div[contains(text(),'Display In')]")
	public WebElement displayin_label ;
	@FindBy (xpath = "//select[@id='chooseVatDdl']")
	public WebElement displayin_listbox ;
	@FindBy (xpath = "//div[@class='runOn']")
	public WebElement role ;
	@FindBy (xpath = "//div[@class='dReportTimeTitle']")
	public WebElement navigation_label;
	@FindBy (xpath = "//input[@id='CIMSNext']")
	public WebElement next_btn ;
	@FindBy (xpath = "//input[@id='CIMSPrev']")
	public WebElement previous_btn ;
	@FindBy (xpath = "//div[@class='dReportTimeTitle']//input[@id='btProdCalNY']")
	public WebElement next_year_btn ;
	@FindBy (xpath = "//div[@class='dReportTimeTitle']//input[@id='btProdCalLY']")
	public WebElement last_year_btn ;
	
	
	public Common_Method(WebDriver driver) {
		
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 
	}
	
	
	
	
	public void SelectRole(String role) throws Throwable {
			Common_Method com = new Common_Method(driver);
			com.page_isloaded();
			settings_btn.click();
			changeRole_btn.click();
			
			List<WebElement> stores = driver.findElement(By.id("RoleSwitcher")).findElements(By.xpath("*"));
			int storeIndex=0;
			String elementSearched;
			boolean find = false;
		
			do {
			
				elementSearched = stores.get(storeIndex).getAttribute("class").toLowerCase();
			
				if(elementSearched.contains(role.toLowerCase())) { 
					
					if(!role.equalsIgnoreCase("reg") ) find = true;
					
					else if(role.equalsIgnoreCase("reg") && stores.get(storeIndex).getAttribute("innerHTML").contains("BA"))  find = true;
					else storeIndex++;
					
						
					
				
				}else storeIndex++;
				
			
			}while(stores.size()> storeIndex && find == false  );
		
			if(find)stores.get(storeIndex).click();
				
			Thread.sleep(5000);
		
	}
	
	
	public void check_displayin() {
		
		
	
		List<WebElement> listbox = displayin_listbox.findElements(By.xpath("*"));
		ArrayList <String> list = new ArrayList <String> ();
		ArrayList<String> merged = new ArrayList<String>();
	
			for(WebElement e: listbox){
				list.add(e.getText());
			}
	
		String footer = role.getText();
		footer = footer.substring(footer.length()-3);
		Select s = new Select(displayin_listbox);
		
		switch (driver.getTitle())
		{
			case "Calendar":
		
							if(footer.equalsIgnoreCase("STM")) {
								
								
								merged.addAll(display_in);
								merged.addAll(display_in_lc);
				
							}else merged.addAll(display_in);
							
							
							break;
		
		
		}
		
		
		org.testng.Assert.assertTrue(s.getFirstSelectedOption().getText().equalsIgnoreCase("Net Sales $"),"Display in Default value is not Net Sales $");	
		org.testng.Assert.assertTrue(list.size()==merged.size() && list.containsAll(merged) && merged.containsAll(list),"Display in list is not as expected");
		
		
		merged.clear();
		list.clear();
	
	}
	
	
	public void page_isloaded() {
		
		ExpectedCondition<Boolean> pageLoadCondition = new
        ExpectedCondition<Boolean>() {
           public Boolean apply(WebDriver driver) {
           return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
           }
        };
        
        WebDriverWait waitpage=new WebDriverWait(driver, 20000);
        waitpage.until(pageLoadCondition);
	}
	
	
	
	
}
