package Day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumWithTestNG 
{

	WebDriver driver;
	
	@Test(description="This test will set Browsers", priority=1)
	public  void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test (description="This test will check wheather application is up and running", priority=2)
	public void pingApplication()
	{
		Assert.assertTrue(driver.getTitle().contains("HRM"));
	}
	
	@Test(description="This test will close application", priority=3)
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
