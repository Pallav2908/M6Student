package sampleLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericLibOrUtlity.IconstantUtilityProgram;

public class WriteDataInExcel 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream(IconstantUtilityProgram.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		sh.createRow(9).createCell(1).setCellValue("Welcome");
		
		FileOutputStream fos = new FileOutputStream(IconstantUtilityProgram.excelPath);
		book.write(fos);
		System.out.println("Pass");
		
	}
   public void writeDataInExcel(String sheetName, int rowNum, int cellNum, String value) throws Exception
   {
	   FileInputStream fis = new FileInputStream(IconstantUtilityProgram.excelPath);
	   Workbook book = WorkbookFactory.create(fis);
	   Sheet sh = book.getSheet(sheetName);
	   sh.createRow(rowNum).createCell(cellNum).setCellValue(value);
	   
	   FileOutputStream fos = new FileOutputStream(IconstantUtilityProgram.excelPath);
	   book.write(fos);
   }
}
