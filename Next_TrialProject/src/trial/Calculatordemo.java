package trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calculatordemo {
	
	WebDriver driver = null;
	
	public void calculations() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	
	@BeforeTest
	public void launchapp() throws InterruptedException {
		
		Thread.sleep(1000, 20);
		
		driver.navigate().to("https://www.calculator.net/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void calculatepercent() {
		
		driver.findElement(By.className("scinm")).click();
		driver.findElement(By.className("sciop")).click();
		driver.findElement(By.className("scinm")).click();
		driver.findElement(By.className("sciop")).click();
		
		
		
	}
	
	@SuppressWarnings({ })
	@AfterTest
	public void terminatetest() throws InterruptedException {
		
		Thread.sleep(200, 10);
		driver.close();
	}
	

}
