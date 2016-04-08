package com.importsource.mr.core.sample.weight;

import java.util.List;

import com.importsource.mr.core.Context;
import com.importsource.mr.core.Reducer;

public class CommentReducer implements Reducer {

	public void reduce(String key, List<Object> values,Context context) {
		 int sum=0;
		 for(int i=0;i<values.size();i++){
			sum+=Integer.parseInt(values.get(i).toString());
		 }
		 context.write(key,sum);
	}

}
