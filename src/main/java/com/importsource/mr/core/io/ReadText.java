package com.importsource.mr.core.io;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ReadText {
	
	private static final String filePath="Y:\\中文分词词库整理\\sample\\pinglun.txt";
	public static void main(String[] args) throws IOException{
		readF1(filePath);
	}

	public static  void readF1(String filePath) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(filePath),Charset.forName("gbk")));
		
		for (String line = br.readLine(); line != null; line = br.readLine()) {
			System.out.println(line);
		}
		br.close();

	}
	
	public static  void readF1WithLineNo(String filePath) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(filePath),Charset.forName("gbk")));
		LineBufferReader myReader=new LineBufferReader(br);
		for (String line = myReader.readLine(); line != null; line = myReader.readLine()) {
			System.out.println(line);
		}
		br.close();

	}

	public static  void readF2(String filePath) throws IOException {
		FileReader fr = new FileReader(filePath);
		BufferedReader bufferedreader = new BufferedReader(fr);
		String instring;
		while ((instring = bufferedreader.readLine().trim()) != null) {
			if (0 != instring.length()) {
				System.out.println(instring);
			}
		}
		fr.close();
	}
}
