package com.demo;

import static org.testng.Assert.assertNotNull;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Class2 {



	public static void main(String[] args) throws Throwable {
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbijinepalli\\Desktop\\JarsFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 System.setProperty("webdriver.ie.driver", "C:\\Users\\sbijinepalli\\Desktop\\ie\\IEDriverServer.exe");
		 WebDriver driver=new InternetExplorerDriver();

		System.out.println("Chrome Browser executed");
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.get("https://qa.taxilla.com/organizations/ff4d96f7-dc44-4c42-986f-ebe6ca32cbdb/home"); */
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbijinepalli\\Desktop\\JarsFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome Browser executed");*/
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sbijinepalli\\Desktop\\ie\\IEDriverServer.exe");
		 WebDriver driver=new InternetExplorerDriver();
		System.out.println("InternetExplorerDriver executed");
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.get("https://qa.taxilla.com/organizations/ff4d96f7-dc44-4c42-986f-ebe6ca32cbdb/home");
		
	
		 Thread.sleep(20000);
	       driver.findElement(By.xpath("//*[contains(@placeholder,'Search Apps')]")).sendKeys("Outward E-Way Bills");
	       Thread.sleep(2000);

	       driver.findElement(By.xpath("//*[contains(@placeholder,'Search Apps')]")).sendKeys(Keys.ENTER);
	       
	       Thread.sleep(15000);
	       //driver.findElement(By.xpath("(//*[contains(text(),'Process Now')])[1]")).click();
	       
	        WebElement Element4=driver.findElement(By.xpath("(//*[contains(text(),'Process Now')])[1]"));
		   JavascriptExecutor js4=(JavascriptExecutor) ((JavascriptExecutor)driver).executeScript("arguments[0].click();", Element4);  

	    
		   
		
	       driver.findElement(By.xpath("(//*[contains(text(),'Select Transformation')])[3]")).click();
	       Thread.sleep(2000);

	       
	       driver.findElement(By.xpath("//*[contains(text(),' E-waybill-Inbound-1.03 ')]")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("(//*[contains(text(),'Choose File')])[2]")).click();
	}

}
