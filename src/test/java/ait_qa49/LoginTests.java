package ait_qa49;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getLogin().isLoginButtonPresent()) {
            app.getContact().clickOnLogoutButton();
        }
    }

    @Test(priority = 1)
    public void loginPositiveTest() {
        app.getLogin().clickOnLoginButton();
        app.getLogin().LoginAndPassword();
        app.getLogin().ClickLogIn();
    }
}
