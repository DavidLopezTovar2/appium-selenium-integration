package test.mobile.po;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {

    AppiumDriver driver;
    WebDriverWait wait;

    private static final short WAIT_TIME = 10;

    public PageBase(AppiumDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        PageFactory.initElements(driver,this);
    }

    public void waitPresence(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void sendKeys(WebElement element, String text){
        waitPresence(element);
        element.sendKeys(text);
    }

    public void click(WebElement element){
        waitPresence(element);
        element.click();
    }

}
