package pageObjects.emr.nurse.Execute;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CardexPage {



    @FindBy(how = How.XPATH , using = "//input[@ng-reflect-is-disabled='false']")
    public List<WebElement> checkBoxList;


    @FindBy(how= How.ID , using = "btnApproval")
    public WebElement btn_approval;


    @FindBy(how= How.XPATH, using = "//i[contains(@class ,'icon ion-ios-arrow-back toggle-bt-off')]")
    public WebElement i_arrow;



}
