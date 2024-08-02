package genericLibOrUtlity;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtlityOrLib 
{
	public String readDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception
	  {
		  FileInputStream fis = new FileInputStream(IconstantUtilityProgram.excelPath);
		  Workbook book = WorkbookFactory.create(fis);
		  Sheet sh = book.getSheet(sheetName);
		  DataFormatter format = new DataFormatter();
		  String values = format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		  return values;
	  }

		  
	public void readMultipleDataFromExcel(String sheetName, int firstRowNum, int firstcellNum) throws Exception
	 {
	  FileInputStream fis = new FileInputStream(IconstantUtilityProgram.excelPath);
	  Workbook book = WorkbookFactory.create(fis);
	  Sheet sh = book.getSheet(sheetName);
	  DataFormatter format = new DataFormatter();
	  
	  for(int i = firstRowNum; i<=sh.getLastRowNum(); i++)
	  {
		  Row r = sh.getRow(i);
		  for(int j = firstcellNum; j <= r.getLastCellNum()-1; j++)
		  {
			  String values = format.formatCellValue(r.getCell(j));
			  System.out.println(values);
		  }
	  }
	  
	 }
		  
	  

}
