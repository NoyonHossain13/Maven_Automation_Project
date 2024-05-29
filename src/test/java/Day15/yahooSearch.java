package Day15;

import Day13_05142024.TestParent;
import Day14_05202024.ReusableMethods_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

import static Day13_05142024.TestParent.driver;
import static Day13_05142024.TestParent.logger;

public class yahooSearch extends TestParent {

    @Test
    public void yahooSearch(){
        driver.navigate().to("https://www.yahoo.com");
        //enter a keyword on search field
        ReusableMethods_Loggers.sendKeysMethod(driver,logger,"//*[@name='p']","cars","Search Field");
        //click on Google Search button
        ReusableMethods_Loggers.submitMethod(driver,logger,"//*[@id='ybar-search']","Search Button");
        //capture the search results
        String results = ReusableMethods_Loggers.captureText(driver,logger,"//*[@class='compTitle fc-smoke']","Search Results");
        System.out.println("My search Result is " + results);
        logger.log(LogStatus.INFO,"My search Result is " + results);
    }//end of test
}// end of class
