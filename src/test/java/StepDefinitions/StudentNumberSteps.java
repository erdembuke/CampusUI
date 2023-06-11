package StepDefinitions;

import Pages.DialogContents;
import Pages.NavigationTabs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StudentNumberSteps {

    DialogContents dc=new DialogContents();
    NavigationTabs nt=new NavigationTabs();


    @Given("Click on the burger menu")
    public void clickOnTheBurgerMenu() {
    }

    @And("Click on the Student then click on the Students")
    public void clickOnTheStudentThenClickOnTheStudents() {
    }

    @Then("Verify the number of student from bottom of the page")
    public void verifyTheNumberOfStudentFromBottomOfThePage() {
        dc.verifyElementIsDisplayed(dc.rangeLabel);
    }
}
