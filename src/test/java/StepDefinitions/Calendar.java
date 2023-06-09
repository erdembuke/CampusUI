package StepDefinitions;

import Pages.DialogContents;
import io.cucumber.java.en.Then;

public class Calendar {

    DialogContents dg = new DialogContents();
    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dg.verifyContainsTextFunction(dg.successMessage,"successfully");
    }
}
