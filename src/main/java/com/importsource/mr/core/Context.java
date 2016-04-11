package com.importsource.mr.core;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;

import com.importsource.mr.core.io.LineBufferReader;

/**
 * 负责处理处理过程中的各种操作能力的链接提供
 * @author Hezf
 *
 */
public class Context {
	/**
	 * 得到map
	 * @return
	 */
	public Map<String, Object> getMap(){
		return AbstractMR.map;
	}
	
	public void write(String key, int sum) {
		System.out.println(key+":"+sum);
	}

	public Object get(String key) {
		Object value1=AbstractMR.map.get(key);
		return value1;
	}

	public void remove(String key) {
		AbstractMR.map.remove(key);
	}

	public void put(String key, String value) {
		AbstractMR.map.put(key, value);
		
	}
	
	public void textFile(String path){
		//String path = PropertiesTools.get(p, "importsource.mr.file.path", null);
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(
					new FileInputStream(path),Charset.forName("gbk")));
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException(e);
		}
		LineBufferReader myReader=new LineBufferReader(br);
	}
}