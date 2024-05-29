package Day9_04302024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.TableHeaderUI;
import java.util.ArrayList;

public class inCLass {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito","start-maximized");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("08234");
        zipCode.add("08093");
        ArrayList<String> policyStart = new ArrayList<>();
        policyStart.add("05/13/2024");
        policyStart.add("06/12/2024");
        ArrayList<String>firstName = new ArrayList<>();
        firstName.add("Noyon");
        firstName.add("Novel");
        ArrayList<String>lastName = new ArrayList<>();
        lastName.add("hossain");
        lastName.add("ahsan");
        ArrayList<String>streetAdd = new ArrayList<>();
        streetAdd.add("2594 ridge ave");
        streetAdd.add("14 Spruce Ave");
        ArrayList<String>dob = new ArrayList<>();
        dob.add("12/13/1991");
        dob.add("12/23/1991");
        ArrayList<String>coFirstName = new ArrayList<>();
        coFirstName.add("Dawg");
        coFirstName.add("Leo");
        ArrayList<String>coLastName = new ArrayList<>();
        coLastName.add("Potter");
        coLastName.add("henry");
        ArrayList<String> selectCity = new ArrayList<>();
        selectCity.add("EGG HARBOR TWSP");
        selectCity.add("GLOUCESTER CITY");

        for (int i=0;i< zipCode.size();i++) {
            // navigate to mortgate calculator
            driver.navigate().to("https://www.statefarm.com/");

            //Click on get a quote
            try {
                driver.findElement(By.xpath("//*[text()='Get a Quote']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on get a quote : " + e);
            }
            //select dropdown as Homeowners
            try {
                WebElement pDrop = driver.findElement(By.xpath("//*[@name='productName']"));
                Select dDown = new Select(pDrop);
                dDown.selectByVisibleText("Homeowners");
            } catch (Exception e) {
                System.out.println("Unable to select homeowner : " + e);
            }//end of homeowners

            Thread.sleep(2000);
            // enter zipcode
            try {
                WebElement zCode = driver.findElement(By.xpath("//*[@name='zipCode']"));
                zCode.clear();
                zCode.click();
                zCode.sendKeys(zipCode.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter zipcode : " + e);
            }//end of zipcode

            //click on start a quote
            try {
                driver.findElement(By.xpath("//*[@id='quote-submit-button1']")).click();
            } catch (Exception e) {
                System.out.println("Unable to enter click on start a quote : " + e);
            }//end of click start a quote

            Thread.sleep(2000);
            // enter policy start date
            try {
                WebElement pDate = driver.findElement(By.xpath("//*[@id='effectiveDate']"));
                pDate.clear();
                pDate.sendKeys(policyStart.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter policy date : " + e);
            }//end of policy date

            // enter firstName
            try {
                WebElement fName = driver.findElement(By.xpath("//*[@id='firstName']"));
                fName.clear();
                fName.sendKeys(firstName.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter firstName : " + e);
            }//end of firstName

            // enter lastName
            try {
                WebElement lName = driver.findElement(By.xpath("//*[@id='lastName']"));
                lName.clear();
                lName.sendKeys(lastName.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter lastName : " + e);
            }//end of lastName

            // enter address
            try {
                WebElement addy = driver.findElement(By.xpath("//*[@id='street']"));
                addy.clear();
                addy.sendKeys(streetAdd.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter address: " + e);
            }//end of address

            // enter DOB
            try {
                WebElement birthD = driver.findElement(By.xpath("//*[@id='dateOfBirth']"));
                birthD.clear();
                birthD.sendKeys(dob.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter date of birth: " + e);
            }//end of date of birth

            //scroll down using javascript executor and click continue button
            try {
                WebElement continueButton = driver.findElement(By.xpath("//*[@name='continue']"));
                jse.executeScript("arguments[0].scrollIntoView(true);", continueButton);
                continueButton.click();
            } catch (Exception e) {
                System.out.println("Unable to scroll down and click continue: " + e);
            }//end of scroll down to click continue
            Thread.sleep(2000);

            //click on continue
            try {
                WebElement continueButton = driver.findElement(By.xpath("//*[@name='continue']"));
                jse.executeScript("arguments[0].scrollIntoView(true);", continueButton);
                continueButton.click();
            } catch (Exception e) {
                System.out.println("Unable to click continue: " + e);
            }//end of scroll down to click continue
            Thread.sleep(3000);

            //select value from dropdown
            try {
                WebElement fProtection = driver.findElement(By.xpath("//*[@id='fireProtectionAreaNameSelectId']"));
                Select city = new Select(fProtection);
                city.selectByIndex(1);
                driver.findElement(By.xpath("//*[@name='continue']")).click();
            } catch (Exception e) {
                System.out.println("Unable to select value from city dropdown and click continue: " + e);
            }//end of select value from city dropdown
            Thread.sleep(3000);

            //print the personal applicant info
            try {
                WebElement appName = driver.findElement(By.xpath("//*[@class='label-edit bold']"));
                System.out.println(appName.getText());

            } catch (Exception e) {
                System.out.println("Unable to get text from personal info " + e);
            }//end of personal applicant info

            //print the email info message
            try {
                WebElement emailMessage = driver.findElement(By.xpath("//*[@class='help-block']"));
                System.out.println(emailMessage.getText());
            } catch (Exception e) {
                System.out.println("Unable to get text from email message " + e);
            }//end of personal applicant info

            //print the add an applicant message
            try {
                WebElement emailMessage = driver.findElement(By.xpath("//*[@class='row-fluid']"));
                System.out.println(emailMessage.getText());
            } catch (Exception e) {
                System.out.println("Unable to get text from email message " + e);
            }//end of personal applicant info

            //click on Add an applicant
            try {
                WebElement addButton = driver.findElement(By.xpath("//*[@id='addApplicantModuleNewAdd']"));
                jse.executeScript("arguments[0].scrollIntoView(true);", addButton);
                addButton.click();

            } catch (Exception e) {
                System.out.println("Unable to click on add an applicant" + e);
            }//end of click on add an applicant
            Thread.sleep(3000);

            //enter co-applicant first and last name and continue
            try {
                WebElement coFName = driver.findElement(By.xpath("//*[@id='sfx_additionalApplicants[0].client.firstName_input']"));
                WebElement coLName = driver.findElement(By.xpath("//*[@id='sfx_additionalApplicants[0].client.lastName_input']"));
                coFName.sendKeys(coFirstName.get(i));
                coLName.sendKeys(coLastName.get(i));
                driver.findElement(By.xpath("//*[@name='continue']")).click();

            } catch (Exception e) {
                System.out.println("Unable to enter co first and last name then continue" + e);
            }//end of click on add an applicant


        }//end of loop
        driver.quit();
    }//end of method
}//end of class
