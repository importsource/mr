package com.importsource.mr.core.sample.average;

import com.importsource.mr.core.Application;
import com.importsource.mr.core.ApplicationManager;
import com.importsource.mr.core.Mapper;
import com.importsource.mr.core.Reducer;

/**
 * 写一个框架。先从api写起。
 * <p>
 *1、 现在需要对数据集获取暴露。
 * <p>
 *2、然后是map需要重新搞。这个map太过单一。
 * <p>
 *3、
 * @author Hezf
 *
 */
public class AvgTest {
	public static void main(String[] args) {
		Application avg = new Application();
		Mapper mapper = new AvgMapper();
		avg.setPath("Y:\\中文分词词库整理\\sample\\wenzhang.txt");
		avg.setMapper(mapper);
		Reducer reducer = new AvgReducer();
		avg.setReducer(reducer);
		ApplicationManager.start(avg);
	}
}
