package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import firstproject.Dashboard;
import firstproject.HomePage;
import firstproject.LoginPage;

public class Login_TC1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/books");
		
		//Creating object of home page
		HomePage home = new HomePage(driver);
		
		//Creating object of Login page
		LoginPage login = new LoginPage(driver);
		
		//Creating object of Dashboard
		Dashboard dashboard = new Dashboard(driver);
		
		//Click on Login button
		home.clickLogin();
		
		//Enter username & password
		login.enterUsername("user");
		login.enterPassword("pass");
		
		//Click on login button
		login.clickLogin();
		Thread.sleep(3000);
		
		
		//Capture the page heading and print on console
		System.out.println("The page heading is --- " +dashboard.getHeading());
		
		//Click on Logout button
		dashboard.clickLogout();

               //Close browser instance
               driver.quit();
	}

}