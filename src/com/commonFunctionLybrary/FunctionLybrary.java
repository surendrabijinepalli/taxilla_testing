package com.commonFunctionLybrary;





import static org.testng.Assert.assertNotNull;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import com.utilities.Delay;
import com.utilities.PropertyFileUtil;





public class FunctionLybrary 
{
	
     public static WebDriver startBrowser(WebDriver driver) throws Throwable, Throwable 
     { 
    	 
		 String Browser=PropertyFileUtil.getValueForkey("Browser").trim();
		 System.out.println("chrome char length:"+Browser.length());
		  
		 try
		 {
    	 if(Browser.equalsIgnoreCase("chrome"))
    	 {
    		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbijinepalli\\Desktop\\cc\\chromedriver.exe");
    		 driver=new ChromeDriver();
    		 System.out.println("Chrome Browser executed");
    	 }else 
    		 if(PropertyFileUtil.getValueForkey("Browser").equalsIgnoreCase("firefox"))
    		 {
    			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\sbijinepalli\\Desktop\\JarsFiles\\geckodriver.exe");
    			 driver= new FirefoxDriver();
    			 System.out.println(" FireFox browser executed");
    		 }else
    			 if(PropertyFileUtil.getValueForkey("Browser").equalsIgnoreCase("IE"))
    			 {
    				 
  			    	System.setProperty("webdriver.ie.driver", "C:\\Users\\sbijinepalli\\Desktop\\ie\\IEDriverServer.exe");
  				    driver=new InternetExplorerDriver();
    			    System.out.println(" InternetExplorer browser executed");
  				 }else
    				 if(PropertyFileUtil.getValueForkey("Browser").equalsIgnoreCase("MicrosoftEdge"))
        			 {
        				 System.setProperty("webdriver.edge.driver", "C:\\Users\\sbijinepalli\\Desktop\\cc\\msedgedriver.exe");
        				driver=new EdgeDriver();
        				 System.out.println(" MicrosoftEdge browser executed");
        			 }else
        				 if(PropertyFileUtil.getValueForkey("Browser").equalsIgnoreCase("Opera"))
            			 {
            				 System.setProperty("webdriver.opera.driver", "C:\\Users\\sbijinepalli\\Desktop\\cc\\operadriver.exe");
            				 driver=new OperaDriver();
            				 System.out.println(" Opera browser executed");
            			 }
		 }
		 catch (Exception e) {
			 if(Browser.equalsIgnoreCase("chrome"))
	    	 {
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbijinepalli\\Desktop\\RamJars\\chromedriver.exe");
	    		 driver=new ChromeDriver();
	    		 System.out.println("Chrome Browser executed");
	    	 }else 
	    		 if(PropertyFileUtil.getValueForkey("Browser").equalsIgnoreCase("firefox"))
	    		 {
	    			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\sbijinepalli\\Desktop\\JarsFiles\\geckodriver.exe");
	    			 driver= new FirefoxDriver();
	    			 System.out.println(" FireFox browser executed");
	    		 }else
	    			 if(PropertyFileUtil.getValueForkey("Browser").equalsIgnoreCase("IE"))
	    			 {
	    				 
	  			    	System.setProperty("webdriver.ie.driver", "C:\\Users\\sbijinepalli\\Desktop\\ie\\IEDriverServer.exe");
	  				    driver=new InternetExplorerDriver();
	    			    System.out.println(" InternetExplorer browser executed");
	  				 }else
	    				 if(PropertyFileUtil.getValueForkey("Browser").equalsIgnoreCase("MicrosoftEdge"))
	        			 {
	        				 System.setProperty("webdriver.edge.driver", "C:\\Users\\sbijinepalli\\Desktop\\JarsFiles\\msedgedriver.exe");
	        				driver=new EdgeDriver();
	        				 System.out.println(" MicrosoftEdge browser executed");
	        			 }else
	        				 if(PropertyFileUtil.getValueForkey("Browser").equalsIgnoreCase("Opera"))
	            			 {
	            				 System.setProperty("webdriver.opera.driver", "C:\\Users\\sbijinepalli\\Desktop\\JarsFiles\\operadriver.exe");
	            				 driver=new OperaDriver();
	            				 System.out.println(" Opera browser executed");
	            			 }
		}
    	 
    	 return driver;
     }
     
     
     public static void openApplication(WebDriver driver) throws Throwable 
     {
    	 driver.manage().deleteAllCookies();
    	 driver.manage().window().maximize();
    	 driver.get(PropertyFileUtil.getValueForkey("URL"));
    	 
    	
     }
     public static void openApplication1(WebDriver driver) throws Throwable 
     {
    	 driver.manage().deleteAllCookies();
    	 driver.manage().window().maximize();
    	 driver.get(PropertyFileUtil.getValueForkey("URL"));
    	 
    	 boolean loadStatus=false;

    	 while(loadStatus==false) {

    	 try {
    	 driver.findElement(By.xpath("//input[@id='userId']")).isDisplayed();
    	 loadStatus=true;

    	 }catch(Exception e) {
    	 loadStatus=false;
    	 Thread.sleep(5000);
    	 }

    	 

    	 System.out.println("page loaded");

    	

    	 }
     }
     
     public static void closeBrowser(WebDriver driver) throws Throwable
     {
    	 driver.close();
    	 System.out.println("Browser closed");
     }
     
    
     
     public static void windowHandlesdiff(WebDriver driver) throws Throwable
     {
    	 //Set<String> allwindows=driver.getWindowHandles();
         //System.out.println(allwindows.size());
         
         String window1=driver.getWindowHandle();
         for(String windowHandle:driver.getWindowHandles())
         {
        	 if(!windowHandle.equals(window1))
        	 {
        		 driver.switchTo().window(windowHandle);
        	 }
         }

         String window2=driver.getWindowHandle();
         driver.close();
    	 Thread.sleep(30000);

         driver.switchTo().window(window1);
    	 Thread.sleep(30000);

     }
     public static void windowHandlesram(WebDriver driver) throws Throwable
     {
         Thread.sleep(5000);

    	/*  // psdbComponent.clickDocumentLink();
    	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    	    System.out.println("all windows :"+ tabs2 + driver.getTitle());
            Thread.sleep(30000);
            
            
    	    driver.switchTo().window(tabs2.get(1));
    	   // driver.close();
    	    //driver.switchTo().window(tabs2.get(0));
    	    System.out.println("windowHandle exexuted succesfully");*/
    	    
         String oldTab = driver.getWindowHandle();
  	    System.out.println("old window :"+ oldTab + driver.getTitle());

         //driver.findElement(By.linkText("Twitter Advertising Blog")).click();
         ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
 	    System.out.println("all windows :"+ newTab + driver.getTitle());

         newTab.remove(oldTab);
        // Thread.sleep(30000);

         // change focus to new tab
         driver.switchTo().window(newTab.get(0));
  	    System.out.println(" newwindow :"+ newTab + driver.getTitle());

         // Do what you want here, you are in the new tab

         //driver.close();
         System.out.println("windowHandle exexuted succesfully");
    	    
     }
     
     
  public static void windowHandles(WebDriver driver) throws Throwable
     {        
           Thread.sleep(5000);

    	   Set<String> allwindows=driver.getWindowHandles();
    	   
    	   System.out.println("all windows no :"+allwindows.size());
    	   Object[] windows=allwindows.toArray();
    	   
           String window1=windows[0].toString();
           System.out.println("window1 =" +window1+" "+driver.getTitle());
       
           String window2=windows[1].toString();
           System.out.println("window2 =" +window2+" "+driver.getTitle());
                System.out.println("'''''");
          Thread.sleep(20000);
          System.out.println("////");
         //driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);
             
          int j =1;
         for(String win : allwindows) {
        	 
        	 if(j==2){
        		 System.out.println("Entered ");
                 driver.switchTo().window(win);
                 System.out.println("Switched into expected");
        	 }
        	 j++;
		}

        System.out.println(driver.getTitle());

         System.out.println("windowHandle exexuted succesfully");
     }
     
