package ait.qa49;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {
    @Test
    public void isHeaderLogoPresentTest() {
        Assert.assertTrue(isComponentOnMainPagePresent());
    }
}
