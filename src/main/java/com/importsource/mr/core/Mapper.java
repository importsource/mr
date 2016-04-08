package com.importsource.mr.core;

/**
 * 通用mapper模型的接口
 * @author Hezf
 *
 */
public interface Mapper {
   /**
    * map
    * @param key 偏移量（暂不用）
    * @param text 该map需要处理的文本内容
    * @param context 上下文
    */
   public void map(String key,String text,Context context);

}