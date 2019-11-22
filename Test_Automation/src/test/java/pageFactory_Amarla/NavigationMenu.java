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
	@FindBy(xpath = "//div[@id='dNavigationBar']")
	WebElement navigationBar;
	
	
	List<String> actualDefaultMenu ;
	List<String> actualMoreMenu  ;
	public List<WebElement> unifiedListMenu; 

	
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
	
	
	
	public boolean CheckMenu(List <String>validDefaultMenu, List <String>validMoreMenu) throws Throwable  {
		
		
		boolean equals = true;
		
		
		unifiedListMenu = new ArrayList <WebElement> ();
		unifiedListMenu = navigationBar.findElements(By.xpath("//div/div[contains(@class,'dMenu')]"));
		unifiedListMenu.addAll(navigationBar.findElements(By.xpath("//div/div/div/div[contains(@class,'aDropdownItem')]")));
		
		
		int size = unifiedListMenu.size();
		int i =0;
		unifiedListMenu.clear();
		
		do {
			
			 try {
				 if(driver.findElement(By.id("DialogLayer_1")).isDisplayed()) {
			
				
				driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']")).click();
				}
			 }catch (org.openqa.selenium.NoSuchElementException e) {}
			 
			 
			unifiedListMenu = navigationBar.findElements(By.xpath("//div/div[contains(@class,'dMenu')]"));
			unifiedListMenu.addAll(navigationBar.findElements(By.xpath("//div/div/div/div[contains(@class,'aDropdownItem')]")));
			parseDefaultmenu();
			parseMoremenu();
			
			if(actualDefaultMenu.equals(validDefaultMenu)&&actualMoreMenu.equals(validMoreMenu)) {
				equals = true;
				i++;}
			else {
				equals = false;
						
				}
			if(actualDefaultMenu.size()<i) {
				System.out.println("More");
				//driver.findElement(By.xpath("//div[contains(text(),'More')]")).click();
				}
			unifiedListMenu.get(i).click();
			
			actualDefaultMenu.clear();
			actualMoreMenu.clear();
			unifiedListMenu.clear();
			
		}while(size> i);
		
		
		
		return equals;
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
