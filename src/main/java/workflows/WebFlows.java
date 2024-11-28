package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.DBAction;
import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebFlows extends CommonOps {

    @Step("sign")
    public static void userSignConfirm(){

        userSignModalPage.input_userName.clear();
        userSignModalPage.input_userName.sendKeys("test");
        userSignModalPage.input_password.clear();
        userSignModalPage.input_password.sendKeys("Te081219");
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
        userSignModalPage.btn_confirm.click();
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);

    }

    @Step("Business Flow: Login With Choose Role")
    public static void login(String user , String pass, String role){

        UIActions.updateText( emrLogin.txt_username , user);
        UIActions.updateText( emrLogin.txt_password, pass);
        UIActions.click(emrLogin.btn_submitBtn);
        WebFlows.chooseRole(role);

    }
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
}
