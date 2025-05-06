package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations01 {
   WebDriver driver  = new ChromeDriver();

  @BeforeMethod
  public void setup(){
      driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
  }
    @Test
    public void verifyAmazon()throws InterruptedException{
        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

  }
  @AfterMethod
    public void postRequsite(){
      driver.close();
  }

}
