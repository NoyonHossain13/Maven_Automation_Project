package Day11_05072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReuseableMethod {



    public static void clickMethod(WebDriver driver, String xpathValue, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue))).click();
        }catch (Exception e){
            System.out.println("Unable to click on: "+ elementName + "due to exception " + e);
        }//end of catch block
    }// end of click method

    public static String captureText(WebDriver driver, String xpathValue, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String results= "";
        try {
            results = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue))).getText();
        }catch (Exception e){
            System.out.println("Unable to capture text " + elementName + " due to exception " + e);
        }//end of catch block
        return results;
    }//end of capture text method

    public static WebDriver setupChromeDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito","Start-Maximized");
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }// end of setupChromeDriver method

    public static void submitMethod(WebDriver driver, String xpathValue, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue))).submit();
        }catch (Exception e){
            System.out.println("Unable to submit on: "+ elementName + "due to exception " + e);
        }//end of catch block
    }// end of submitMethod

    public static void sendKeysMethod(WebDriver driver, String xpathValue, String userInput, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue))).sendKeys(userInput);
        }catch (Exception e){
            System.out.println("Unable to send keys on: "+ elementName + "due to exception " + e);
        }//end of catch block
    }// end of sendKeysMethod



}//end of class
