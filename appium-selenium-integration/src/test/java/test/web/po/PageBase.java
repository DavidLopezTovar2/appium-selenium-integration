package test.web.po;

import org.hamcrest.core.StringStartsWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    public WebDriver driver;

    public PageBase (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void sendKeys(WebElement element, String text){
        element.sendKeys(text);
    }

    public void click(WebElement element){
        element.click();
    }

    public void get(String url){
        driver.get(url);
    }

    public boolean contains(WebElement element, String text){
        return element.getText().contains(text);
    }

}
