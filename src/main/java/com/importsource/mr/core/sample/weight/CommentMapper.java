package com.importsource.mr.core.sample.weight;

import com.importsource.mr.core.AbstractMR;
import com.importsource.mr.core.Mapper;

public class CommentMapper extends AbstractMR implements Mapper {

	public void map(String text) {
		String[] strArr =splitLine(text);
		for(int i=0;i<strArr.length;i++){
			String[] pers=strArr[i].split("	");
//			/System.out.println(pers[0]);
			String key=pers[0];
			String value=pers[1];
			String weight="0";
			if(value.length()>20){
				weight="20";
			}else if(value.length()<=20 && value.length()>10){
				weight="10";
			}else if(value.length()<=10){
				weight="5";
			}
			if(map.containsKey(key)){
				String value1=map.get(key).toString();
				map.remove(key);
				map.put(key, value1+","+weight);
			}else{
				map.put(key, weight);
			}
		}
		

	}

}
