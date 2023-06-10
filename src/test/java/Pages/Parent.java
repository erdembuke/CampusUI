package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

    public void sendKeysFunction(WebElement element, String text){
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void clickFunction(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void verifyContainsTextFunction(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()), "no such text in the element");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
        // close the dialog box if there is any.
    }

    public void verifyElementIsDisplayed(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.isDisplayed());
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilTextToBe(WebElement element, String text){
        wait.until(ExpectedConditions.textToBePresentInElement(element,text));
    }

    public void waitUntilRefresh(){

        wait.until(ExpectedConditions.numberOfElementsToBe
                (By.xpath("//fuse-progress-bar/*") , 0));

    }

    public void waitUntilRefreshLayout(){

        wait.until(ExpectedConditions.numberOfElementsToBe
                (By.xpath("//teacher-layout/*") , 1));

    }

}
