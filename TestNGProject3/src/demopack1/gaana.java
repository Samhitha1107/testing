package demopack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gaana {
	
	WebDriver driver = null;

	@BeforeTest
	public void setuptest() {
		@SuppressWarnings("unused")
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void gaanatest() throws InterruptedException {
		driver.get("https://gaana.com/");
		
		
		driver.findElement(By.id("login_id")).sendKeys("dagol40239@safe-cart.com");
		Thread.sleep(2000, 30);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000, 30);
		driver.findElement(By.id("login_pw")).sendKeys("Abcd@123");
		Thread.sleep(2000, 30);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000, 30);
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		Thread.sleep(2000, 30);
		
		
	}
@AfterTest
	
	public void teatDownTest() {
		//close browser
		
		driver.close();
		driver.quit();
		System.out.println("Test COmpleted Succesfully");
	}

}
