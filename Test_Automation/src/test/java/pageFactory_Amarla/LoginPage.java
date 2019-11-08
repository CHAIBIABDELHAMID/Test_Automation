package pageFactory_Amarla;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;




public class LoginPage {
	
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
        PageFactory.initElements(driver, this);
        
	}
	
	
	public void submitUsernameAndPassword(String username, String password) throws Throwable{
		
		
		driver.findElement(By.id("logintxt")).clear();
		driver.findElement(By.id("logintxt")).sendKeys(username);
		driver.findElement(By.id("passwordtxt")).clear();
		driver.findElement(By.id("passwordtxt")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@class='loginbutton']")).click();
		
		
		
	}
	
}
