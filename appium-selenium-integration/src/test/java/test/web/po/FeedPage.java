package test.web.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class FeedPage extends PageBase {

    public FeedPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/div[2]/div")
    WebElement inputClick;

    @FindBy(className = "text-[#ABABAB]")
    WebElement inpupText;

    @FindBy(className = "font-medium")
    WebElement publishButton;

    @FindAll({
            @FindBy(className="whitespace-pre")
    })
    List<WebElement> posts;

    public void getPage(){
        get("https://remix-i-poc.taringa.net/");
    }

    public void setInpupText(String text){
        click(inputClick);
        sendKeys(inpupText,text);
    }

    public void post(){
        click(publishButton);
    }

    public boolean findPost(String text){
        for (int i=0; i<posts.size(); i++){
            if(contains(posts.get(i),text)){
                return true;
            }
        }
        return false;
    }

    //public void findPost()


}
