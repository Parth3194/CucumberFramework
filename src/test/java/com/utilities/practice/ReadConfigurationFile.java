package com.utilities.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigurationFile {
	
	Properties prop = new Properties() ;

	public ReadConfigurationFile() throws IOException {
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\parth\\eclipse-workspace\\CucumberFrameWork\\src\\test\\java\\com\\utilities\\practice\\ConfiguraionFile");
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		
	}
}
		

	public String getBrowser() {
		// TODO Auto-generated method stub
		String value = prop.getProperty("browser");
		return value;
	}
}
