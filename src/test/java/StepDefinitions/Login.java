package StepDefinitions;

import Pages.DialogContents;
import Pages.NavigationTabs;
import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;

public class Login {
    DialogContents dc = new DialogContents();
    NavigationTabs nt = new NavigationTabs();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().navigate().to("https://test.mersys.io/");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyElementIsDisplayed(nt.homepageText);
    }

    @Then("Invalid username or password message should be displayed")
    public void invalidUsernameOrPasswordMessageShouldBeDisplayed() {
        dc.waitUntilVisible(dc.errorTab);
        Assert.assertTrue(dc.errorTab.getText().contains("Invalid"));
    }

    @When("Enter teacher username and password with ApachePOI")
    public void enterTeacherUsernameAndPasswordWithApachePOI() {
        ArrayList<ArrayList<String>> info = ExcelUtility.getData("src/main/resources/TestData/TestData.xlsx","testdata",2);

        dc.sendKeysFunction(dc.username,info.get(0).get(0));
        dc.sendKeysFunction(dc.password,info.get(0).get(1));

        dc.clickFunction(dc.loginBtn);
    }

    @When("Enter {string} username and password with ApachePOI")
    public void enterUsernameAndPasswordWithApachePOI(String text) {
        ArrayList<ArrayList<String>> info =
                ExcelUtility.getData("src/main/resources/TestData/TestData.xlsx","testdata",2);

        switch (text){
            case "teacher":
                dc.sendKeysFunction(dc.username,info.get(0).get(0));
                dc.sendKeysFunction(dc.password,info.get(0).get(1));
                dc.clickFunction(dc.loginBtn);
                break;

            case "student":
                dc.sendKeysFunction(dc.username,info.get(1).get(0));
                dc.sendKeysFunction(dc.password,info.get(1).get(1).substring(0,5));
                dc.clickFunction(dc.loginBtn);
                break;

            case "admin":
                dc.sendKeysFunction(dc.username,info.get(2).get(0));
                dc.sendKeysFunction(dc.password,info.get(2).get(1));
                dc.clickFunction(dc.loginBtn);
                break;
        }

    }
}
