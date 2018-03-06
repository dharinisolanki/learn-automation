package excelReadAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileDemo {
	
	public static void main(String[] args) throws Exception {
		
		File fileSource = new File("C:\\Exceldata\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(fileSource);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String value = sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		wb.close();
	}

}
 