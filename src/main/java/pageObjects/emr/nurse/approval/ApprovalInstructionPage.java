package pageObjects.emr.nurse.approval;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ApprovalInstructionPage {

    @FindBy(how = How.NAME , using = "drugRow1")
    public List<WebElement>  drugToApprovalList;

    @FindBy(how = How.NAME , using = "drugRow2")
    public List<WebElement>  hoursApprovalList;

    @FindBy(how = How.NAME , using = "drugsCurrentDay")
    public List<WebElement>  currentDayList;

    @FindBy(how = How.NAME , using = "drugsRoutine")
    public List<WebElement>  routineList;

    @FindBy(how= How.XPATH , using = "//div[@id='div-group-current-day']//button")
    public List<WebElement>  btn;

    @FindBy(how= How.XPATH , using = "//div[@id='div-group-current-day']//button/following-sibling::ul")
    public List<WebElement>  ul;


    @FindBy(how= How.XPATH , using = "//tr[@name='drugRow1']//button[@tabindex='5']")
    public List<WebElement>  btns_approveToDrug;

    // btn

    @FindBy(how = How.ID , using = "approvalDrug")
    public WebElement btn_approvalDrug;


    //title

    @FindBy(how= How.CLASS_NAME , using = "navbar-text-s-heder")
    public List<WebElement>  title_instructionToApproval;

}
