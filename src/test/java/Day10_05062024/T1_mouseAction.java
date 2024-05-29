package Day10_05062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_mouseAction {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito","Start-Maximized");
        WebDriver driver = new ChromeDriver(options);
        Actions mouseAction = new Actions(driver);

        // navigate to USPS
        driver.navigate().to("https://www.usps.com");

        //hover over send option
        try{
            WebElement send = driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
            mouseAction.moveToElement(send).perform();
        }catch (Exception e){
            System.out.println("Unable to hover over send option: "+ e);
        }//end of hover over Send option

        //click on look up zipcode
        try{
            WebElement zipCodeLookUp = driver.findElement(By.xpath("//*[text()='Look Up a ZIP Code']"));
            mouseAction.moveToElement(zipCodeLookUp).click().perform();
        }catch (Exception e){
            System.out.println("unable to click on zipcode: "+ e);
        }//end of look up zipcode

        //click on find Cities by Zip
        try{
            WebElement findCitiesZip = driver.findElement(By.xpath("//*[text()='Find Cities by ZIP']"));
            mouseAction.moveToElement(findCitiesZip).click().perform();
        }catch (Exception e){
            System.out.println("unable to click on Find Cities by zipcode: "+ e);
        }//end of look up zipcode

        Thread.sleep(2000);
        //enter input in zipcode field
        try{
            WebElement findCitiesZip = driver.findElement(By.xpath("//*[@id='tZip']"));
            Thread.sleep(2000);
            mouseAction.moveToElement(findCitiesZip).click().sendKeys("11221").perform();
        }catch (Exception e){
            System.out.println("unable to sendkeys to zip code field: "+ e);
        }//end of look up zipcode




    }// end of method
}// end of class
