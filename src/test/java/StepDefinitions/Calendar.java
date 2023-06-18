package StepDefinitions;

import Pages.DialogContents;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Calendar {

    DialogContents dg = new DialogContents();
    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dg.verifyContainsTextFunction(dg.successMessage,"successfully");
    }

    @Then("Verify that all courses are displayed on weekly basis")
    public void verifyThatAllCoursesAreDisplayedOnWeeklyBasis() {

        dg.waitUntilVisible(dg.currentDate);

        int count=0;

        for (WebElement courseName :dg.courseNames) {

            if (courseName.getText().toLowerCase().contains("kimya") || courseName.getText().toLowerCase().contains("fizik")){
                count++;
            }
        }
        Assert.assertEquals(count,6);

    }

    @And("Teacher-layout wait for load")
    public void teacherLayoutWaitForLoad() {
        dg.waitUntilRefreshLayout();
    }
}
