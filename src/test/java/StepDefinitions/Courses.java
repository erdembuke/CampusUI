package StepDefinitions;

import Pages.DialogContents;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Courses {

    DialogContents dc = new DialogContents();

    @Then("Verify that all courses are displayed on Home Page")
    public void verifyThatAllCoursesAreDisplayedOnHomePage() {

        Assert.assertTrue(dc.homeCourses.getText().contains("11B"), "Courses not found" );

    }

    @Then("Verify that course cirruculum on displayed page")
    public void verifyThatCourseCirruculumOnDisplayedPage() {

        dc.verifyContainsTextFunction(dc.fizikCirruculumMaterials, "Course Materials");
    }
}
