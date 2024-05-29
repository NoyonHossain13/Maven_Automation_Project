package Day6_04222024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class T1_GoogleForLoop {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        ArrayList<String> carBrands = new ArrayList<>();
        carBrands.add("BMW");
        carBrands.add("Toyota");
        carBrands.add("Mercedes");
        carBrands.add("Honda");


        for (int i = 0;i< carBrands.size();i++) {
            driver.navigate().to("https://www.google.com/");
            driver.manage().window().maximize();
            // type cars into the search box
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@name= 'q']")).sendKeys(carBrands.get(i));
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();
            //pause for 2 seconds
            Thread.sleep(2000);
            String searchResults = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            System.out.println("search result for " + carBrands.get(i) + " is " + searchResults);

        }// end of loop

        driver.quit();
    }
}
