package testing;

 import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestForFirefox {
	static WebDriver driver = null;

	@BeforeTest
	@Parameters("browser")
	public void differtbrowser(String browserName) {
	
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Drivers\\\\chromedriver.exe");
			driver =  new ChromeDriver();
			
	}

	@Test
	public void aflipkartopen() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000, 20);

		String expected = driver.getTitle();
		String actualURL = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(expected, actualURL);
		System.out.println("Assert passed");

	}

	
}
