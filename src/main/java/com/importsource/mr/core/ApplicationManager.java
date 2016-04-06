package com.importsource.mr.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ApplicationManager {

	public static void start(Application app) {
		        
				String str = readFile(app);
				
				String[] strArr = getFormatList(app, str);

				map(app, strArr);
				
				reduce(app);

				/*Set<String> keySet = AbstractMR.map.keySet();
				Iterator<String> iterator = keySet.iterator();
				while (iterator.hasNext()) {
					String key = (String) iterator.next();
					String value =AbstractMR. map.get(key).toString();
					//System.out.println(key + ":" + value);
				}*/
				
				
		
	}

	private static void reduce(Application app) {
		Set<String> keySet1 = AbstractMR.map.keySet();
		Iterator<String> iterator1 = keySet1.iterator();
		while (iterator1.hasNext()) {
			String key = (String) iterator1.next();
			String value =AbstractMR. map.get(key).toString();
			String[] valuesArr=value.split(",");
			
			List<Object> valuesList=new ArrayList<Object>();
			for(int i=0;i<valuesArr.length;i++){
				valuesList.add(valuesArr[i]);
			}
			app.getReducer().reduce(key, valuesList);
		}
	}

	private static void map(Application app, String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			//System.out.println(strArr[i]);
			app.getMapper().map(strArr[i], 1);
		}
	}

	private static String[] getFormatList(Application app, String str) {
		String[] strArr = app.splitLine(str);
		return strArr;
	}

	private static String readFile(Application app) {
		String str = app.readLine();
		return str;
	}


}
