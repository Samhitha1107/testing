package demo2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertAmazon {
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

    @Test(priority=1)
    public void amazonopne() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptopcharger");

        Thread.sleep(3000, 10);
        @SuppressWarnings("unused")
        String expected = driver.getCurrentUrl();
        @SuppressWarnings("unused")
        String actualTile = "https://www.amazon.in/";
        Assert.assertEquals(actualTile, expected);
        System.out.println("Passed first");
    }

    @SuppressWarnings("null")
    @Test(priority=2)
    public void search() throws InterruptedException {




        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");

        Thread.sleep(3000, 10);

        driver.findElement(By.id("nav-search-bar-form")).submit();
        //      Thread.sleep(3000, 20);
        driver.findElement(By.id("a-autoid-0-announce")).click();
        Thread.sleep(3000, 20);
        String expected1 = driver.getTitle();
        String actual = "Amazon.in : laptopcharger";
        Assert.assertEquals(actual, expected1);
        System.out.println("Passed second");

    }

    @SuppressWarnings("deprecation")
    @Test(priority=3)
    public void searchbutton() throws InterruptedException {

        //		 driver.findElement(By.id("s-result-sort-select_2")).click();
        Thread.sleep(3000, 20);
        driver.findElement(By.xpath("//a[@id='s-result-sort-select_1']")).click();
        Thread.sleep(3000, 20);
        String expected2 = driver.getTitle();
        String actual = "Amazon.in: laptop charger";
        Assert.assertEquals(actual, expected2);
        System.out.println("Passed Third");
        driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//div[@class='s-card-container s-overflow-hidden aok-relative puis-include-content-margin s-latency-cf-section s-card-border']//div[@class='a-section']//div[@class='sg-row']//div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 s-list-col-right']//div[@class='sg-col-inner']//div[@class='a-section a-spacing-small a-spacing-top-small']//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']//span[@class='a-size-medium a-color-base a-text-normal']")).click();
        String expected3 = "https://www.amazon.in/TravisLappy-Power-Cable-Dell-Alienware/dp/B08N4FT2SG/ref=sr_1_1?crid=2923D9KC7BKW3&keywords=laptop+charger&qid=1660799026&sprefix=laptopcharger%2Caps%2C359&sr=8-1";
        String actual1 = "https://www.amazon.in/TravisLappy-Power-Cable-Dell-Alienware/dp/B08N4FT2SG/ref=sr_1_1?crid=2923D9KC7BKW3&keywords=laptop+charger&qid=1660799026&sprefix=laptopcharger%2Caps%2C359&sr=8-1";
        Assert.assertEquals(actual1, expected3);
        System.out.println("Passed second");
        Thread.sleep(2000, 20);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)", "");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //	   Select quantity = new Select( driver.findElement(By.xpath("//select[@id='quantity']")));
        //	   quantity.selectByIndex(2);

    }
    @SuppressWarnings("deprecation")
    @Test(priority=4)
    public void cart() throws InterruptedException {

        ArrayList < String > AllTabs = new ArrayList < String > (driver.getWindowHandles());
        driver.switchTo().window(AllTabs.get(1));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)", "");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // add to cart 
        //driver.findElement(By.xpath("http://html/body/div[1]/div[2]/div[9]/div[6]/div[1]/div[4]/div/div/div/div/form/div/div/div/div/div[3]/div/div[13]/div[1]/span/span/span/input")).click();
        @SuppressWarnings("unused")
        WebElement result = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        result.click();
        Thread.sleep(2000, 20);
        
        driver.close();
        driver.quit();
    }

   

}