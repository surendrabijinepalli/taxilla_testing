package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;










public class LogOut {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbijinepalli\\Desktop\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome Browser executed");
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\sbijinepalli\\Desktop\\Browserexefiles\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		System.out.println("Firefox Browser executed");*/
		
		/*System.setProperty("webdriver.ie.driver", "C:\\Users\\sbijinepalli\\Desktop\\chromedriver1\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		System.out.println("InternetExplorer Browser executed");*/
		
		/*System.setProperty("webdriver.opera.driver", "C:\\Users\\sbijinepalli\\Desktop\\Browserexefiles\\operadriver.exe");
		WebDriver driver=new OperaDriver();
		System.out.println("Opera Browser executed");*/
		
	   /* System.setProperty("webdriver.edge.driver", "C:\\Users\\sbijinepalli\\Desktop\\Browserexefiles\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		System.out.println(" MSEdge Browser executed");*/
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.get("https://qa.taxilla.com");
		Thread.sleep(2000);
		driver.findElement(By.id("userId")).sendKeys("krishna");
		Thread.sleep(2000);
		driver.findElement(By.id("userPassword")).sendKeys("Taxilla@2020");
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
       Thread.sleep(5000);
       driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
       //Thread.sleep(40000);
       /*try {
    	   String msg=driver.switchTo().alert().getText();
           System.out.println(msg);
           if(msg.contains("Login"))
           {
        	   driver.switchTo().alert().accept();
           }else
           {
        	   driver.switchTo().alert().dismiss();
           }
           System.out.println("submit pass");

	} catch (Exception e) {
		e.printStackTrace();
	}       */
       
      
       
       Thread.sleep(40000);
       driver.findElement(By.xpath("(//*[contains(text(),'person')])[2]")).click();
       System.out.println("log icon clicked");
       Thread.sleep(5000);
       driver.findElement(By.xpath("(//*[contains(text(),'Sign Out')])[1]")).click();
       System.out.println("logout pass");
       


	}

}
