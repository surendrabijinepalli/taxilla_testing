package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "‪C:\\Users\\sbijinepalli\\Desktop\\11\\IEDriverServer.exe");
		 System.out.println("set the system proety");
		 WebDriver driver=new InternetExplorerDriver();
		 
		 driver.get("https://github.com/bonigarcia/webdrivermanager");
		 
		 

	}

}
