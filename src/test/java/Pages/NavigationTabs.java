package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavigationTabs extends Parent{

    public NavigationTabs(){
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "ms-layout-menu-button[page='COURSES']")
    public WebElement coursesTab;

    @FindBy(css = "ms-layout-menu-button[page='CALENDAR']")
    public WebElement calendarTab;

    @FindBy(css = "ms-layout-menu-button[page='ASSIGNMENT']")
    public WebElement assignmentTab;

    @FindBy(css = "ms-layout-menu-button[page='ATTENDANCE']")
    public WebElement attendanceTab;

    @FindBy(css = "ms-layout-menu-button[page='GRADING']")
    public WebElement gradingTab;

    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[1]")
    public WebElement burgerMenu;

    @FindBy(xpath = "//span[contains(text(),'Staj 2023')]")
    public WebElement homepageText;

    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-chevron-left'])[2]")
    public WebElement previous;






    public WebElement getWebElement(String element){
        switch (element) {
            case "coursesTab": return coursesTab;
            case "calendarTab": return calendarTab;
            case "homepageText": return homepageText;
            case "assignmentTab": return assignmentTab;
            case "burgerMenu": return burgerMenu;
            case "gradingTab":
                return gradingTab;
            case "attendanceTab":
                return attendanceTab;
            case "previous":
                return previous;

        }
        return null;
    }
}

