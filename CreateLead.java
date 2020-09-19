package week2.day1;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		// To setup the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		
		//Open the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Code to maximize the browser window
		driver.manage().window().maximize();
		
		//Code to open the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Identify and enter the username
		WebElement username = driver.findElementById("username");
		username.sendKeys("demosalesmanager");
		
		// Enter the password
		driver.findElementById("password").sendKeys("crmsfa");
		//password.sendKeys("crmsfa");
		
		//Click on the Login button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click on the CRM/SFA link
		//driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByPartialLinkText("SFA").click();
		
		//Click on the LEADS tab
		driver.findElementByLinkText("Leads").click();
		
		//Click on the CreateLead in the LEADS tab
		driver.findElementByLinkText("Create Lead").click();
		
		//Enter value for COMPANY NAME
		driver.findElementById("createLeadForm_companyName").sendKeys("SHS Company");
		
		//Enter value for FIRST NAME
		driver.findElementById("createLeadForm_firstName").sendKeys("HariHara");
		
		//Enter value for LAST NAME
		driver.findElementById("createLeadForm_lastName").sendKeys("Subramanian");	
		
		//Select Employee from the Source dropdown field using select by visible text
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select sourcedropDown = new Select (source);
		sourcedropDown.selectByVisibleText("Employee");
		
		//Select Pay Per Click Advertising from the Marketing Campaign id using select by value
		WebElement MarketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketingCampaignDropDown = new Select (MarketingCampaign);
		marketingCampaignDropDown.selectByValue("9001");
		
		//Select value as Telecommunication from bottom (size-2)
		Select industryDropDown = new Select (driver.findElementById("createLeadForm_industryEnumId"));
		java.util.List<WebElement> options = industryDropDown.getOptions();
		int size = options.size();
		industryDropDown.selectByIndex(size-2);
		
		//Select value as Corporation from the Ownership dropdown using the Index
		Select ownershipDropDown = new Select (driver.findElementById("createLeadForm_ownershipEnumId"));
		java.util.List<WebElement> listoptions = ownershipDropDown.getOptions();
		int size1 = listoptions.size();
		ownershipDropDown.selectByIndex(size1-2);
		
		//Select country as India using Visible text
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select countryDropDown = new Select (country);
		countryDropDown.selectByVisibleText("India");
		
		//Click on the Create Lead button
		driver.findElementByClassName("smallSubmit").click();
	
		// Get the title
		System.out.println(driver.getTitle());
		
	}

}
