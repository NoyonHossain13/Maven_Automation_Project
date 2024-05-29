package Day5_04162024;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_googleSearch {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        // type cars into the search box
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name= 'q']")).sendKeys("cars");
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        //pause for 2 seconds
        Thread.sleep(2000);
        String searchResults = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        System.out.println("search result is " + searchResults);
        driver.quit();


    }// end of main

}// end of class
