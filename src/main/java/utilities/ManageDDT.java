package utilities;

import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManageDDT extends CommonOps{

    @DataProvider(name ="drugsDaily")
    public Object[][] getDataProviderDrugsDaily(){
       return  getDataFromCSV("./DDTFiles/drugsDaily.csv");
    }

    @DataProvider(name ="drugsOnceOnly")
    public Object[][] getDataProviderDrugsOnceOnly(){
        return getDataFromCSV("./DDTFiles/drugsOnceOnly.csv");
    }



    public static Object[][] getDataFromCSV(String filePath) {

        List<String> lines = readCSV(filePath);
        List<String> columes = new ArrayList<String>(Arrays.asList(lines.get(0).split(",")));
        Object [][] data = new Object[lines.size()][columes.size()];

        for (int i = 0; i < lines.size(); i++) {
            for (int j = 0; j < columes.size(); j++) {
                data[i][j] = lines.get(i).split(",")[j];
            }
        }

        return data;
    }



    public static List<String> readCSV (String csvFile){

        List<String> lines = null;
        File file = new File(csvFile);
        try{
            lines = Files.readAllLines(file.toPath() , StandardCharsets.UTF_8);
        }
        catch (IOException e){
            System.out.println("Some Error , See Deatails, " + e);
        }
        return lines;
    }




//מקורי
//    public static Object[][] getDataFromCSV(String filePath, int lines , int colums) {
//
//        List<String> csvData = readCSV(filePath);
//        Object[][] data = new Object[lines][colums];
//        for (int i = 0; i < csvData.size(); i++) {
//            for (int j = 0; j < colums; j++) {
//                data[i][j] = csvData.get(i).split(",")[j];
//            }
//        }
//        for (int i = 0; i < lines; i++) {
//            for (int k = 0; k < colums; k++)
//                System.out.println(data[i][k]);
//
//        }
//
//       return data;
//    }
}


