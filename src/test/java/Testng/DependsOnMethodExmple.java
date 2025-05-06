package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExmple {

    @Test
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login");

    }
    @Test(dependsOnMethods = "verifyLogin")
    public void verifyHomePage(){
        System.out.println("Verify Home Page");

    }
    @Test
    public void verifyOnBoarding(){
        System.out.println("Verify Onboarding");

    }

}
