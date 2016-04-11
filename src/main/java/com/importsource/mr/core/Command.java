package com.importsource.mr.core;

/**
 * 对于结果集的各种转换及操作
 * @author Hezf
 */
public class Command {
	/**
	 * 这个是命令的名字。同时也是之后rdd数据集的名字
	 */
	private String name;
	
	/**
	 * 命令所传参数。比如 %w
	 */
	private String value;
	
	/**
	 * 命令类型。现在有where，path等等
	 */
	private CmdType cmdType;
	
	

	public void setName(String name) {
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}


	public void setValue(String value) {
		this.value=value;
	}
	
	public String getValue(){
		return this.value;
	}

	public void setType(CmdType cmdType) {
		this.cmdType=cmdType;
	}
	
	public CmdType getCmdType(){
		return cmdType;
	}

}
