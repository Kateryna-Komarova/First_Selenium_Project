package demo.webshop.fw;

import demo.webshop.utils.MyListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class ApplicationManager {
    String browser;
    WebDriver driver;

    Logger logger = LoggerFactory.getLogger(ApplicationManager.class);

    AddItemHelper add;
    ContactHelper contact;
    HomePageHelper home;
    LoginHelper login;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        }

        WebDriverListener listener = new MyListener();
        driver = new EventFiringDecorator<>(listener).decorate(driver);

        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com");
        logger.info("Current url --> " + driver.getCurrentUrl());
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

