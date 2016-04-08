package com.importsource.mr.core.io;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * 
 * @author Hezf
 *
 */

public class LineBufferReader {
	// 声明成员bufferedReader变量
	private BufferedReader bufferedReader;
	// 声明计数器
	private int count = 1;
	
	public int getLineNumber(){
		return  this.count-1;
	}

	public LineBufferReader(BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;
	}

	/**
	 * 逐行读取
	 * @return
	 */
	public String readLine() {
		String reader="";
		//StringBuilder builder = new StringBuilder();
		try {
			 reader = bufferedReader.readLine();
			if (reader == null) {
				return null;
			}
			//builder.append(count++).append(": ").append(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reader;
	}
}