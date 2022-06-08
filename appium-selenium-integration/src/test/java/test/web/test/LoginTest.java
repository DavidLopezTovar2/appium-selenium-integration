package test.web.test;

import io.appium.java_client.android.options.context.SupportsShowChromedriverLogOption;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import test.web.po.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginTest extends WebFactory {


    @Test
    public void loginUser(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getPage();
        loginPage.setUserName("dadavivi88@hotmail.com");
        loginPage.setPassword("Toolbar1997");
        loginPage.login();
    }

    public static void allAcess(WebDriver driver){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getPage();
        loginPage.setUserName("dadavivi88@hotmail.com");
        loginPage.setPassword("Toolbar1997");
        loginPage.login();
    }


}
