package day15_TestNG_Part2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWithTestNGWithAnnotations {
	WebDriver driver;

	@BeforeMethod

	public void startBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(description = "This test will check wheather application is up and running")
	public void pingApplication() {
		Assert.assertTrue(driver.getTitle().contains("HRM"));
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
