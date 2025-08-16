package practice;

//import java.io.FileInputStream;
import java.util.List;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class FetchingMultipleDataFromExcelFile {

	public static void main(String[] args) throws Exception  {
		
//		FileInputStream fis = new FileInputStream("/home/ahub/Documents/TestData.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Animal");
////		System.out.println(sh.getLastRowNum());
//		
//		DataFormatter df = new DataFormatter();
//		for (int i = 0; i <= sh.getLastRowNum(); i++) {
//			Row r = sh.getRow(i);
////			System.out.println(r.getLastCellNum());
//			for (int j = 0; j < r.getLastCellNum(); j++) {
//				Cell cell = r.getCell(j);
//				String value = df.formatCellValue(cell);
//				System.out.print(value + " ");
//
//			}
//			System.out.println();
//			
//		}
		
		ExcelUtility eUtilty = new ExcelUtility();
		List<String> datas = eUtilty.getMultipleDataFromExcelFile("Animal", 0, 0);
		System.out.println(datas);
	}
}
