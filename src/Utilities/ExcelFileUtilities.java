package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtilities {
	
	public static Workbook wb;
	
		public ExcelFileUtilities() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	
	FileInputStream f = new FileInputStream("./DataFolder/TestData.xlsx");
	wb = WorkbookFactory.create(f);
	}
	
	
	public int RowCount(String Sheetname)
	{
		return wb.getSheet(Sheetname).getLastRowNum();
	}
	public int ColCount(String Sheetname, int Rownum)
	{
		return wb.getSheet(Sheetname).getRow(Rownum).getLastCellNum();
	}
	public String ReadData(String Sheetname, int Rownum, int Colnum)
	{
		String data;
		if(wb.getSheet(Sheetname).getRow(Rownum).getCell(Colnum).getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
		double x = wb.getSheet(Sheetname).getRow(Rownum).getCell(Colnum).getNumericCellValue();
		 data = String.valueOf(x);
		}
		else 
		{
			 data = wb.getSheet(Sheetname).getRow(Rownum).getCell(Colnum).getStringCellValue();
		}
		return data;
		
	}
	
	public void SetData(String Sheetname, int Rownum, int Colnum, String Data )
	{
		wb.getSheet(Sheetname).getRow(Rownum).getCell(Colnum).setCellType(Data);
	}
	
	
	
	

}
