package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT 
{
	public static String un;
	public static String pwd;
	public void credentials() throws EncryptedDocumentException, IOException 
	{
	FileInputStream f1= new FileInputStream("C:\\Users\\dell\\Automation\\SeleniumBasics\\DDT\\Sanskruti.xlsx");
	Workbook w1= WorkbookFactory.create(f1);
	 un= w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
	 pwd= w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
	}
}
