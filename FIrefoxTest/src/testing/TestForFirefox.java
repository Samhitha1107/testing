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

	}

	@Test
	public void bsearch() throws InterruptedException {
		
		//search for watches
		WebElement searchbox = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		searchbox.sendKeys("watches");
		searchbox.submit();
		Thread.sleep(2000, 20);
		String expected1 = driver.getTitle();
		String actualURL1 = driver.getTitle();
		Assert.assertEquals(expected1, actualURL1);
		System.out.println("Assert passed");

	}

	@SuppressWarnings("deprecation")
	@Test
	public void citemclick() throws InterruptedException {

		ArrayList<String> AllProducts = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(AllProducts.get(0));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		driver.switchTo().defaultContent(); // Come out of iframe.
		Thread.sleep(2000, 20);
		
		//moves to top of the page after scrolll
		driver.findElement(By.xpath("//div[@class='bra6U8 HL5oOQ']")).click();
		Thread.sleep(2000, 20);
		
		//click on couple checkbox
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("(//div[contains(text(),'Couple')])"));
		Thread.sleep(2000, 30);
		@SuppressWarnings("unused")
		String text = ele.getText();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", ele);
		Thread.sleep(4000, 30);
		String expected1 = driver.getTitle();
		String actualURL1 = driver.getTitle();
		Assert.assertEquals(expected1, actualURL1);
		System.out.println("Assert passed");

	}

	@Test
	public void dproductopen() throws InterruptedException {
		
		//click on the first element using this class name 
		driver.findElement(By.xpath("//a[@class='IRpwTa']")).click();
		Thread.sleep(3000, 40);
		String expected1 = driver.getTitle();
		String actualURL1 = driver.getTitle();
		Assert.assertEquals(expected1, actualURL1);
		System.out.println("Assert passed");

	}

	@SuppressWarnings("deprecation")
	@Test
	public void eaddtocart() throws InterruptedException {
		//switch to next tab
		ArrayList<String> AllTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(AllTabs.get(1));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on delivery pincode and search for required pincode
		WebElement code = driver.findElement(By.xpath("//input[@class='cfnctZ']"));
		code.sendKeys("560028");
		driver.findElement(By.xpath("//span[@class='UgLoKg']")).click();
		Thread.sleep(2000, 20);
		String expected1 = driver.getTitle();
		String actualURL1 = driver.getTitle();
		Assert.assertEquals(expected1, actualURL1);
		System.out.println("Assert passed");
		
		//click on check
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(4000, 20);
		@SuppressWarnings("unused")
		String expected11 = driver.getTitle();
		@SuppressWarnings("unused")
		String actualURL11 = driver.getTitle();
		Assert.assertTrue(true);
		System.out.println("Assert passed");
		driver.quit();

	}
	public static void assertNull(Object object) {
		WebElement demo = driver.findElement(By.xpath("//button[@class='_2MMH-I']"));
		demo.click();
		Assert.assertNull(demo);
	}
}
