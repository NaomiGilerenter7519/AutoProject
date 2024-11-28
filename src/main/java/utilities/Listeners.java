package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends CommonOps  implements ITestListener {


   public   void onStart(ITestContext result){
       System.out.println("--------------------Starting Execution--------------------");
    }

    public   void onFinish(ITestContext result){
        System.out.println("--------------------Ending Execution--------------------");
    }

    public   void onTestStart(ITestResult result){
        System.out.println("--------Starting Test: " + result.getName() + "------------");
    }

    public   void onTestSkipped(ITestResult result){
        System.out.println("--------Skipping Test: " + result.getName() + "------------");
    }

    public   void onTestSuccess(ITestResult result){
        System.out.println("-------- Test: " + result.getName() + " Passed -----------");
    }

    public   void onTestFailure(ITestResult result){
        System.out.println("-------- Test: " + result.getName() + " Failed -----------");
        saveScreenshot();
    }

   @Attachment(value = " Page Screen-Shot", type = "image/png")
    public byte[] saveScreenshot(){
       return ((TakesScreenshot)driver).getScreenshotAs((OutputType.BYTES));
   }

}



