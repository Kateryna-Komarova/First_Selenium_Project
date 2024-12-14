package ait_qa49;

import demo.webshop.data.ExistingUser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getLogin().isLoginButtonPresent()) {
            app.getContact().clickOnLogoutButton();
            app.getLogin().pause(2000);
        }
    }

    @Test(priority = 1)
    public void loginPositiveTest() {
        logger.info("Login with data " + ExistingUser.Email + " ***** " + ExistingUser.Password );
        app.getLogin().pause(2000);
        app.getLogin().clickOnLoginButton();
        app.getLogin().LoginAndPassword();
        app.getLogin().ClickLogIn();
    }
}
