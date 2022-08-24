package dynamic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Flipkartdynamic {
	
	WebDriver driver = null;
	
	@BeforeTest
	@Parameters("browser")
	public void differtbrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Drivers\\\\chromedriver.exe");
			driver =  new ChromeDriver();
			


		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\SAMHITHA\\Selenium\\alldrivers\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    
			
		}
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
		
		//clicks top offers
		driver.findElement(By.xpath("//div[@class='xtXmba']")).click();
		Thread.sleep(2000, 20);
		
		String expected1 = driver.getTitle();
		String actualURL1 = "Flipkart Offers & Deals of the Day - Get Best Discounts on Mobiles, Electronics, Fashion & Home etc.";
		Assert.assertEquals(expected1, actualURL1);
		System.out.println("Assert passed");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void bopenoffers() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		
		//to open flute
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("(//div[contains(text(),'Flutes')])"));
		Thread.sleep(2000, 30);
		@SuppressWarnings("unused")
		String text = ele.getText();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", ele);
		Thread.sleep(4000, 30);
		String expected1 = driver.getCurrentUrl();
		String actualURL1 = driver.getCurrentUrl();
		Assert.assertEquals(expected1, actualURL1);
		System.out.println("Assert passed");

		
	}
	
	@Test
	public void cclickoffer() {
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[3]/div[3]")).click();
		
		String expected1 = driver.getCurrentUrl();
		String actualURL1 = driver.getCurrentUrl();
		Assert.assertEquals(expected1, actualURL1);
		System.out.println("Assert passed");
		
	}
	
	@Test
	public void openproduct() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]")).click();
		driver.wait(3000);
	}
	
	@AfterTest
	public void terminate() {
		driver.close();
		driver.quit();
	}
	
	
	}
        
      

        
        
    
	
	


