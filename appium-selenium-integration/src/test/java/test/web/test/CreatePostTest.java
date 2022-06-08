package test.web.test;

import org.testng.annotations.Test;
import test.web.po.FeedPage;
import test.web.po.LoginPage;

import java.util.concurrent.TimeUnit;

public class CreatePostTest extends WebFactory{

    public FeedPage feedPage;

    @Test
    public void createPost(){
        LoginTest.allAcess(driver);
        feedPage = new FeedPage(driver);
        feedPage.getPage();
        feedPage.setInpupText("This is my first post in Taringa");
        feedPage.post();
    }

    @Test
    public void findPost(){
        feedPage.getPage();
        assert (feedPage.findPost("Hola a todos"));
    }
}
