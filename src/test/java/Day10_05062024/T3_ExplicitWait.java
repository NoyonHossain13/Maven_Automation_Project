package Day10_05062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T3_ExplicitWait {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito","Start-Maximized");
        WebDriver driver = new ChromeDriver(options);

        //navigate to UPS
        driver.navigate().to("https://www.ups.com");
        // add an explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        //click on Tracking with explicit wait
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainNavDropdown2']"))).click();
        }catch(Exception e){
            System.out.println("Unable to click tracking with explicit wait: " + e);
        }

        //click on Track a package with explicit wait
        try{
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();
        }catch(Exception e){
            System.out.println("Unable to click on Track a Package: " + e);
        }


    }//end of method
}//end of class
