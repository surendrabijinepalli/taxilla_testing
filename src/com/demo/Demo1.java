package com.demo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sbijinepalli\\Desktop\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://qa.taxilla.com");
		driver.manage().window().maximize();
		
	}
		
		
	

}
