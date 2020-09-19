package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		// To setup the driver
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");
				//WebDriverManager.chromedriver().setup();
				
				//Open the chrome browser
				ChromeDriver driver = new ChromeDriver();
				
				//Maximize the browser window
				driver.manage().window().maximize();
				
				//Open the URL
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
				driver.findElementByPartialLinkText("SFA").click();
				
				//Click on the Accounts tab
				driver.findElementByLinkText("Accounts").click();
				
				//Click on Create Account
				driver.findElementByLinkText("Create Account").click();
				
				//Enter Debit Limited Account value in the Account Name field
				driver.findElementByXPath("//*[@id=\"accountName\"]").sendKeys("Debit Limited Account - Hari");
				
				//Enter the Description
				driver.findElementByXPath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[9]/td[2]/textarea").sendKeys("Selenium Automation Tester");
				
				//Enter Local Name
				driver.findElementByXPath("//*[@id=\"groupNameLocal\"]").sendKeys("Selenium Automation Testing-Local Name");
				
				//Enter Site Name
				driver.findElementByXPath("//*[@id=\"officeSiteName\"]").sendKeys("Selenium Automation Testing-Site Name");
				
				//Enter Annual Revenue
				driver.findElementByXPath("//*[@id=\"annualRevenue\"]").sendKeys("50000");
				
				//Select industry as Computer Software
				WebElement industry = driver.findElementByName("industryEnumId");
				Select industryDropDown = new Select (industry);
				industryDropDown.selectByVisibleText("Computer Software");
				
				//Select Ownership
				WebElement ownership = driver.findElementByName("ownershipEnumId");
				Select ownershipDropDown = new Select (ownership);
				ownershipDropDown.selectByVisibleText("S-Corporation");
				
				//Select Source
				WebElement source = driver.findElementByName("dataSourceId");
				Select sourceDropDown = new Select (source);
				sourceDropDown.selectByValue("LEAD_EMPLOYEE");
				
				//Select Marketing Campaign from the dropdown
				Select marketingCampaignDropDown1 = new Select (driver.findElementByName("marketingCampaignId"));
				java.util.List<WebElement> listoptions = marketingCampaignDropDown1.getOptions();
				int size2 = listoptions.size();
				marketingCampaignDropDown1.selectByIndex(size2-3);
				
				//Select State/Province
				WebElement stateOrProvince = driver.findElementByName("generalStateProvinceGeoId");
				Select stateOrProvinceDropDown = new Select (stateOrProvince);
				stateOrProvinceDropDown.selectByValue("TX");
				
				//Click on Create Account button
				driver.findElementByXPath("//*[@onclick=\"submitFormWithSingleClick(this)\"]").click();
	}

}
