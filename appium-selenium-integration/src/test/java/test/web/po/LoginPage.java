package test.web.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    public LoginPage (WebDriver driver){
        super(driver);
    }

    @FindBy(id = "email")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(className = "w-full")
    WebElement loginButton;

    public void getPage(){
        get("https://remix-i-poc.taringa.net/login");
    }

    public void setUserName(String text){
        sendKeys(username,text);
    }

    public void setPassword(String text){
        sendKeys(password,text);
    }

    public void login(){
        click(loginButton);
    }

    public void getHomePage(){
        get("https://remix-i-poc.taringa.net");
    }
}
