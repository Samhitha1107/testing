package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drivers\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver(); 
	    
	    driver.navigate().to("https://in.search.yahoo.com/?fr2=inr");
	    
	   
	    
	    driver.findElement(By.id("yschsp")).sendKeys("Celominds Solution Private Limited");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    driver.navigate().back();  
	    driver.quit();

	}

}
