package com.importsource.mr.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application extends AbstractMR {
	private Mapper mapper;
	private Reducer reducer;
	//文件路径
	private String path;
	
	//用来保存命令列表
	private List<Command> rddCmd=new ArrayList<Command>();
	//专门放rdd数据集
	private Map<String, Object> rddMap=new HashMap<String, Object>();
	
    public List<Command> getRddCmd(){
    	return rddCmd;
    }
	public void setMapper(Mapper mapper) {
		this.mapper=mapper;
	}
	public Mapper getMapper(){
		return this.mapper;
	}

	public void setReducer(Reducer reducer) {
		this.reducer=reducer;
	}
	
	public Reducer getReducer(){
		return this.reducer;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	/**
	 * 设置命令。这个就相当于表名
	 * @param path  文件路径
	 * @param name  命令名称以及之后的RDD结果集的名称
	 */
	public void setTextFile(String path, String name) {
		Command textFile=new Command();
		textFile.setName(name);
		textFile.setValue(path);
		textFile.setType(CmdType.PATH);
		rddCmd.add(textFile);
		
	}
	
	/**
	 * filter命令
	 * @param value 命令参数值
	 * @param name 命令名称以及之后的RDD结果集的名称
	 */
	public void where(String value, String name) {
		Command whereContains=new Command();
		whereContains.setName(name);
		whereContains.setValue(value);
		whereContains.setType(CmdType.WHERE);
		rddCmd.add(whereContains);
		
	}
	public Map<String, Object> getRddMap() {
		return rddMap;
	}
	
	public void setRddCmd(List<Command> rddCmd) {
		this.rddCmd = rddCmd;
	}

}
