package Day11_05072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Day11_05072024.ReuseableMethod.captureText;
import static Day11_05072024.ReuseableMethod.setupChromeDriver;

public class T1_googleReusableMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = setupChromeDriver();

        driver.navigate().to("https://www.google.com/");
        // type bmw into the search box
        ReuseableMethod.sendKeysMethod(driver,"//*[@name= 'q']","bmw","Google Search");
        //click submit
        ReuseableMethod.submitMethod(driver,"//*[@name='btnK']","Submit Button");
        //click on tools
        ReuseableMethod.clickMethod(driver,"//*[@id='hdtb-tls']","Click tools");
       //capture the results in searResults
        String searchResults = ReuseableMethod.captureText(driver,"//*[@id='result-stats']","Rearch Result");
        System.out.println("search result is " + searchResults);
        driver.quit();



    }//end of main
}//end of class
