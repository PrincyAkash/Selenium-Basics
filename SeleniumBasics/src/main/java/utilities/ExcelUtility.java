package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static FileInputStream file;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	
	
	public static String  readStringData(int i,int j, String string) throws IOException {
		 file = new FileInputStream("C:\\Users\\hp\\git\\Selenium-Basics\\SeleniumBasics\\src\\main\\resources");
		 wb = new XSSFWorkbook (file);
		 sh =wb.getSheet(null);
		 XSSFRow row = sh.getRow(i);
		 XSSFCell cell =row.getCell(j);
		 return cell.getStringCellValue();
	}
	
	
	
	public static double readIntegerData(int i, int j, String sheet) throws IOException {
		
		file = new FileInputStream("C:\\Users\\hp\\git\\Selenium-Basics\\SeleniumBasics\\src\\main\\resources");
		 wb = new XSSFWorkbook (file);
		 sh =wb.getSheet(null);
		 XSSFRow row = sh.getRow(i);
		 XSSFCell cell =row.getCell(j);
		 return cell.getNumericCellValue();
	}

}

	
	
	


