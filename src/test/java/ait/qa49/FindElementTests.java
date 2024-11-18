package ait.qa49;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void  tearDown(){
        driver.quit();
    }

    @Test
    public void findElementByTagName(){
        //option+enter
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.tagName("a"));
        System.out.println(element1.getText());

        List<WebElement> a = driver.findElements(By.tagName("a"));
        System.out.println(a.size());


    }
    @Test
     public void findElementByLocators(){
      driver.findElement(By.id("city"));
      driver.findElement(By.className("header"));
      driver.findElement(By.linkText("Let the car work"));
      driver.findElement(By.partialLinkText("car"));
    }
    @Test
    public void findElementByCssSelectorTest(){
        //tagName == css
        driver.findElement(By.cssSelector("h1"));
        //id -> css(#)
        driver.findElement(By.cssSelector("#city"));
        //className -> css(.)
        driver.findElement(By.cssSelector(".header"));
        //[attr ='value']
        driver.findElement(By.cssSelector("[href='/login?url=%2Fsearch']")); //полное совпадение
        //contains -> *
        driver.findElement(By.cssSelector("[href*='login']")); // частичное совпадение
        //start ->^
        driver.findElement(By.cssSelector("[href^='/log']"));
        //end on -> $
        driver.findElement(By.cssSelector("[href$='search']"));
    }
}
