package pageFactory_Amarla;

import org.openqa.selenium.support.FindBy;



import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;


import com.google.common.base.Function;



public class NavigationMenu {
	
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[@id='dNavigationBar']")
	WebElement navigationBar;
	
	
	List<String> actualDefaultMenu ;
	List<String> actualMoreMenu  ;
	public List<WebElement> unifiedListMenu; 
	public boolean equals = true;
	WebDriverWait waitElem ;
	
	
 	public NavigationMenu(WebDriver driver) {
		
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void  CheckMenu(List <String>validDefaultMenu, List <String>validMoreMenu) throws InterruptedException  {
		
		
			waitElem = new WebDriverWait(driver, 3000);
			unifiedListMenu = new ArrayList <WebElement> ();
			unifiedListMenu = navigationBar.findElements(By.xpath("//div/div[contains(@class,'dMenu')]"));
			unifiedListMenu.addAll(navigationBar.findElements(By.xpath("//div/div/div/div[contains(@class,'aDropdownItem')]")));
			
			int i =1;
			int size = unifiedListMenu.size();
			unifiedListMenu.clear();
		
		
			do {
			
				@SuppressWarnings("deprecation")
				Wait<WebDriver> waits = new FluentWait<WebDriver>(driver)
				    .withTimeout(36, TimeUnit.SECONDS)
				    .pollingEvery(3, TimeUnit.SECONDS)
				    .ignoring(NoSuchElementException.class);
				
				@SuppressWarnings("unused")
				WebElement logo = waits.until(new Function<WebDriver, WebElement>() 
				{
					public WebElement apply(WebDriver driver) {return driver.findElement(By.id("linkSiteMap"));}
				});
			
				Thread.sleep(5000);
			
				unifiedListMenu = navigationBar.findElements(By.xpath("//div/div[contains(@class,'dMenu')]"));
				unifiedListMenu.addAll(navigationBar.findElements(By.xpath("//div/div/div/div[contains(@class,'aDropdownItem')]")));
				parseDefaultmenu();
				parseMoremenu();
			
			
			
			
			
				if(actualDefaultMenu.equals(validDefaultMenu)&&actualMoreMenu.equals(validMoreMenu) && i<size) {
					equals = true;
				
					//Click More menu
					if(i>=actualDefaultMenu.size()) driver.findElement(By.xpath("//div[@class='dropbtn bMenu arrow'][contains(text(),'More')]")).click();
						//System.out.println(unifiedListMenu.get(i).getText());	
						unifiedListMenu.get(i).click();
				
				 
						//Check if picker is displayed
						try {
							if(driver.findElement(By.id("dCommonSelector")).isDisplayed()) {
						
								Actions action = new Actions(driver);
								Thread.sleep(2000);
								try {
									if( driver.findElement(By.xpath("//div[contains(@class,'dSelectorEntity') and ./span[contains(.,'Store')]]")).isDisplayed()) {
										action.moveToElement( driver.findElement(By.xpath("//div[contains(@class,'dSelectorEntity') and ./span[contains(.,'Store')]]//span[contains(@role,'presentation')]"))).click().build().perform();
										action.moveToElement( driver.findElement(By.xpath("//li[1]"))).click().build().perform();
									}
								}catch(Exception ex) {}
						 
								action.moveToElement( driver.findElement(By.xpath("//input[@id='btCSSubmit']"))).click().build().perform();
							}
							
						}catch (org.openqa.selenium.NoSuchElementException e) {}
				
				 
						//Check if no data error message is displayed
						try {
							if(driver.findElement(By.id("DialogLayer_1")).isDisplayed()) 
								driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']")).click();
					 
						}catch (org.openqa.selenium.NoSuchElementException e) {}
			
					}
					else {
						equals = false;
						break;
					}
			
			
			
		
				actualDefaultMenu.clear();
				actualMoreMenu.clear();
				unifiedListMenu.clear();
				i++;
			
			}while( i<size && equals);
		org.testng.Assert.assertTrue(equals);
	}
	
	
	public void parseDefaultmenu() {
		
		List<WebElement> navigation = navigationBar.findElements(By.xpath("//div/div[contains(@class,'dMenu')]"));
		actualDefaultMenu = new ArrayList <String> ();
		
		for(WebElement e: navigation) actualDefaultMenu.add(e.getAttribute("innerHTML").toString());
	
	}
	
	public void parseMoremenu() {
	
		List<WebElement> morenavigation =  navigationBar.findElements(By.xpath("//div/div/div/div[contains(@class,'aDropdownItem')]"));
		actualMoreMenu = new ArrayList <String> ();
		
		for(WebElement e: morenavigation) actualMoreMenu.add(e.getAttribute("innerHTML").toString());
	
	}
	

	
	
	
	

}