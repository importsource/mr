package com.importsource.mr.core;

public class WordMap extends AbstractMR implements Mapper  {

	public void map(String key, int obj) {
		put(key, obj);
	}
	
	private  Object put(String key,Object value){
		Object obj=null;
		if(map.containsKey(key)){
			String value1=map.get(key).toString();
			map.remove(key);
			obj=map.put(key, value1+","+value);
		}else{
			obj=map.put(key, value);
		}
		return  obj;
	}

	

}
