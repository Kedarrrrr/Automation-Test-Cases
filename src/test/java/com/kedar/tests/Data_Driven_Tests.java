package com.kedar.tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Tests {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream File = new FileInputStream("K:\\java\\Practice_test\\Test_Data\\Book.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(File);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int row =sheet.getLastRowNum();
		
		int col = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Rows: "+row+"Columns: "+col);
		
	}

}
