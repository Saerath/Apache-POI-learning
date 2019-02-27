import java.io.*;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class TableCreator {
	public Workbook createTable(int numRows) {
		Workbook book = new HSSFWorkbook();

		createHeader(book);
		
		System.out.println(getPaths("C:/Users/Saerath/workspace/ExcelExercise/src/resources/"));

		return book;
	}
	
	private void createHeader(Workbook book){
		Sheet sh = book.createSheet("First sheet");
		
		Row headerRow = sh.createRow(0);
		
		int i = 0;
		for (EnumColumns e : EnumColumns.values()) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(e.getName());
			i++;
		}
	}
	
	private ArrayList<String> getPaths(String dirPath){
		
		ArrayList<String> pathList = new ArrayList<String>();
		
		File resDir = new File(dirPath);
		for (String s : resDir.list()) {
			pathList.add(dirPath + s);
		}
		
		return pathList;
	}
}
