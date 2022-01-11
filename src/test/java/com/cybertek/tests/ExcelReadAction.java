package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelReadAction {
    String filePath = "Employees.xlsx";

    @Test
    public void readExcelSheetData() throws IOException {
        //Open the Employees.xlsx using Apache POI
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);

        //Go to sheet.Or go to first sheet by index
        XSSFSheet workSheet = workbook.getSheetAt(0); //first sheet index

        System.out.println(workSheet.getRow(0).getCell(0));
        System.out.println(workSheet.getRow(0).getCell(1));
        System.out.println(workSheet.getRow(0).getCell(2));

        System.out.println("------------");
        //loop and print all 3 column names
        for (int i = 0; i <= 2; i++) {
            System.out.println(workSheet.getRow(0).getCell(i));

        }

        //find out number of rows in the worksheet
        int rowsCount = workSheet.getPhysicalNumberOfRows(); // start count from 0
        System.out.println(rowsCount); //print 5

        int usedRowsCount = workSheet.getLastRowNum(); // start count from 1
        System.out.println(usedRowsCount); //print 4

        //print all first names
        for (int i = 1;i<=usedRowsCount; i++){
            System.out.println(workSheet.getRow(i).getCell(0));
        }

        System.out.println("\nMuhammed info");
        for (int i=1;i<=workSheet.getLastRowNum();i++){
            if (workSheet.getRow(i).getCell(0).toString().equals("Muhammed")){
                System.out.println(workSheet.getRow(i).getCell(0) + " | " + workSheet.getRow(i).getCell(1) + " | " +
                        workSheet.getRow(i).getCell(2));
                break;
            }
        }

    }
}
