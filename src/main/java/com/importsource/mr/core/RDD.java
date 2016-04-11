package com.importsource.mr.core;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个通用数据集
 * @author Hezf
 *
 * @param <T> 可以指定类型
 */
public class RDD<T> {
   private List<T> list =null;
   
   public RDD(){
	  list= new ArrayList<T>();
   }
   
   public T get(int i){
	   return list.get(i);
   }
   
   public boolean add(T t){
	   return list.add(t);
   }
   
   public int size(){
	   return list.size();
   }


   
}
