package com.web.sut.pro.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UploadPath {
	public String getPath(String strKey) {
		Properties prop = new Properties();
		InputStream inps = this.getClass().getResourceAsStream("/uploadPath.properties");
		String webpath = "";
		try {
			prop.load(inps);
			webpath = prop.getProperty(strKey).trim();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return webpath;
	}
}
