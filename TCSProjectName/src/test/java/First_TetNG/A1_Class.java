package First_TetNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_Class {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\MD 10\\Desktop\\18th June Morning.xlsx");
		//WorkbookFactory= org.apache.poi.ss.usermodel.WorkbookFactor
		
	Workbook book1=	WorkbookFactory.create(file);// by using creat method we can open the excellsheet// workbook is interface
		
	    Sheet sh =book1.getSheet("Velocity 18th june");// specif sheet open karna tha // sheet is interface
	
	         Row w=   sh.getRow(0);// perticular row chaye // row is interfce
	         
	        Cell cll= w.getCell(2);// perticular row me se particula cell ko dega
		
		Boolean value=cll.getBooleanCellValue();
		System.out.println(value);

		
	}
	
}
