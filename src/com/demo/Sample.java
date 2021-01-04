package com.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hslf.record.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;






public class Sample {

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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='signinmaindiv']/div/mat-card/div/div[2]/mat-drawer-container/mat-drawer-content/div/div[3]/material-button/button/span")).click();
		Thread.sleep(3000);
		
         String t1=driver.findElement(By.xpath("//div[@class='ng-star-inserted']/div[1]//div/div/div/input")).getAttribute("id");
         System.out.println(t1);
         Thread.sleep(2000);
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
             
       
       
       
       Thread.sleep(50000);
    
                //driver.findElement(By.xpath("//button[@class='settingsCurtainMatMenuButton nav-item mat-button']//i[1]")).click();
       // driver.findElement(By.xpath("//button[@class='settingsCurtainMatMenuButton nav-item mat-button']//i")).click();
                 //Thread.sleep(2000);
       
                //driver.findElement(By.xpath("//div[@class='mat-menu-content']//div[3]/button")).click();
             
       driver.findElement(By.xpath("//body/app-root/div[@id='mainRouterContainer']/app-organizations[@class='ng-star-inserted']/div[@id='postLoginContainer']/app-postloginheader/app-taxilla-header/mat-toolbar[@class='postLoginHeaderToobar mat-toolbar mat-toolbar-multiple-rows']/mat-toolbar-row[@class='postLoginHeader mat-toolbar-row']/ul[@class='navbar-nav']/li[2]/button[1]/span[1]")).click();
      // driver.findElement(By.xpath("//*[@id='postLoginContainer']/app-postloginheader/app-taxilla-header/mat-toolbar/mat-toolbar-row/ul/li[2]/button/span/span")).click();
    Thread.sleep(10000);
       List<WebElement> list=driver.findElements(By.xpath("//div[@class='tenantsList']//button"));
     //div[@class='tenantsList']//button
       System.out.println(list.size());
       Thread.sleep(5000);
       String exp_rel="Outward E-Way Bills";

       boolean flag=false;
       for(int i=0;i<list.size();i++)
       {
    	   
    	   String act_reslt=list.get(i).getText();
    	   //System.out.println(orgname);
           if(exp_rel.equalsIgnoreCase(act_reslt))
    	   //if(exp_rel.toLowerCase().contains(act_reslt.toLowerCase()))
           {
        	   flag=true;
        	   break;
           }

       }
       if(flag)
       {
    	   System.out.println("test pass");
       }else
       {
    	   System.out.println("test fail");
       }
       Thread.sleep(5000);
         
      /* if(driver.findElement(By.xpath("//*[@id='cdk-overlay-9']/div/div/div/mat-card/mat-card-content/div/div/div/div[2]")).isDisplayed())
       {
    	   Thread.sleep(10000);
    	   //driver.findElement(By.xpath("//div[@class='slimScrollBar']/div")).sendKeys(Keys.PAGE_DOWN);
    	   driver.findElement(By.xpath("//*[@id='cdk-overlay-9']/div/div/div/mat-card/mat-card-content/div/div/div/div[2]")).sendKeys(Keys.PAGE_DOWN);
    	 //*[@id="cdk-overlay-9"]/div/div/div/mat-card/mat-card-content/div/div/div/div[2]
       }*/
       Thread.sleep(10000);
      String expdata= driver.findElement(By.xpath("//button[@class='appName mat-menu-item ng-star-inserted'][101]")).getText();
      Thread.sleep(5000);
      //driver.findElement(By.xpath("//*[@id='mat-input-5']")).sendKeys(expdata);
       
       
       if(driver.findElement(By.xpath("//div[@class='mat-form-field-infix']/input")).isDisplayed())
       {
    	      Thread.sleep(5000);
    	   driver.findElement(By.xpath("//div[@class='mat-form-field-infix']/input")).sendKeys(expdata);
    	      Thread.sleep(5000);
    	   driver.findElement(By.xpath("//div[@class='mat-form-field-infix']/input")).sendKeys(Keys.ENTER);
       }
       
       driver.findElement(By.xpath("//div[@class='tenantsList']/button[101]")).click();
	}
	

}
