package Day8_0429224;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_selectCommand2 {

    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized", "incognito");
        //add option to start it maximized
//        options.addArguments("incognito");
        //run headless mode (code runs in the background)
//        options.addArguments("headless");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator site
        driver.navigate().to("https://www.mortgagecalculator.org");
        //wait few seconds for the browser session to load up
        Thread.sleep(3000);
        // end the home value
        driver.findElement(By.xpath("//*[@id= 'homeval']")).sendKeys("450000");
        //enter down payment
        driver.findElement(By.xpath("//*[@id= 'downpayment']")).sendKeys("100000");
        //select a start month from the start month dropdown
        WebElement strMonth = driver.findElement(By.xpath("//*[@name = 'param[start_month]']"));
        // call the select function to select the start month
        Select strMonthDropdown = new Select(strMonth);
        //select may by visible text
        strMonthDropdown.selectByVisibleText("May");
        //select May by index
        //strMonthDropdown.selectByIndex(4);
        //select by value
        //strMonthDropdown.selectByValue("5");

    }// end of main
// end of class





}
