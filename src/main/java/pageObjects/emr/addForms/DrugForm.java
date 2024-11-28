package pageObjects.emr.addForms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DrugForm {

    //inputs

    @FindBy(how = How.ID, using = "selectDrug")
    public WebElement inp_selectDrug;

    @FindBy(how = How.XPATH, using = "//div[@class='form-group code-list']/span/ngb-typeahead-window/button")
    public WebElement inp_selectDrugTopList;


    @FindBy(how = How.ID, using = "drugDosage")
    public WebElement input_drugDosage;


    @FindBy(how = How.ID, using = "drugComment")
    public WebElement input_drugComment;


    @FindBy(how = How.CLASS_NAME, using = "border-container row")
    public List<WebElement> div_containers;

    @FindBy(how = How.XPATH, using = "div[@class='dir_rtl text-right']")
    public WebElement otherSymbolies;

    // checkboxs

    @FindBy(how = How.XPATH, using = "div[@class='form-group code-list']/span[2]/input")
    public WebElement checkbox_DepartmentalStandard;

    // dropdown
//
//    @FindBy(how = How.ID, using = "dropdownDrugUnitMeasure")
//    public WebElement dropdownDrug_UnitMeasure;
    @FindBy(how = How.ID, using = "drugUnitMeasureID")
    public WebElement input_unitMeasure;


    @FindBy(how = How.ID, using = "dropdownRouteAdministrationID")
    public WebElement btn_dropdownRouteAdministration;


    @FindBy(how = How.XPATH, using = "//*[@id='dropdownRouteAdministrationID']/span")
    public WebElement span_btn_dropdownRouteAdministration;

    @FindBy(how = How.XPATH, using = "//button[@id='dropdownRouteAdministrationID']/following-sibling::ul/li")
    public List<WebElement> routeAdministrationList;

    // buttons

    @FindBy(how = How.ID, using = "btnUndo")
    public WebElement btn_undo;

    @FindBy(how = How.ID, using = "btnAdd")
    public WebElement btn_add;

    @FindBy(how = How.ID, using = "btnAddAndClose")
    public WebElement btn_addAndClose;


    @FindBy(how = How.ID, using = "approvalDrug")
    public WebElement btn_approval;

    // divs

    @FindBy(how = How.XPATH, using = "//div[@class='border-container newDrug']/div")
    public List<WebElement> div_newDrugs;

    //possibility

    @FindBy(how = How.ID, using = "drugTimeGivingPossibilitiesID + 0")
    public WebElement radio_dailyPossbility;

    @FindBy(how = How.ID, using = "drugTimeGivingPossibilitiesID + 1")
    public WebElement radio_sosPossbility;

    @FindBy(how = How.XPATH, using = "//input[@id='drugTimeGivingPossibilitiesID + 2']/following-sibling::label")
    public WebElement radio_onceOnlyPossbility;

    @FindBy(how = How.ID, using = "drugTimeGivingPossibilitiesID + 3")
    public WebElement radio_byHourPossbility;

    @FindBy(how = How.ID, using = "drugTimeGivingPossibilitiesID + 4")
    public WebElement radio_WeeklyPossbility;

    @FindBy(how = How.ID, using = "drugTimeGivingPossibilitiesID + 5")
    public WebElement radio_timeLimitPossbility;

    @FindBy(how = How.ID, using = "drugTimeGivingPossibilitiesID + 6")
    public WebElement radio_continuousPossbility;

    @FindBy(how = How.ID, using = "drugTimeGivingPossibilitiesID + 7")
    public WebElement radio_constantRatePossbility;

    //modals

    @FindBy(how = How.XPATH, using = "//div[@class='modal-content']")
    public WebElement modal;

    @FindBy(how = How.ID, using = "buttonImport")
    public WebElement btn_modalOK;

    @FindBy(how = How.ID, using = "buttonCancle")
    public WebElement btn_modalCancle;



}