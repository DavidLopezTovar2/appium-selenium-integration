package test.mobile.test;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;

public class MobileFactory {
    private static final String APP = "/Users/davidlopez/Downloads/app-debug.apk";
    private static final String APPIUM = "http://localhost:4723/wd/hub";
    public AppiumDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", APP);
        driver = new AppiumDriver(new URL(APPIUM), caps);
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