    public static void windowHandles1(WebDriver driver,String data ) throws Throwable
     {
       /* String windowID;  
    	
    	 Set<String> st= driver.getWindowHandles();
    	 Iterator<String> it=st.iterator();
    	 while (Integer.parseInt(data)>0) {​​
    	 {​​
    	 windowID=it.next();
    	 Integer.parseInt(data)--;
    	 }​​
    	 driver.switchTo().window(windowID);
    	 }*/
    	
    	
     }
     
  
  
     public static void windowHandles10(WebDriver driver) throws Throwable
     {
    	 Set<String> allwindows=driver.getWindowHandles();
         System.out.println(allwindows.size());
         
          driver.switchTo().defaultContent();
 		 Thread.sleep(3000);

          String parentWin = driver.getWindowHandle();
         
         for(String winid : allwindows){
        	 
        	 if (!parentWin.equalsIgnoreCase(winid)) {
			
        		 Thread.sleep(2000);
        		 	driver.switchTo().window(winid);
        		 	
        		 	System.out.println("Switched to window : "+ winid);
        		 	try {
        		 		WebElement CNPHeading =  driver.findElement(By.xpath("//span[@class='createNewProcessSpan']"));
               		 
        		 		Thread.sleep(3000);
        		 		if (CNPHeading.isDisplayed()) {
							
        		 			
        		 			break;
        		 			
						}
        		 		
        		 		
					} catch (Exception e) {
						System.out.println("Moving to next window Element is not available");
					}
        		 
			}
        	 
         }
         
         
         
//         Object[] windows=allwindows.toArray();
//         String window1=windows[0].toString();
//         System.out.println("window1="+window1);
//
//         String window2=windows[1].toString();
//         System.out.println("window2="+window2);
//
//         Thread.sleep(80000);
        // driver.switchTo().window(window2);
     }
     public static void windowHandlesforIE1(WebDriver driver) throws Throwable
     {
    	 String parent = driver.getWindowHandle();

         // after clicking on the link
          Thread.sleep(1000);
          Set<String> availableWindows = driver.getWindowHandles();
          String newWindow = null;
          for (String window : availableWindows) {
              if (!parent.equals(window)) {
                  newWindow = window;
              }
          }
          assertNotNull(newWindow);

          // switch to new window
          driver.switchTo().window(newWindow);
          // do assert the elements in the new window
          // and then close the new window
         // driver.close();
          // switch to parent
          //driver.switchTo().window(parent);
          // close main window
         // driver.close();
     }
     public static void windowHandlesforIE(WebDriver driver) throws Throwable
     {

		
    		 Set<String> handles = driver.getWindowHandles();
 	        int size = handles.size();
 	       // WebElement we = driver.findElement(By.xpath(locaterValue));
 	        //we.click();
 	        Set<String> handles2 = null;
 	        int size2;
 	        do {
 	                handles2 = driver.getWindowHandles();
 	                size2 = handles2.size();
 	                Thread.sleep(250);
 	        } while(size2 - size != 1);
 	        handles2.removeAll(handles);
 	        String newWindowHandle = (String)handles2.toArray()[0];
 	        //return;
 	        String newWindowHandle1 = (String)handles2.toArray()[1];
	         Thread.sleep(50000);
 	         driver.switchTo().window(newWindowHandle1);
		 
	         	    	 
     }
     public static void windowHandlesforIE2(WebDriver driver) throws Throwable
     {
    	 
    	 String parentWindowHandle = driver.getWindowHandle();
    	 System.out.println("Parent window's handle -> " + parentWindowHandle);
    	 
    	 Thread.sleep(3000);
    	 
    	 Set<String> allWindowHandles = driver.getWindowHandles();
    	  System.out.println("allWindowHandles " +allWindowHandles);
    	 for(String handle : allWindowHandles)
    	 {
    	 driver.switchTo().window(handle); 
    	System.out.println("handle " + handle);
    	 }
		 
	         	    	 
     }
     
          // for uploading input file (ex: 05AAACG2115R1ZN-Demo_(1)_(3)_(1)_(1)_(1)_(1))
     public static void robotClass(WebDriver driver)
     {
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
     }
     //for uploading inout 	Document(ex: SourceFTP Document)
     public static void robotClass2(WebDriver driver)
     {
    	 StringSelection stringselection=new StringSelection("D:\\profile backup\\D drive\\SourceFTP Document.txt");
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
     }
     public static void robotClassforMaster1(WebDriver driver)
     {
    	 StringSelection stringselection=new StringSelection("D:\\profile backup\\D drive\\EE1.xlsx");
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
     }
     public static void robotClassforMaster2(WebDriver driver)
     {
    	 StringSelection stringselection=new StringSelection("D:\\profile backup\\D drive\\EEEE2.xlsx");
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
     }
     public static void robotClassforMaster3(WebDriver driver)
     {
    	 StringSelection stringselection=new StringSelection("C:\\Users\\sbijinepalli\\Desktop\\masterinput.xlsx");
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
     }
     
     
     
