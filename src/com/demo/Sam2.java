package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sam2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\test2\\commonjars\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("http://qa.taxilla.com");

	}

}
