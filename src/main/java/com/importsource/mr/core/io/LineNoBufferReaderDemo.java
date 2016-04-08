package com.importsource.mr.core.io;

import java.io.IOException;

/**
 * 
 * @author Hezf
 *
 */
public class LineNoBufferReaderDemo {

	private static final String filePath="Y:\\中文分词词库整理\\sample\\pinglun.txt";
	public static void main(String[] args) throws IOException {
		ReadText.readF1WithLineNo(filePath);

	}

}
