package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestForFirefox {
	
	@Test
	public void Navigation() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\SAMHITHA\\Selenium\\alldrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		Thread.sleep(500, 10);
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		
		Thread.sleep(500, 10);
		
		driver.findElement(By.xpath("//div[contains(text(),'Top Offers')]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[2]")).click();
		
		//driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(1000, 10);
		
		
		driver.close();
	}


}
