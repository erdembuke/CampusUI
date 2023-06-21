package StepDefinitions;

import Pages.DialogContents;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

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

    @And("close message box and open again")
    public void closeMessageBoxAndOpenAgain() throws AWTException {

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

        js.executeScript("arguments[0].click();", dg.noteStudent_3_11B);


    }

    @Then("Verify that message has been sent successfully")
    public void verifyThatMessageHasBeenSentSuccessfully(DataTable dt) {

        List<String> messages = dt.asList(String.class);

        for (String message : messages) {

            dg.waitUntilVisible(dg.sentMessage);
            Assert.assertEquals(dg.sentMessage.getText().trim(), message);

        }
    }
}
