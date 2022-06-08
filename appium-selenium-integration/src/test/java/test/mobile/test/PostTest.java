package test.mobile.test;

import org.testng.annotations.Test;
import test.mobile.po.FeedPage;
import test.mobile.po.PageBase;

public class PostTest extends MobileFactory {

    @Test
    public void postTest(){
        String text = "This is my first post in Taringa";
        LoginTest.allAccess(driver);
        FeedPage feedPage = new FeedPage(driver);
        feedPage.setInputTextBox(text);
        feedPage.publish();
    }

}
