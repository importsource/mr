package com.importsource.mr.core;

/**
 * 写一个框架。先从api写起。
 * 
 * @author Hezf
 *
 */
public class MrTestEn {
	public static void main(String[] args) {
		Application wordCount = new Application();
		Mapper mapper = new WordMapper();
		wordCount.setMapper(mapper);
		Reducer reducer = new WordReducer();
		wordCount.setReducer(reducer);
		ApplicationManager.start(wordCount);
	}
}
