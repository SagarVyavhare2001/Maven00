package Testng.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionExmple {
    @Test
    public void verifySauceDemo(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement userNameTextBox = driver.findElement(By.id("user-name"));
        Assert.assertTrue(userNameTextBox.isDisplayed(),"user name text box should be display");

        Assert.assertEquals(driver.getTitle(),"swag","swag word only");

        driver.close();
    }
}
