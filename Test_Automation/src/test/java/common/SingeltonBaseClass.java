package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SingeltonBaseClass {

	protected static WebDriver driver;
	
	public static WebDriver getdriver() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/java/ressources/chromedriver.exe");
		
		if(driver == null) {
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			
			ParameterParser pp = new ParameterParser();
			pp.deserializeProjects();
			return driver;
			
		}else
			return driver;
	}









}
