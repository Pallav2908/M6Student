package sampleLib;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws Exception 
	{	
       FileInputStream fis = new FileInputStream("D:\\Eclipse\\Selenium\\Selenium Folder\\M6TestCaseData.xlsx");
       Workbook book = WorkbookFactory.create(fis);
       Sheet sh = book.getSheet("Sample");
       //Row r = sh.getRow(2);
       //Cell c = r.getCell(3);
       //String value = c.getStringCellValue();
       
         String value = sh.getRow(2).getCell(3).getStringCellValue();
       
       System.out.println(value);
	}

}
