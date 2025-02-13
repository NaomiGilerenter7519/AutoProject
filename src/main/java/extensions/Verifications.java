package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;

import java.util.List;

import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;

public class Verifications extends CommonOps {

    @Step("Verify count in List")
    public static void numberOfElementList(List< WebElement> li, int expected){
        wait.until(ExpectedConditions.visibilityOf(li.get(li.size()-1)));
        assertEquals(li.size() , expected);
    }

    @Step("Verify count")
    public static void numberOfElement(int count, int expected){
       // wait.until(ExpectedConditions.visibilityOf(li.get(li.size()-1)));
        assertEquals(count , expected);
    }

    @Step("Verify Text in Element")
    public static void textIsVisible(WebElement elem , String expected){
        wait.until(ExpectedConditions.urlContains("main"));
        assertEquals(elem.getText() , expected);
    }

    @Step("Verify Text in Element")
    public static void textIsContains(WebElement elem , String expected){
        wait.until(ExpectedConditions.urlContains("main"));
        assertTrue(elem.getText().contains(expected));
      //  System.out.println(elem.getText());
    }

    @Step("Verify Element is Display On Screen")
    public static void isElementDisplay(WebElement elem){
        assertTrue(elem.isDisplayed());
    }

    @Step("Verify Text in Input Element")
    public static void textInputIsNotEmpty(WebElement elem){
        assertTrue(!(elem.getAttribute("value").isEmpty()));
    }


    @Step("Verify Text in Input Element")
    public static void textIsDifferentFrom(WebElement elem, String text){
        assertTrue(!elem.getText().equals(text));
    }


    @Step("Verify Elements Are Display On Screen")
    public static void visibilityOfElements(List<WebElement> elems){

       for(WebElement elem: elems) {
           softAssert.assertTrue(elem.isDisplayed());
       }
       softAssert.assertAll();
    }

    @Step("Verify Element Visually")
    public static void visualElement(String expectedElement ) {
        try {
            screen.find(getData("ImageRepo") +  expectedElement );
        }
        catch (FindFailed findFailed) {

            System.out.println("Error Compare Image File:" + findFailed);
            fail("Error Compare Image File: + findFailed");
        }
    }
}
