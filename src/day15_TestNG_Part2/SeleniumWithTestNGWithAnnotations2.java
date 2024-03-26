package day15_TestNG_Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWithTestNGWithAnnotations2 {
	WebDriver driver;

	@BeforeMethod

	public void startBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(description = "This test will check wheather application is up and running")
	public void verifyTitle() {
		Assert.assertTrue(driver.getTitle().contains("HRM"));
	}

	@Test(description = "URL is matched")
	public void verifyURL() {
		Assert.assertTrue(driver.getCurrentUrl().contains("demo"));
	}
	
	@Test(description = "Social Media count")
	public void verifySocialIcons() {
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']")).getSize(),4);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
