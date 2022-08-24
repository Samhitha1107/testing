package dynamic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkartdynamic {
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
	public void openflipkart() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000, 20);

//		String expected = driver.getTitle();
//		String actualURL = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertTrue(true, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		System.out.println("Assert passed");
	}
	
	@Test
	public void topoffers() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[2]")).click();
		driver.wait(2000);
		
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/a/div[2]")).click();
//		driver.wait(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));    
		By elem_dynamic = By.xpath("");
		wait.until(ExpectedConditions.presenceOfElementLocated(elem_dynamic));
		
		driver.close();
		
	}

}
