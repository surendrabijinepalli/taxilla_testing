package com.demo;

import static org.testng.Assert.assertNotNull;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class datepickerclass {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbijinepalli\\Desktop\\JarsFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome Browser executed");
		
		
		/*System.setProperty("webdriver.ie.driver", "C:\\Users\\sbijinepalli\\Desktop\\ie\\IEDriverServer.exe");
		 WebDriver driver=new InternetExplorerDriver();
		System.out.println("InternetExplorerDriver executed");*/
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.get("https://qa.taxilla.com");
		
			//driver.get("https://eninvoice-qa.taxilla.com");

			
			
	  //driver.get("https://vdm-qa.taxilla.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("userId")).sendKeys("paper1234");
		Thread.sleep(2000);
		driver.findElement(By.id("userPassword")).sendKeys("Test@123");
		Thread.sleep(2000);
		
		
		 WebElement Element=driver.findElement(By.xpath("(//*[contains(text(),' Sign in ')])[2]"));
  		 JavascriptExecutor js=(JavascriptExecutor) ((JavascriptExecutor)driver).executeScript("arguments[0].click();", Element);  

		Thread.sleep(5000);
		
         String t1=driver.findElement(By.xpath("//div[@class='ng-star-inserted']/div[1]//div/div/div/input")).getAttribute("id");
         System.out.println(t1);
         if(t1.contains("born"))
         {
         	driver.findElement(By.xpath("//div[@class='ng-star-inserted']/div[1]//div/div/div/input")).sendKeys("test");
         }else if(t1.contains("provider"))
         	{
         		driver.findElement(By.xpath("//div[@class='ng-star-inserted']/div[1]//div/div/div/input")).sendKeys("test");
         	}else if(t1.contains("grandmother"))
         		{
         			driver.findElement(By.xpath("//div[@class='ng-star-inserted']/div[1]//div/div/div/input")).sendKeys("test");
         		}else  if(t1.contains("phone"))
         			{
         				driver.findElement(By.xpath("//div[@class='ng-star-inserted']/div[1]//div/div/div/input")).sendKeys("test");
         			}else  if(t1.contains("landmark"))
         			{
         				driver.findElement(By.xpath("//div[@class='ng-star-inserted']/div[1]//div/div/div/input")).sendKeys("test");
         			}
         
       Thread.sleep(2000);  	
       WebElement q2=driver.findElement(By.xpath("//div[@class='ng-star-inserted']/div[2]//div/div/div/input"));
       String t2=q2.getAttribute("id");
       System.out.println(t2);
       if(t2.contains("born"))
       {
    	   q2.sendKeys("test");
       }
       else if(t2.contains("provider"))
       {
    	   q2.sendKeys("test");
       }
       else  if(t2.contains("grandmother"))
       {
    	   q2.sendKeys("test");
       }
       else if(t2.contains("phone"))
       {
    	   q2.sendKeys("test");
       }
       else if(t2.contains("landmark"))
       {
    	   q2.sendKeys("test");
       }
       Thread.sleep(5000);
       //driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
       WebElement Element2=driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
	   JavascriptExecutor js2=(JavascriptExecutor) ((JavascriptExecutor)driver).executeScript("arguments[0].click();", Element2);  

                  
       Thread.sleep(20000);
       driver.findElement(By.xpath("//*[contains(@placeholder,'Search Apps')]")).sendKeys("Outward E-Way Bills");
       Thread.sleep(2000);

       driver.findElement(By.xpath("//*[contains(@placeholder,'Search Apps')]")).sendKeys(Keys.ENTER);
       
       Thread.sleep(15000);
       driver.findElement(By.xpath("(//*[contains(text(),'Process Now')])[1]")).click();
       
       Set<String> allwindows=driver.getWindowHandles();
       System.out.println(allwindows);
       
       Object[] windows=allwindows.toArray();
       String window1=windows[0].toString();
       String window2=windows[1].toString();
       Thread.sleep(30000);
       driver.switchTo().window(window2);  
       
       
       
       
       
       Thread.sleep(20000);
       
       driver.findElement(By.xpath("(//*[contains(text(),'Select Transformation')])[3]")).click();
       Thread.sleep(2000);

       
       driver.findElement(By.xpath("//*[contains(text(),' E-waybill-Inbound-1.03 ')]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//*[contains(text(),'Choose File')])[2]")).click();
       
       StringSelection stringselection=new StringSelection("D:\\profile backup\\D drive\\05AAACG2115R1ZN-Demo_(1)_(3)_(1)_(1)_(1)_(1).xlsx");
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
       Robot robot = null;
       
       try {
           robot = new Robot();
       } catch (Exception e) {
           e.printStackTrace();
       }
       robot.delay(250);
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);
       robot.keyPress(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_V);
       robot.keyRelease(KeyEvent.VK_V);
       robot.keyRelease(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.delay(150);
       robot.keyRelease(KeyEvent.VK_ENTER);
       
       Thread.sleep(5000);
       WebElement Element3=driver.findElement(By.xpath("(//*[contains(text(),' Initiate Process ')])[1]"));
		 JavascriptExecutor js3=(JavascriptExecutor) ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Element3);		  
	     System.out.println(" scrollPageDownByJavaScript  :  Executed");
	   Thread.sleep(2000);
       driver.findElement(By.xpath("(//*[contains(text(),' Initiate Process ')])[1]")).click();
	   Thread.sleep(10000);
       driver.findElement(By.xpath("//*[contains(text(),'refresh')]")).click();
	   Thread.sleep(10000);
       driver.findElement(By.xpath("//*[contains(@type,'search')]")).sendKeys("Reg000431");
       Thread.sleep(5000);
       driver.findElement(By.xpath("//*[contains(@type,'search')]")).sendKeys(Keys.ENTER);
	   Thread.sleep(10000);
       driver.findElement(By.xpath("//*[contains(@class,'feedItemCounterBlock')]/div[2]")).click();
	   Thread.sleep(10000);
       driver.findElement(By.xpath("//*[contains(@title,'Bulk Actions')]")).click();
	   Thread.sleep(2000);
       driver.findElement(By.xpath("(//*[contains(text(),'Download Report')])[3]")).click();
	   Thread.sleep(10000);
       driver.findElement(By.xpath("(//*[contains(text(),'Download Report')])[3]")).click();
     
		 
		 driver.findElement(By.xpath("(//*[contains(@class,'mat-datepicker-toggle-default-icon ng-star-inserted')])[1]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@aria-label='Choose month and year']")).click();

	/*	 String appdate="10/01/2020";
		 
		 String[] temp=appdate.split("/");
		 String dt= temp[0];
		 String month=temp[1];
		 String year=temp[2];
		 
			 String calyear,calmonth,caldt;
			 
					// driver.findElement(By.xpath(locaterValue)).click();
			 
			 
 		 Thread.sleep(3000);
 		// driver.findElement(By.xpath("//*[@aria-label='Choose month and year']")).click();
 		 
		calyear =driver.findElement(By.xpath("//*[contains(@aria-label,'2020')]")).getText(); 
		 while(!calyear.equalsIgnoreCase(year))
		 {
			//next month(<)  xpath here
			 driver.findElement(By.xpath("//*[contains(@aria-label,'Previous 20 years')]")).click(); 
			 driver.findElement(By.xpath("//*[contains(@aria-label,'2020')]")).getText();
		 }
		 
		 calmonth=driver.findElement(By.xpath("//*[contains(text(),' AUG ')]")).getText();
		 while(!calmonth.equalsIgnoreCase(month))
		 {
			//next month(<)  xpath here
			 driver.findElement(By.xpath("//*[contains(@aria-label,'Previous year')]")).click();
			 calmonth= driver.findElement(By.xpath("//*[contains(text(),' AUG ')]")).getText();
		 }
		 
		 //code for select date from the table
		 WebElement cal=driver.findElement(By.xpath("//*[@aria-label='Choose month and year']"));
		 List<WebElement> rows,cols;
		 rows=cal.findElements(By.tagName("tr"));
		 boolean flag= false;
		 for(int i=1;i<rows.size();i++)
		 {
			 cols=rows.get(i).findElements(By.tagName("td"));
			 for(int j=1;j<cols.size();j++)
			 {
				 if(cols.get(j).getText().equalsIgnoreCase(dt))
				 {
					 cols.get(j).click();
					 flag=true;
					 break;
				 }
				 
			 }
			 if(flag)
			 {
				 break;
			 }
		 }
		 
		 System.out.println("datePicker method executed");*/
		 
		 
		
		 String appdate="1/10/2019";
		 
		 String[] temp=appdate.split("/");
		 String dt= temp[0];
		 String month=temp[1];
		 String year=temp[2];
		 System.out.println("splitted successfully");
		 
		/* driver.findElement(By.xpath("//td/div[contains(text(),'year')]")).click();
         Thread.sleep(2000);
		 driver.findElement(By.xpath("//td/div[contains(text(),'month')]")).click();
		 switch (month) {
		     case 01: driver.findElement(By.xpath("//td/div[contains(text(),'JAN')]")).click();
			 break;
		     case 02: driver.findElement(By.xpath("//td/div[contains(text(),'FEB')]")).click();
			 break;
		     case 03: driver.findElement(By.xpath("//td/div[contains(text(),'MAR')]")).click();
			 break;
		     case 04: driver.findElement(By.xpath("//td/div[contains(text(),'APR')]")).click();
			 break;
		     case 05: driver.findElement(By.xpath("//td/div[contains(text(),'MAY')]")).click();
			 break;
		     case 06: driver.findElement(By.xpath("//td/div[contains(text(),'JUN')]")).click();
			 break;
		     case 07: driver.findElement(By.xpath("//td/div[contains(text(),'JUL')]")).click();
			 break;
		     case 08: driver.findElement(By.xpath("//td/div[contains(text(),'AUG')]")).click();
			 break;
		     case 09: driver.findElement(By.xpath("//td/div[contains(text(),'SEP')]")).click();
			 break;
		     case 10: driver.findElement(By.xpath("//td/div[contains(text(),'OCT')]")).click();
			 break;
		     case 11: driver.findElement(By.xpath("//td/div[contains(text(),'NOV')]")).click();
			 break;
		     case 12: driver.findElement(By.xpath("//td/div[contains(text(),'DEC')]")).click();
			 break;

		}*/
          
		 
		 
		 
		/* Select select1=new Select(driver.findElement(By.xpath("//*[contains(@aria-label,'2020')]"))); //yearxpath
         select1.selectByVisibleText(year);
         Thread.sleep(2000);
         System.out.println("Year selected");
         
         
         Select select=new Select(driver.findElement(By.xpath("//*[contains(text(),' AUG ')]"))); //monthxpath
         select.selectByVisibleText(month);
         Thread.sleep(2000);
         System.out.println("Month selected");*/
              
         
        /* String beforexpath="//span[contains(text(),'-')]//div[";
         String afterxpath="]//div["; */
		 
		/* String beforexpath="//span[contains(text(),'-')]//div[";
         String afterxpath="]//div[";
         

		 driver.findElement(By.xpath("//td/div[text()=' "+year+" ']")).click();
		 Thread.sleep(2000);	
		 driver.findElement(By.xpath("//div[contains(text(),'"+monthMap.get(month)+"')]")).click();
		 Thread.sleep(2000);	
		 driver.findElement(By.xpath("//td/div[text()=' "+dt+" ']")).click();	 */
		 HashMap<String, String> monthMap = new HashMap<String, String>();

		 // Add keys and values (monthNumber, monthString)
		 monthMap.put("01", " JAN ");
		 monthMap.put("02", " FEB ");
		 monthMap.put("03", " MAR ");
		 monthMap.put("04", " APR ");
		 monthMap.put("05", " MAY ");
		 monthMap.put("06", " JUN ");
		 monthMap.put("07", " JUL ");
		 monthMap.put("08", " AUG ");
		 monthMap.put("09", " SEP ");
		 monthMap.put("10", " OCT ");
		 monthMap.put("11", " NOV ");
		 monthMap.put("12", " DEC ");
		 
		 System.out.println("month selected successfully");
		 
		 driver.findElement(By.xpath("//td/div[text()=' "+year+" ']")).click();
		 Thread.sleep(2000);	
		 driver.findElement(By.xpath("//div[contains(text(),'"+monthMap.get(month)+"')]")).click();
		 Thread.sleep(2000);	
		 driver.findElement(By.xpath("//td/div[text()=' "+dt+" ']")).click();	 
	 
		 System.out.println(" selected successfully");

        /* final int totalweekdays=7;
         
          boolean flag=false;
          String dayval=null;
          
          for(int rowNum=2;rowNum<=7;rowNum++)
          {
        	  for(int colNum=1; colNum<= totalweekdays;colNum++)
        	  {
        		  try
        		  {
        		  dayval=driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]")).getText();
        		  }catch (NoSuchElementException e)
        		  {
        		  System.out.println("Please enter a Current date Value");
        		  flag = false;
        		  break;
        		  }
        		  System.out.println(dayval);
        		  if(dayval.equals(dt))
        				  {
        			  Thread.sleep(1000);
        			  driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]")).click();
        			  Thread.sleep(2000);
        			  System.out.println("day picked");
        			  flag = true;
        			  break;
        				  }
        				  
        	  }
        	  if(flag)
              {
             	 break;
              }
        	  
          }*/
                         
		
	 }
		 
		 
	 }
      




	



