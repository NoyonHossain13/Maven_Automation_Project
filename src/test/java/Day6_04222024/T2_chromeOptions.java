package Day6_04222024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_chromeOptions {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        //add options to start it maximized
        options.addArguments("start-maximized", "incognito");
        //options.addArguments("headless");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.yahoo.com/");





    }// end of method
}// end of class
