package StepDefinitions;

import Pages.DialogContents;
import Utilities.GWD;
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

        int count=0;

        dg.waitUntilVisible(dg.currentDate);

        for (WebElement courseName :dg.courseNames) {


            switch (courseName.getText()){
                case "11B-Kimya(Test)- (E)": dg.verifyContainsTextFunction(courseName,"Kimya(Test)"); count++;break;
                case "11B-Kimya- (P)": dg.verifyContainsTextFunction(courseName,"Kimya"); count++;break;
                case "11B-Fizik- (P)": dg.verifyContainsTextFunction(courseName,"Fizik"); count++;break;
                case "11B-Kimya- (E)": dg.verifyContainsTextFunction(courseName,"Kimya"); count++;break;
                case "11B-Fizik": dg.verifyContainsTextFunction(courseName,"Fizik"); count++;break;
                case "11B-Kimya": dg.verifyContainsTextFunction(courseName,"Kimya"); count++;break;
                case "11B-Kimya(Test)": dg.verifyContainsTextFunction(courseName,"Kimya(Test)"); count++;break;

            }

            System.out.println(count+".name" + courseName.getText());
        }

        Assert.assertEquals(count,6);

    }
}
