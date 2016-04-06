package com.importsource.mr.core;


public class Application extends AbstractMR {
	private Mapper mapper;
	private Reducer reducer;

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

}
