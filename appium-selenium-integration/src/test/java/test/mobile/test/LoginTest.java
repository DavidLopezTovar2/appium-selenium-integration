package test.mobile.test;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;
import test.mobile.po.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginTest extends MobileFactory{

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("david");
        loginPage.setPassword("12345");
        loginPage.login();
    }

    public static void allAccess( AppiumDriver driver){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("david");
        loginPage.setPassword("12345");
        loginPage.login();
    }

}
