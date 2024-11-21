package ait.qa49;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeMethod

    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(enabled = true)

    public void tearDown() {
        driver.quit();
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
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

    public boolean isTextPresent() {
        return isElementPresent(By.xpath("//a[@class='product-name'][contains(text(), '14.1-inch Laptop')]"));
    }

    public void clickOnShoppingCartByCssSelector() {
        click(By.cssSelector("span.cart-label"));
    }

    public void clickOnItemByCss() {
        click(By.cssSelector(".item-box:nth-child(3) .button-2"));
    }

    public boolean isComponentOnMainPagePresent() {
        return driver.findElements(By.cssSelector(".header-logo")).size() > 0;
    }
}
