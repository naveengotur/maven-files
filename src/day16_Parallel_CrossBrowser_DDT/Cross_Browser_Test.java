package day16_Parallel_CrossBrowser_DDT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_Browser_Test {

	@Parameters("Browser")
	@Test
	public void startBrowser(String browser) throws InterruptedException {
		WebDriver driver = null;

		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			Thread.sleep(5000);

		}

		else if (browser.equalsIgnoreCase("FF") || browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		else if (browser.equalsIgnoreCase("Edge") || browser.equalsIgnoreCase("MicrosoftEdge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		else {

			System.out.println("Sorry Application supports Chrome, FF, Edge");
		}

		driver.manage().window().maximize();
		driver.get("https://testng.org/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
