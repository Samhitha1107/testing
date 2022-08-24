package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TestNGClass1 {
	@Test
	public class Navigation {
		public static void main(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.facebook.com/login/");
			
			driver.findElement(By.id("email")).sendKeys("kirefa1978@altpano.com");
			
			driver.findElement(By.name("pass")).sendKeys("123456789");
			
			driver.findElement(By.id("loginbutton")).click();
			
			driver.wait(10000);
			
			driver.close();
		}
	}
}