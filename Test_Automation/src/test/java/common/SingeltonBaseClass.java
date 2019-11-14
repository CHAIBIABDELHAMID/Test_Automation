package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SingeltonBaseClass {

	public  WebDriver driver;
	
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
