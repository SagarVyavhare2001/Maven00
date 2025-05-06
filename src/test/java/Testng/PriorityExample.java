package Testng;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 5)
    public void  verifyA(){
        System.out.println("Verify test A");
    }

    @Test(priority = 4)
    public void  verifyB(){
        System.out.println("Verify test B");
    }

    @Test(priority = 3)
    public void  verifyC(){
        System.out.println("Verify test C");
    }

}
