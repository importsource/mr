package com.importsource.mr.core.sample.wordcount;

import com.importsource.mr.core.AbstractMR;
import com.importsource.mr.core.Context;
import com.importsource.mr.core.Mapper;

public class WordMapper extends AbstractMR implements Mapper  {

	public void map(String key1,String text,Context context) {
		put(text);
	}
	
	private  void put(String text){
		String[] strArr =splitLine(text);
		for(int i=0;i<strArr.length;i++){
			if(map.containsKey(strArr[i])){
				String value1=map.get(strArr[i]).toString();
				map.remove(strArr[i]);
				map.put(strArr[i], value1+","+1);
			}else{
				map.put(strArr[i], 1);
			}
		}
		
	}
	
	
	private static final String REGEX = "[ ]";

	

}
