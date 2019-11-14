package pageFactory_Amarla;

import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NavigationMenu {
	
	
	WebDriver driver;
	
	@FindBy (xpath = "//div[contains(text(),'Settings')]")
	WebElement settings_btn ;
	@FindBy(xpath = "//div[contains(text(),'Change Role »')]")
	WebElement changeRole_btn ;
	@FindBy(xpath = "//div[@class='dNavBar']")
	WebElement navigationBar;
	@FindBy(xpath = "//div[@class='dropdown'][1]//div[@class='dropdown-content More']")
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
		List<WebElement> navigation = navigationBar.findElements(By.xpath("*"));
		List<WebElement> actualDefaultMenu = new ArrayList <WebElement> ();
		int navigationIndex=0;
		int actualDefaultIndex=0;
		boolean finish = false;
		
		do {
			
			String attribute = navigation.get(navigationIndex).getAttribute("class").toString().toLowerCase();
			if(attribute.contains("dmenu")) {
				
				actualDefaultMenu.add(actualDefaultIndex, navigation.get(navigationIndex));
				System.out.println(actualDefaultMenu.get(actualDefaultIndex).getText());
				actualDefaultIndex++;
				navigationIndex ++;
				
			}else {navigationIndex ++; finish = true;}
			
		}while(!finish);
		
		
		
		
		
		return equals;
	}
	

}
