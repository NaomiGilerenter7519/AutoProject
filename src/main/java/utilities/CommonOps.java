package utilities;
import extensions.UIActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Base {

    public static String getData(String nodeName) {

        DocumentBuilder dBuilder;
        Document doc = null;
        File fxmlFile = new File("./Configuration/DataConfig.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fxmlFile);
        }
        catch (Exception e) {
            System.out.println("Exception in reading XMLfile: "+ e);
        }
        doc.getDocumentElement().normalize();
        return  doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }


    public static void initBrowser(String browserType){
        if(browserType.equalsIgnoreCase("chrom"))
            driver = initChromDriver();
        else if(browserType.equalsIgnoreCase("firefox"))
            driver = initFirefoxDriver();
        else if(browserType.equalsIgnoreCase("ie"))
            driver = initIEDriver();
        else throw new RuntimeException("Invalid Browser Type") ;


        //Resulation
        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(1920,1080) );
        //driver.manage().window().maximize();


        //Wait
        wait = new WebDriverWait(driver, Long.parseLong((getData("Timeout"))));
        driver.manage().timeouts().implicitlyWait( Long.parseLong((getData("Timeout"))), TimeUnit.SECONDS);
        driver.get(getData("url"));
        ManagePages.initEmr();


        action = new Actions(driver);
    }
    public static WebDriver initChromDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver initIEDriver(){
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }

    @BeforeClass
    public void startSession(){
      //  String platform = "web";
        if(getData("PlatformName").equalsIgnoreCase("web"))
            initBrowser(getData("BrowserName"));

//       else  if(getData("PlatformName").equalsIgnoreCase("mobile"))
//            initMobile();
        else
            throw new RuntimeException("Invalid platform name") ;

        screen = new Screen();
        softAssert = new SoftAssert();
        ManageDB.openConnection(getData("DBUrl"),getData("DBName"),getData("DBPassword"));
    }

    @AfterClass
    public void closeSession(){
        ManageDB.closeConnection();
        driver.quit();
    }

    @AfterMethod
    public void afterMethod(){

        driver.get(getData("url"));
        try {
            Alert confirm_popup = driver.switchTo().alert();
            confirm_popup.accept();
        }
        catch (NoAlertPresentException ex){

        }
        UIActions.clearText(emrLogin.txt_username);
        UIActions.clearText(emrLogin.txt_password);
    }


}
