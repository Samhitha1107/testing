package firstproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Selenium_Grid {
	
	@SuppressWarnings({ })
	@Test
	public void homePageCheck() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		
		@SuppressWarnings("unused")
		WebDriver driver = new RemoteWebDriver(new URL("http://172.20.1.230:4444"), caps);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Celominds Solutions");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
//		search.click();
	}

	@SuppressWarnings("unused")
	private WebDriver getWebDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}


