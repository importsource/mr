package com.importsource.mr.core.sample.wordcount;

import com.importsource.mr.core.Application;
import com.importsource.mr.core.ApplicationManager;
import com.importsource.mr.core.Mapper;
import com.importsource.mr.core.Reducer;

/**
 *1、先把一个文件内容读取到缓存中。
 *2、然后进行map操作。map里边的key是做什么的。
 * @author Hezf
 *
 */
public class NewMrTest {

	public static void main(String[] args) {
		Application wordCount = new Application();
		Mapper mapper = new WordMapper();
		wordCount.setMapper(mapper);
		Reducer reducer = new WordReducer();
		wordCount.setReducer(reducer);
		ApplicationManager.start(wordCount);

	}

}
