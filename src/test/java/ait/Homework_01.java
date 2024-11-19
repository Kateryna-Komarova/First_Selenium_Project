package ait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework_01 {

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

    @Test
    public void openDemoWeb() {
        System.out.println("DemoWeb opened");
    }

    @Test
    public void FindElementByLocator() {
        driver.findElement(By.id("flyout-cart"));
        driver.findElement(By.className("header-logo"));
        driver.findElement(By.id("topcartlink"));
        driver.findElement(By.linkText("Facebook"));
        driver.findElement(By.name("q"));
        driver.findElement(By.linkText("Wishlist"));
        driver.findElement(By.className("twitter"));
        driver.findElement(By.tagName("title"));
        driver.findElement(By.linkText("My account"));
        driver.findElement(By.id("dialog-notifications-success"));
    }

    @Test
    public void FindElementByCssSelector() {
        driver.findElement(By.cssSelector("#flyout-cart"));
        driver.findElement(By.cssSelector(".header-logo"));
        driver.findElement(By.cssSelector("#topcartlink"));
        driver.findElement(By.cssSelector("[href = 'http://www.facebook.com/nopCommerce']"));
        driver.findElement(By.cssSelector("[name = 'q']"));
        driver.findElement(By.cssSelector("[href*='/wis']"));
        driver.findElement(By.cssSelector(".twitter"));
        driver.findElement(By.cssSelector("title"));
        driver.findElement(By.cssSelector("[href^='/customer']"));
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
    }

    @Test
    public void FindElementByXpath() {
        driver.findElement(By.xpath("//div[@id='mob-menu-button']"));
        driver.findElement(By.xpath("//div[@class='search-box']"));
        driver.findElement(By.xpath("//a[@href='http://www.facebook.com/nopCommerce']"));
        driver.findElement(By.xpath("//h3[contains(text(),'Information')]"));
        driver.findElement(By.xpath("//h3/parent::*"));
        driver.findElement(By.xpath("//h3[contains(.,'Follow')]"));
        driver.findElement(By.xpath("//body"));
        driver.findElement(By.xpath("//h3/parent::div"));
        driver.findElement(By.xpath("//input"));
        driver.findElement(By.xpath("//body/div[4]"));
        driver.findElement(By.xpath("//input[@id='newsletter-email']"));
        driver.findElement(By.xpath("//span[@class='close']/parent::div"));
        driver.findElement(By.xpath("//ul[@class='list']/child::li"));
        driver.findElement(By.xpath("//div[@class='search-box']/ancestor::div"));
        driver.findElement(By.xpath("//a[contains(text(), 'Log in')]"));
    }
}
