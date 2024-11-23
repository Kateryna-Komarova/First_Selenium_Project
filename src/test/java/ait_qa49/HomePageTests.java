package ait_qa49;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getHome().isComponentOnMainPagePresent()) {
            app.getHome().clickOnHomeLink();
        }
    }

    @Test
    public void isHeaderLogoPresentTest() {

        Assert.assertTrue(app.getHome().isComponentOnMainPagePresent());
    }
}
