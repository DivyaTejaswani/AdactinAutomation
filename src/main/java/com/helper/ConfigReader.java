package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	public static Properties prop;
	public ConfigReader()  {
		try{
			prop=new Properties();
			File f=new File("E:\\eclipse-workspace\\AdactinCucumber\\src\\test\\resource\\com\\adactin\\proterties\\configuration.properites");
					FileInputStream fin=new FileInputStream(f);
					prop.load(fin);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public String getUrl() throws Exception {
		String property=prop.getProperty("url");
		if(property==null) {
			throw new Exception("Not a valid prop name");
		}
	return property;
	}
	public String getBrowser() throws Exception {
		String property=prop.getProperty("browser");
		if(property==null) {
			throw new Exception("Not a valid prop name");
		}
	return property;
	}

}
