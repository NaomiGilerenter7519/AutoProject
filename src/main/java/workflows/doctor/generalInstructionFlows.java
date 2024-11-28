package workflows.doctor;

import io.qameta.allure.Step;
import utilities.CommonOps;
import workflows.WebFlows;
import workflows.drugs.doctor.doctorFlows;


public class generalInstructionFlows extends CommonOps {

    @Step("Business Flow: click on newGeneral")
    public static void newGeneral(){

        doctorInstructionPage.btns_addDrug.get(1).click();
    }

    @Step("Business Flow: go to newGeneral")
    public static void chooseTopGeneralInstruction() {

        generalInstructionPage.generalInstructionCategoryList.get(0).click();
        generalInstructionPage.generalInsTop.click();

    }


    @Step("Business Flow: go to newGeneral")
    public static void saveGeneralInstructionsSelected() {

        generalInstructionPage.btn_save.click();

    }
}
