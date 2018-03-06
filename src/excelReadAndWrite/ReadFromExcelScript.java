package excelReadAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcelScript {
public static void main(String[] args) throws IOException {
		
		File fileSource = new File("C:\\Exceldata\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(fileSource);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowcount = sheet1.getLastRowNum();
		System.out.println("total row is :" + rowcount+1);
		
		for(int i=0; i<rowcount; i++){
			String data2 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("testdata from excel is :" + data2);
		}
		
		wb.close();
	}
}
