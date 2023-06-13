package StepDefinitions;

import Pages.DialogContents;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignmentTeacher {

    WebDriver driver;
    DialogContents dc=new DialogContents();

    @And("User fill out the form in Dialog Content")
    public void FillOutForm() {
        dc.sendKeysFunction(dc.nameInput, "Hucre");
       }

    @And("Fill the Text Description")
    public void fillTheTextDescription() {
        driver.switchTo().frame(0);
        dc.sendKeysFunction(dc.textArea, "Hucreyi tanımak icin bir proje hazırlayın");

    }
}
