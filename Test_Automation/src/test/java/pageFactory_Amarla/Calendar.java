package pageFactory_Amarla;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Calendar {

	
	WebDriver driver;
	List <String> colored_by = Arrays.asList("Sales","Traffic","Conv %","Trans","ATV","UPT","$/FS","SPAH","Hours %");
	List <String> segment = Arrays.asList("All Store Types","VSBA","VSFA");
	
	@FindBy (xpath = "//div[@class='dReportStoreTitle")
	public WebElement page_title ;
	@FindBy (xpath = "//input[@id='CIMSNext']")
	public WebElement next_btn ;
	@FindBy (xpath = "//input[@id='CIMSPrev']")
	public WebElement previous_btn ;
	@FindBy (xpath = "//div[@class='dReportTimeTitle']//input[@id='btProdCalNY']")
	public WebElement next_year_btn ;
	@FindBy (xpath = "//div[@class='dReportTimeTitle']//input[@id='btProdCalLY']")
	public WebElement last_year_btn ;
	@FindBy (xpath = "//div[@class='dCommonSelectorIcon']")
	public WebElement pencil_btn ;
	@FindBy (xpath = "//div[@id='dProdCalChangeBkGrnColorMeas']//span[@class='sProdCalChangeBkGrnColorLabel'][contains(text(),'Colored by')]")
	public WebElement colored_label ;
	@FindBy (xpath = "//div[@id='dProdCalChangeBkGrnColorMeas']//select[@id='selBkGrnVarColorMeasure']")
	public WebElement colored_listbox ;
	@FindBy (xpath = "//span[contains(text(),'Segment')]")
	public WebElement segment_label ;
	@FindBy (xpath = "//select[@id='segmentdesc']")
	public WebElement segment_listbox ;
	
	
	
	
	
	
	public Calendar(WebDriver driver) {
		
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	public void check_colored() {
		
		
		  List<WebElement> listbox = colored_listbox.findElements(By.xpath("*"));
		  ArrayList <String> list = new ArrayList <String> ();
		
		  	for(WebElement e: listbox){
				list.add(e.getText());
			}

		  Select s = new Select(colored_listbox);
	
		  org.testng.Assert.assertTrue(s.getFirstSelectedOption().getText().equalsIgnoreCase("Sales"));	
		  org.testng.Assert.assertTrue(list.size()==colored_by.size() && list.containsAll(colored_by) && colored_by.containsAll(list));
		
		
		  list.clear();

	}
	
	
	public void check_segment() {
		
		
		  List<WebElement> listbox = segment_listbox.findElements(By.xpath("*"));
		  ArrayList <String> list = new ArrayList <String> ();
		
		  	for(WebElement e: listbox){
				list.add(e.getText());
			}

		  Select s = new Select(segment_listbox);
	
		  org.testng.Assert.assertTrue(s.getFirstSelectedOption().getText().equalsIgnoreCase("All Store Types"));	
		  org.testng.Assert.assertTrue(segment.containsAll(list));
		
		
		  list.clear();

	}
	
	
	
	
}
