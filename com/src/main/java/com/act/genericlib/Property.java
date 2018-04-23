package com.act.genericlib;

import java.io.FileInputStream;

import java.util.Properties;

public class Property {
	
	public Properties getproperties() throws Throwable
	{
		String path="./property";
		FileInputStream fis=new FileInputStream(path);
		Properties pro=new Properties();
		pro.load(fis);
		return pro;
		
		
	}
	

}
