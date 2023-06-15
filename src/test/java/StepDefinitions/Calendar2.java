package StepDefinitions;

import Pages.DialogContents;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Calendar2 {
    WebDriver driver;

    DialogContents di = new DialogContents();
    @Then("click on course meeting")
    public void click_on_course_meeting(io.cucumber.datatable.DataTable dataTable) {

        di.clickFunction(di.fizikCourseBtn);


    }


    @And("make sure all buttons are clickable")
    public void makeSureAllButtonsAreClickable() throws InterruptedException {


        di.waitUntilClickable(di.topicBtn);
        di.clickFunction(di.topicBtn);
        di.waitUntilClickable(di.informationBtn);
        di.clickFunction(di.informationBtn);
        di.waitUntilClickable(di.attandeesBtn);
        di.clickFunction(di.attandeesBtn);
        di.waitUntilClickable(di.attachmentsBtn);
        di.clickFunction(di.attachmentsBtn);
        di.waitUntilClickable(di.recentEventsBtn);
        di.clickFunction(di.recentEventsBtn);


        }

            }





