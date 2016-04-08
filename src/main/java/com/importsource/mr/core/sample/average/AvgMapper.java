package com.importsource.mr.core.sample.average;

import com.importsource.mr.core.AbstractMR;
import com.importsource.mr.core.Context;
import com.importsource.mr.core.Mapper;

public class AvgMapper extends AbstractMR implements Mapper {

	public void map(String key1,String text,Context context) {
			String[] pers=text.split(" ");
//			/System.out.println(pers[0]);
			String key=pers[0];
			String value=pers[1];
			if(map.containsKey(key)){
				String value1=map.get(key).toString();
				map.remove(key);
				map.put(key, value1+","+value);
			}else{
				map.put(key, value);
			}
		}
		


}
