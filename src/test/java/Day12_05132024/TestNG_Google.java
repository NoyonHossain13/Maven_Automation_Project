package Day12_05132024;

import Day11_05072024.ReuseableMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static Day11_05072024.ReuseableMethod.setupChromeDriver;

public class TestNG_Google {

    WebDriver driver;

    @BeforeSuite
    public void setUpChromeDriver(){
        driver = setupChromeDriver();
        //navigate to google home page
        driver.navigate().to("https://www.google.com");
    }//end of before suite

    @Test()
    public void tc001_searchForACar(){
        //search for a car
        ReuseableMethod.sendKeysMethod(driver, "//*[@name = 'q']", "bmw", "Google Search");
        //hit submit
        ReuseableMethod.submitMethod(driver, "//*[@name = 'btnK']", "Submit Button");
    }//end of test case 1

    @Test()
    public void tc002_captureSearchResult(){
        // click on the tools button
        ReuseableMethod.clickMethod(driver,"//*[@id = 'hdtb-tls']","Tools Button");
        //store the search result into a string variable
        String searchResult = ReuseableMethod.captureText(driver,"//*[@id = 'result-stats']", "Search Result" );
        //print out the result stats
        System.out.println("Search Result is " + searchResult);
    }//end of test case 2

    @AfterSuite
    public void cleanUpDriver(){
        driver.quit();
    }//end of after suite



}// end of class
