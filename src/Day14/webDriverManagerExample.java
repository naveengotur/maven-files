package Day14;

import org.bouncycastle.crypto.ec.ECElGamalDecryptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverManagerExample 
{

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.quit();	
		
		WebDriver driver2 = new FirefoxDriver();
		
		driver2.get("https://www.google.co.in/");
		
		driver2.quit();
		
		WebDriver driver3 = new EdgeDriver();
		
		driver3.get("https://www.google.co.in/");
		
		driver3.quit();		
		
		
		
		
	}
}