     public static void typeAction(WebDriver driver,String locaterType,String locaterValue,String data) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("id"))
    	 {
    		 driver.findElement(By.id(locaterValue)).clear();
    		 driver.findElement(By.id(locaterValue)).sendKeys(data);
    	 }else
    		 if(locaterType.equalsIgnoreCase("name"))
    		 {
    			 driver.findElement(By.name(locaterValue)).clear();
    			 driver.findElement(By.name(locaterValue)).sendKeys(data); 
    		 }else
    			 if(locaterType.equalsIgnoreCase("xpath"))
    			 {
    				 driver.findElement(By.xpath(locaterValue)).clear();
    				 driver.findElement(By.xpath(locaterValue)).sendKeys(data);
    			 }
     }
     public static void typeAction3SecurAthen(WebDriver driver,String locaterType,String locaterValue,String data) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
		 {
			 driver.findElement(By.xpath(locaterValue)).clear();
			 //driver.findElement(By.xpath(locaterValue)).sendKeys(data);
			 String t2=driver.findElement(By.xpath(locaterValue)).getAttribute("name");
    		 System.out.println(t2);
    		 Thread.sleep(2000);
    		 if(t2.contains("born"))
    		 {
    			 driver.findElement(By.xpath(locaterValue)).sendKeys(data);
    		 }else if(t2.contains("provider"))
             {
    		     driver.findElement(By.xpath(locaterValue)).sendKeys(data);
             }else if(t2.contains("grandmother"))
             {
            	 driver.findElement(By.xpath(locaterValue)).sendKeys(data);
             }else if(t2.contains("phone"))
             {
            	 driver.findElement(By.xpath(locaterValue)).sendKeys(data);
             }else if(t2.contains("landmark"))
             {
            	 driver.findElement(By.xpath(locaterValue)).sendKeys(data);
             }else if(t2.contains("owned?"))
             {
            	 driver.findElement(By.id(locaterValue)).sendKeys(data);
             }else if(t2.contains("Drink?"))
             {
            	 driver.findElement(By.id(locaterValue)).sendKeys(data);
             }    		    		    		     
	         }   	
     }
     public static void typeAction2SecurAthen(WebDriver driver,String locaterType,String locaterValue,String data) throws Throwable
     {
    	if(locaterType.equalsIgnoreCase("id"))
    	 {
    		 driver.findElement(By.id(locaterValue)).clear();
    		 //driver.findElement(By.name(locaterValue)).sendKeys(data); 
    		 String t1=driver.findElement(By.id(locaterValue)).getAttribute("data-placeholder");
    		 System.out.println(t1);
    		 Thread.sleep(2000);
    		 if(t1.contains("born"))
    		 {
    			 driver.findElement(By.id(locaterValue)).sendKeys(data);
    		 }else if(t1.contains("provider"))
             {
    		     driver.findElement(By.id(locaterValue)).sendKeys(data);
             }else if(t1.contains("grandmother"))
             {
            	 driver.findElement(By.id(locaterValue)).sendKeys(data);
             }else if(t1.contains("phone"))
             {
            	 driver.findElement(By.id(locaterValue)).sendKeys(data);
             }else if(t1.contains("landmark"))
             {
            	 driver.findElement(By.id(locaterValue)).sendKeys(data);
             }else if(t1.contains("brand"))
             {
            	 driver.findElement(By.id(locaterValue)).sendKeys(data);
             }else if(t1.contains("Soft"))
             {
            	 driver.findElement(By.id(locaterValue)).sendKeys(data);
             }else if(t1.contains("company"))
             {
            	 driver.findElement(By.id(locaterValue)).sendKeys(data);
             }     		    		    		 
    	 }else
    		 if(locaterType.equalsIgnoreCase("name"))
    		 {
    			 driver.findElement(By.name(locaterValue)).clear();
    			 //driver.findElement(By.name(locaterValue)).sendKeys(data); 
    			 String t1=driver.findElement(By.name(locaterValue)).getAttribute("data-placeholder");
        		 System.out.println(t1);
        		 Thread.sleep(2000);
        		 if(t1.contains("born"))
        		 {
        			 driver.findElement(By.name(locaterValue)).sendKeys(data);
        		 }else if(t1.contains("provider"))
                 {
        		     driver.findElement(By.name(locaterValue)).sendKeys(data);
                 }else if(t1.contains("grandmother"))
                 {
                	 driver.findElement(By.name(locaterValue)).sendKeys(data);
                 }else if(t1.contains("phone"))
                 {
                	 driver.findElement(By.name(locaterValue)).sendKeys(data);
                 }else if(t1.contains("landmark"))
                 {
                	 driver.findElement(By.id(locaterValue)).sendKeys(data);
                 }else if(t1.contains("brand"))
                 {
                	 driver.findElement(By.id(locaterValue)).sendKeys(data);
                 }else if(t1.contains("Soft"))
                 {
                	 driver.findElement(By.id(locaterValue)).sendKeys(data);
                 }else if(t1.contains("company"))
                 {
                	 driver.findElement(By.id(locaterValue)).sendKeys(data);
                 }       		    		    		 
    			 
         }else
    			 if(locaterType.equalsIgnoreCase("xpath"))
    			 {
    				 driver.findElement(By.xpath(locaterValue)).clear();
    				 //driver.findElement(By.xpath(locaterValue)).sendKeys(data);
    				 String t1=driver.findElement(By.xpath(locaterValue)).getAttribute("data-placeholder");
            		 System.out.println(t1);
            		 Thread.sleep(2000);
            		 if(t1.contains("born"))
            		 {
            			 driver.findElement(By.xpath(locaterValue)).sendKeys(data);
            		 }else if(t1.contains("provider"))
                     {
            		     driver.findElement(By.xpath(locaterValue)).sendKeys(data);
                     }else if(t1.contains("grandmother"))
                     {
                    	 driver.findElement(By.xpath(locaterValue)).sendKeys(data);
                     }else if(t1.contains("phone"))
                     {
                    	 driver.findElement(By.xpath(locaterValue)).sendKeys(data);
                     }else if(t1.contains("landmark"))
                     {
                    	 driver.findElement(By.xpath(locaterValue)).sendKeys(data);
                     }else if(t1.contains("name"))
                     {
                    	 driver.findElement(By.xpath(locaterValue)).sendKeys(data);
                     }else if(t1.contains("Soft"))
                     {
                    	 driver.findElement(By.xpath(locaterValue)).sendKeys(data);
                     }else if(t1.contains("company"))
                     {
                    	 driver.findElement(By.xpath(locaterValue)).sendKeys(data);
                     }  		    		    		     
       	         }   
    	}
     public static void SecurAthen(WebDriver driver,String locaterType,String locaterValue,String data) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
		 {
    		 driver.findElement(By.xpath(locaterValue)).clear();
			 //driver.findElement(By.xpath(locaterValue)).sendKeys(data);
			 String t1=driver.findElement(By.xpath(locaterValue)).getAttribute("data-placeholder");
    		 System.out.println(t1);
    		 Thread.sleep(2000);
    		 if(t1.contains("born") || t1.contains("provider") || t1.contains("grandmother") || t1.contains("phone") || t1.contains("landmark") || t1.contains("name")
    				 || t1.contains("Soft") || t1.contains("company"))
    		 {
    			 driver.findElement(By.xpath(locaterValue)).sendKeys(data);
    		 }
		 }
    	
              
     }
     
     public static void clickAction(WebDriver driver,String locaterType,String locaterValue) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("id"))
    	 {
    		 driver.findElement(By.id(locaterValue)).click();
    	 }else
    		 if(locaterType.equalsIgnoreCase("name"))
    		 {
    			  driver.findElement(By.name(locaterValue)).click();
    		 }else
    			 if(locaterType.equalsIgnoreCase("xpath"))
    			 {
    				 driver.findElement(By.xpath(locaterValue)).click();
    			 }
     }
     public static void enterAction(WebDriver driver,String locaterType,String locaterValue) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("id"))
    	 {
    		 driver.findElement(By.id(locaterValue)).sendKeys(Keys.ENTER);
    	 }else
    		 if(locaterType.equalsIgnoreCase("name"))
    		 {
    			  driver.findElement(By.name(locaterValue)).sendKeys(Keys.ENTER);
    		 }else
    			 if(locaterType.equalsIgnoreCase("xpath"))
    			 {
    				 driver.findElement(By.xpath(locaterValue)).sendKeys(Keys.ENTER);
    			 }
     }
    /* public static void pageDown(WebDriver driver,String locaterType,String locaterValue) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
    	 {
    		 driver.findElement(By.xpath(locaterValue)).sendKeys(Keys.PAGE_DOWN);
    		 System.out.println("PageDown method executed ");
    	 } 
    	 // Actions act=new Actions(driver);
    	 // act.sendKeys(Keys.PAGE_DOWN).build().perform();
     }*/
     public static void pageDown(WebDriver driver) throws Throwable
     {
    	
    	  Actions act=new Actions(driver);
    	  act.sendKeys(Keys.PAGE_DOWN).build().perform();
     }
   
     public static void isDisplayed(WebDriver driver,String locaterType,String locaterValue) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
    	 {
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			 driver.findElement(By.xpath(locaterValue)).click();
    			 System.out.println("isDispalyed method executed");
    		 }
    	 }
     }
     // in panindia, REquest is Completed or not for that Validation
     public static void isDisplayed_Request_completed(WebDriver driver,String locaterType,String locaterValue) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
    	 {
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			   String requestcompleted= driver.findElement(By.xpath(locaterValue)).getAttribute("title");
    			   System.out.println("Request State = "+  requestcompleted);
    		 }else
    		 {
    			   System.out.println("Request State =  IN PROGRESS");
    		 }
    	 }
     }
     public static void isSelected(WebDriver driver,String locaterType,String locaterValue) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
    	 {
    		 WebElement checkbox=driver.findElement(By.xpath(locaterValue));
    		 if(!checkbox.isSelected())
    		 {
    			 checkbox.click();
    			 System.out.println("checkbox(isSelected) method executed");
    		 }
    	 }
     }
     public static void validationofExpireDuration(WebDriver driver,String locaterType,String locaterValue,String expval) throws Throwable
     {
    	
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			 System.out.println("displayed");
    			   String actval= driver.findElement(By.xpath(locaterValue)).getText();
    			   String expectedValue=expval;//"Please enter expire duration";
    			   //System.out.println("Request State = "+  accessAPI);
    			   if(actval.equalsIgnoreCase(expectedValue))
                   {
	                    System.out.println("Expire Duration test case pass");
                   }else
                   {
	                    System.out.println("Expire Duration test case pass");

                   }
    		 
    		 }		    		 
    	 
     }
     public static void validationofMaxTokens(WebDriver driver,String locaterType,String locaterValue,String expval) throws Throwable
     {
    	
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			 System.out.println("displayed");
    			   String actval= driver.findElement(By.xpath(locaterValue)).getText();
    			   String expectedValue=expval;//"Please enter expire duration";
    			   //System.out.println("Request State = "+  accessAPI);
    			   if(actval.equalsIgnoreCase(expectedValue))
                   {
	                    System.out.println("Max Tokens test case pass");
                   }else
                   {
	                    System.out.println("Max Tokens test case pass");
                   }
    		 }		    		 
    	 
     }
     public static void UserMangmt_withoutfirstName(WebDriver driver,String locaterType,String locaterValue,String expval) throws Throwable
     {
    	
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			 System.out.println("displayed");
    			   String actval= driver.findElement(By.xpath(locaterValue)).getText();
    			   String expectedValue=expval;
    			   if(actval.equalsIgnoreCase(expectedValue))
                   {
	                    System.out.println("Validation of Without First Name field test case pass");
                   }else
                   {
	                    System.out.println("Validation of Without First Name field test case pass");
                   }
                   
    		 }		    		 
    	 
     }
     public static void UserMangmt_withoutLasttName(WebDriver driver,String locaterType,String locaterValue,String expval) throws Throwable
     {
    	
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			 System.out.println("displayed");
    			   String actval= driver.findElement(By.xpath(locaterValue)).getText();
    			   String expectedValue=expval;
    			   if(actval.equalsIgnoreCase(expectedValue))
                   {
	                    System.out.println("Validation of Without Last Name field test case pass");
                   }else
                   {
	                    System.out.println("Validation of Without Last Name field test case pass");
                   }
                   
    		 }		    		 
    	 
     }
     public static void UserMangmt_withoutUserID(WebDriver driver,String locaterType,String locaterValue,String expval) throws Throwable
     {
    	
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			 System.out.println("displayed");
    			   String actval= driver.findElement(By.xpath(locaterValue)).getText();
    			   String expectedValue=expval;
    			   if(actval.equalsIgnoreCase(expectedValue))
                   {
	                    System.out.println("Validation of Without UserId field test case pass");
                   }else
                   {
	                    System.out.println("Validation of Without UserId field test case pass");
                   }
                   
    		 }		    		 
    	 
     }
     public static void UserMangmt_withoutEmailID(WebDriver driver,String locaterType,String locaterValue,String expval) throws Throwable
     {
    	
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			 System.out.println("displayed");
    			   String actval= driver.findElement(By.xpath(locaterValue)).getText();
    			   String expectedValue=expval;
    			   if(actval.equalsIgnoreCase(expectedValue))
                   {
	                    System.out.println("Validation of Without EmailID field test case pass");
                   }else
                   {
	                    System.out.println("Validation of Without EmailID field test case pass");
                   }
                   
    		 }		    		 
    	 
     }
     public static void UserMangmt_chechingValidEmailID(WebDriver driver,String locaterType,String locaterValue,String expval) throws Throwable
     {
    	
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			 System.out.println("displayed");
    			   String actval= driver.findElement(By.xpath(locaterValue)).getText();
    			   String expectedValue=expval;
    			   if(actval.equalsIgnoreCase(expectedValue))
                   {
	                    System.out.println("Validation of Checking Valid EmailID test case pass");
                   }else
                   {
	                    System.out.println("Validation of Checking Valid EmailID test case pass perfect");
                   }
                   
    		 }		    		 
    	 
     }
     public static void UserMangmt_EmailIDalreadyhasbeenTaken(WebDriver driver,String locaterType,String locaterValue,String expval) throws Throwable
     {
    	
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			 System.out.println("displayed");
    			   String actval= driver.findElement(By.xpath(locaterValue)).getText();
    			   String expectedValue=expval;
    			   if(actval.equalsIgnoreCase(expectedValue))
                   {
	                    System.out.println("Validation of Checking EmailID already has been taken test case pass");
                   }else
                   {
	                    System.out.println("Validation of Checking EmailID already has been taken test case pass");
                   }
                   
    		 }		    		 
    	 
     }
     public static void UserMangmt_ChekingNumericsOnfirstName(WebDriver driver,String locaterType,String locaterValue,String expval) throws Throwable
     {
    	
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			 System.out.println("displayed");
    			   String actval= driver.findElement(By.xpath(locaterValue)).getText();
    			   String expectedValue=expval;
    			   if(actval.equalsIgnoreCase(expectedValue))
                   {
	                    System.out.println("Validation of Numerics On First Name field test case pass");
                   }else
                   {
	                    System.out.println("Validation of Numerics On First Name field test case pass");
                   }
                   
    		 }		    		 
    	 
     }
     public static void UserMangmt_ChekingNumericsOnLastName(WebDriver driver,String locaterType,String locaterValue,String expval) throws Throwable
     {
    	
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			 System.out.println("displayed");
    			   String actval= driver.findElement(By.xpath(locaterValue)).getText();
    			   String expectedValue=expval;
    			   if(actval.equalsIgnoreCase(expectedValue))
                   {
	                    System.out.println("Validation of Numerics On Last Name field test case pass");
                   }else
                   {
	                    System.out.println("Validation of Numerics On Last Name field test case pass");
                   }
                   
    		 }		    		 
    	 
     }
     public static void UserMangmt_min6charsofUserID(WebDriver driver,String locaterType,String locaterValue,String expval) throws Throwable
     {
    	
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			 System.out.println("displayed");
    			   String actval= driver.findElement(By.xpath(locaterValue)).getText();
    			   String expectedValue=expval;
    			   if(actval.equalsIgnoreCase(expectedValue))
                   {
	                    System.out.println("Validation of min 6 charecters UserId field test case pass");
                   }else
                   {
	                    System.out.println("Validation of min 6 charecters UserId field test case pass");
                   }
                   
    		 }		    		 
    	 
     }
     public static void UserMangmt_checkngSpacesOfUserID(WebDriver driver,String locaterType,String locaterValue,String expval) throws Throwable
     {
    	
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			 System.out.println("displayed");
    			   String actval= driver.findElement(By.xpath(locaterValue)).getText();
    			   String expectedValue=expval;
    			   if(actval.equalsIgnoreCase(expectedValue))
                   {
	                    System.out.println("Validation of checking spaces and special chars of UserId field test case pass");
                   }else
                   {
	                    System.out.println("Validation of checking spaces and special chars of UserId field test case pass");
                   }
                   
    		 }		    		 
    	 
     }
     public static void UserMangmt_checkngDuplicateUserID(WebDriver driver,String locaterType,String locaterValue,String expval) throws Throwable
     {
    	
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			 System.out.println("displayed");
    			   String actval= driver.findElement(By.xpath(locaterValue)).getText();
    			   String expectedValue=expval;
    			   if(actval.equalsIgnoreCase(expectedValue))
                   {
	                    System.out.println("Validation of Checking Duplicate UserId test case pass");
                   }else
                   {
	                    System.out.println("Validation of Checking Duplicate UserId test case pass");
                   }
                   
    		 }		    		 
    	 
     }
     public static void isDisplayedAPI(WebDriver driver,String locaterType,String locaterValue) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
    	 {
    		 if(driver.findElement(By.xpath(locaterValue)).isDisplayed())
    		 {
    			
    			 System.out.println("isDispalyed method executed");
    		 }
    	 }
     }
    /* public static void isSelecteds(WebDriver driver,String locaterType,String locaterValue) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
    	 {
    		List<WebElement> list= driver.findElements(By.xpath(locaterValue));
    		System.out.println(list.size());
    		for(int i=1;i<list.size();i++)
    		{
    			String chekbox1=list.get(i).getText();
    			
    		}
    		
    	 }
     }*/
     public static void isClickable(WebDriver driver,String locaterType,String locaterValue,String waittime ) throws Throwable
     {
    	 WebDriverWait wait=new WebDriverWait(driver, Integer.parseInt(waittime));
    	 if(locaterType.equalsIgnoreCase("xpath"))
     	{
    		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locaterValue)));
    		 System.out.println("Element Clickable:  isClickable- Methos Executed");
     	}
     }
     public static void isClickableAccessAPI(WebDriver driver,String locaterType,String locaterValue,String waittime ) throws Throwable
     {
    	 WebDriverWait wait=new WebDriverWait(driver, Integer.parseInt(waittime));
    	 if(locaterType.equalsIgnoreCase("xpath"))
     	{
    		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locaterValue)));
    		 System.out.println("Element Clickable:  clientID not clickable ");
     	}
     	  		     
     	
     }
     
     public static void waitForanElement(WebDriver driver,String locaterType,String locaterValue,String waittime) throws Throwable
     {
    	WebDriverWait wait=new WebDriverWait(driver, Integer.parseInt(waittime));
    	if(locaterType.equalsIgnoreCase("id"))
    	{
    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locaterValue)));
    		//wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.id(locaterValue))));
    	}else
    		if(locaterType.equalsIgnoreCase("name"))
        	{
        		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locaterValue)));
        		//wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.name(locaterValue))));
        	}else
        		if(locaterType.equalsIgnoreCase("xpath"))
            	{
            		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locaterValue)));
            		//wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.xpath(locaterValue))));
            	}
     }
     public static void waitForinvisibilityOfElement(WebDriver driver,String locaterType,String locaterValue,String waittime) throws Throwable
     {
    	WebDriverWait wait=new WebDriverWait(driver, Integer.parseInt(waittime));
    	if(locaterType.equalsIgnoreCase("id"))
    	{
    		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(locaterValue)));
    		//wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.id(locaterValue))));
    	}else
    		if(locaterType.equalsIgnoreCase("name"))
        	{
        		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(locaterValue)));
        		//wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.name(locaterValue))));
        	}else
        		if(locaterType.equalsIgnoreCase("xpath"))
            	{
            		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locaterValue)));
            		//wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.xpath(locaterValue))));
            	}
     }
     public static void refresh(WebDriver driver,String locaterType,String locaterValue,String waittime)
     {
    	 WebDriverWait wait=new WebDriverWait(driver, Integer.parseInt(waittime));
    	 if(locaterType.equalsIgnoreCase("id"))
     	{
     		wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.id(locaterValue))));
     	}else
     		if(locaterType.equalsIgnoreCase("name"))
         	{
         		wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.name(locaterValue))));
         	}else
         		if(locaterType.equalsIgnoreCase("xpath"))
             	{
             		wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.xpath(locaterValue))));
             	}
    	 System.out.println("refresh method executed");
     }
     
     public static void delay(WebDriver driver,String data) throws Throwable
     {
    	 Thread.sleep(Integer.parseInt(data));
    	 //System.out.println("deley method Executed");
     }
     
     
   
     public static void captureData(WebDriver driver,String locaterType,String locaterValue) throws Throwable
     {
    	 String Data="";
    	 Thread.sleep(2000);
    	 if(locaterType.equalsIgnoreCase("id"))
    	 {
    		 Data=driver.findElement(By.id(locaterValue)).getAttribute("value");
    	 }else
    		 if(locaterType.equalsIgnoreCase("name"))
        	 {
        		 Data=driver.findElement(By.name(locaterValue)).getAttribute("value");
        	 }else
        		 if(locaterType.equalsIgnoreCase("xpath"))
            	 {
            		 Data=driver.findElement(By.xpath(locaterValue)).getAttribute("value");
            	 }
    	 FileWriter fw=new FileWriter("D:\\profile backup\\D drive\\workspace\\test3\\CaptureData\\Data.txt");
    	 BufferedWriter bw=new BufferedWriter(fw);
    	 bw.write(Data);
    	 bw.close();
     }
     
     //integretion's tablevalidation
     public static void tableValidation1(WebDriver driver,String column) throws Throwable
     {
    	 FileReader fr=new FileReader("D:\\profile backup\\D drive\\workspace\\test3\\CaptureData\\Data.txt");
    	 BufferedReader br=new BufferedReader(fr);
    	 String exp_data=br.readLine();
    	 System.out.println("Expected Data"+exp_data);
    	 int columnum=Integer.parseInt(column);
    	 
    	 WebElement webtable=driver.findElement(By.xpath(PropertyFileUtil.getValueForkey("webtable1")));
    	 //row count
    	 List<WebElement> rows=webtable.findElements(By.tagName("tr"));
    	 for(int i=1;i<=rows.size();i++)
    	 {
    		 String act_data=driver.findElement(By.xpath("//table[@class='mat-elevation-z8 pAdjust mat-table ng-tns-c37-343 ng-star-inserted']//tr["+i+"]//td["+columnum+"]")).getText();
    		 System.out.println("Actual Data"+act_data);
    		 Assert.assertEquals(act_data, exp_data);
    		 
    	 }
     }
     
     //locations table validation
     public static void tableValidation2(WebDriver driver,String column) throws Throwable
     {
    	 FileReader fr=new FileReader("D:\\profile backup\\D drive\\workspace\\test3\\CaptureData\\Data.txt");
    	 BufferedReader br=new BufferedReader(fr);
    	 String exp_data=br.readLine();
    	 System.out.println("Expected Data"+exp_data);
    	 int columnum=Integer.parseInt(column);
    	 
    	 WebElement webtable=driver.findElement(By.xpath(PropertyFileUtil.getValueForkey("webtable2")));
    	 //row count
    	 List<WebElement> rows=webtable.findElements(By.tagName("tr"));
    	 for(int i=1;i<=rows.size();i++)
    	 {
    		 String act_data=driver.findElement(By.xpath("//table[contains(@class,'mat-elevation-z8 pAdjust mat-table ng-tns-c39-213 ng-star-inserted')]//tr["+i+"]//td["+columnum+"]")).getText();
    		 System.out.println("Actual Data"+act_data);
    		 Assert.assertEquals(act_data, exp_data);
    		 
    		 if(act_data.contains(exp_data))
    		 {
    			 driver.findElement(By.xpath("//table[contains(@class,'mat-elevation-z8 pAdjust mat-table ng-tns-c39-213 ng-star-inserted')]//tr["+i+"]//td["+columnum+"]")).click(); 
    		 }
    		 	 
    	 }
    	 
     }
     
     
     public static String generateDate() throws Throwable
     {
         Date date=new Date();
         SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy--hh-mm-ss");
         return sdf.format(date);
     }
     
     
     public static void titleValidation(WebDriver driver,String exp_data) throws Throwable
     {
    	 String act_data=driver.getTitle();
    	 Thread.sleep(2000);
    	 if(exp_data.equalsIgnoreCase(act_data))
    	 {
    		 System.out.println("Title Matched");
    	 }else
    	 {
    		 System.out.println("Title Miss Matched");
    	 }
     }
    
     //OutWard E-Way Bill BulkActions
     public static void BulkActionValidations(WebDriver driver,String locaterType,String  locaterValue,String exp_data)
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
    	 {
    		 String  act_data=driver.findElement(By.xpath(locaterValue)).getText();
    		 System.out.println("Actual Data: "+act_data);
    		 if(act_data.contains(exp_data))
    		 {
    			 System.out.println("Sussesfully BulkActions Performed :  "+act_data);
    		 }else
    		 {
    			 System.out.println("Not BulkActionsPerformed");
    		 }
    	 }
     }
     
     public static void isDisplayed_UpdateCancelEWayBill(WebDriver driver,String locaterType,String  locaterValue,String exp_data)
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
    	 {
    		 String  act_data=driver.findElement(By.xpath(locaterValue)).getText();
    		 System.out.println("Actual Data: "+act_data);
    		 if(act_data.contains(exp_data))
    		 {
    			 System.out.println("Sussesfully Update Cancel EWay Bill:  "+act_data);
    		 }else
    		 {
    			 System.out.println("Not Update Cancel EWay Bill");
    		 }
    	 }
     }
     
     
     //documentNumberValidation and upper one(BulkActionValidations) Methods Behaviour both are same : (--Remember--)
     
     //panIndia sheet documentValidation
     public static void documentNumberValidation(WebDriver driver,String locaterType,String  locaterValue,String exp_documentNum) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
    	 {
    		 String act_documentNum=driver.findElement(By.xpath(locaterValue)).getText();
    		 System.out.println("Atc_DocumentNum: "+act_documentNum);
    		 if(act_documentNum.contains(exp_documentNum))
    		 {
    			 System.out.println("Exp.DocumentNum : "+ exp_documentNum  +"  and  Atc_DocumentNum  :" 
    		 + act_documentNum  +"  DocumentNumber Matched");
    		 }
    		 else
    		 {
    			 System.out.println("Exp.DocumentNum : "+ exp_documentNum  +"  and  Atc_DocumentNum  :" 
    		 + act_documentNum  +"  DocumentNumber Miss Matched");
    		 }
    		 
    	 }
     }
     //OutwardE-WayBill sheet reportsValidation
     public static void reportsValidate(WebDriver driver,String locaterType,String locaterValue) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
		 {
			 String portalNum=driver.findElement(By.xpath(locaterValue)).getAttribute("title");
			 System.out.println("PortalNumber: "+portalNum);
			 if(portalNum.contains("--"))
			 {
				 System.out.println("Government PortalNo.= "+portalNum+" reports not generated");
			 }else
			 {
				 //driver.findElement(By.xpath(locaterValue)).click();
				 System.out.println("Government PortalNo.="+portalNum+" reports Sussesfully generated ");
			 }
		 }
     }
    /* public static void scrolldown2(WebDriver driver, String locaterType,String locaterValue) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
    	 {
    	 Robot robot=new Robot();
    	 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
    	 robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    	 }
     }*/
  
     /*public static void scrollDown(WebDriver driver,String data)
     {
    	 while(!(driver.findElement(By.xpath(data)).isDisplayed()))
    	 {
    		 driver.findElement(By.xpath(data)).sendKeys(Keys.ARROW_DOWN);
    	 }
     }*/
     
     /*public static void iterationScroll(WebDriver driver,ArrayList<String> outputList,ArrayList<ArrayList<String>> mainList)
     {
    	 int i=4;
    	 while(i<=6)
    	 {
    		 Actions act=new Actions(driver);
    		 WebElement From=driver.findElement(By.xpath("(//*[contains(@class,'slimScrollBar')])[2]"));
    		 act.dragAndDropBy(From, 135, 120).build().perform();
    		 
    		 String xpath= "//div[contains(@class,'row"+i+"')]";
    		 WebElement allRows=driver.findElement(By.xpath(xpath));
    		 
    		 List<WebElement> cells=allRows.findElements(By.tagName("div"));
    		 
    		 outputList.clear();
    		 for(int k=0;k<cells.size();k++)
    		 {
    			 String cellValue=cells.get(k).getText();
    			 outputList.add(cellValue);
    			 
    		 }
    		 
    		 System.out.println("=========="+(i+4)+"==========");
    		 mainList.add(outputList);
    		 i++;
    		 
    	 }
     }*/
     // This is for Scrolling  Small
      public static void scrollPageDownByActions(WebDriver driver,String locaterType,String locaterValue) throws Throwable
     {  	 //this mwthod is for scrollbar is visible permenently ,and it will drag the scroll littlebit only
    	  
    	  if(locaterType.equalsIgnoreCase("xpath"))
    	  {
      		 Actions act=new Actions(driver);
    		 WebElement From=driver.findElement(By.xpath(locaterValue));
    		 act.dragAndDropBy(From, 135, 50).build().perform();
                    //normal values(From, 135,120)
    		 System.out.println(" scrollPageDownByActions :  Executed");
    	  }
     }
      
      //This  is for Scrolling Large
      public static void scrollPageDownByActionsLarge(WebDriver driver,String locaterType,String locaterValue) throws Throwable
      {  	 //this mwthod is for scrollbar is visible permenently ,and it will drag the scroll large
     	  
     	  if(locaterType.equalsIgnoreCase("xpath"))
     	  {
       		 Actions act=new Actions(driver);
     		 WebElement From=driver.findElement(By.xpath(locaterValue));
     		 act.dragAndDropBy(From, 135, 120).build().perform();
                     //normal values(From, 135,120)
     		 System.out.println(" scrollPageDownByActionsLarge :  Executed");
     	  }
      }
     /* public static void scrollPageDownLarge(WebDriver driver,String locaterType,String locaterValue) throws Throwable
      {  	  
       		 Actions act=new Actions(driver);
     		 WebElement From=driver.findElement(By.xpath(locaterValue));
     		 act.dragAndDropBy(From, 135, 180).build().perform();
                     //normal values(From, 135,120)
      }*/
      
      
      public static void scrollPageDownByJavaScript(WebDriver driver,String locaterType,String locaterValue)  throws Throwable
      {  //this method for if scrollbar is not visible permenently means it will be appeared only 2 secns, and scroll dragged by upto element
    	  
    	  if(locaterType.equalsIgnoreCase("xpath"))
    	  {
      		 WebElement Element=driver.findElement(By.xpath(locaterValue));
      		 JavascriptExecutor js=(JavascriptExecutor) ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Element);		  
    	     System.out.println(" scrollPageDownByJavaScript  :  Executed");
    	  }
      }
      // Both methods(behaviour) are same, just we changed the methode name that's it
      public static void scrollPageUpByJavaScript(WebDriver driver,String locaterType,String locaterValue)  throws Throwable
      {  //this method for if scrollbar is not visible permenently means it will be appeared only 2 secns, and scroll dragged by upto element
    	  
    	  if(locaterType.equalsIgnoreCase("xpath"))
    	  {
      		 WebElement Element=driver.findElement(By.xpath(locaterValue));
      		 JavascriptExecutor js=(JavascriptExecutor) ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Element);		  
    	     System.out.println(" scrollPageUpByJavaScript  :  Executed");
    	  }
      }
      public static void JavaScriptClick(WebDriver driver,String locaterType,String locaterValue)  throws Throwable
      {  //this method for if scrollbar is not visible permenently means it will be appeared only 2 secns, and scroll dragged by upto element
    	  
    	  if(locaterType.equalsIgnoreCase("xpath"))
    	  {
      		 WebElement Element=driver.findElement(By.xpath(locaterValue));
      		 JavascriptExecutor js=(JavascriptExecutor) ((JavascriptExecutor)driver).executeScript("arguments[0].click();", Element);		  
    	     System.out.println(" JavaScriptClick  :  Executed");
    	  }
      }
      
      
     /* public static void scrollPageDownlarge(WebDriver driver,String locaterType,String locaterValue) throws Throwable
      {  	  
       		 Actions act=new Actions(driver);
     		 WebElement From=driver.findElement(By.xpath(locaterValue));
     		 act.dragAndDropBy(From, 135, 150).build().perform();
                     //normal values(From, 135,120)
      }*/
     /* public static void scrollJavaScript(WebDriver driver){
  		
  		JavascriptExecutor js= ((JavascriptExecutor)driver);
  		js.executeScript("window.scrollBy(0,2000)");
  	}*/
      
     public static void handleAlerts(WebDriver driver,String data)
     { 
    		 String message=driver.switchTo().alert().getText();
    		 System.out.println(message);
    		 if(message.contains(data))
    		 {
    			 driver.switchTo().alert().accept();
    			 System.out.println("Alert accepted Succesfully");
    		 }else
    		 {
    			 driver.switchTo().alert().dismiss();
    			 System.out.println("Alert Dismissed");
    		 }
    		 
     }
     public static void handleAlerts2(WebDriver driver,String locaterType,String locaterValue,String data) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
    	 {
    		 driver.findElement(By.xpath(locaterValue)).click();
    		 Thread.sleep(3000);
    		 String message=driver.switchTo().alert().getText();
    		 System.out.println(message);
    		 if(message.contains(data))
    		 {
    			 driver.switchTo().alert().accept();
    			 System.out.println("Alert accepted Succesfully");
    		 }else
    		 {
    			 driver.switchTo().alert().dismiss();
    		 }
    	 }
     }
     
     public static void datePicker(WebDriver driver,String locaterType,String locaterValue,String date) throws Throwable
     {
    	
    			 if(locaterType.equalsIgnoreCase("xpath"))
    			 {
    				 driver.findElement(By.xpath(locaterValue)).click();
    				 Thread.sleep(3000);
    				 driver.findElement(By.xpath("//*[@aria-label='Choose month and year']")).click();
    				 
    				 String appdate=date;
    				 
    				 String[] temp=appdate.split("/");
    				 String dt= temp[0];
    				 String month=temp[1];
    				 String year=temp[2];
    				 System.out.println("splitted successfully");

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
    			 
    				 System.out.println("date selected successfully");
    				 
    				
    			 }
     }
     public static void datePicker2(WebDriver driver,String locaterType,String locaterValue,String date) throws Throwable
     {
    	
    			 if(locaterType.equalsIgnoreCase("xpath"))
    			 {
    				 driver.findElement(By.xpath(locaterValue)).click();
    				 //driver.findElement(By.xpath(locaterValue)).sendKeys(date);
    				 String appdate=date;
    				 
    				 String[] temp=appdate.split("/");
    				 String dt= temp[0];
    				 String month=temp[1];
    				 String year=temp[2];
    				 
     				 String calyear,calmonth,caldt;
     				 
    				 //first step here: wehave to click the calender icon in application by using of clickAction, 
     				 //and we have to menction that method  in exelsheet, after in next row we have to call this 
     				 //datePicker method
     				 driver.findElement(By.xpath(locaterValue)).click();
     				 
    				 calyear =driver.findElement(By.xpath("//*[contains(@class,'custom-select')][2]")).getText(); 
    				 while(!calyear.equalsIgnoreCase(year))
    				 {
    					//next month(<)  xpath here
    					 driver.findElement(By.xpath("//*[contains(@class,'ngb-dp-arrow right')]/button")).click(); 
    					 driver.findElement(By.xpath("//*[contains(@class,'custom-select')][2]")).getText();
    				 }
    				 
    				 calmonth=driver.findElement(By.xpath("//*[contains(@class,'custom-select')][1]")).getText();
    				 while(!calmonth.equalsIgnoreCase(month))
    				 {
    					//next month(<)  xpath here
    					 driver.findElement(By.xpath("//*[contains(@class,'ngb-dp-arrow right')]/button")).click();
    					 calmonth= driver.findElement(By.xpath("//*[contains(@class,'custom-select')][1]")).getText();
    				 }
    				 
    				 //code for select date from the table
    				 WebElement cal=driver.findElement(By.xpath("//*[contains(@class,'ngb-dp-months')]"));
    				 List<WebElement> rows,cols;
    				 rows=cal.findElements(By.tagName("div"));
    				 boolean flag= false;
    				 for(int i=1;i<rows.size();i++)
    				 {
    					 cols=rows.get(i).findElements(By.tagName("span"));
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
    				 
    				 System.out.println("datePicker2 method executed");
    			 }
     }
     //datepicker for  Dashboard
     public static void datePicker3(WebDriver driver,String locaterType,String locaterValue,String date) throws Throwable
     {
    	
    			 if(locaterType.equalsIgnoreCase("xpath"))
    			 {
    				 driver.findElement(By.xpath(locaterValue)).click();
    				 //driver.findElement(By.xpath(locaterValue)).sendKeys(date);
    				 String appdate=date;
    				 
    				 String[] temp=appdate.split("/");
    				 String dt= temp[0];
    				 String month=temp[1];
    				 String year=temp[2];
    				 System.out.println("splitted successfully");
    				 
                     Select select=new Select(driver.findElement(By.xpath("//*[contains(@class,'custom-select')][1]"))); //monthxpath
                     select.selectByVisibleText(month);
                     Thread.sleep(2000);
                     System.out.println("Month selected");
                     
                     
                     Select select1=new Select(driver.findElement(By.xpath("//*[contains(@class,'custom-select')][2]"))); //yearxpath
                     select1.selectByVisibleText(year);
                     Thread.sleep(2000);
                     System.out.println("Year selected");
                     
                     
           //These are observation xpaths(means absuluetxpaths)          
                   //body/app-root/div/div/div/ng-component/div/div/div/dashboard-detail/div/span[contains(text(),'-')]/span/
                   //datepicker/div/ngb-datepicker/div/div/ngb-datepicker-month-view/div[2]
                   //body/app-root/div/div/div/ng-component/div/div/div/dashboard-detail/div/span[contains(text(),'-')]/span/
                   //datepicker/div/ngb-datepicker/div/div/ngb-datepicker-month-view/div[3]
                   //body/app-root/div/div/div/ng-component/div/div/div/dashboard-detail/div/span[contains(text(),'-')]/span/
                   //datepicker/div/ngb-datepicker/div/div/ngb-datepicker-month-view/div[4]
                     
          //These are Relational xpaths(means including the from columns,rows onwards)  plz... abserve both(above&bellow) xpaths 
          // are same , (just for obervation we have taken 3/4 xpaths including the from columns & rows )
                     
                   //span[contains(text(),'-')]//div[3]//div[1]
                   //span[contains(text(),'-')]//div[3]//div[2]
                   //div[3]//div[7]
                     
                     String beforexpath="//span[contains(text(),'-')]//div[";
                     String afterxpath="]//div[";
                     
                     final int totalweekdays=7;
                     
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
                    	  
                      }
                                     
    				
    			 }
     }
     
     public static void datepickerByJS(WebDriver driver,String locaterType,String locaterValue, String dateval)
     {                                                 
    	                                           
    	 if(locaterType.equalsIgnoreCase("xpath"))
    	 {
    	 WebElement element=driver.findElement(By.xpath(locaterValue));
    	 
    	 JavascriptExecutor js=(JavascriptExecutor) ((JavascriptExecutor)driver).
    	 executeScript("orguments[0].setAttribute('element.value','"+dateval+"');", element);
    	 
    	 //JavascriptExecutor js=(JavascriptExecutor) ((JavascriptExecutor)driver).
    	 //executeScript("orguments[0].setAttribute('element.getAttribute(value)','"+dateval+"');", element);
    	 
    	 //JavascriptExecutor js=  (JavascriptExecutor) ((JavascriptExecutor)driver).
    		//	 executeScript("document.getElementById(element).value='"+dateval+"'",element);
    	 }
     }
     
     
     public static void example_VerifyExpectedFileName(WebDriver driver,String locaterType,String locaterValue) 
     {
 		String downloadPath="‪D:\\profile backup\\SeleniumDownlodedFiles";
 		
 	    if(locaterType.equalsIgnoreCase("xpath"))
 	    {
 	    	driver.findElement(By.xpath(locaterValue)).click();
 	    	System.out.println("Download/JSON link clicked");
 	    	
 	    File getLatestFile = getLatestFilefromDir(downloadPath);
 	    String fileName = getLatestFile.getName();
 	    Assert.assertTrue(fileName.equals(locaterValue), "Downloaded file name is not matching with expected file name");
 	   System.out.println("example_VerifyExpectedFileName : executed");
 	    }
 	}
     /* Get the latest file from a specific directory*/
 	public static File getLatestFilefromDir(String dirPath)
 	{
 	    File dir = new File(dirPath);
 	    File[] files = dir.listFiles();
 	    if (files == null || files.length == 0) 
 	    {
 	        return null;
 	    }
 	
 	    File lastModifiedFile = files[0];
 	    for (int i = 1; i < files.length; i++)
 	    {
 	       if (lastModifiedFile.lastModified() < files[i].lastModified()) 
 	       {
 	           lastModifiedFile = files[i];
 	          System.out.println("getLatestFilefromDir : executed");
 	       }
 	    }
 	    return lastModifiedFile;
 	   
 	}
    /* public static File getLatestFilefromDir(String dirPath)
     {
    	 File dir=new File(dirPath);
    	 File[] files=dir.listFiles();
    	 if(files==null || files.length==0)
    	 {
    		 return null;
    	 }
    	 
    	 File lastModifiedFile = files[0];
    	 for(int i=1;i<files.length;i++)
    	 {
    		 if(lastModifiedFile.lastModified()< files[i].lastModified())
    		 {
    			 lastModifiedFile =files[i];
    		 }
    	 }
    	 return lastModifiedFile;
     }*/
 	
 	 public static void PerticularViewIconinMasters(WebDriver driver,String locaterType,String locaterValue) throws Throwable
     {
    	 if(locaterType.equalsIgnoreCase("xpath"))
		 {
			 String Text=driver.findElement(By.xpath(locaterValue)).getText();
			 System.out.println("PortalNumber: "+Text);
			 if(Text.contains(" remove_red_eye "))
			 {
				 driver.findElement(By.xpath(locaterValue)).click();
			 }else
			 {
				 System.out.println("Text not clickable");
			 }
		 }
     }
    


     
}
