package ait_qa49;

import demo.webshop.data.NewUserData;
import demo.webshop.models.Contact;
import demo.webshop.utils.DataProviders;
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
                .setFirstName(NewUserData.FirstName)
                .setLastName(NewUserData.LastName)
                .setEmail(NewUserData.Email)
                .setPassword(NewUserData.Password)
                .setConfirmPassword(NewUserData.ConfirmPassword));
        app.getContact().clickRegistrationEnd();
        Assert.assertTrue(app.getContact().isElementPresent(By.cssSelector("input[value='Continue']")));

    }
//
//    @Test(dataProvider = "createAccountWithCsv", dataProviderClass = DataProviders.class)
//    public void addContactWithCsvFileTest(Contact contact) {
//        int i = (int) ((System.currentTimeMillis() / 1000) % 3600);
//        app.getContact().clickOnRegisterButton();
//        app.getContact().fillRegistrationData(contact);
//        app.getContact().clickRegistrationEnd();
//        Assert.assertTrue(app.getContact().isElementPresent(By.cssSelector("input[value='Continue']")));
//
//    }
}
