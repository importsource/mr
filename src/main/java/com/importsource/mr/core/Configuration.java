package com.importsource.mr.core;

import com.importsource.conf.Properties;

/**
 * 配置文件处理
 * @author Hezf
 *
 */
public class Configuration {
   public static Properties newPropertiesInstance(){
	   Properties p = com.importsource.conf.Properties.newInstance("conf.xml");
	   return p;
   }
}
