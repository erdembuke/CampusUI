package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContents extends Parent{

    public DialogContents(){
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[id='mat-input-0']")
    public WebElement username;

    @FindBy(css = "input[id='mat-input-1']")
    public WebElement password;

    @FindBy(css = "input[id='mat-checkbox-1-input']")
    public WebElement rememberMeCheckBox;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginBtn;

    @FindBy(css = "hot-toast[class='ng-star-inserted']")
    public WebElement errorTab;

    public WebElement getWebElement(String element){

        switch (element){
            case "username": return username;
            case "password": return password;
            case "rememberMeCheckBox": return rememberMeCheckBox;
            case "loginBtn": return loginBtn;
            case "errorTab": return errorTab;
        }
        return null;
    }
}
