package Day8_0429224;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_clickDropdown {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized", "incognito");
        //add option to start it maximized
//        options.addArguments("incognito");
        //run headless mode (code runs in the background)
//        options.addArguments("headless");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator site
        driver.navigate().to("https://www.mortgagecalculator.org");
        //wait few seconds for the browser session to load up
        Thread.sleep(3000);
        // end the home value
        driver.findElement(By.xpath("//*[@id= 'homeval']")).sendKeys("450000");
        //enter down payment
        driver.findElement(By.xpath("//*[@id= 'downpayment']")).sendKeys("100000");
        // click on start of the month
        driver.findElement(By.xpath("//*[@name= 'param[start_month]']")).click();
        //click on dropdown value may by using xpath text()
        driver.findElement(By.xpath("//*[text()='May']")).click();



    }
}




