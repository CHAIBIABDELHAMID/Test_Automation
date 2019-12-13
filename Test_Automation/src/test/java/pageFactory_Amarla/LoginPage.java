package pageFactory_Amarla;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;




public class LoginPage {
	
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='logintxt']")
	WebElement usernametextbox;
	@FindBy(xpath = "//input[@id='passwordtxt']")
	WebElement passwordtextbox;
	@FindBy(xpath = "//input[@class='loginbutton']")
	WebElement loginbutton;
		
	
	
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
        PageFactory.initElements(driver, this);
        
	}
	
	
	public void submit_username_and_password(String username, String password) throws Throwable{
		
		
		usernametextbox.clear();
		usernametextbox.sendKeys(username);
	
		passwordtextbox.clear();
		passwordtextbox.sendKeys(password);
		
		
		loginbutton.click();
		
		
		
	}

	
	
}