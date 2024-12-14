package demo.webshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHelper extends BaseHelper {
    public LoginHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginButton() {
        click(By.cssSelector("[href='/login']"));
    }

    public void LoginAndPassword() {
        type(By.cssSelector("input#Email"), "Müleri@gmail.com");
        type(By.cssSelector("input#Password"), "@NpnD!A8gc99u");
    }

    public void ClickLogIn() {
        click(By.cssSelector("[value='Log in']"));
    }

    public boolean isLoginButtonPresent() {
        pause(1000);
        return isElementPresent(By.cssSelector("[href='/login']"));
    }
}
