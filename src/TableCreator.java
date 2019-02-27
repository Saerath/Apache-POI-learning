import java.io.*;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class TableCreator {
	public Workbook createTable(int numRows) {
		Workbook book = new HSSFWorkbook();

		createHeader(book);
		
		File files = getFiles("C:/Users/Saerath/workspace/ExcelExercise/src/resources/");
		ArrayList<String> pathsList = new ArrayList<String>(getDataFromFiles(files));
		
		for (String p : pathsList) {
			System.out.println(p);
		}

		return book;
	}

	//Method creates header row with columns names
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
	
	private File getFiles(String dirPath){
		File files = new File(dirPath);
		
		return files;
	}

	//get data from file. Path - full path
	private ArrayList<String> getDataFromFiles(File files) {

		ArrayList<String> dataList = new ArrayList<String>();
		
		for (File f : files.listFiles()) {
			try {
				FileInputStream fstream = new FileInputStream(f.getAbsolutePath());
				BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
				String strLine;
				while ((strLine = br.readLine()) != null) {
					dataList.add(strLine);
				}
			} catch (IOException e) {
				System.out.println("Ошибка");
			}
		}
		
		return dataList;
	}
}
