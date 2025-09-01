package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


	/**
	 * This is a utility file which works with Excel file 
	 * @author ahub
	 * @version 16-08-25 
	 */
public class ExcelUtility {

	/**
	 * This is a generic method to fetch single cell data from excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws Exception
	 */
	public String getSingleDataFromExcelFile(String sheetName, int rowIndex, int cellIndex) throws Exception 
	{
		FileInputStream fis = new FileInputStream(IPathUtility.vtigerExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell cell = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(cell);
		return value;
	}
	
	/**
	 * This is a generic method to fetch multiple data from excel file
	 * @param sheetname
	 * @param rowStartIndex
	 * @param cellStartIndex
	 * @return
	 * @throws Exception
	 */
	
	public List<String> getMultipleDataFromExcelFile(String sheetname, int rowStartIndex, int cellStartIndex) throws Exception
	{
		FileInputStream fis = new FileInputStream(IPathUtility.vtigerExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		
		DataFormatter df = new DataFormatter();
		List<String> a1 = new ArrayList<String>();
		for (int i = rowStartIndex; i <= sh.getLastRowNum(); i++) {
			Row r = sh.getRow(i);
			for (int j = cellStartIndex; j < r.getLastCellNum(); j++) {
				Cell cell = r.getCell(j);
				a1.add(df.formatCellValue(cell));
			}
			
		}
		return a1;
		
	}
	
	/**
	 * This a generic method to write the data in a cell to Excel file for an existing Sheet & existing Row.
	 * @param sheetname
	 * @param rowIndex
	 * @param cellIndex
	 * @param value
	 * @throws Exception
	 */
	public void writeDataToExcelFile(String sheetname, int rowIndex, int cellIndex, String value) throws Exception
	{
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row r = sh.getRow(rowIndex);
		Cell cell = r.createCell(cellIndex);
		cell.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IPathUtility.excelPath);
		wb.write(fos);
	}
	
	
	/**
	 * This a generic method to write the data in a cell & create new row to Excel file for an existing Sheet
	 * @param sheetname
	 * @param rowIndex
	 * @param cellIndex
	 * @param value
	 * @throws Exception
	 */
	public void writeDataToExcelFileByCreatingRow(String sheetname, int rowIndex, int cellIndex, String value) throws Exception
	{
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row r = sh.createRow(rowIndex);
		Cell cell = r.createCell(cellIndex);
		cell.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IPathUtility.excelPath);
		wb.write(fos);
	}

}
