package Day6_04232024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_webElement_Variable {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        //add options to start it maximized
        options.addArguments("start-maximized", "incognito");
        //options.addArguments("headless");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.mortgagecalculator.org/");
        WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));
        homeValue.clear();
        homeValue.sendKeys("950000");

        Thread.sleep(2000);

        driver.quit();



    }// end of method

}// end of class
