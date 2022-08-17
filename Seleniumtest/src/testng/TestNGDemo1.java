package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestNGDemo1 {
	
	
	@Test
	public void Navigation() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(500, 10);
		
		driver.navigate().to("https://www.facebook.com/login/");
		
		
		Thread.sleep(500, 10);
		
		driver.findElement(By.id("email")).sendKeys("kirefa1978@altpano.com");
		
		driver.findElement(By.name("pass")).sendKeys("123456789");
		
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(1000, 10);
		
		
		driver.close();
	}

}
