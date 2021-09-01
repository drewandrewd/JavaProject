package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
        //Login
        driver.get("https://crm.geekbrains.space/user/login");
        driver.findElement(By.id("prependedInput")).click();
        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).click();
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span"))).build().perform();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div/div/div[2]/div/div/a")).click();
        //Create project
        driver.findElement(By.name("crm_project[name]")).click();
        driver.findElement(By.name("crm_project[name]")).sendKeys("new888");
        driver.findElement(By.cssSelector(".select2-default > .select2-arrow")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li[1]/div")).click();
        //Thread.sleep(3000);
        new WebDriverWait(driver, 3).until(ExpectedConditions.invisibilityOfElementLocated(By.className("select2-container-disabled")));
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/form/div[2]/div[3]/div/div[1]/div[2]/fieldset/div[4]/div[1]/div[2]/div/a/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li[1]/div")).click();
        {
            Select select = new Select(driver.findElement(By.name("crm_project[businessUnit]")));
            select.selectByVisibleText("Research & Development");
        }
        {
            Select select = new Select(driver.findElement(By.name("crm_project[curator]")));
            select.selectByVisibleText("Applanatest Applanatest Applanatest");
        }
        {
            Select select = new Select(driver.findElement(By.name("crm_project[rp]")));
            select.selectByVisibleText("Applanatest Applanatest Applanatest");
        }
        {
            Select select = new Select(driver.findElement(By.name("crm_project[administrator]")));
            select.selectByVisibleText("Applanatest Applanatest Applanatest");
        }
        {
            Select select = new Select(driver.findElement(By.name("crm_project[manager]")));
            select.selectByVisibleText("Applanatest Applanatest Applanatest");
        }
        driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn")).click();
    }
}
