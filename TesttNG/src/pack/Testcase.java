package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    
	    driver.get("http://www.facebook.com");
	    driver.manage().window().maximize();
		

	}

}
