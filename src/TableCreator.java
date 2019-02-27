import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class TableCreator {
	
	final String RESOURCES_DIR = "C:/Users/Saerath/workspace/ExcelExercise/src/resources/";

	Map<String, ArrayList<String>> listMap = new HashMap<String, ArrayList<String>>();

	public Workbook createTable(int numRows) {

		Workbook book = new HSSFWorkbook();
		Sheet sh = book.createSheet("First sheet");
		
		createHeader(sh);
		addRow(sh);

		return book;
	}

	// Method creates header row with columns names
	private void createHeader(Sheet sh) {

		Row headerRow = sh.createRow(0);

		int i = 0;
		for (EnumColumns e : EnumColumns.values()) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(e.getName());
			i++;
		}
	}

	//getting files from dirPath
	private File getFiles(String dirPath) {
		File files = new File(dirPath);
		return files;
	}

	// get data from file. Path - full path
	private void getDataFromFiles(File files) {

		for (File f : files.listFiles()) {
			//adding new ArrayList to map
			listMap.put(f.getName(), new ArrayList<String>());
			try {
				FileInputStream fstream = new FileInputStream(
						f.getAbsolutePath());
				BufferedReader br = new BufferedReader(new InputStreamReader(
						fstream));
				String strLine;
				while ((strLine = br.readLine()) != null) {
					listMap.get(f.getName()).add(strLine);
				}
			} catch (IOException e) {
				System.out.println("������");
			}
		}

	}
	
	private void addRow(Sheet sh){
		
		File files = getFiles(RESOURCES_DIR);
		getDataFromFiles(files);
		
		System.out.println(sh.getLastRowNum());
		
	}

}
