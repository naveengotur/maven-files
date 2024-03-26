package day15_TestNG_Part2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWithTestNG 
{

	WebDriver driver;
	
	/*
	 * @BeforeSuite
	 * @BeforeTest
	 * @BeforeGroup
	 * @Beforeclass
	 * @BeforeMethod
	 * @Test
	 * @Test
	 * @AfterMethod
	 * @AfterClass
	 * @AfterGroup
	 * @AfterTest
	 * @AfterSuite
	 * 
	 */
	
	@Test (description="This test will setBrowsers", priority=1)
	
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test (description ="This test will check wheather application is up and running", priority=2, dependsOnMethods="Start Browser")

	public void  pingApplication()
	{
		Assert.assertTrue(driver.getTitle().contains("HRM"));
	}
	
	@Test (description ="This test will close Application", priority=3, dependsOnMethods="Ping Application")
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
