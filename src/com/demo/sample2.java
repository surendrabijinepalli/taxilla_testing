package com.demo;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Extensions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://qa.taxilla.com");
		Thread.sleep(3000);
		driver.findElement(By.id("userId")).sendKeys("krishna");
		Thread.sleep(3000);
		driver.findElement(By.id("userPassword")).sendKeys("Taxilla@2020");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='signinmaindiv']/div/mat-card/div/div[2]/mat-drawer-container/mat-drawer-content/div/div[3]/material-button/button/span")).click();
		Thread.sleep(3000);
		
         String t1=driver.findElement(By.xpath("//div[@class='ng-star-inserted']/div[1]//div/div/div/input")).getAttribute("id");
         System.out.println(t1);
         Thread.sleep(5000);
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
         			}
         	
       WebElement q2=driver.findElement(By.xpath("//div[@class='ng-star-inserted']/div[2]//div/div/div/input"));
       String t2=q2.getAttribute("id");
       System.out.println(t2);
       Thread.sleep(5000);
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
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
       
       //Thread.sleep(10000);
      // if(driver.findElement(By.xpath("//div[@class='mat-form-field-infix']/input")).isDisplayed())
      // {
    	      Thread.sleep(30000);
    	     // driver.findElement(By.xpath("//*[@id='mat-input-6']")).sendKeys("Outward E-Way Bills");
    	  driver.findElement(By.xpath("//div[@class='mat-form-field-infix']/input")).sendKeys("Outward E-Way Bills");
    	
    	 // driver.findElement(By.xpath("(//*[contains(text(),'Serch Apps')])[1]")).sendKeys("Outward E-Way Bills");
    	
    	   //driver.findElement(By.xpath("//div[@class='mat-form-field-infix']/input")).sendKeys("Outward E-Way Bills");
    	   
    	      Thread.sleep(5000);
    	  // driver.findElement(By.xpath("(//*[contains(text(),'Serch Apps')])[1]")).sendKeys(Keys.ENTER);
    	   driver.findElement(By.xpath("//div[@class='mat-form-field-infix']/input")).sendKeys(Keys.ENTER);
       //}
       Thread.sleep(10000);
       driver.findElement(By.xpath("(//*[contains(text(),'Process Now')])[1]")).click();
       Thread.sleep(10000);
       Set<String> allwindows=driver.getWindowHandles();
       System.out.println(allwindows);
       
       Object[] windows=allwindows.toArray();
       String window1=windows[0].toString();
       String window2=windows[1].toString();
       Thread.sleep(30000);
       driver.switchTo().window(window2);
       Thread.sleep(60000);
       
       
       driver.findElement(By.xpath("(//*[contains(text(),'Upload')])[2]")).click();
       Thread.sleep(30000);
       driver.findElement(By.xpath("//*[@id='mat-select-1']")).click();
       //E-waybill-Inbound-1.03
      // Thread.sleep(30000);
       ////driver.findElement(By.xpath("//*[@id='mat-select-1']")).sendKeys("E-waybill-Inbound-1.03");
       //driver.findElement(By.xpath("//*[@id='cdk-overlay-3']/div/div")).sendKeys(Keys.PAGE_DOWN);
     //*[@id="cdk-overlay-3"]/div/div
       Thread.sleep(30000);
       driver.findElement(By.xpath("//*[contains(text(),' E-waybill-Inbound-1.03 ')]")).click();
       
       
       Thread.sleep(5000);
       driver.findElement(By.xpath("(//*[contains(text(),' Browse ')])[3]")).click();
       Thread.sleep(10000);
       
       
       StringSelection stringselection=new StringSelection("C:\\Users\\sbijinepalli\\Desktop\\05AAACG2115R1ZN-Demo_(1)_(3)_(1)_(1)_(1)_(1).xlsx");
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
       driver.findElement(By.xpath("(//*[contains(text(),' Upload ')])[5]")).click();
       
       Thread.sleep(10000);
       driver.findElement(By.xpath("//div[@class='invoiceFeedItem_details row']")).click();
       Thread.sleep(10000);
       driver.findElement(By.xpath("//*[contains(text(),'refresh')]")).click();
       Thread.sleep(10000);
       driver.findElement(By.xpath("(//*[contains(text(),' E-Way Bill # ')])[1]")).click();
       Thread.sleep(10000);
       driver.findElement(By.xpath("(//*[contains(text(),' Reports ')])[1]")).click();
       Thread.sleep(20000);
       String portalnum=driver.findElement(By.xpath("(//*[@class='col-xs-6 no-padding feedValue'])[1]")).getAttribute("title");
       if(portalnum.contains(" "))
       {
    	   System.out.println(portalnum+" "+ ": reports not generated");
       }else
       {
    	   System.out.println(portalnum+" "+": reports generated");
       }
	}
	

}
