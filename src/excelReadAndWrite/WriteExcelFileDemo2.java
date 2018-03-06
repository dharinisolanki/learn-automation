package excelReadAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFileDemo2 {

	public static void main(String[] args) throws IOException {

		File fileSource = new File("C:\\Exceldata\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(fileSource);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);

		sheet1.getRow(0).createCell(3).setCellValue("pass");

		sheet1.getRow(1).createCell(3).setCellValue("fail");

		FileOutputStream fileoutput = new FileOutputStream(fileSource);
		wb.write(fileoutput);
		wb.close();

	}

}
