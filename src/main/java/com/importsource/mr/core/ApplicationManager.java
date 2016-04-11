package com.importsource.mr.core;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.importsource.conf.Properties;
import com.importsource.conf.PropertiesTools;
import com.importsource.mr.core.io.LineBufferReader;

/**
 * 这个主要负责应用生命周期的管理
 * 
 * @author Hezf
 *
 */
public class ApplicationManager {
	/**
	 * 启动
	 * 
	 * @param app
	 *            要启动的app
	 */
	public static void start(Application app) {

		// String str = readFile(app);
		Context context = new Context();

		try {
			map(app, context);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sort();

		reduce(app);

		/*
		 * Set<String> keySet = AbstractMR.map.keySet(); Iterator<String>
		 * iterator = keySet.iterator(); while (iterator.hasNext()) { String key
		 * = (String) iterator.next(); String value =AbstractMR.
		 * map.get(key).toString(); //System.out.println(key + ":" + value); }
		 */

	}

	private static void map(Application app, Context context) throws IOException {

		Properties p=Configuration.newPropertiesInstance();
		String path = PropertiesTools.get(p, "importsource.mr.file.path",
		null);
		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), Charset.forName("gbk")));
		LineBufferReader myReader = new LineBufferReader(br);
		for (String line = myReader.readLine(); line != null; line = myReader.readLine()) {
			
				

				app.getMapper().map(String.valueOf(myReader.getLineNumber()), line, context);
				// System.out.println(line);
			
			
		}
		br.close();

	}

	private static void default1(String line,String name,String value) {
		//把这一行sh

	}

	private static void sort() {
		Map<String, Object> result = AbstractMR.map;
		Map<String, Object> treeMap = new TreeMap<String, Object>(result);
		AbstractMR.map = treeMap;

	}

	private static void reduce(Application app) {
		Set<String> keySet1 = AbstractMR.map.keySet();
		Iterator<String> iterator1 = keySet1.iterator();
		while (iterator1.hasNext()) {
			String key = (String) iterator1.next();
			String value = AbstractMR.map.get(key).toString();
			String[] valuesArr = value.split(",");

			List<Object> valuesList = new ArrayList<Object>();
			for (int i = 0; i < valuesArr.length; i++) {
				valuesList.add(valuesArr[i]);
			}
			Context context = new Context();
			app.getReducer().reduce(key, valuesList, context);
		}
	}

	/*
	 * private static String readFile(Application app) { String str =
	 * app.readLine(); return str; }
	 */

}
