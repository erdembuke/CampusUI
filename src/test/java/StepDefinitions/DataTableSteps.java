package StepDefinitions;

import Pages.DialogContents;
import Pages.NavigationTabs;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DataTableSteps {

    NavigationTabs nt = new NavigationTabs();
    DialogContents dc = new DialogContents();

    @And("Click on the element in NavigationTabs")
    public void clickOnTheElementInNavigationTabs(DataTable dt){
        List<String> navigationItem = dt.asList(String.class);

        for (String buttonList : navigationItem){
            WebElement element = nt.getWebElement(buttonList);
            nt.clickFunction(element);
        }
    }

    @And("Click on the element in Dialog Content")
    public void clickOnTheElementInDialog(DataTable dt){
        List<String> dialogItem = dt.asList(String.class);

        for (String buttonList : dialogItem){
            WebElement element = dc.getWebElement(buttonList);
            dc.clickFunction(element);
        }
    }

    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable dt){
        List<List<String>> items = dt.asLists(String.class);

        for (List<String> item : items) {
            WebElement element = dc.getWebElement(item.get(0));
            dc.sendKeysFunction(element, item.get(1));
        }
    }

    @And("Click on the element in JS")
    public void clickOnTheElementInJS(DataTable dt) {
        List<String> dialogItem = dt.asList(String.class);
        WebElement element = null;
        
        for (String buttonList : dialogItem){
            element = dc.getWebElement(buttonList);
        }
        JavascriptExecutor executor = (JavascriptExecutor) GWD.getDriver();
        executor.executeScript("arguments[0].click();", element);
        
    }

    @And("Click on the element in AC")
    public void clickOnTheElementInAC(DataTable dt) {
        List<String> dialogItem = dt.asList(String.class);
        WebElement element=null;
        for (String buttonList : dialogItem){
            element = dc.getWebElement(buttonList);
        }

        Actions actions = new Actions(GWD.getDriver());
        Action action = actions.moveToElement(element).click(element).build();
        action.perform();


    }



}
