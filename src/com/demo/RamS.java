package com.demo;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RamS {
	
		public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sbijinepalli\\Desktop\\JarsFiles\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.get("https://www.naukri.com/");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]")).click();;
			
			Set<String> wins = driver.getWindowHandles();
			
			int j =1;
			
			for (String win : wins) {
				
				if (j==2 ) {
					
					System.out.println("Entered");
					
					driver.switchTo().window(win);
					
					System.out.println("Switched");
					
					driver.close();
				}
				j++;
			}
			
			//driver.switchTo().window(wins[0]);
			
			
			
			// TODO Auto-generated method stub

		}

	}



