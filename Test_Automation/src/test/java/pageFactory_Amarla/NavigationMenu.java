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
	
	List<String> actualDefaultMenu = new ArrayList <String> ();
	List<String> actualMoreMenu  = new ArrayList <String> ();
	List<WebElement> unifiedListMenu = new ArrayList <WebElement> ();
	Boolean oneDOccurence = true;
	Boolean oneMOccurence = true;
	
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
		
		int i =0;
		do {
			
			parseDefaultmenu();
			parseMoremenu();
			
			
			if(actualDefaultMenu.equals(validDefaultMenu)&&actualMoreMenu.equals(validMoreMenu)) {
				equals = true;
				i++;}
			else {
				equals = false;
						System.out.println(equals);
				}
			
			unifiedListMenu.get(i).click();
			actualDefaultMenu.clear();
			actualMoreMenu.clear();
			
		}while(unifiedListMenu.size()> i);
		
		
		
		return equals;
	}
	
	
	public void parseDefaultmenu() {
		
		List<WebElement> navigation = navigationBar.findElements(By.xpath("*"));
		for(WebElement e: navigation) {
			String attribute = e.getAttribute("class").toString().toLowerCase();
			if(attribute.contains("dmenu")) {
				actualDefaultMenu.add(e.getAttribute("innerHTML").toString());
				if(oneDOccurence)unifiedListMenu.add(e);
				}
		}
		oneDOccurence = false;
		
	}
	
	public void parseMoremenu() {
	
		List<WebElement> morenavigation =  moreMenu.findElements(By.xpath("*"));
		for(WebElement e: morenavigation) {
		 actualMoreMenu.add(e.getAttribute("innerHTML").toString());
		 if(oneMOccurence)unifiedListMenu.add(e);
		}
		
		oneMOccurence = false;
		
	}
	
	
	
	

}
