package com.importsource.mr.core.sample.average;

import java.util.List;

import com.importsource.mr.core.Reducer;

public class AvgReducer implements Reducer {

	public void reduce(String key, List<Object> values) {
		 int sum=0;
		 for(int i=0;i<values.size();i++){
			sum+=Integer.parseInt(values.get(i).toString());
		 }
		 System.out.println(key+":"+sum/values.size());

	}

}
