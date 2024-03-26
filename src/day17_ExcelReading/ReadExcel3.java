package day17_ExcelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel3 
{

	@Test
	public void readExcel() throws Exception, IOException
	{
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"\\TestData\\OranageHRMTestData.xlsx")));
		
		System.out.println(wb.getSheet("login").getRow(3).getCell(1).getStringCellValue());
		
		System.out.println(wb.getSheet("login").getRow(2).getCell(1).getNumericCellValue());
		wb.close();
		
	}
}
