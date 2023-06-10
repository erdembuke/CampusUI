package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(css = "svg[data-icon='plus']")
    public WebElement addBtn;

    @FindBy(xpath = "(//span[text()='Course'])[1]")
    public WebElement coursePopUpBtn;

    @FindBy(xpath = "(//span[text()='Periods'])[1]")
    public WebElement periodsPopUpBtn;

    @FindBy(xpath = "//span[contains(text(),'11B-Kimya(Test)')]")
    public WebElement kimya11BTestPopUp;

    @FindBy(xpath = "//span[contains(text(),'11:00')]")
    public WebElement period_11_00;

    @FindBy(css = "svg[data-icon='floppy-disk']")
    public WebElement saveBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(css = "svg[data-icon='calendar']")
    public WebElement calendarBtn;

    @FindBy(id = "fc-dom-1")
    public WebElement currentDate;

    @FindBy(xpath = "//div[contains(text(),'11B')]")
    public List<WebElement> courseNames;

    public WebElement getWebElement(String element){

        switch (element){
            case "username": return username;
            case "password": return password;
            case "rememberMeCheckBox": return rememberMeCheckBox;
            case "loginBtn": return loginBtn;
            case "errorTab": return errorTab;
            case "addBtn": return addBtn;
            case "coursePopUpBtn": return coursePopUpBtn;
            case "kimya11BTestPopUp": return kimya11BTestPopUp;
            case "periodsPopUpBtn": return periodsPopUpBtn;
            case "period_11_00": return period_11_00;
            case "saveBtn": return saveBtn;
            case "calendarBtn": return calendarBtn;

        }
        return null;
    }
}
