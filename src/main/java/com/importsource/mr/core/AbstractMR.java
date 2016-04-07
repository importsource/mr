package com.importsource.mr.core;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractMR  {
	//private static final String REGEX = "[,]";
	private static final String REGEX = "[ ]";
	
	
	public String[] splitLine(String str) {
		String[] strArr=str.split(REGEX);
		return strArr;
	}
	
	public String readLine() {
		String wenzhang = FileMgr.readTxtFile("Y:\\中文分词词库整理\\sample\\wenzhang.txt");
		return wenzhang;
	}
	

	public static  Map<String, Object> map=new HashMap<String, Object>();
	
	//protected abstract   void map(String key, int i) ;

}
