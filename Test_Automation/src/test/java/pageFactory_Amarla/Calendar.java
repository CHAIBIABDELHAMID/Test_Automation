package pageFactory_Amarla;


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
	List <String> summaryColumnsSTM = Arrays.asList("My Store","Area","Enterprise");
	List <String> summaryColumnsREG = Arrays.asList("My Area","Division","Enterprise");
	List <String> metrics = Arrays.asList("Actual","Plan Var %");
	List <String> summaryMetrics = Arrays.asList("Sales","$/FS","Conv %","ATV","UPT");
	
	
	@FindBy (xpath = "//div[@class='dReportStoreTitle")
	public WebElement page_title ;
	@FindBy (xpath = "//div[@class='dCommonSelectorIcon']")
	public WebElement pencil_btn ;
	@FindBy (xpath = "//div[@id='dProdCalChangeBkGrnColorMeas']//span[@class='sProdCalChangeBkGrnColorLabel'][contains(text(),'Colored by')]")
	public WebElement colored_label ;
	@FindBy (xpath = "//div[@id='dProdCalChangeBkGrnColorMeas']//select[@id='selBkGrnVarColorMeasure']")
	public WebElement colored_listbox ;
	@FindBy (xpath = "//span[contains(text(),'Segment')]")
	public WebElement segment_label ;
	@FindBy (xpath = "//select[@id='segmentdesc']/option")
	public List <WebElement> segment_listbox ;
	@FindBy (xpath = "//div[@class='dReportDescTitle']")
	public WebElement variance_color ;
	@FindBy (xpath = "//div[@id='dProdCalLegend']")
	public WebElement legend ;
	@FindBy(xpath = "//table[@id='tStoreRollUp']")
	public WebElement summary_table;
	@FindBy(xpath = "//table[@id='tProdCal']")
	public WebElement weeks;
	@FindBy(xpath = "//div[@class='weatherBlock']")
	public List <WebElement> weather_icon;
	@FindBy(xpath = "//tr[@class='trProdCal']"
				  + "/td[contains(@class,'NetSales') and not(contains(@class,'LightGray'))]"
				  + "/table[contains(@class,'Click') and not(contains(@celldate,'0.0000'))]")
	public List <WebElement> days;
	
	@FindBy(xpath = "//td[contains(@class,'Today')]")
	public WebElement today;
	public static int day_num;
	@FindBy(xpath = "//td[contains(@class,'Today')]/preceding-sibling::td[1]")
	public WebElement yesterday;
	@FindBy(xpath = "//td[contains(@class,'Today')]/following-sibling::td[1]']")
	public WebElement tomorrow;
	
	@FindBy(xpath = "//td[contains(@class,'CurrentWeek')]")
	public WebElement current_week;
	@FindBy(xpath = "//td[contains(@class,'PastWeek')]")
	public WebElement past_week;
	@FindBy(xpath = "//td[contains(@class,'FuturetWeek')]")
	public WebElement future_week;
	
	
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
		
		  ArrayList <String> list = new ArrayList <String> ();
		
		  	for(WebElement e: segment_listbox){
				list.add(e.getText());
			}

		  Select s = new Select(driver.findElement(By.id("segmentdesc")));
	
		  org.testng.Assert.assertTrue(s.getFirstSelectedOption().getText().equalsIgnoreCase("All Store Types"));	
		  org.testng.Assert.assertTrue(segment.containsAll(list));
		
		
		  list.clear();

	}
	
	
	public void check_summaryTable(String role) {
		
		List <WebElement> listcolumn = driver.findElements(By.xpath("//table[@id='tStoreRollUp']/thead[1]/tr[3]/th[@colspan]"));
		List <WebElement> listmetrics =driver.findElements(By.xpath("//table[@id='tStoreRollUp']/tbody/tr/td[1]"));
		
		List <String> actualcolumn = new ArrayList <String> ();
		List <String> actualmetrics = new ArrayList <String> ();
		
		for(WebElement e: listcolumn) actualcolumn.add(e.getAttribute("innerHTML"));
		for(WebElement e: listmetrics) {actualmetrics.add(e.getAttribute("innerHTML"));}
		
		if(role.equalsIgnoreCase("stm")) {
		 org.testng.Assert.assertTrue(actualcolumn.containsAll(summaryColumnsSTM) && summaryColumnsSTM.containsAll(actualcolumn));
		 org.testng.Assert.assertTrue(actualmetrics.containsAll(summaryMetrics) && summaryMetrics.containsAll(actualmetrics));
		}
		if(role.equalsIgnoreCase("reg")) {
			 org.testng.Assert.assertTrue(actualcolumn.containsAll(summaryColumnsREG) && summaryColumnsREG.containsAll(actualcolumn));
			 org.testng.Assert.assertTrue(actualmetrics.containsAll(summaryMetrics) && summaryMetrics.containsAll(actualmetrics));
		}
		
	}
	
	
	public void check_weeks_from1to52() throws InterruptedException {
		
		List <WebElement> listweeks = weeks.findElements(By.xpath("./tbody[1]/tr[@class='trProdCal']"));
	
		String number;	
	
		
		for(WebElement e: listweeks) {
			
			number= e.findElement(By.xpath("./td[10]/table/tbody/tr/th/div")).getText();
			number=number.substring(number.length()-2);
			int week_number = Integer.valueOf(number);
			
			boolean comparison = (week_number<53 && week_number>0) ? true : false;
			org.testng.Assert.assertTrue(comparison);
	
			
			
		}
		
	}
	
	public void check_weatherIcons_vs_days() {
		
    	org.testng.Assert.assertEquals(weather_icon.size(), days.size(),"Weather icons are not displayed for all days");
     
	}
	
	public void check_weather_unit() {
		
		
		for(WebElement e: weather_icon) {
			
			org.testng.Assert.assertTrue(e.findElement(By.xpath("//div[@class='tempUnit']")).getAttribute("innerHTML").equalsIgnoreCase("°C"),"Weather Unit is not in Celsuis");
			org.testng.Assert.assertTrue(!e.findElement(By.xpath("//div[@class='weatherDesc']")).getAttribute("innerHTML").equalsIgnoreCase("null"),"Weather Description is Null");
		}
	
	}
	
}
