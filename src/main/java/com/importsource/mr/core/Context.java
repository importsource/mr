package com.importsource.mr.core;

import java.util.Map;

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
}