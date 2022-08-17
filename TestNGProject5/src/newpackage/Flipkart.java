package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart {
	WebDriver driver = null;
	
	@BeforeTest
	public void setup() {
		@SuppressWarnings("unused")
		String 
		projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void flipkartopen() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000, 20);
		
		//login flipkart
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']")).sendKeys("9620614054");
		Thread.sleep(1000, 30);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("01071999");
		Thread.sleep(1000, 30);
		
	driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Login')]")).click();
		
		//flipkart search
		driver.findElement(By.xpath("//div[contains(text(),'Travel')]")).click();
		Thread.sleep(2000, 20);
		driver.get("https://www.flipkart.com/books-store?fm=neo%2Fmerchandising&iid=M_358ff965-c315-4cb4-b8a5-35a7f0c3bf71_1_372UD5BXDFYS_MC.WKV8I2UZ8OZC&otracker=hp_rich_navigation_8_1.navigationCard.RICH_NAVIGATION_Beauty%252C%2BToys%2B%2526%2BMore~Books_WKV8I2UZ8OZC&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_8_L1_view-all&cid=WKV8I2UZ8OZC");
		
		Thread.sleep(2000, 20);
		
		//scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1500)", "");
	    
	    Thread.sleep(1000, 10);
	    
	    //select brand
//	    driver.findElement(By.xpath("//div[contains(text(),'Brand')]")).click();
//	    Thread.sleep(2000, 20);
//	    
//	    driver.findElement(By.xpath("//div[@class='_3879cV'][contains(text(),'Mi')]")).click();
//	    Thread.sleep(2000, 20);
//	    
//	    driver.findElement(By.xpath("//a[@class='s1Q9rs']")).click();
//	    Thread.sleep(2000, 20);
//	    
//	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
//	    js1.executeScript("window.scrollBy(0,2000)", "");
//	    
//	    Thread.sleep(1000, 10);
////	    
//	    driver.findElement(By.id("pincodeInputId")).sendKeys("560028");////input[@id='pincodeInputId']
//	    Thread.sleep(4000, 10);
////	    
//	    driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
//	    Thread.sleep(2000, 20);
	    
//	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
//	    Thread.sleep(2000, 20);
	   
	 
	    driver.close();
	    driver.quit();
	    	
	    
	    
		
	}
	

}
