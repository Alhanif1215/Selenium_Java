package practice;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class WritingDataToExcelFile {
	
	public static void main(String[] args) throws Exception {
		/*
		FileInputStream fis = new FileInputStream("/home/ahub/Documents/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet("Bird");
		Row r = sh.createRow(0);
		Cell cell = r.createCell(0);
		cell.setCellValue("Sparrow");
		FileOutputStream fos = new FileOutputStream("/home/ahub/Documents/TestData.xlsx");
		wb.write(fos);
		*/
		
		
		ExcelUtility eUtility = new ExcelUtility();
		eUtility.writeDataToExcelFile("Bird", 0, 0, "Parrot");
		eUtility.writeDataToExcelFile("Bird", 1, 1, "Sparrow");
		eUtility.writeDataToExcelFile("Bird", 2, 2, "Crow");
		eUtility.writeDataToExcelFile("Bird", 3, 3, "Peacock");
		eUtility.writeDataToExcelFile("Bird", 4, 4, "Pigeon");
	}

}
