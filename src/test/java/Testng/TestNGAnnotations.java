package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGAnnotations {

    @Test
    public void verifyAmazon()throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }

}
