package demo.webshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItemHelper extends BaseHelper {

    public AddItemHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isTextPresent() {
        return isElementPresent(By.xpath("//a[@class='product-name'][contains(text(), '14.1-inch Laptop')]"));
    }

    public void clickOnShoppingCartByCssSelector() {
        click(By.cssSelector("span.cart-label"));
    }

    public void clickOnItemByCss() {
        click(By.cssSelector(".item-box:nth-child(3) .button-2"));
    }
}
