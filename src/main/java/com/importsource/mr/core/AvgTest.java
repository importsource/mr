package com.importsource.mr.core;

/**
 * 写一个框架。先从api写起。
 * 
 * @author Hezf
 *
 */
public class AvgTest {
	public static void main(String[] args) {
		Application avg = new Application();
		Mapper mapper = new AvgMapper();
		avg.setMapper(mapper);
		Reducer reducer = new AvgReducer();
		avg.setReducer(reducer);
		ApplicationManager.start(avg);
	}
}
