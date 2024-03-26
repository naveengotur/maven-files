package day17_ExcelReading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.ExcelUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateMultipleUserwithExcelData {

	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

	}

	@Test(dataProvider = "loginData")

	public void loginUser(String user, String pass) {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@DataProvider(name = "loginData")

	public Object[][] loginTestData() {
		System.out.println("**** Test Data is getting prepared****");

		ExcelUtility excel = new ExcelUtility();

		System.out.println("**** Test Data is ready to Test****");

		return excel.getDataFromSheet("login");

	}

}
