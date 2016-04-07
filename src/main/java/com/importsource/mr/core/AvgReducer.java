package com.importsource.mr.core;

import java.util.List;

public class AvgReducer implements Reducer {

	public void reduce(String key, List<Object> values) {
		 int sum=0;
		 for(int i=0;i<values.size();i++){
			sum+=Integer.parseInt(values.get(i).toString());
		 }
		 System.out.println(key+":"+sum);

	}

}
