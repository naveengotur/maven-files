package day16_Parallel_CrossBrowser_DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateMultipleUsers2 
{

	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(dataProvider ="LoginData")
	public void login(String user, String pass)
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "LoginFailed");
	}
	
	@DataProvider(name="LoginData")
	public Object[][] loginTestData()
	{
		System.out.println("**** Test Data is getting prepared****");
		Object[][]arr = new Object[3][2];
		arr[0][0]="Admin";
		arr[0][1]="admin123";
		arr[1][0]="Admin";
		arr[1][1]="admin123";
		arr[2][0]="Admin";
		arr[2][1]="admin123";
		System.out.println("**** Test Data is ready to Test****");
		return arr;
		
	}
			
	
}
