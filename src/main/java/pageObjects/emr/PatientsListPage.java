package pageObjects.emr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PatientsListPage {


    @FindBy(how= How.LINK_TEXT , using = "רשימת מטופלים")
    public WebElement menu_patientList;


    //todo    לשנות לפי class כולל את הכותרת :
    @FindBy(how= How.TAG_NAME , using = "tr")
    public List< WebElement> list_patients;

    @FindBy(how= How.ID , using = "bed_side_dropdown")
    public Select select_size_bed;

    @FindBy(how= How.ID , using = "status_dropdown")
    public WebElement select_status;

    @FindBy(how= How.ID , using = "alerts_dropdown")
    public WebElement select_alerts;

    @FindBy(how= How.CSS , using = "btn[title='רענן']")
    public WebElement btn_reload;

    @FindBy(how= How.XPATH , using = "//input[type='text']")
    public WebElement txt_search;
}
