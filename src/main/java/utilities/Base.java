package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;
import pageObjects.emr.*;
import pageObjects.emr.addForms.*;
import pageObjects.emr.menu.InnerMenuPage;
import pageObjects.emr.nurse.Execute.CardexPage;
import pageObjects.emr.nurse.approval.ApprovalInstructionPage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base {

    protected static WebDriver driver ;
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static Screen screen;
    protected static SoftAssert softAssert;

    //DB

    protected static Connection con;
    protected static Statement stmt;
    protected static ResultSet rs;

    //Pages Object
    protected static LoginPage emrLogin;
    protected static ChooseRolePage chooseRole;
    protected static InnerMenuPage innerMenuPage;
    protected static PatientsListPage patientsList ;
    protected static PatientBoxPage patientBox ; ;
    protected static DemogeDataBarPage demogeDataBar ;


    protected static DoctorInstructionPage doctorInstructionPage ;
    protected static DrugsSection drugSection ;
    protected static DrugForm drugForm ;
    protected static DrugFormDailyPossibility drugFormDailyPossibility ;
    protected static DrugFormSOSPossibility drugFormSOSPossibility ;
    protected static DrugFormOnceOnlyPossibility drugFormOnceOnlyPossibility ;
    protected static DrugFormByHourPossibility drugFormByHourPossibility ;
    protected static DrugFormWeeklyPossibility drugFormWeeklyPossibility ;



    protected static GeneralInstructionPage generalInstructionPage ;

    protected static ApprovalInstructionPage approvalInstructionPage;
    protected static CardexPage cardexPage;


    protected static UserSignModalPage userSignModalPage;



}
