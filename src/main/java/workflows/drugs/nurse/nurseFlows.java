package workflows.drugs.nurse;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;
import workflows.NavigateFlows;
import workflows.WebFlows;
import workflows.drugs.doctor.doctorFlows;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class nurseFlows extends CommonOps {

    @Step("Business Flow: Login")
    public static void login(String user , String pass){

        UIActions.updateText( emrLogin.txt_username , user);
        UIActions.updateText( emrLogin.txt_password, pass);
        UIActions.click(emrLogin.btn_submitBtn);

    }

    @Step("Business Flow: ")
    public static void chooseRole(String roleDescription){

        UIActions.selectFromList(chooseRole.list , roleDescription);
    }

    @Step("Business Flow: patientBoxEntry")
    public static void patientBoxEntry(int index){

        UIActions.click(patientsList.list_patients.get(index));
    }

    @Step("choose hours to drugs")
    public static void chooseHours() {
    }

    @Step("approval OnceOnly Drugs")
    public static void approvalOnceOnlyDrugs(int count){



        WebFlows.patientBoxEntry(2);
      //  Verifications.textIsVisible("תרופות לאישור"+ );
//        List<WebElement>

//        approvalInstructionPage.btn

        for (int i = 0; i < count; i++) {
            approvalInstructionPage.btn.get(i).click();
           approvalInstructionPage.ul.get(i).findElements(By.tagName("li")).get(4).click();
            approvalInstructionPage.btns_approveToDrug.get(i).click();
            approvalInstructionPage.btn_approvalDrug.click();
        }
        WebFlows.userSignConfirm();




    }

    @Step("execute OnceOnly Drugs")
    public static void executeOnceOnlyDrugs(int count) {
           //todo כניסה למסך קרדקס



        WebFlows.patientBoxEntry(2);

      //  NavigateFlows.goTo("jj");

        for (int i = 0; i < count; i++) {
            cardexPage.checkBoxList.get(i).click();
        }
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);

        cardexPage.btn_approval.click();
        WebFlows.userSignConfirm();
    }

    }
