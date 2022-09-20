package com.Uitility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	String path = System.getProperty("user.dir") + "\\Configuration\\config.properties";

	Properties prop;

	public ReadConfig() {

		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(path);
			prop.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String BaseUrl() {

		String url = prop.getProperty("url");
		return url;

	}

	public String setBrowserValue() {

		String Bvalue = prop.getProperty("browser");

		return Bvalue;
	}

	public String username() {

		String Uname = prop.getProperty("username");

		return Uname;
	}

	public String password() {

		String pass = prop.getProperty("password");

		return pass;

	}
	
	public String headless() {

		String headless = prop.getProperty("headless");

		return headless;

	}

}
