package Utility;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String getData(int row,int cell) throws EncryptedDocumentException, IOException  {
		FileInputStream file = new FileInputStream("C:\\Users\\ZIG COMPUTERS\\eclipse-workspace\\KiteZerodha\\src\\main\\resources\\ZerodhaLogin.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}
