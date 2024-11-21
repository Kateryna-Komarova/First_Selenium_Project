package ait.qa49;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @Test
    public void newUserRegistrationPositiveTest() {
        int i = (int) ((System.currentTimeMillis() / 1000) % 3600);
        clickOnRegisterButton();
        fillRegistrationData(new Contact()
                .setFirstName("Maria")
                .setLastName("Müllir")
                .setEmail("Müleri@gmail.com")
                .setPassword("@NpnD!A8gc99u")
                .setConfirmPassword("@NpnD!A8gc99u"));
        clickRegistrationEnd();
        Assert.assertTrue(isElementPresent(By.cssSelector("input[value='Continue']")));

    }
}
