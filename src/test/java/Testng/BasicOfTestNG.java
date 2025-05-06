package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicOfTestNG {

    @Test
    public void verifyEdsoServices()throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.edso.in");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void verifyAmazon()throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void verifyFlipkart()throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.flipkart.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void verifyGoogle()throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }

}
