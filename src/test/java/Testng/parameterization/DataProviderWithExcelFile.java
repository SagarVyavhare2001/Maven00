package Testng.parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcelFile {
    @DataProvider(name = "test.data")
    public Object[][] dataSetup()throws IOException{

        Object[][] arrObj = getDataFromExcel(""C:\\Users\\lenovo\\Downloads\\ProductName.xlsx" , "ProductName");
                return arrObj;

    }

    public String[][] getDataFromExcel(String filePath, String sheetName)throws IOException{

        FileInputStream fs = new FileInputStream(filePath);         // Access the file
        XSSFWorkbook wb = new XSSFWorkbook(fs);                     // Acccessingg the xlsx file
        XSSFSheet sheet = wb.getSheet(sheetName);                 // sheet name accessing
        XSSFRow row = sheet.getRow(0);                  // access the row

        int noOfRow = sheet.getPhysicalNumberOfRows();
        int noOfColumn = row.getLastCellNum();

        Cell cell;

        String[][] data = new String[noOfRow-1][noOfColumn];

        for(int i = 1; i< noOfRow-1; i++){
            for(int j = 0; j< noOfColumn; j++){

                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i-1][j] = cell.getStringCellValue();
            }
        }
            return data;
    }


    @Test(dataProvider = "Test data")
    public void verifySearchFlipkart(String productName)throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement searchTextBox =  driver.findElement(By.name("q"));
        searchTextBox.sendKeys(productName);
        Thread.sleep(3000);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();

    }

}
