package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExmple {

    @Test(priority = 3, groups ="smoke")
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");

    }
    @Test
    public void verifyPayment(){
        System.out.println("Verify Payment");

    }
    @Test
    public void verifyOnBoarding(){
        System.out.println("Verify Onboarding");

    }

}
