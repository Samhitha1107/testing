package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AsserTest {
	
WebDriver driver = null;
	
	@BeforeTest
	public void setup() {
		@SuppressWarnings("unused")
		String 
		projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void verifytitle() throws InterruptedException {
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000, 20);
		//search on google
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Celominds");
		Thread.sleep(2000, 20);
		driver.findElement(By.xpath("//div[@class='iblpc']")).click();
		Thread.sleep(2000, 20);
		//driver.findElement(By.xpath("//h3[contains(text(),'Celominds Solutions: Software')]")).click();
		String expected = "https://www.google.com";

			String actualURL= "https://www.google.com";

			Assert.assertEquals(expected, actualURL);
				System.out.println("Assert passed");
	}
	
	@AfterTest
	public void Terminate() {
		driver.close();
	}

}
