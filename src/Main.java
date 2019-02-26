import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		TableCreator tc = new TableCreator();
		Workbook book = tc.createTable(5);
		
		String test = "test.xls";
		book.write(new FileOutputStream(test));

		book.close();
	}

}
