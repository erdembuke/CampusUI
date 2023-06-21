package StepDefinitions;

import Pages.DialogContents;
import Pages.NavigationTabs;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class AssignmentTeacher {
    DialogContents dc=new DialogContents();

    @And("User fill out the form in Dialog Content")
    public void FillOutForm() {
        dc.sendKeysFunction(dc.nameInput, "Hucre");
       }

    @And("Fill the Text Description")
    public void fillTheTextDescription() {
        GWD.getDriver().switchTo().frame(0);
        dc.sendKeysFunction(dc.textArea,"axxaaxaxa");
        GWD.getDriver().switchTo().parentFrame();
    }

    @And("Add the file from local")
    public void addTheFileFromLocal() throws AWTException {
        Robot rbt= new Robot();
        StringSelection dosyaYolu = new StringSelection("C:\\Users\\Halil\\Desktop\\Gonderilecek Dosya.odt\\");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

    }
}
