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

    @FindBy(xpath = "(//div/button)[11]")
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

    @FindBy(xpath = "//span[contains(text(),'11B')]")
    public WebElement homeCourses;

    @FindBy(xpath = "(//span[contains(text(),'Details')])[1]")
    public WebElement fizikDetailsBtn;

    @FindBy(xpath = " //h3[contains(text(),'Total Amount of Course Materials')]")
    public WebElement fizikCirruculumMaterials;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchBtn;

    @FindBy(xpath = "//mat-select//span[contains(text(),'Course')]")
    public WebElement dropDownCourse;

    @FindBy(xpath = "//mat-select//span[contains(text(),'Type')]")
    public WebElement dropDownType;

    @FindBy(xpath = "//mat-select//span[contains(text(),'Grade Level')]")
    public WebElement dropDownGradeLevel;
    @FindBy(xpath = "//mat-option//span[contains(text(),'11B-Fizik')]")
    public WebElement dropDownFizik;

    @FindBy(xpath = "//mat-option//span[contains(text(),'Homework')]")
    public WebElement dropDownHomework;

    @FindBy(xpath = "//mat-option//span[contains(text(),'11')]")
    public WebElement dropDown11;

    @FindBy(xpath = "//td[contains(text(),'Published')]")
    public WebElement publishConfirm;

    @FindBy(xpath = "//strong[contains(text(),'11B-Fizik')]")
    public WebElement fizikAssignment;

    @FindBy(xpath = "//div[contains(text(),'Published')]")
    public WebElement assignmentStatus;

    @FindBy(xpath = "//button//span[contains(text(),'Student')]")
    public WebElement burgerStudent;

    @FindBy(xpath = "(//button//span[contains(text(),'Student')])[2]")
    public WebElement burgerStudent2;

    @FindBy(xpath = "//div[@class='mat-paginator-range-label']")
    public WebElement rangeLabel;
    @FindBy(css = "fa-icon[style='font-size: 24px;']>svg[class='svg-inline--fa fa-plus']")
    public WebElement addAttach;
    @FindBy(xpath = "//span[text()='Type']")
    public WebElement typeBtn;
    @FindBy(xpath = "//span[text()='Course']")
    public WebElement courseBtn;
    @FindBy(css = "svg[class='svg-inline--fa fa-calendar-day']")
    public WebElement calendarIcon;
    @FindBy(xpath = "//span[text()=' 11B-Fizik ']")
    public WebElement chooseCourseFizik;
    @FindBy(xpath = "//span[text()=' Homework ']")
    public WebElement homeWorkBtn;
    @FindBy(xpath = "//span[text()='Please select an item']")
    public WebElement selectItemBtn;
    @FindBy(xpath = "//span[text()='Select']")
    public WebElement selectBtn;
    @FindBy(xpath = "//span[text()='From My Files']")
    public WebElement fromMyFilesBtn;

    @FindBy(xpath = "(//span[text()='11B-FIZIK '])[1]")
    public WebElement courseFizik;

    @FindBy(xpath = "//span[text()='11B-FIZIK ']")
    public List<WebElement> courseFizikCount;           // The count of Fizik courses for the current week
    @FindBy(css = "svg[class='svg-inline--fa fa-pen-to-square']")  // count of attach files teacher's page
    public List<WebElement> filesIconTeach;
    @FindBy(css = "svg[class='svg-inline--fa fa-file-image']")    // count of attach files student's page
    public List<WebElement> filesIconStud;
    @FindBy(xpath = "//span[text()='Excel Export']")
    public WebElement excelExportBtn;
    @FindBy(xpath = "//span[text()='Course Term Grades']")
    public WebElement courseTermGrades;
    @FindBy(xpath = "//span[text()='Periods']")
    public WebElement periodsBtn;
    @FindBy(xpath = "//span[text()=' ( L4 ) 12:00  -  12:50 ']")
    public WebElement periodsL4Btn;
    @FindBy(xpath = "(//label[@class='mat-checkbox-layout'])[14]")
    public WebElement uploadFile;

    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement deleteBtn;
    @FindBy(xpath = "//span[text()=' Delete ']")
    public WebElement deleteConfirmBtn;

    @FindBy(xpath = "//span[text()='Attachments']")
    public WebElement attachmentBtn;


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
            case "fizikDetailsBtn": return fizikDetailsBtn;
            case "fizikAssignment": return fizikAssignment;
            case "searchBtn": return searchBtn;
            case "burgerStudent": return burgerStudent;
            case "burgerStudent2": return burgerStudent2;
            case "addAttach":
                return addAttach;
            case "typeBtn":
                return typeBtn;
            case "homeWorkBtn":
                return homeWorkBtn;
            case "fromMyFilesBtn":
                return fromMyFilesBtn;
            case "selectItemBtn":
                return selectItemBtn;
            case "selectBtn":
                return selectBtn;
            case "uploadFile":
                return uploadFile;
            case "courseTermGrades":
                return courseTermGrades;
            case "excelExportBtn":
                return excelExportBtn;
            case "courseBtn":
                return courseBtn;
            case "chooseCourseFizik":
                return chooseCourseFizik;
            case "courseFizik":
                return courseFizik;
            case "attachmentBtn":
                return attachmentBtn;
            case "periodsBtn":
                return periodsBtn;
            case "periodsL4Btn":
                return periodsL4Btn;

            case "successMessage":
                return successMessage;
            case "deleteBtn":
                return deleteBtn;
            case "deleteConfirmBtn":
                return deleteConfirmBtn;
            case "calendarIcon":
                return calendarIcon;



        }
        return null;
    }
}
