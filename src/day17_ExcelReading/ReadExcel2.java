package day17_ExcelReading;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel2
{

	@Test
	
	public void readExcel() throws Exception {

		/*
		 * XSSFWorkbook - loadexcel XSSFSheet - Specific Sheet XSSFRow - Row XSSFCell -
		 * Cell
		 */

		File src = new File(System.getProperty("user.dir")+"/TestData/OrangeHRMTestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("login");
		XSSFRow r1 = sh1.getRow(0);
		XSSFCell c1 = r1.getCell(0); 
		XSSFCell c2 = r1.getCell(1);
		System.out.println(c1.getStringCellValue());
		System.out.println(c2.getStringCellValue());
		System.out.println(sh1.getPhysicalNumberOfRows());
		wb.close();
		

	}
}
