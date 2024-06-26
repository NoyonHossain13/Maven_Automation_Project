package Day13_05142024;

import Day11_05072024.ReuseableMethod;
import org.testng.annotations.Test;

public class T2_Google_Inheritance extends TestParent {

    @Test()
    public void tc001_searchForACar(){
        //navigate to google home page
        driver.navigate().to("https://www.google.com");
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



}// end of class
