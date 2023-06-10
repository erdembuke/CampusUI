package StepDefinitions;

import Pages.DialogContents;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment {

    WebDriver driver;
    DialogContents dc=new DialogContents();

    @Then("Verify that homeworks is published on diplayed page")
    public void verifyThatHomeworksIsPublishedOnDiplayedPage() {
        dc.verifyContainsTextFunction(dc.assignmentStatus, "Published");
    }
    @And("Enter {string} to the name section")
    public void enterToTheNameSection(String text) {
        dc.sendKeysFunction(dc.nameInput, text);
    }

    @And("Select Course from drop down menu")
    public void selectCourseFromDropDownMenu() {
        dc.clickFunction(dc.dropDownCourse);
        dc.clickFunction(dc.dropDownFizik);
    }

    @And("Select Type from drop down menu")
    public void selectTypeFromDropDownMenu() {
        dc.clickFunction(dc.dropDownType);
        dc.clickFunction(dc.dropDownHomework);
    }

    @And("Select Grade Level from drop down menu")
    public void selectGradeLevelFromDropDownMenu() {
        dc.clickFunction(dc.dropDownGradeLevel);
        dc.clickFunction(dc.dropDown11);
    }

    @Then("Verify that Assignment is displayed on the page")
    public void verifyThatAssignmentIsDisplayedOnThePage() {
        dc.verifyContainsTextFunction(dc.publishConfirm, "Published");
    }


}
