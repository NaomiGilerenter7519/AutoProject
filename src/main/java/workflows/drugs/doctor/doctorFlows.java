package workflows.drugs.doctor;
import com.google.common.util.concurrent.Uninterruptibles;
import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;
import workflows.WebFlows;

import java.util.concurrent.TimeUnit;

public class doctorFlows extends CommonOps {

    @Step("Business Flow: click on newDrug")
    public static void newDrug(){

        UIActions.click(doctorInstructionPage.btns_addDrug.get(0));
    }

    @Step("Business Flow: click on newGeneralInstruction")
    public static void newGeneralInstruction(){

        doctorInstructionPage.btns_addDrug.get(1).click();
    }

    @Step("Business Flow: click on newDrug")
    public static void clickReturnAndApproval(){

        drugForm.btn_undo.click();
        doctorInstructionPage.btn_approvalDrug.click();
    }


    @Step("Business Flow: click on newDrug")
    public static void approvalInstruction(){

      UIActions.click(doctorInstructionPage.btn_approvalDrug);
    }

    @Step("Business Flow: Fill Drug's Details")
    public static void fillDrugsDetails(String drugName ,String dosage ,String routeAdministration){

     //   Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        drugForm.inp_selectDrug.sendKeys(drugName);
        drugForm.inp_selectDrugTopList.click();
        drugForm.input_drugDosage.clear();
        drugForm.input_drugDosage.sendKeys(dosage);
        drugForm.btn_dropdownRouteAdministration.click();
        UIActions.selectFromListInsideAnotherTag(drugForm.routeAdministrationList, routeAdministration);
    }

    @Step("Business Flow: Fill Details In Daily")
    public static void fillDrugNumberOfTimes( String numberOfTimeDaily ) {

        drugFormDailyPossibility.btn_numberOfTimesDaily.click();
        drugFormDailyPossibility.numberOfTimesDaily.get(Integer.parseInt(numberOfTimeDaily)-1).click();
    }

    @Step("Business Flow: Fill Hour In OnceOnly")
    public static void fillDrugOnceOnlyHour( String hour ) {

        if(hour!= "ללא") {
            drugFormOnceOnlyPossibility.btn_hour.click();
            UIActions.selectFromListInsideAnotherTag( drugFormOnceOnlyPossibility.hourList, hour);
        }
    }

    @Step("Business Flow: fill DrugForm for addNewDrugDaily")
    public static void drugFormAddDrugDaily(String drugName ,String dosage,  String numberOfTimeDaily, String routeAdinistration ){

        fillDrugsDetails(drugName,dosage,routeAdinistration);
       // drugForm.radio_dailyPossbility.click();
        fillDrugNumberOfTimes(numberOfTimeDaily);
        drugForm.btn_add.click();

    }

    @Step("Business Flow: fill DrugForm for addNewDrugOnceOnly")
    public static void drugFormAddDrugOnceOnly(String drugName ,String dosage,  String hour , String routeAdinistration ){

        fillDrugsDetails(drugName,dosage,routeAdinistration);
        drugForm.radio_onceOnlyPossbility.click();
        fillDrugOnceOnlyHour(hour);
        drugForm.btn_add.click();
    }



    @Step("Business Flow: Fill DrugForm for addNewDrugOnceOnly")
    public static void drugFormAddAndCloseDrugOnceOnly(String drugName ,String dosage,  String hour , String routeAdinistration ){

        fillDrugsDetails(drugName,dosage,routeAdinistration);
        drugForm.radio_onceOnlyPossbility.click();
        fillDrugOnceOnlyHour(hour);
        drugForm.btn_addAndClose.click();
        drugForm.btn_approval.click();
        WebFlows.userSignConfirm();
    }


    @Step("Business Flow: fill DrugForm for addNewDrugDaily")
    public static void drugFormAddAndCloseDrugDaily(String drugName ,String dosage,  String numberOfTimeDaily, String routeAdinistration ){

        fillDrugsDetails(drugName,dosage,routeAdinistration);
        drugForm.radio_dailyPossbility.click();
        fillDrugNumberOfTimes(numberOfTimeDaily);
        drugForm.btn_addAndClose.click();

    }

    @Step("Business Flow: fill DrugForm for addNewDrugDailyWithConfirmSameInstruction")
    public static void drugFormAddAndCloseDrugDailyWithConfirmSameInstruction(String drugName ,String dosage,  String numberOfTimeDaily, String routeAdinistration ){

        fillDrugsDetails(drugName,dosage,routeAdinistration);
        drugForm.radio_dailyPossbility.click();
        fillDrugNumberOfTimes(numberOfTimeDaily);
        drugForm.btn_addAndClose.click();
    }

    @Step("Business Flow: fill DrugForm for addNewDrugDaily")
    public static void confirmModalSameInstruction(){

        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
        drugForm.btn_modalOK.click();

    }



    public static void collapseDetail(){

       // wait.until(ExpectedConditions.invisibilityOf(patientBox.div_instruction));
        UIActions.click(demogeDataBar.btn_collapse_patient_deatiles);
       // demogeDataBar.btn_collapse_patient_deatiles.click();
    }


  //  public List<Object> drugs = new ArrayList<>(5);



}
