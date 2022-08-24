package projecttrial;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class app1 {
	WebDriver driver = null;

	@BeforeTest
	public void setup() {
	@SuppressWarnings("unused")
	String
	projectPath = System.getProperty("user.dir");

	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Drivers\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	}

	@Test
	public void aflipkartopen() throws InterruptedException {
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000, 20);

	String expected = driver.getTitle();
	String actualURL= "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	Assert.assertEquals(expected, actualURL);
	System.out.println("Assert passed");

	}

	@Test
	public void bsearch() throws InterruptedException {


	WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
	searchbox.sendKeys("mobiles");
	searchbox.submit();
	Thread.sleep(2000, 20);
	String expected1 = driver.getTitle();
	String actualURL1= driver.getTitle();
	Assert.assertEquals(expected1, actualURL1);
	System.out.println("Assert passed");


	}

	@SuppressWarnings("deprecation")
	@Test
	public void citemclick() throws InterruptedException {

	@SuppressWarnings("unused")
	ArrayList < String > AllProducts = new ArrayList < String > (driver.getWindowHandles());
	driver.switchTo().window(AllProducts.get(0));
	JavascriptExecutor js = (JavascriptExecutor) driver;

	//get the height of the webpage and scroll to the end
	js.executeScript("window.scrollBy(0,3000)");
	driver.switchTo().defaultContent(); //Come out of iframe.
	Thread.sleep(2000, 20);

	driver.findElement(By.xpath("//div[@class='bra6U8 HL5oOQ']")).click();
	Thread.sleep(2000, 20);
	@SuppressWarnings("unused")
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Thread.sleep(4000, 30);
	String expected1 = driver.getTitle();
	String actualURL1= driver.getTitle();
	Assert.assertEquals(expected1, actualURL1);
	System.out.println("Assert passed");


	}

	@Test
	public void dopenproduct() throws InterruptedException {

	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
	Thread.sleep(4000, 40);
	String expected1 = driver.getTitle();
	String actualURL1= driver.getTitle();
	Assert.assertEquals(expected1, actualURL1);
	System.out.println("Assert passed");
	}
	@Test
	public void eopencart() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[6]/div/div/a/span")).click();
	Thread.sleep(4000, 40);
	ArrayList < String > AllTabs = new ArrayList < String > (driver.getWindowHandles());
	driver.switchTo().window(AllTabs.get(0));
	String expected1 = driver.getTitle();
	String actualURL1= driver.getTitle();
	Assert.assertEquals(expected1, actualURL1);
	System.out.println("Assert passed");
	driver.quit();
	}
	
}