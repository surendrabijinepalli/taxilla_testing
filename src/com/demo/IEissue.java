package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class IEissue {
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.ie.driver", "C:\\Users\\sbijinepalli\\Desktop\\ie\\IEDriverServer.exe");
		 WebDriver driver=new InternetExplorerDriver();

		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbijinepalli\\Desktop\\JarsFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		
		driver.get("https://qa.taxilla.com");
		 Thread.sleep(2000);

		System.out.println("Browser lauched");
		 Thread.sleep(2000);
         
		 
		 driver.findElement(By.cssSelector("input[type*='text']")).sendKeys("paper1234");
		 //driver.findElement(By.id("userId")).sendKeys("paper1234");
		 Thread.sleep(2000); 
		 
		 driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("Test@123");
		 //driver.findElement(By.id("userPassword")).sendKeys("Test@123");
		 Thread.sleep(2000);
		 
		 //driver.findElement(By.xpath("(//*[contains(text(),' Sign in ')])[2]")).click();
		// driver.findElement(By.cssSelector("span[class*='mat-button-wrapper']")).click(); 
		// Thread.sleep(2000);
		 
		 WebElement Element=driver.findElement(By.xpath("(//*[contains(text(),' Sign in ')])[2]"));
  		 //JavascriptExecutor js=(JavascriptExecutor) ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Element);  
  		 JavascriptExecutor js=(JavascriptExecutor) ((JavascriptExecutor)driver).executeScript("arguments[0].click();", Element);  


		 /*WebElement element = driver.findElement(By.xpath("(//*[contains(text(),' Sign in ')])[2]"));
		 Actions action = new Actions(driver);
		 action.moveToElement(element).click().perform();*/
		
	}

}