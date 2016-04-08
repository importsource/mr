package com.importsource.mr.core;

import java.util.List;

/**
 * 通用reducer模型接口
 * @author Hezf
 *
 */
public interface Reducer {
	/**
	 * 汇聚
	 * @param key 汇聚的key
	 * @param values 需要汇聚的集合
	 * @param context 上下文
	 */
	public void reduce(String key, List<Object> values,Context context) ;
}
