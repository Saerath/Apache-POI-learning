import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class TableCreator {
	public Workbook createTable(int numRows) {

		int numColumns = EnumColumns.values().length;

		Workbook book = new HSSFWorkbook();

		createHeader(book);

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
}
