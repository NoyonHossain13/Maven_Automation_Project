package Day13_05142024;

import Day11_05072024.ReuseableMethod;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class T3_SoftAssert extends TestParent {

    @Test
    public void tc001_verifyGoogle(){
        //naviagete to google homepage
        driver.navigate().to("https://www.google.com");
        //store the title of google page in a string variable
        String actualTitle = driver.getTitle();
        //store the expected title
        String expectedTitle = "Google";
        //assert two titles
        SoftAssert softie = new SoftAssert();
        softie.assertEquals(actualTitle,expectedTitle);
        softie.assertAll();
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
        SoftAssert softie = new SoftAssert();
        softie.assertEquals(actualGoogleSearchResult,expectedGoogleSearchResult);
        softie.assertAll();
    }//end of test case 3




}
