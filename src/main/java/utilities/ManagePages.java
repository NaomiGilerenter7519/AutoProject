package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.emr.*;
import pageObjects.emr.addForms.*;
import pageObjects.emr.menu.InnerMenuPage;
import pageObjects.emr.nurse.Execute.CardexPage;
import pageObjects.emr.nurse.approval.ApprovalInstructionPage;

public class ManagePages extends Base {

    public static void initEmr(){
        emrLogin = PageFactory.initElements(driver , LoginPage.class);
        chooseRole = PageFactory.initElements(driver , ChooseRolePage.class);
        innerMenuPage = PageFactory.initElements(driver, InnerMenuPage.class);

        patientsList = PageFactory.initElements(driver , PatientsListPage.class);
        patientBox = PageFactory.initElements(driver , PatientBoxPage.class);
        demogeDataBar = PageFactory.initElements(driver , DemogeDataBarPage.class);
        doctorInstructionPage = PageFactory.initElements(driver, DoctorInstructionPage.class);
        drugSection  = PageFactory.initElements(driver, DrugsSection.class);
        drugForm = PageFactory.initElements(driver, DrugForm.class);
        drugFormDailyPossibility = PageFactory.initElements(driver, DrugFormDailyPossibility.class);
        drugFormSOSPossibility = PageFactory.initElements(driver, DrugFormSOSPossibility.class);
        drugFormOnceOnlyPossibility = PageFactory.initElements(driver, DrugFormOnceOnlyPossibility.class);
        drugFormByHourPossibility = PageFactory.initElements(driver, DrugFormByHourPossibility.class);
        drugFormWeeklyPossibility = PageFactory.initElements(driver, DrugFormWeeklyPossibility.class);


        generalInstructionPage = PageFactory.initElements(driver, GeneralInstructionPage.class);


        approvalInstructionPage = PageFactory.initElements(driver, ApprovalInstructionPage.class);
        cardexPage= PageFactory.initElements(driver , CardexPage.class);

        userSignModalPage = PageFactory.initElements(driver, UserSignModalPage.class);
    }
}
