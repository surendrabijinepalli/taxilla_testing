package com.DriverFactory;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.commonFunctionLybrary.FunctionLybrary;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.ExelFileUtil;
import com.utilities.PropertyFileUtil;

public class DriverScript 
{
       WebDriver driver;
       ExtentReports reports;
       ExtentTest logger;
       
       public void startTest() throws Throwable
       {
    	   ExelFileUtil exel= new ExelFileUtil();
    	   //System.out.println("startmethod started");
    	   //System.out.println( "master test ::"+exel.rowCount("MasterTestcases"));
    	  
    	   for(int i=1;i<=exel.rowCount("MasterTestcases");i++)
    	   {
    		         System.out.println("master sheet ex mode :: " +exel.getData("MasterTestcases", i, 0)
    		         +"   "+exel.getData("MasterTestcases", i, 1)+ "  "+exel.getData("MasterTestcases", i, 2));
    		         
    		   String moduleStatus="";
    		   if(exel.getData("MasterTestcases", i, 2).equalsIgnoreCase("Y"))
    		   {
    			   String TCModule=exel.getData("MasterTestcases", i, 1);
    			   reports=new ExtentReports("D:\\profile backup\\D drive\\workspace\\test3\\Reports"+".html"+TCModule+" "+FunctionLybrary.generateDate());
    			   logger=reports.startTest(TCModule);
    			   //System.out.println("tc module count "+exel.rowCount(TCModule));
    			   for(int j=1;j<=exel.rowCount(TCModule);j++)
    			   {
    				   String Description=exel.getData(TCModule, j, 0);
    				   String Object_Type=exel.getData(TCModule, j, 1);
    				   String Locater_Type=exel.getData(TCModule, j, 2);
    				   String Locater_Value=exel.getData(TCModule, j, 3);
    				   String Test_Data=exel.getData(TCModule, j, 4);
    				  // String Status=exel.getData(TCModule, j, 5);
    				   try {
    					  
						      if(Object_Type.equalsIgnoreCase("startBrowser"))
						      {
						    	  driver=FunctionLybrary.startBrowser(driver);
						    	  logger.log(LogStatus.INFO, Description);	
						    	  
						      }
						      if(Object_Type.equalsIgnoreCase("openApplication"))
						      {
						    	  FunctionLybrary.openApplication(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("openApplication1"))
						      {
						    	  FunctionLybrary.openApplication1(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      
						      
						      
						      if(Object_Type.equalsIgnoreCase("closeBrowser"))
						      {
						    	  FunctionLybrary.closeBrowser(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      }     
						      
						      
						      if(Object_Type.equalsIgnoreCase("windowHandlesram"))
						      {
						    	  FunctionLybrary.windowHandlesram(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      }     
						      if(Object_Type.equalsIgnoreCase("windowHandlesdiff"))
						      {
						    	  FunctionLybrary.windowHandlesdiff(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      }     
						      if(Object_Type.equalsIgnoreCase("windowHandles"))
						      {
						    	  FunctionLybrary.windowHandles(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      }     
						      if(Object_Type.equalsIgnoreCase("windowHandles10"))
						      {
						    	  FunctionLybrary.windowHandles10(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      }     
						      if(Object_Type.equalsIgnoreCase("windowHandlesforIE1"))
						      {
						    	  FunctionLybrary.windowHandlesforIE1(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      } 
						      if(Object_Type.equalsIgnoreCase("windowHandlesforIE"))
						      {
						    	  FunctionLybrary.windowHandlesforIE(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      } 
						      if(Object_Type.equalsIgnoreCase("windowHandlesforIE2"))
						      {
						    	  FunctionLybrary.windowHandlesforIE2(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      
						      
						      
						      
						      if(Object_Type.equalsIgnoreCase("robotClass"))
						      {
						    	  FunctionLybrary.robotClass(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      }     
						      if(Object_Type.equalsIgnoreCase("robotClass2"))
						      {
						    	  FunctionLybrary.robotClass2(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      }     
						      if(Object_Type.equalsIgnoreCase("robotClassforMaster1"))
						      {
						    	  FunctionLybrary.robotClassforMaster1(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      }     
						      if(Object_Type.equalsIgnoreCase("robotClassforMaster2"))
						      {
						    	  FunctionLybrary.robotClassforMaster2(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      }     
						      if(Object_Type.equalsIgnoreCase("robotClassforMaster3"))
						      {
						    	  FunctionLybrary.robotClassforMaster3(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      }     
						      
						      if(Object_Type.equalsIgnoreCase("typeAction"))
						      {
						    	  FunctionLybrary.typeAction(driver, Locater_Type, Locater_Value, Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("typeAction2SecurAthen"))
						      {
						    	  FunctionLybrary.typeAction2SecurAthen(driver, Locater_Type, Locater_Value, Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }				      
						      if(Object_Type.equalsIgnoreCase("typeAction3SecurAthen"))
						      {
						    	  FunctionLybrary.typeAction2SecurAthen(driver, Locater_Type, Locater_Value, Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }				      
						      if(Object_Type.equalsIgnoreCase("SecurAthen"))
						      {
						    	  FunctionLybrary.SecurAthen(driver, Locater_Type, Locater_Value, Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }				      
						      
						      if(Object_Type.equalsIgnoreCase("clickAction"))
						      {
						    	  FunctionLybrary.clickAction(driver, Locater_Type, Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("enterAction"))
						      {
						    	  FunctionLybrary.enterAction(driver, Locater_Type, Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("pageDown"))
						      {
						    	  FunctionLybrary.pageDown(driver);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      
						     /* if(Object_Type.equalsIgnoreCase("scrollactionsClass"))
						      {
						    	  FunctionLybrary.scrollactionsClass(driver,Locater_Type,Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }*/
						      
						      
						      if(Object_Type.equalsIgnoreCase("scrollPageDownByActions"))
						      {
						    	  FunctionLybrary.scrollPageDownByActions(driver,Locater_Type,Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("scrollPageDownByActionsLarge"))
						      {
						    	  FunctionLybrary.scrollPageDownByActionsLarge(driver,Locater_Type,Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("scrollPageDownByJavaScript"))
						      {
						    	  FunctionLybrary.scrollPageDownByJavaScript(driver,Locater_Type,Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("scrollPageUpByJavaScript"))
						      {
						    	  FunctionLybrary.scrollPageUpByJavaScript(driver,Locater_Type,Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("JavaScriptClick"))
						      {
						    	  FunctionLybrary.JavaScriptClick(driver,Locater_Type,Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      
						      
						      if(Object_Type.equalsIgnoreCase("validationofExpireDuration"))
						      {
						    	  FunctionLybrary.validationofExpireDuration(driver,Locater_Type,Locater_Value,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("validationofMaxTokens"))
						      {
						    	  FunctionLybrary.validationofMaxTokens(driver,Locater_Type,Locater_Value,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      
						      
						      
						      if(Object_Type.equalsIgnoreCase("UserMangmt_withoutfirstName"))
						      {
						    	  FunctionLybrary.UserMangmt_withoutfirstName(driver,Locater_Type,Locater_Value,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("UserMangmt_withoutLasttName"))
						      {
						    	  FunctionLybrary.UserMangmt_withoutLasttName(driver,Locater_Type,Locater_Value,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("UserMangmt_withoutUserID"))
						      {
						    	  FunctionLybrary.UserMangmt_withoutUserID(driver,Locater_Type,Locater_Value,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("UserMangmt_withoutEmailID"))
						      {
						    	  FunctionLybrary.UserMangmt_withoutEmailID(driver,Locater_Type,Locater_Value,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }			      
						      if(Object_Type.equalsIgnoreCase("UserMangmt_ChekingNumericsOnfirstName"))
						      {
						    	  FunctionLybrary.UserMangmt_ChekingNumericsOnfirstName(driver,Locater_Type,Locater_Value,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("UserMangmt_ChekingNumericsOnLastName"))
						      {
						    	  FunctionLybrary.UserMangmt_ChekingNumericsOnLastName(driver,Locater_Type,Locater_Value,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("UserMangmt_min6charsofUserID"))
						      {
						    	  FunctionLybrary.UserMangmt_min6charsofUserID(driver,Locater_Type,Locater_Value,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("UserMangmt_checkngSpacesOfUserID"))
						      {
						    	  FunctionLybrary.UserMangmt_checkngSpacesOfUserID(driver,Locater_Type,Locater_Value,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("UserMangmt_checkngDuplicateUserID"))
						      {
						    	  FunctionLybrary.UserMangmt_checkngDuplicateUserID(driver,Locater_Type,Locater_Value,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("UserMangmt_chechingValidEmailID"))
						      {
						    	  FunctionLybrary.UserMangmt_chechingValidEmailID(driver,Locater_Type,Locater_Value,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("UserMangmt_EmailIDalreadyhasbeenTaken"))
						      {
						    	  FunctionLybrary.UserMangmt_EmailIDalreadyhasbeenTaken(driver,Locater_Type,Locater_Value,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      
						      
						      
						      if(Object_Type.equalsIgnoreCase("isDisplayedAPI"))
						      {
						    	  FunctionLybrary.isDisplayed(driver,Locater_Type,Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
			     
						      if(Object_Type.equalsIgnoreCase("isDisplayed"))
						      {
						    	  FunctionLybrary.isDisplayed(driver,Locater_Type,Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("isDisplayed_Request_completed"))
						      {
						    	  FunctionLybrary.isDisplayed_Request_completed(driver,Locater_Type,Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("isDisplayed_UpdateCancelEWayBill"))
						      {
						    	  FunctionLybrary.isDisplayed_Request_completed(driver,Locater_Type,Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("isSelected"))
						      {
						    	  FunctionLybrary.isSelected(driver,Locater_Type,Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      
						      
						      
						      if(Object_Type.equalsIgnoreCase("isClickable"))
						      {
						    	  FunctionLybrary.isClickable(driver, Locater_Type, Locater_Value, Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						    	  //System.out.println("wait methd executed");
						      }
						      if(Object_Type.equalsIgnoreCase("isClickableAccessAPI"))
						      {
						    	  FunctionLybrary.isClickableAccessAPI(driver, Locater_Type, Locater_Value, Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						    	  //System.out.println("wait methd executed");
						      }
						      
						      
						      
						      if(Object_Type.equalsIgnoreCase("waitForanElement"))
						      {
						    	  FunctionLybrary.waitForanElement(driver, Locater_Type, Locater_Value, Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						    	  //System.out.println("wait methd executed");
						      }
						      if(Object_Type.equalsIgnoreCase("waitForinvisibilityOfElement"))
						      {
						    	  FunctionLybrary.waitForinvisibilityOfElement(driver, Locater_Type, Locater_Value, Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						    	  //System.out.println("wait methd executed");
						      }
						      if(Object_Type.equalsIgnoreCase("refresh"))
						      {
						    	  FunctionLybrary.refresh(driver, Locater_Type, Locater_Value, Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						    	 // System.out.println("refresh methd executed");
						      }
						      
						      
						      
						      
						      //delay
						      if(Object_Type.equalsIgnoreCase("delay"))
						      {
						    	  FunctionLybrary.delay(driver,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						    	  //System.out.println("delay methd executed");
						      }
						      if(Object_Type.equalsIgnoreCase("handleAlerts"))
						      {
						    	  FunctionLybrary.handleAlerts(driver,Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						    	  //System.out.println("delay methd executed");
						      }
						      if(Object_Type.equalsIgnoreCase("handleAlerts2"))
						      {
						    	  FunctionLybrary.handleAlerts2(driver, Locater_Type, Locater_Value, Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						     						     
						      
						      
						      
						      if(Object_Type.equalsIgnoreCase("captureData"))
						      {
						    	  FunctionLybrary.captureData(driver, Locater_Type, Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("tableValidation1"))
						      {
						    	  FunctionLybrary.tableValidation1(driver, Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						      }

						      if(Object_Type.equalsIgnoreCase("generateDate"))
						      {
						    	  FunctionLybrary.generateDate();
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      
						      
						      if(Object_Type.equalsIgnoreCase("titleValidation"))
						      {
						    	  FunctionLybrary.titleValidation(driver, Test_Data); 
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("BulkActionValidations"))
						      {
						    	  FunctionLybrary.BulkActionValidations(driver, Locater_Type, Locater_Value, Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						    	  
						      }
						      if(Object_Type.equalsIgnoreCase("documentNumberValidation"))
						      {
						    	  FunctionLybrary.documentNumberValidation(driver, Locater_Type, Locater_Value, Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						    	  
						      }
						      //zoominZoomOut
						      /*if(Object_Type.equalsIgnoreCase("zoomInZoomOut"))
						      {
						    	  FunctionLybrary.zoomInZoomOut(driver, Test_Data); 
						    	  logger.log(LogStatus.INFO, Description);
						      }*/
						      
						      //reportsValidate
						      if(Object_Type.equalsIgnoreCase("reportsValidate"))
						      {
						    	  FunctionLybrary.reportsValidate(driver, Locater_Type, Locater_Value); 
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("datePicker"))
						      {
						    	  FunctionLybrary.datePicker(driver, Locater_Type, Locater_Value, Test_Data);
						    	  logger.log(LogStatus.INFO, Description);
						    	  //System.out.println("datePicker methd executed");
						      }
						    
						      if(Object_Type.equalsIgnoreCase("example_VerifyExpectedFileName"))
						      {
						    	  FunctionLybrary.example_VerifyExpectedFileName(driver, Locater_Type, Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      if(Object_Type.equalsIgnoreCase("PerticularViewIconinMasters"))
						      {
						    	  FunctionLybrary.PerticularViewIconinMasters(driver, Locater_Type, Locater_Value);
						    	  logger.log(LogStatus.INFO, Description);
						      }
						      exel.setData(TCModule, j, 5, "Pass");
						      moduleStatus="true";
						      logger.log(LogStatus.PASS, Description);
						      
					       } catch (Exception e)
    				       {
						      exel.setData(TCModule, j, 5, "Fail");
						      moduleStatus="false";
						      logger.log(LogStatus.FAIL, Description);
						      System.out.println("WEDRIVER IS "+driver);
						      File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						      FileUtils.copyFile(srcfile, new File("D:\\profile backup\\D drive\\workspace\\test3\\Screenshots"+Description+" "+FunctionLybrary.generateDate()+".png"));
						      break;
					       }
    			   }
    			   if(moduleStatus.equalsIgnoreCase("true"))
    			   {
    				   exel.setData("MasterTestcases", i, 3, "Pass");
    			   }else
    			   {
    				   if(moduleStatus.equalsIgnoreCase("false"))
    				   {
    					   exel.setData("MasterTestcases", i, 3, "Fail");
    				   }
    			   }
    			   reports.endTest(logger);
    			   reports.flush();
    			   
    		   }else
    		   {
    			   exel.setData("MasterTestcases", i, 3, "Not Executed");
    		   }
    	   }
       }
}
