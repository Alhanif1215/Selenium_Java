package genericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

	/**
	 * Generic class to access excel file
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
	public String getDataFromExcelFile(String sheetName, int rowIndex, int cellIndex) throws Exception 
	{
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell cell = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(cell);
		return value;
	}
}
