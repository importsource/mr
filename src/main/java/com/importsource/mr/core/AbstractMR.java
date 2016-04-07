package com.importsource.mr.core;

import java.util.HashMap;
import java.util.Map;

import com.importsource.conf.Properties;
import com.importsource.conf.PropertiesTools;

public abstract class AbstractMR  {
	//private static final String REGEX = "[,]";
	public String[] splitLine(String str) {
		Properties p=Configuration.newPropertiesInstance();
		String seperator = PropertiesTools.get(p, "importsource.mr.file.seperator", null);
		String[] strArr=str.split(seperator);
		return strArr;
	}
	
	public String readLine() {
		Properties p=Configuration.newPropertiesInstance();
		String path = PropertiesTools.get(p, "importsource.mr.file.path", null);
		String wenzhang = FileMgr.readTxtFile(path);
		return wenzhang;
	}
	

	public static  Map<String, Object> map=new HashMap<String, Object>();
	
	//protected abstract   void map(String key, int i) ;

}
