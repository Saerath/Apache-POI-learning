import java.io.*;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class TableCreator {
	public Workbook createTable(int numRows) {
		Workbook book = new HSSFWorkbook();

		createHeader(book);

		ArrayList<String> pathsList = new ArrayList<String>(getPaths("C:/Users/Saerath/workspace/ExcelExercise/src/resources/"));
		
		for (String p : pathsList) {
			System.out.println(getDataFromFile(p));
		}

		return book;
	}

	private void createHeader(Workbook book) {
		Sheet sh = book.createSheet("First sheet");

		Row headerRow = sh.createRow(0);

		int i = 0;
		for (EnumColumns e : EnumColumns.values()) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(e.getName());
			i++;
		}
	}

	private ArrayList<String> getPaths(String dirPath) {

		ArrayList<String> pathList = new ArrayList<String>();

		File resDir = new File(dirPath);
		for (String s : resDir.list()) {
			pathList.add(dirPath + s);
		}

		return pathList;
	}

	private ArrayList<String> getDataFromFile(String path) {

		ArrayList<String> dataList = new ArrayList<String>();
		
		try {
			FileInputStream fstream = new FileInputStream(path);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				dataList.add(strLine);
			}
		} catch (IOException e) {
			System.out.println("Ошибка");
		}
		
		return dataList;
	}
}
