package demo.webshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BaseHelper {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isComponentOnMainPagePresent() {
        return isElementPresent(By.cssSelector(".header-logo"));
    }

    public void clickOnHomeLink() {
        click(By.xpath("//a[contains(text(),'Sitemap')]"));
    }
}
