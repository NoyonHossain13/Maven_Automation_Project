package Day13_05142024;

import Day11_05072024.ReuseableMethod;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.reflect.Method;

import static Day11_05072024.ReuseableMethod.setupChromeDriver;

public class TestParent {
    public static WebDriver driver;

    public static ExtentReports reports;

    public static ExtentTest logger;

    public static void assertEqualsLoggers(String expectedText, String actualText){
        if(expectedText.equals(actualText)){
            logger.log(LogStatus.PASS, "Expected Text" + "Matches" + actualText);
            Assert.assertEquals(actualText,expectedText);
        }else {
            logger.log(LogStatus.FAIL, "Expected Text" + expectedText + "Does not match " + actualText);
            Assert.assertEquals(actualText,expectedText);
        }
    }//end of assertEqualsLogger

    //declare a global public webDriver variable
    @BeforeSuite
    public void setUpReports(){
        reports = new ExtentReports("src/main/java/HTML_Report/AutomationReport.html");
    }//end of before suite

    @BeforeClass
    public void setUpDriver(){
        driver = ReuseableMethod.setupChromeDriver();
    }//end of before class

    @BeforeMethod
    public void setTestName (Method methodName){
        logger = reports.startTest(methodName.getName());
    }//end of before method

    @AfterMethod
    public void endTest (){
        reports.endTest(logger);
    }//end of before method

    @AfterClass
    public void quitDriver(){
        driver.quit();
    }//end of after class

    @AfterSuite
    public void flushReport(){
        reports.flush();
    }//end of after suite


}//end of class
