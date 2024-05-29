package Day13_05142024;

import Day11_05072024.ReuseableMethod;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_HardAssert extends TestParent{

    @Test
    public void tc001_verifyGoogle(){
        //naviagete to google homepage
        driver.navigate().to("https://www.google.com");
        //store the title of google page in a string variable
        String actualTitle = driver.getTitle();
        //store the expected title
        String expectedTitle = "Google";
        //assert two titles
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(priority = 2)
    public void tc002_searchForACar(){
        //navigate to google home page
        driver.navigate().to("https://www.google.com");
        //search for a car
        ReuseableMethod.sendKeysMethod(driver, "//*[@name = 'q']", "bmw", "Google Search");
        //hit submit
        ReuseableMethod.submitMethod(driver, "//*[@name = 'btnK']", "Submit Button");
    }//end of test case 2

    @Test(priority = 3)  //this test case should fail
    public void tc003_captureSearchResult(){
        // click on the tools button
        ReuseableMethod.clickMethod(driver,"//*[@id = 'hdtb-tls']","Tools Button");
        //store the search result into a string variable
        String actualGoogleSearchResult = ReuseableMethod.captureText(driver,"//*[@id = 'result-stats']", "Search Result" );
        String expectedGoogleSearchResult = "About 1,390,000,000 results (0.51 seconds)";
        //Assert the search results
        Assert.assertEquals(actualGoogleSearchResult,expectedGoogleSearchResult);
    }//end of test case 3



}//end of class
