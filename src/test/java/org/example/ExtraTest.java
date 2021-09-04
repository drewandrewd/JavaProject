package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ExtraTest { // т.к. капчу в ThirdTest не проходит, добавил данный дополнительный тест

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
        driver.get("https://online-bloknot.ru/");
        driver.findElement(By.cssSelector(".cke_button__bold_icon")).click();
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("/html/body")).sendKeys("Добрый день!!");
        driver.switchTo().defaultContent();
    }
}
