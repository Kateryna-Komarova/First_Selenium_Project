package demo.webshop.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ApplicationManager {
    String browser;
    WebDriver driver;

    AddItemHelper add;
    ContactHelper contact;
    HomePageHelper home;
    LoginHelper login;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() {
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }



        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        add = new AddItemHelper(driver);
        contact = new ContactHelper(driver);
        home = new HomePageHelper(driver);
        login = new LoginHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public AddItemHelper getAdd() {
        return add;
    }

    public ContactHelper getContact() {
        return contact;
    }

    public HomePageHelper getHome() {
        return home;
    }

    public LoginHelper getLogin() {
        return login;
    }
}
