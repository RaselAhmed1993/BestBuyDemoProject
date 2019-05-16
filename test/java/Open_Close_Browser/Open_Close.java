package Open_Close_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Open_Close {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Russe\\OneDrive\\Desktop\\Bittech\\eclipse\\BestBuyDemoProject\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		
	}
	
	
	
	
	
	@AfterMethod
	public void Close()
	{

		driver.quit();
	}

}
