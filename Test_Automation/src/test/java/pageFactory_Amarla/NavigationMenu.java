package pageFactory_Amarla;

import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.gl.E;

public class NavigationMenu {
	
	
	WebDriver driver;
	
	@FindBy (xpath = "//div[contains(text(),'Settings')]")
	WebElement settings_btn ;
	@FindBy(xpath = "//div[contains(text(),'Change Role »')]")
	WebElement changeRole_btn ;
	@FindBy(xpath = "//div[@class='dNavBar']")
	WebElement navigationBar;
	@FindBy(xpath = "//div[@class='dNavBar']/div[@class='dropdown']/div[contains(@class,'More')]")
	WebElement moreMenu;
	
	
 	public NavigationMenu(WebDriver driver) {
		
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	public void SelectRole(String role) throws Throwable {
		
		settings_btn.click();
		changeRole_btn.click();
		
		List<WebElement> stores = driver.findElement(By.id("RoleSwitcher")).findElements(By.xpath("*"));
		int storeIndex=0;
		String elementSearched;
		boolean find = false;
		
		do {
			
			elementSearched = stores.get(storeIndex).getAttribute("class").toLowerCase();
			if(elementSearched.contains(role.toLowerCase())) { 
				
				stores.get(storeIndex).click();
				find = true;
				
			}else storeIndex++;
			
		}while(stores.size()> storeIndex && find == false  );
			
		 Thread.sleep(5000);
		
		
	}
	
	
	
	public boolean CheckMenu(List <String>validDefaultMenu, List <String>validMoreMenu) {
		
		boolean equals = true;
		
		
		//Parsing Actual Default menu into <String> List
		List<WebElement> navigation = navigationBar.findElements(By.xpath("*"));
		List<String> actualDefaultMenu = new ArrayList <String> ();
		for(WebElement e: navigation) {
			String attribute = e.getAttribute("class").toString().toLowerCase();
			if(attribute.contains("dmenu")) {
				actualDefaultMenu.add(e.getText());
				}
				
		 }
		
		//Parsing Actual More menu into <String> List
		List<WebElement> morenavigation =  moreMenu.findElements(By.xpath("*"));
		List<String> actualMoreMenu  = new ArrayList <String> ();
		for(WebElement e: morenavigation) {
			 ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;", e).toString();
			 actualMoreMenu.add( ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;", e).toString());
		}
		
		
		
		
		
		
		
		
		
		
	
		return equals;
	}
	

}
