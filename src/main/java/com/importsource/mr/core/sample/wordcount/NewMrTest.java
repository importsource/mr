package com.importsource.mr.core.sample.wordcount;

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
 *3、实现转换功能。案例是找到所有w开头的。
 *
 * 一个数据集可以多层的处理。对于任何一个处理都是查询。查询分为过滤型和汇聚型。
 * 
 * 如何汇聚？
 * 
 * 原始数据集 然后就是各种操作。 如何有中间数据集就保存起来。如果没有中间数据集就不管。
 * 
 * dataset获取  只是设置。 还要得到后面的查询条件 搞好。是不是
 * 
 * 这个要用sql思维来写。
 * 
 * groupby
 * where 
 * orderby
 * 
 * count
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
