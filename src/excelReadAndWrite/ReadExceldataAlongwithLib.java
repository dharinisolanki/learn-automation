package excelReadAndWrite;

import lib.ExceldataConfig;

public class ReadExceldataAlongwithLib {
	
	public static void main(String[] args) {
		
		
		ExceldataConfig excel = new ExceldataConfig("C:\\Exceldata\\Testdata.xlsx");
		System.out.println(excel.getData(0, 0, 0));
	}

}
