package Day6_04232024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_Javascript_Executor {

    public static void main(String[] args) throws InterruptedException {


        ChromeOptions options = new ChromeOptions();
        //add options to start it maximized
        options.addArguments("start-maximized", "incognito");
        //options.addArguments("headless");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        driver.navigate().to("https://www.mlcalc.com/");
        jse.executeScript("scroll(0,800)");
        Thread.sleep(2000);

        WebElement calc = driver.findElement(By.xpath("//*[@value='Calculate']"));
        jse.executeScript("arguments[0].scrollIntoView(true);", calc);
        Thread.sleep(2000);
        // scroll into webElement
        driver.quit();


    }// end of method
}// end of class
