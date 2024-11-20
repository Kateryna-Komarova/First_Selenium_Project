package ait.qa49;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    @Test
    public void newUserRegistrationPositiveTest(){
        int i = (int)((System.currentTimeMillis()/1000)%3600);
        click(By.cssSelector("[href='/register']"));
        type(By.cssSelector("input#FirstName"),"Maria");
        type(By.cssSelector("input#LastName"),"Müller");
        type(By.cssSelector("input#Email"),"Müller"+i+"@gmail.com");
        type(By.cssSelector("input#Password"),"@NpnD!A8gc99u");
        type(By.cssSelector("input#ConfirmPassword"),"@NpnD!A8gc99u");
        click(By.cssSelector("input[value='Register']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("input[value='Continue']")));


    }
}
