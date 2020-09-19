package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ACMESystem1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");
				
		//Open the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Open the URL
		driver.get("https://acme-test.uipath.com/login");
		
		//Enter Email
		driver.findElementByXPath("//*[@id=\"email\"]").sendKeys("kumar.testleaf@gmail.com");
		
		//Enter Password
		driver.findElementByXPath("//*[@id=\"password\"]").sendKeys("leaf@12");
		
		//Click on Login button
		driver.findElementByXPath("/html/body/div/div[2]/div/div/div/form/button").click();
		
		//Get the Title
		System.out.println(driver.getTitle());
		
		//Click on Logout
		driver.findElementByLinkText("Log Out").click();
		
		//Close the browser
		driver.close();
		

	}

}
