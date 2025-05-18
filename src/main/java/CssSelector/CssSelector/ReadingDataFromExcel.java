package CssSelector.CssSelector;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//excel file------>workbook------>rows----->cells

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//capture excel file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		//capture workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//sheets
		XSSFSheet sheet=workbook.getSheet("Sheet1");   //XSSFSheet sheet=workbook.getSheet(0);   //index
		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(1).getLastCellNum();    //here you need to get the total num of cells first you need to find the total num of rows
		System.out.println("no of rows: " +totalRows);   //5    //rows are counting from  0
		System.out.println("no of cells: " +totalCells);  //4    //cells are counting from 1
		
		//2 for loops
		//here outer for loop represents rows and inner for loop represents  cells
		
		for(int r=0;r<=totalRows;r++)
		{
			 XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<totalCells;c++)
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}
}
			
				
				
				
				
				
				
			
		
		
		
		
	
	
		
		;
	
		

	
