package demo.webshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddItemHelper extends BaseHelper {

    public AddItemHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isTextPresent() {
        pause(1000);
        return isElementPresent(By.xpath("//a[@class='product-name'][contains(text(), '14.1-inch Laptop')]"));
    }

    public void clickOnShoppingCartByCssSelector() {
        click(By.id("topcartlink"));
    }


    public void clickOnCart() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.invisibilityOfElementLocated(By.id("bar-notification")));
       click(By.id("topcartlink"));
    }


    public void clickOnItemByCss() {
        pause(1000);
        click(By.cssSelector(".item-box:nth-child(3) .button-2"));
    }
}
