package day17_ExcelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void readExcel() throws Exception {

		/*
		 * XSSFWorkbook - loadexcel XSSFSheet - Specific Sheet XSSFRow - Row XSSFCell -
		 * Cell
		 */

		File src = new File(System.getProperty("user.dir") + "/TestData/OrangeHRMTestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("login");
		System.out.println(sh1.getPhysicalNumberOfRows());

	}
}
