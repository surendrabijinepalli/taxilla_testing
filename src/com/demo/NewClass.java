package com.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class NewClass {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbijinepalli\\Desktop\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome Browser executed");
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.get("https://www.microsoft.com/en-us/edge");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//*[contains(@class,'c-glyph btn-dwn dropbtn')])[1]")).click();
		//Select s=new Select(element)
		/*List<WebElement> list= driver.findElement(By.xpath("(//*[contains(@class,'c-glyph btn-dwn dropbtn')])[1]")).click();
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			String A=list.get(i).getText();
			System.out.println(A);
			
		}*/
	}

}
