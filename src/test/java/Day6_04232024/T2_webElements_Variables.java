package Day6_04232024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T2_webElements_Variables {
    public static void main(String[] args) throws InterruptedException {
        // webElements array list go to yahoo and print out the headers
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito","start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://www.yahoo.com/");
        //store the yahoo headers in an array list of webElements
        ArrayList<WebElement> yahooHeaders = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class, '_yb_jujrfs')]")));
        //print out the headers using a for loop
        for(int i=0;i<yahooHeaders.size();i++){
            System.out.println("yahoo headers are "+ yahooHeaders.get(i).getText());


        }
        yahooHeaders.get(2).click();
        Thread.sleep(2000);
        driver.quit();

    }// end of method
} // end of class
