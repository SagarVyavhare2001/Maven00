package Testng.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExmple {
    @Test
            public void verifySoftAssert()throws InterruptedException{
            SoftAssert sa = new SoftAssert();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement userNameTextBox = driver.findElement(By.id("user-name"));
        sa.assertTrue(userNameTextBox.isDisplayed(),"user name text box should be display");

        sa.assertEquals(driver.getTitle(),"swag","swag word only");
        Thread.sleep(3000);
        driver.close();
    }

}
