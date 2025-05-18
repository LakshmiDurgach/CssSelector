package CssSelector.CssSelector;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {
	public static void main(String args[]) throws IOException
	{
		//if fle is already exist opens that file...... file is not exists then create a new file and writing data in that file
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Data");
		
		XSSFRow row1=sheet.createRow(0);
		
		row1.createCell(0).setCellValue("welcome");
		row1.createCell(0).setCellValue(1234);
		row1.createCell(0).setCellValue("Automation");
		
        XSSFRow row2=sheet.createRow(1);
		
		row2.createCell(0).setCellValue("Java");
		row2.createCell(0).setCellValue(345);
		row2.createCell(0).setCellValue("testing");
		
        XSSFRow row3=sheet.createRow(1);
		
		row3.createCell(0).setCellValue("python");
		row3.createCell(0).setCellValue(678);
		row3.createCell(0).setCellValue("e2e");
		
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
