package com.importsource.mr.core.sample.weight;

import com.importsource.mr.core.Application;
import com.importsource.mr.core.ApplicationManager;
import com.importsource.mr.core.Mapper;
import com.importsource.mr.core.Reducer;

/**
 * 写一个框架。先从api写起。
 * 
 * @author Hezf
 *
 */
public class CommentTest {
	public static void main(String[] args) {
		Application avg = new Application();
		Mapper mapper = new CommentMapper();
		avg.setMapper(mapper);
		Reducer reducer = new CommentReducer();
		avg.setReducer(reducer);
		ApplicationManager.start(avg);
	}
}
