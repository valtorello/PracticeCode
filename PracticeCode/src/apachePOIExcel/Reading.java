package apachePOIExcel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class Reading {
	
	public static final String SAMPLE_EXCEL_FILE_PATH = "C:\\Users\\valentintorello\\Documents\\Excel File\\ApacheTest.xlsx";
	

	public static void main(String[] args) throws IOException, InvalidFormatException {
		
		// Creating a Workbook from an Excel file (.xls or .xlsx)
		FileInputStream in = new FileInputStream(new File (SAMPLE_EXCEL_FILE_PATH));
		
		 //HSSFWorkbook workbook = new HSSFWorkbook(in);
		
		// XSSF excel format
		Workbook workbook = new XSSFWorkbook(in);
		
		//get sheet at index zero
		Sheet sheet = workbook.getSheetAt(0);
		
		//create a DataFormatter to format and get each cell's value as String
		DataFormatter dataFormatter = new DataFormatter();
		
		//
		Iterator <Row> rowIterator = sheet.rowIterator();
		
		
		while (rowIterator.hasNext()) {
			
			Row row = rowIterator.next();
			
			//now let's iterate over the column of the current row
			Iterator<Cell> cellIterator = row.cellIterator();
			
			while (cellIterator.hasNext()) {
				
				Cell cell = cellIterator.next();
				String cellValue = dataFormatter.formatCellValue(cell);
				System.out.print(cellValue + "\t");
			}
			
			System.out.println();
		}
		
		
		
		
		
		

	}

}
