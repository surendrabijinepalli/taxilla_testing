package com.demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
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
	}
}
