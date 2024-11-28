package workflows.db;

import extensions.DBAction;
import extensions.UIActions;
import io.qameta.allure.Step;
import org.testng.annotations.Listeners;
import utilities.CommonOps;

import java.util.List;


public class DrugsWithDBFlow extends CommonOps {

    @Step("Business Flow: get drug list from db")
    public static void getDrugsList(){
        String query = "SELECT TOP 2 dc.item_no, dc.drugDescription, dum.drugUnitMeasureDesc , dc.dosageTafnit , ra.routeAdministrationEN\n" +
                "FROM cpoe.drugsCode AS dc \n" +
                "INNER JOIN cpoe.drugUnitMeasureCode AS dum\n" +
                "ON dum.drugUnitMeasureID = dc.drugUnitMeasureID \n" +
                "INNER JOIN cpoe.drugFormOfGivingDefault AS dfg\n" +
                "ON dc.drugFormOfGivingID = dfg.drugFactoryFormOfGivingID\n" +
                "INNER JOIN cpoe.routeAdministrationCode AS ra\n" +
                "ON ra.routeAdministrationID = dfg.routeAdministrationID\n" +
                "WHERE dc.drugStatusID=2\n" +
                "AND dc.drugFormOfGivingID=1\n" +
                "AND dfg.isDefault = 1\n" +
                "ORDER BY dc.item_no\n";
      //  List<String> list =
                DBAction.getListToCSV(query, 4);
    //    System.out.println(list.get(0)+ " "+ list.get(1));
    }}
