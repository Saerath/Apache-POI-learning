import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Workbook book = new HSSFWorkbook();
		Sheet sheet = book.createSheet("test");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue(0);
		String test = "test.xls";
		book.write(new FileOutputStream(test));
		book.close();
	}

}
