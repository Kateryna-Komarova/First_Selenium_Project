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
        //tag + id
        driver.findElement(By.cssSelector("input#city"));
        //tag+class
        driver.findElement(By.cssSelector("div.search-card"));
        //tag+id+[att='value']
        driver.findElement(By.cssSelector("input#city[type='text']"));
    }
    //  //*[@attr='value']
    @Test
    public void FindElementByXpath(){

        //id-> xpath - //*[@id='value']
       // driver.findElement(By.id("city"));
        driver.findElement(By.xpath("//input[@id='city']"));
        //tag-> //tag
        //driver.findElement(By.tagName("h1"));
        driver.findElement(By.xpath("//h1"));
        //className -> //*[@class='value']
        //driver.findElement(By.className("header"));
        driver.findElement(By.xpath(" //div[@class='header']"));
        //contains -> //*[contains(.,'Text')]
        driver.findElement(By.xpath("//h2[contains(.,'Yalla')]"));
        //equal -> //*[text()='FoolText']
        driver.findElement(By.xpath("//h2[text()='Type your data and hit Yalla!']"));
        driver.findElement(By.xpath("//h2[.='Type your data and hit Yalla!']"));
        //start-> //*[starts-with@attr, 'StartText']
        driver.findElement(By.xpath("//label[starts-with(@for,'ci')]"));
        //move up
        driver.findElement(By.xpath("//a[@class='navigation-link']/.."));
        //parent
        driver.findElement(By.xpath("//h1/parent::*"));
        driver.findElement(By.xpath("//h1/parent::div"));
        driver.findElement(By.xpath("//h1/.."));
        //ancestor
        driver.findElement(By.xpath("//h1/ancestor::*"));//all
        driver.findElement(By.xpath("//h1/ancestor::div"));//two options
        driver.findElement(By.xpath("//h1/ancestor::div[2]"));// one option
        //following-sibling
        driver.findElement(By.xpath("//h1/following-sibling::form"));
        //preceding sibling
        driver.findElement(By.xpath("//h2/preceding-sibling::*"));

    }
}
