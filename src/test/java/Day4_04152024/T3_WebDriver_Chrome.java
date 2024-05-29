package Day4_04152024;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_WebDriver_Chrome {
    public static void main(String[] args) throws InterruptedException {
        // set chromeDriver with webDrivermanager
        //define the webdriver
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.quit();



    }
}
