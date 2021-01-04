package com.commonFunctionLybrary;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.utilities.PropertyFileUtil;

public class Dummy {

	public static void main(String[] args) throws Throwable {
		
		PropertyFileUtil pt=new PropertyFileUtil();
		String browser=pt.getValueForkey("Browser");
		System.out.println(browser);
		
	}

}
