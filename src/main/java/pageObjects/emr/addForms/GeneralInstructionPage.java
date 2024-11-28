package pageObjects.emr.addForms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class GeneralInstructionPage {

    @FindBy(how = How.TAG_NAME, using = "general-ins-menu")
    public WebElement generalInsMenu;

    @FindBy(how = How.XPATH, using = "//ngb-accordion/div//button")
    public List<WebElement> generalInstructionCategoryList;

    @FindBy(how = How.XPATH, using = "//div[@class='sub-list']/div/input")
    public WebElement generalInsTop;

    //רשימת הוראות שנבחרו - קיימת רק אם יש משהו שנבחר
    @FindBy(how = How.XPATH, using = "//ul[@class='black-scroll']")
    public WebElement listSelectedGeneralIns;


    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-defualt btn-submit btn-click ']")
    public WebElement btn_save;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-defualt btn-cancel btn-click '][0]")
    public WebElement btn_clear;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-defualt btn-cancel btn-click '][1]")
    public WebElement btn_back;
}
