package com.demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender 
{
    public static void main(String[] args) throws Throwable 
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbijinepalli\\Desktop\\Browserexefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
System.out.println(" MSEdge Browser executed");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.get("https://qa.taxilla.com");
		Thread.sleep(2000);
		driver.findElement(By.id("userId")).sendKeys("paper1234");
		Thread.sleep(2000);
		driver.findElement(By.id("userPassword")).sendKeys("Test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='signinmaindiv']/div/mat-card/div/div[2]/mat-drawer-container/mat-drawer-content/div/div[3]/material-button/button/span")).click();
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
         			}else
         				 if(t1.contains("landmark"))
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
       driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
       Thread.sleep(25000);
       driver.findElement(By.xpath("//*[contains(@class,'mat-form-field-infix')]/input")).click();
       driver.findElement(By.xpath("//*[contains(@class,'mat-form-field-infix')]/input")).sendKeys("Outward E-Way Bills");
       Thread.sleep(10000);
       driver.findElement(By.xpath("//*[contains(text(),'Process Now')]")).sendKeys(Keys.ENTER);
       Set<String> allwindows=driver.getWindowHandles();
       System.out.println(allwindows);
       
       Object[] windows=allwindows.toArray();
       String window1=windows[0].toString();
       String window2=windows[1].toString();
       Thread.sleep(30000);
       driver.switchTo().window(window2);
       
       Thread.sleep(30000);
       driver.findElement(By.xpath("(//*[contains(text(),'Dashboard')])[1]")).click();
       Thread.sleep(10000);
       driver.findElement(By.xpath("//*[contains(@class,'fa fa-pencil')]")).click();
	
	}
}
