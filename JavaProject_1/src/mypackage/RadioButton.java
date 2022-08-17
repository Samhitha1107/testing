package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drivers\\chromedriver.exe"); 
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/test/radio.html");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='vfb-7-1']")).click();
			driver.findElements(By.xpath("//input[@name='webform']"));
			
			
			
			//driver.close();
			
	}

}
