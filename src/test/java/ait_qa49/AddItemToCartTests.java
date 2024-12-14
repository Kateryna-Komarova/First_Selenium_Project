package ait_qa49;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddItemToCartTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getLogin().isLoginButtonPresent()) {
            app.getContact().clickOnLogoutButton();
        }
        app.getLogin().clickOnLoginButton();
        app.getLogin().LoginAndPassword();
        app.getLogin().ClickLogIn();
    }

    @Test
    public void addSecondItemInTheCart() {
        app.getAdd().clickOnItemByCss();
        app.getAdd().pause(1000);
        app.getAdd().clickOnCart();
        //clickOnShoppingCartByCssSelector();
        Assert.assertTrue(app.getAdd().isTextPresent());
    }
}
