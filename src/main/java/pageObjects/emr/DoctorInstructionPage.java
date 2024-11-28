package pageObjects.emr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import workflows.WebFlows;

import java.util.List;

public class DoctorInstructionPage {

    //title

    @FindBy(how= How.XPATH , using="//*/div[@class='rtl flex text-right menu-page-title']/span")
    public WebElement title;
    // buttons

    @FindBy(how = How.ID, using="btnAddMedicine")
    public List<WebElement> btns_addDrug;

    @FindBy(how = How.ID, using="btnImportMedicine")
    public WebElement btn_importDrug;

    @FindBy(how = How.ID, using="btnDilution")
    public WebElement btn_addDilution;

    @FindBy(how = How.ID, using="approvalDrug")
    public WebElement btn_approvalDrug;


    @FindBy(how = How.XPATH, using="//button[@id='approvalDrug']/span")
    public WebElement span_numberForApproval;


//
//    @FindBy(how = How.CLASS_NAME, using="main-title")
//    public List<WebElement> h2_list;
//
//    @FindBy(how = How.TAG_NAME, using="table")
//    public List<WebElement> table_list;

  //tables

    @FindBy(how = How.XPATH, using="//drug-ins//*[@class='table main-table']")
    public List<WebElement> tableDrugList;

    @FindBy(how = How.XPATH, using="//general-ins//*[@class='table main-table']")
    public List<WebElement> tableGeneralList;

}
