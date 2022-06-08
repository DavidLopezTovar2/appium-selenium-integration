package test.web.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebFactory {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void quite(){
        driver.close();
    }
}
