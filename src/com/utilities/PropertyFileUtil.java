package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtil 
{
     public static String getValueForkey(String key) throws Exception
     {
    	 Properties configproperties= new Properties();
    	 configproperties.load(new FileInputStream(new File("D:\\profile backup\\D drive\\workspace\\test3\\PropertyFile\\Environment.properties")));	 
    	 return configproperties.getProperty(key);
     }
}
