package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelFileUtil
{
   Workbook wb;
   public ExelFileUtil() throws Throwable
   {   
	   //reference for dawood
	 //  FileInputStream fis=new FileInputStream("D:\\profile backup\\D drive\\workspace\\test3\\TestInputs\\org_associations.xlsx");
	   

	 // FileInputStream fis=new FileInputStream("D:\\profile backup\\D drive\\workspace\\test3\\TestInputs\\Inputsheet1.xlsx");
	   
	  // FileInputStream fis=new FileInputStream("D:\\profile backup\\D drive\\workspace\\test3\\TestInputs\\MastersInputSheet.xlsx");
	   
	  // FileInputStream fis=new FileInputStream("D:\\profile backup\\D drive\\workspace\\test3\\TestInputs\\Integration.xlsx");
	   
	 // FileInputStream fis=new FileInputStream("D:\\profile backup\\D drive\\workspace\\test3\\TestInputs\\AccessAPI.xlsx");
	   
	   FileInputStream fis=new FileInputStream("D:\\profile backup\\D drive\\workspace\\test3\\TestInputs\\UserManagement.xlsx");

	   
	  // FileInputStream fis=new FileInputStream("D:\\profile backup\\D drive\\workspace\\test3\\TestInputs\\exam.xlsx");


	   wb= WorkbookFactory.create(fis);
   }
   
   
   public int rowCount(String sheetname)
   {
	   return wb.getSheet(sheetname).getLastRowNum();
   }
   
   
   public int columnCount(String sheetname, int row)
   {
	   return wb.getSheet(sheetname).getRow(row).getLastCellNum();
   }
   
   
   public String getData(String sheetname,int row,int column)
   {
	   String Data="";
	  if( wb.getSheet(sheetname).getRow(row).getCell(column).getCellType()==Cell.CELL_TYPE_NUMERIC)
	  {
		  int celldata=(int)wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
		  Data= String.valueOf(celldata);
	  }else
	  {
		  Data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	  }
	  return Data;
   }
   
   
   public void setData(String sheetname,int row,int column, String status) throws Throwable
   {
	   Sheet sh=wb.getSheet(sheetname);
	   Row rownum=sh.getRow(row);
	   Cell cell=rownum.createCell(column);
	   cell.setCellValue(status);
	   
	   if(status.equalsIgnoreCase("Pass"))
	   {
		   CellStyle style=wb.createCellStyle();
		   Font font=wb.createFont();
		   font.setColor(IndexedColors.GREEN.getIndex());
		   font.setBold(true);
		   style.setFont(font);
		   rownum.getCell(column).setCellStyle(style);
	   }else
		   if(status.equalsIgnoreCase("Fail"))
		   {
			   CellStyle style=wb.createCellStyle();
			   Font font=wb.createFont();
			   font.setColor(IndexedColors.RED.getIndex());
			   font.setBold(true);
			   style.setFont(font);
			   rownum.getCell(column).setCellStyle(style);
		   }else
			   if(status.equalsIgnoreCase("NotExecuted"))
			   {
				   CellStyle style=wb.createCellStyle();
				   Font font=wb.createFont();
				   font.setColor(IndexedColors.BLUE.getIndex());
				   font.setBold(true);
				   style.setFont(font);
				   rownum.getCell(column).setCellStyle(style);
			   }
	   FileOutputStream fos=new FileOutputStream("D:\\profile backup\\D drive\\workspace\\test3\\TestOutputs\\Outputsheet.xlsx");
	   wb.write(fos);
	   fos.close();
   }

	
}