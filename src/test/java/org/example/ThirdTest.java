package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ThirdTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
        //Login
        driver.get("https://diary.ru/");
        driver.findElement(By.xpath("//*[@id=\"navbar_user-collapse\"]/ul[1]/li[1]/a")).click();
        driver.findElement(By.name("LoginForm[username]")).click();
        driver.findElement(By.name("LoginForm[username]")).sendKeys("andrewid10");
        driver.findElement(By.name("LoginForm[password]")).click();
        driver.findElement(By.name("LoginForm[password]")).sendKeys("Da10071996");
        new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"recaptcha-anchor\"]"))).click();
        driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[4]")).click();
        driver.findElement(By.id("login_btn")).click();
        driver.findElement(By.xpath("//*[@id=\"writeThisDiary\"]/a")).click();
        //Create
        driver.findElement(By.name("BlogsPosts[title]")).click();
        driver.findElement(By.name("BlogsPosts[title]")).sendKeys("new");
        driver.findElement(By.xpath("//*[@id=\"message_ifr\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"message_ifr\"]")).sendKeys("bbb");
        driver.findElement(By.xpath("//*[@id=\"rewrite\"]")).click();
    }
}
