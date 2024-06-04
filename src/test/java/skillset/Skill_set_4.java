package skillset;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Skill_set_4   
{
	
	public static String user_id, password, TestEng, location, skills;
	public void excel() throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\2304086\\eclipse-workspace\\miniproject\\src\\test\\resources\\testdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		user_id = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		password = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		TestEng = wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		location = wb.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		skills = wb.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
		wb.close();
	}


}