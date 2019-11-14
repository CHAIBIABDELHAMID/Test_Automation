package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SingeltonBaseClass {

	private static SingeltonBaseClass SingletonInstance ;
	public WebDriver driver;
	

	
	
	public static SingeltonBaseClass getInstance() {
		
		if(SingletonInstance==null) {
			SingletonInstance = new SingeltonBaseClass();
			return SingletonInstance;
		}else 
			{return SingletonInstance;}
			
		
	}
	
	public  WebDriver getdriver() {
		
		if(driver == null) {
			
			System.setProperty("webdriver.chrome.driver", "src/test/java/ressources/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			
			
		return driver;
			
		}else
			{return driver;}
		
	}









}
