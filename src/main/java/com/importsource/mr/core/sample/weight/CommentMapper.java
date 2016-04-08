package com.importsource.mr.core.sample.weight;

import com.importsource.mr.core.AbstractMR;
import com.importsource.mr.core.Context;
import com.importsource.mr.core.Mapper;

public class CommentMapper extends AbstractMR implements Mapper {

	public void map(String key1,String text,Context context) {
		
			String[] pers=text.split("	");
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
				String value1=context.get(key).toString();
				context.remove(key);
				context.put(key,value1+","+weight);
				
				
			}else{
				context.put(key, weight);
			}
		
		

	}

}
