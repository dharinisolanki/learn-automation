package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataConfig {
	 
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public ExceldataConfig(String excelpath){
		try {
			File fileSource = new File(excelpath);
			FileInputStream fis = new FileInputStream(fileSource);
			wb = new XSSFWorkbook(fis);
			
			
		
		} 
		
		catch (Exception e) {
			System.out.println(e.getMessage());
	}

}
	
	public String getData(int SheetNumber, int row, int column){
		
		sheet1 = wb.getSheetAt(SheetNumber);
		String Data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return Data;
	}
	
	
}
