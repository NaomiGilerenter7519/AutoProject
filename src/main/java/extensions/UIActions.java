package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.List;

public class UIActions extends CommonOps {


    @Step("Click on Element")
    public static void  click(WebElement elem){

        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }


    @Step("Click on Element")
    public static void  click2(By by){

        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        WebElement elem = driver.findElement(by);
        elem.click();
    }

    @Step("Update Text Element")
    public static void  updateText(WebElement elem, String text){

        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }

    @Step("Clear Text Element")
    public static void  clearText(WebElement elem){

        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.clear();
    }

    @Step("Select text from Dropdown")
    public static void  updateDropdown(WebElement elem, String text){

        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropdown = new Select(elem);
        dropdown.selectByVisibleText(text);
    }

    @Step("Mouse Hover Element")
    public static void mouseHover(WebElement elem1){

        action.moveToElement(elem1).click().build().perform();
    }

   @Step("Mouse Hover two Elements")
    public static void mouseHover(WebElement elem1, WebElement elem2){

        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

    @Step("Select text from List")
    public static void selectFromList(List<WebElement> list , String text){

        for(WebElement li : list){
            if(li.getText().equalsIgnoreCase(text)){
                click(li);
                break;
            }
        }
    }

    @Step("Select text from ListInsideAnotherTag")
    public static void selectFromListInsideAnotherTag(List<WebElement> list , String text){

        for(WebElement li : list){
            if(li.findElement(By.tagName("a")).getText().equals(text)){
                click(li);
                break;
            }
        }
    }


}
