package ait.qa49;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        clickOnLoginButton();
        LoginAndPassword();
        ClickLogIn();
    }

    @Test
    public void addSecondItemInTheCart() {
        clickOnItemByCss();
        clickOnShoppingCartByCssSelector();
        Assert.assertTrue(isTextPresent());
    }
}
