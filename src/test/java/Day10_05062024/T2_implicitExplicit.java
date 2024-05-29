package Day10_05062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;
import java.time.Duration;

public class T2_implicitExplicit {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito","Start-Maximized");
        WebDriver driver = new ChromeDriver(options);
        // add a global implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //navigate to UPS
        driver.navigate().to("https://www.ups.com");

        //click on Tracking
        try{
            driver.findElement(By.xpath("//*[@id='mainNavDropdown2']")).click();
        }catch(Exception e){
            System.out.println("Unable to click tracking: " + e);
        }

        //navigate to UPS
        driver.navigate().to("https://www.ups.com");

        //click on Tracking
        try{
            driver.findElement(By.xpath("//*[@id='mainNavDropdown2']")).click();
        }catch(Exception e){
            System.out.println("Unable to click tracking: " + e);
        }

        //click on Track a package
        try{
            driver.findElement(By.xpath("//*[text()='Track a Package']")).click();
        }catch(Exception e){
            System.out.println("Unable to click on Track a Package: " + e);
        }




    }//end of method

}//end of class
