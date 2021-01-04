package com.DriverFactory;
			
import org.testng.annotations.Test;

public class App_Test 	
{
	  @Test
      public static void kickStart() throws Throwable 
      {
    	  DriverScript ds=new DriverScript();
    	  try {
			ds.startTest();
		  } catch (Exception e) {
			e.printStackTrace();
		  }
      }
}

