package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationTabs extends Parent{

    public NavigationTabs(){
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Courses']")
    public WebElement coursesTab;

    @FindBy(xpath = "(//span[text()='Calendar'])[1]")
    public WebElement calendarTab;

    @FindBy(xpath = "//span[contains(text(),'Staj 2023')]")
    public WebElement homepageText;


    public WebElement getWebElement(String element){
        switch (element) {
            case "coursesTab": return coursesTab;
            case "calendarTab": return calendarTab;
            case "homepageText": return homepageText;
        }
        return null;
    }
}

