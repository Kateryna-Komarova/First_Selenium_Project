package demo.webshop.fw;

import demo.webshop.models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends BaseHelper {
    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void clickRegistrationEnd() {
        click(By.cssSelector("input[value='Register']"));
    }

    public void fillRegistrationData(Contact contact) {
        type(By.cssSelector("input#FirstName"), contact.getFirstName());
        type(By.cssSelector("input#LastName"), contact.getLastName());
        type(By.cssSelector("input#Email"), contact.getEmail());
        type(By.cssSelector("input#Password"), contact.getPassword());
        type(By.cssSelector("input#ConfirmPassword"), contact.getConfirmPassword());
    }

    public void clickOnRegisterButton() {
        click(By.cssSelector("[href='/register']"));
    }

    public boolean isRegistrationButtonPresent() {
        return isElementPresent(By.cssSelector("[href='/register']"));
    }

    public void clickOnLogoutButton() {
        click(By.xpath("//a[contains(text(),'Log out')]"));
    }
}
