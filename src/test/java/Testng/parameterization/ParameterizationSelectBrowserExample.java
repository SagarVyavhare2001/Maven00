package Testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationSelectBrowserExample {

    public static WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void setUp(String browserName){
        driver = new ChromeDriver();

        if (browserName.equals("chrome")){
            driver = new ChromeDriver();
        }else if (browserName.equals("edge")){
            driver = new EdgeDriver();
        }else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

    }
    @Parameters({"productName"})
    @Test
    public void verifySearchFlipkart(String productName)throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement searchTextBox =  driver.findElement(By.name("q"));
        searchTextBox.sendKeys(productName);
        Thread.sleep(3000);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();

    }


}
