package ait_qa49;

import demo.webshop.models.Contact;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getContact().isRegistrationButtonPresent()) {
            app.getContact().clickOnLogoutButton();
        }
    }

    @Test(enabled = false)
    public void newUserRegistrationPositiveTest() {
        int i = (int) ((System.currentTimeMillis() / 1000) % 3600);
        app.getContact().clickOnRegisterButton();
        app.getContact().fillRegistrationData(new Contact()
                .setFirstName("Maria")
                .setLastName("Müllir")
                .setEmail("Mülertiko@gmail.com")
                .setPassword("@NpnD!A8gc99uo")
                .setConfirmPassword("@NpnD!A8gc99uo"));
        app.getContact().clickRegistrationEnd();
        Assert.assertTrue(app.getContact().isElementPresent(By.cssSelector("input[value='Continue']")));

    }
}
