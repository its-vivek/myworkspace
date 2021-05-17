package shammi.corejavaprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\vivek\\Desktop\\Book1.xlsx");
		Workbook workbook = null;
		workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheetName = workbook.getSheet("Sheet1");
		int rowCount = sheetName.getLastRowNum() - sheetName.getFirstRowNum();
		for(int i = 0; i < rowCount+1; i++) {
			Row row = sheetName.getRow(i);
			for(int j = 0; j<row.getLastCellNum(); j++) {
				System.out.print(row.getCell(j).getStringCellValue()+"||");
				System.out.print(row.getPhysicalNumberOfCells()+"||");
			}
			System.out.println();
		}
	}
}
